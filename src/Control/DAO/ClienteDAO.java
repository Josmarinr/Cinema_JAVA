
package Control.DAO;

import Control.Conexion.Conexion;
import Modelo.*;
import Vista.MainPage;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ClienteDAO {
    
    private Connection connect;
    private Statement st;
    private ResultSet rs;
    private Sesion sesion;

    public ClienteDAO() {
        this.connect = null;
        this.st = null;
        this.rs = null;
        sesion = null;

    }
    
    public void modifPuntos(String id, int puntos) {

        Statement stmt = null;

        try {
            connect = Conexion.getConexion();
            stmt = connect.createStatement();
            stmt.executeUpdate("update Cliente set [Puntos]='" + puntos + "' where Id='" + id + "';");
            connect.commit();
            Conexion.desconectar();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }
    
    public void modifFecha(String id, String fecha) {

        Statement stmt = null;

        try {
            connect = Conexion.getConexion();
            stmt = connect.createStatement();
            stmt.executeUpdate("update Cliente set [Tiempo Obtencion]='" + fecha + "' where Id='" + id + "';");
            connect.commit();
            Conexion.desconectar();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }
    
    public List<String> solicitarDatosPersona(Persona p, int id) {
        List<String> datos_persona = new ArrayList<>();

        PreparedStatement st;
        PreparedStatement st2;

        switch (p.getClass().getName()) {
            case "proyectocinejungla.Usuario":
                
                try {
                connect = Conexion.getConexion();
                st = connect.prepareStatement("SELECT Nombre, Correo, Contraseña, Puntos, [Tiempo Obtencion] FROM Cliente Where Id =" + id);
                ResultSet result = st.executeQuery();

                while (result.next()) {
                    datos_persona.add(result.getString(1));
                    datos_persona.add(result.getString(2));
                    datos_persona.add(result.getString(3));
                    datos_persona.add(result.getString(4));
                    datos_persona.add(result.getString(5));
                }
                Conexion.desconectar();
            } catch (SQLException ex) {
            }
            break;
            case "proyectocinejungla.Empleado":
                try {
                connect = Conexion.getConexion();
                st = connect.prepareStatement("SELECT Nombre, Cedula, Contraseña, Cargo, [Fecha Inicio Contrato], Salario, Cine FROM Empleado Where Id =" + id);
                ResultSet result = st.executeQuery();

                while (result.next()) {
                    datos_persona.add(result.getString(1));
                    datos_persona.add(result.getString(2));
                    datos_persona.add(result.getString(3));
                    datos_persona.add(result.getString(4));
                    datos_persona.add(result.getString(5));
                    datos_persona.add(result.getString(6));
                    datos_persona.add(result.getString(7));
                }
                result.close();

                int id_cine = Integer.parseInt(datos_persona.get(6));

                st2 = connect.prepareStatement("select Nombre from [Cine Jungla] WHERE Id =" + id_cine);
                ResultSet result2 = st2.executeQuery();
                while (result2.next()) {
                    datos_persona.add(result2.getString(1));
                }
                Conexion.desconectar();
            } catch (SQLException ex) {
            }
            break;
        }
        return datos_persona;
    }
    
    public boolean registrarUsuario(String nombre, String correo, String contraseña) {
        PreparedStatement st;
        boolean failed = false;
        try {
            connect = Conexion.getConexion();
            st = connect.prepareStatement("SELECT Correo, Id FROM Cliente");
            ResultSet result = st.executeQuery();
            while (result.next()) {
                if (result.getString(1).equals(correo)) {
                    JOptionPane.showMessageDialog(null, "El correo ya se encuentra registrado");
                    failed = true;
                }
            }

            if (!failed) {
                try {
                    PreparedStatement pstmt = connect.prepareStatement("insert into Cliente(Nombre, Correo, Contraseña, Puntos, [Tiempo Obtencion]) values(?, ?, ?, ?, ?)");
                    pstmt.setString(1, nombre);
                    pstmt.setString(2, correo);
                    pstmt.setString(3, contraseña);
                    pstmt.setInt(4, 0);
                    pstmt.setInt(5, 0);
                    pstmt.executeUpdate();

                } catch (SQLException ex) {
                }
            }
            Conexion.desconectar();
        } catch (SQLException ex) {
        }
        return failed;
    }
    
    public void cambiarContraseña(int id, String contraseña, String tabla) {
        PreparedStatement statement;

        try {
            connect = Conexion.getConexion();
            statement = connect.prepareStatement("update " + tabla + " set Contraseña=? where Id=?");
            statement.setString(1, contraseña);
            statement.setInt(2, id);
            statement.executeUpdate();
            Conexion.desconectar();
        } catch (SQLException ex) {
        }
    }

    public void cambiarCorreo(int id, String correo) {
        PreparedStatement statement;

        try {
            connect = Conexion.getConexion();
            statement = connect.prepareStatement("update Cliente set Correo=? where Id=?");
            statement.setString(1, correo);
            statement.setInt(2, id);
            statement.executeUpdate();
            Conexion.desconectar();
        } catch (SQLException ex) {
        }
    }
    public void Login(javax.swing.JTextField jtf, javax.swing.JPasswordField jpf, String person, javax.swing.JFrame frame) {
        boolean failed = true;
        switch (person) {
            case "User":
                try {
                PreparedStatement st = connect.prepareStatement("SELECT Correo, Contraseña, Id, Nombre FROM Cliente");
                ResultSet result = st.executeQuery();

                while (result.next()) {
                    String email = result.getString(1);
                    String pw = result.getString(2);
                    int id = result.getInt(3);
                    String nombre = result.getString(4);

                    if (jtf.getText().equals(email) && String.valueOf(jpf.getPassword()).equals(pw)) {

                        sesion = Sesion.getInstance();
                        Usuario u = new Usuario(id);
                        u.rellenarDatos();
                        sesion.setPersona(u);
                        sesion.setLogged(true);

                        MainPage.account_label.setText("Logged as: " + u.getNombre());
                        MainPage.account_label.setFont(new java.awt.Font("Century Gothic", 1, 14));
                        MainPage.account_label.setForeground(new java.awt.Color(102, 0, 0));
                        MainPage.account_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

                        MainPage.getEncabezado().add(MainPage.account_label).setBounds(1680, 93, 200, 20);
                        MainPage.getFrame().setEnabled(true);

                        failed = false;

                        frame.dispose();
                    }
                }
            } catch (SQLException ex) {
                System.err.println(ex.getMessage());
            }
            break;
            case "Employee":
                try {
                PreparedStatement st = connect.prepareStatement("SELECT Cedula, Contraseña, Id, Nombre FROM Empleado");
                ResultSet result = st.executeQuery();

                while (result.next()) {
                    int cedula = result.getInt(1);
                    String pw = result.getString(2);
                    int id = result.getInt(3);
                    String nombre = result.getString(4);

                    if (Integer.parseInt(jtf.getText()) == cedula && String.valueOf(jpf.getPassword()).equals(pw)) {

                        sesion = Sesion.getInstance();
                        Empleado e = new Empleado(id);
                        e.rellenarDatos();
                        sesion.setPersona(e);
                        sesion.setLogged(true);

                        MainPage.account_label.setText("Logged as: " + e.getNombre());
                        MainPage.account_label.setFont(new java.awt.Font("Century Gothic", 1, 14));
                        MainPage.account_label.setForeground(new java.awt.Color(102, 0, 0));
                        MainPage.account_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

                        MainPage.getEncabezado().add(MainPage.account_label).setBounds(1680, 93, 200, 20);
                        MainPage.getFrame().setEnabled(true);

                        failed = false;

                        frame.dispose();
                    }
                }
            } catch (SQLException ex) {
                System.err.println(ex.getMessage());
            }
            break;
        }
        if (failed == true) {
            JOptionPane.showMessageDialog(null, "Los datos introducidos son incorrectos");
        }

    }
}

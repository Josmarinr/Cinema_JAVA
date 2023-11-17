
package Control.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Modelo.Sesion;
import Control.Conexion.Conexion;


public class CineDistriDAO {
    private Connection connect;
    private Statement st;
    private ResultSet rs;
    private Sesion sesion;

    public CineDistriDAO() {
        this.connect = null;
        this.st = null;
        this.rs = null;
        this.sesion = null;
    }
    
    public List<String> cine(int id) {
        List<String> datos = new ArrayList<String>();
        
        try {
            connect = Conexion.getConexion();
            PreparedStatement st = connect.prepareStatement("select Nombre, Puntuacion from [Cine Distri] where Id=" + id);
            rs = st.executeQuery();
            while (rs.next()) {
                datos.add(rs.getString("Nombre"));
                datos.add(rs.getString("Puntuacion"));
            }
            Conexion.desconectar();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return datos;
    }
    
    public void actualizarPuntuacion(String puntuado, float puntuacion, int indx) {
        PreparedStatement statement;
        PreparedStatement statement2;
        ResultSet rs;
        ResultSet rs2;
        float puntuacion_total = 0;
        int veces_puntuado = 0;
        float puntuacion_nueva = 0;
        try {
            switch (puntuado) {
                case "Multiplex" -> {
                    connect = Conexion.getConexion();
                    statement = connect.prepareStatement("Select [Puntuacion Total], [Veces Puntuado] from [Cine Jungla] where Id=" + indx);
                    rs = statement.executeQuery();
                    while (rs.next()) {
                        puntuacion_total = rs.getFloat(1) + puntuacion;
                        veces_puntuado = rs.getInt(2) + 1;
                        puntuacion_nueva = puntuacion_total / veces_puntuado;
                    }
                       
                    statement = connect.prepareStatement("update [Cine Jungla] set Puntuación=?, [Puntuacion Total]=?, [Veces Puntuado]=? where Id=?");
                    statement.setFloat(1, puntuacion_nueva);
                    statement.setFloat(2, puntuacion_total);
                    statement.setInt(3, veces_puntuado);
                    statement.setInt(4, indx);
                    statement.executeUpdate();
                    rs.close();
                    Conexion.desconectar();
                }
                case "Pelicula" -> {
                    connect = Conexion.getConexion();
                    statement2 = connect.prepareStatement("Select [Puntuacion Total], [Veces Puntuado] from Pelicula where Id=" + indx);
                    rs2 = statement2.executeQuery();

                    while (rs2.next()) {
                        puntuacion_total = rs2.getFloat(1) + puntuacion;
                        veces_puntuado = rs2.getInt(2) + 1;
                        puntuacion_nueva = puntuacion_total / veces_puntuado;

                    }

                    statement2 = connect.prepareStatement("update Pelicula set Puntuación=?, [Puntuacion Total]=?, [Veces Puntuado]=? where Id=?");
                    System.out.println(indx);
                    statement2.setFloat(1, puntuacion_nueva);
                    statement2.setFloat(2, puntuacion_total);
                    statement2.setInt(3, veces_puntuado);
                    statement2.setInt(4, indx);
                    statement2.executeUpdate();
                    rs2.close();
                    Conexion.desconectar();
                }

            }

        } catch (SQLException ex) {
        }
    }
}

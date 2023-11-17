
package Control.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import Control.Conexion.Conexion;

public class SalaDAO {
    
    private Connection connect;
    private Statement st;
    private ResultSet rs;

    public SalaDAO() {
        this.connect = null;
        this.st = null;
        this.rs = null;
    }
    
    public List<String> sala(int funcion, int cine) {
        List<String> sillas = new ArrayList<String>();
        ResultSet result = null;

        try {
            connect = Conexion.getConexion();
            PreparedStatement st = connect.prepareStatement("select Silla, Tipo, Estado from Cine" + cine + " where Funcion =" + funcion);
            result = st.executeQuery();
            while (result.next()) {
                sillas.add(result.getString("Silla"));
                sillas.add(result.getString("Tipo"));
                sillas.add(result.getString("Estado"));
            }
            Conexion.desconectar();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return sillas;
    }
    
    public void modifEstado(int cine, String estado, String silla, String funcion) {

        Statement stmt = null;

        try {
            connect = Conexion.getConexion();
            stmt = connect.createStatement();
            stmt.executeUpdate("update Cine" + cine + " set Estado='" + estado + "' where Silla='" + silla + "' and Funcion='" + funcion + "';");
            connect.commit();
            Conexion.desconectar();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }
    
    public List<String> fun(int funcion, int cine) {
        List<String> sillas = new ArrayList<String>();
        ResultSet result = null;

        try {
            connect = Conexion.getConexion();
            PreparedStatement st = connect.prepareStatement("select Sala from Cine" + cine + " where Funcion =" + funcion);
            result = st.executeQuery();
            while (result.next()) {
                sillas.add(result.getString("Sala"));
            }
            Conexion.desconectar();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return sillas;
    }
    
    public String StringOperaciones() {
        PreparedStatement statement;
        ResultSet rs;
        List<Integer> contadores_ingresos = new ArrayList();
        List<Integer> contadores_sillas = new ArrayList();
                
        int ingresos = 0;
        int sillas = 0;
        
        int ingresos_comida = 0;
        int comida_comprada = 0;
        
        for (int i = 1; i <= 6; i++) {
            try {
                connect = Conexion.getConexion();
                statement = connect.prepareStatement("Select Precio From Cine" + i + " where Estado='Ocupada'");
                rs = statement.executeQuery();
                while (rs.next()) {
                    ingresos += rs.getInt(1);
                    sillas += 1;
                }
                contadores_ingresos.add(ingresos);
                contadores_sillas.add(sillas);
                ingresos = 0;
                sillas = 0;
                Conexion.desconectar();
            } catch (SQLException ex) {
                Logger.getLogger(SalaDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
        for (int i = 1; i <= 48; i++) {
            try {
                connect = Conexion.getConexion();
                statement = connect.prepareStatement("Select Precio, [Cantidad Vendida] From Comida where Id="+i);
                rs = statement.executeQuery();
                while (rs.next()) {
                    ingresos_comida += rs.getInt(1);
                    comida_comprada += rs.getInt(2);
                }
                Conexion.desconectar();
            } catch (SQLException ex) {
                Logger.getLogger(SalaDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        String texto = "--------------------------------------------------------------------------\n"
                + "Ingresos por cine de boletas\n"
                + "Cine Titan: $" + contadores_ingresos.get(0)+"     Cantidad Sillas Vendidas: "+contadores_sillas.get(0) + "\n"
                + "Cine Unicentro: $" + contadores_ingresos.get(1)+"     Cantidad Sillas Vendidas: "+contadores_sillas.get(1) + "\n"
                + "Cine Plaza Central: $" + contadores_ingresos.get(2)+"     Cantidad Sillas Vendidas: "+contadores_sillas.get(2) + "\n"
                + "Cine Gran Estacion: $" + contadores_ingresos.get(3)+"     Cantidad Sillas Vendidas: "+contadores_sillas.get(3) + "\n"
                + "Cine Embajador: $" + contadores_ingresos.get(4)+"     Cantidad Sillas Vendidas: "+contadores_sillas.get(4) + "\n"
                + "Cine Las Americas: $" + contadores_ingresos.get(5)+"     Cantidad Sillas Vendidas: "+contadores_sillas.get(5) + "\n"
                + "----------------------------------------------------------\n"
                + "Ingresos totales por Comidas\n"
                + "Se vendieron un total: "+comida_comprada+" productos y generaron un total de: $"+ingresos_comida+" en todos los cines\n"
                + "-----------------------------------------------------------------------------";
        return texto;
    }
}

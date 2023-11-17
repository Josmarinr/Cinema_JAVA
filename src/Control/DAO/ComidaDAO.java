
package Control.DAO;

import Control.Conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ComidaDAO {
    
    private Connection connect;
    private Statement st;
    private ResultSet rs;

    public ComidaDAO() {
        this.connect = null;
        this.st = null;
        this.rs = null;
    }
    
    public List<String> preciosComida(int id) {
        List<String> datos = new ArrayList<String>();
        ResultSet result = null;

        try {
            connect = Conexion.getConexion();
            PreparedStatement st = connect.prepareStatement("select Id, Precio, [Cantidad Vendida] from [Comida]");
            result = st.executeQuery();
            while (result.next()) {
                datos.add(result.getString("Id"));
                datos.add(result.getString("Precio"));
                datos.add(result.getString("Cantidad Vendida"));
            }
            Conexion.desconectar();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return datos;
    }
    
    public void modifComida(String id, String cantidad) {

        Statement stmt = null;

        try {
            connect = Conexion.getConexion();
            stmt = connect.createStatement();
            stmt.executeUpdate("update Comida set [Cantidad Vendida]='" + cantidad + "';");
            connect.commit();
            Conexion.desconectar();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }
}

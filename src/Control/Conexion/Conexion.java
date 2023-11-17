
package Control.Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    
    private static String url = "jdbc:sqlite:src//Data//baseDeDatos.db";
    private static Connection connect = null;
    
    public static Connection getConexion(){
        try {
            Class.forName("org.sqlite.JDBC");
            connect = DriverManager.getConnection(url);
            
        } catch (Exception e) {

            System.out.print(e);
            
        }
        return connect;
    }
    
    public static void desconectar(){
      connect = null;
    }
}

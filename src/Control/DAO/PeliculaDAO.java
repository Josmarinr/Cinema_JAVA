
package Control.DAO;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Control.Conexion.Conexion;

public class PeliculaDAO {
    
    private Connection connect;
    private Statement st;
    private ResultSet rs;

    public PeliculaDAO() {
        this.connect = null;
        this.st = null;
        this.rs = null;
    }
    
    public List<String> cartelera() {
        List<String> cartelera = new ArrayList<String>();
        ResultSet result = null;

        try {
            connect = Conexion.getConexion();
            PreparedStatement st = connect.prepareStatement("select Id, Nombre, Descripcion, Puntuación from Pelicula");
            result = st.executeQuery();
            while (result.next()) {
                cartelera.add(result.getString("Id"));
                cartelera.add(result.getString("Nombre"));
                cartelera.add(result.getString("Descripcion"));
                cartelera.add(result.getString("Puntuación"));
            }
            Conexion.desconectar();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return cartelera;
    }
     
    public List<String> pelicula(int pelicula) {
        List<String> funciones = new ArrayList<String>();
        ResultSet result = null;

        try {
            connect = Conexion.getConexion();
            PreparedStatement st = connect.prepareStatement("select [Hora Funcion], Id from Funcion where Pelicula=" + pelicula);
            result = st.executeQuery();
            while (result.next()) {
                funciones.add(result.getString("Hora Funcion"));
                funciones.add(result.getString("Id"));
            }
            Conexion.desconectar();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return funciones;
    }
}

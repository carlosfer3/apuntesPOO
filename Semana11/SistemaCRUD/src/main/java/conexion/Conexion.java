package conexion;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    
    public static Connection obtenerConexion() {
        String url = "jdbc:sqlserver://localhost:1433;databaseName=universidad;encrypt=false";
        String usuario = "sa";
        String contraseña = "software";
        Connection conexion = null;

        try {
            conexion = DriverManager.getConnection(url, usuario, contraseña);
        } catch (SQLException e) {
            System.out.println("Error de conexión: " + e.getMessage());
        }

        return conexion;
    }
    
}

package uni.edu.conexion;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {

    private static final String usuario = "sa";
    private static final String password = "software";
    private static final String db = "universidad";
    private static final String url
            = "jdbc:sqlserver://localhost:1433;databaseName=" + db
            + ";encrypt=true;trustServerCertificate=true";

    public static Connection getConexion() {
        Connection conexion = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conexion = DriverManager.getConnection(url, usuario, password);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return conexion;
    }

}

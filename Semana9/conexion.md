# Conexion a base de datos

Para conectarse a una base de datos en java, es primordial decidir el motor de base de datos que usaste para el db, en el caso del curso, <b>SQLServer</b>.

Para una mejor instalación, ver el tutorial: https://youtu.be/zgCMmueGnlU?si=2LRk82lBDAkH_nHG

---
Se debe de instarlar el frameworkd de JDBC, el link:
https://learn.microsoft.com/es-es/sql/connect/jdbc/microsoft-jdbc-driver-for-sql-server?view=sql-server-ver16

Se coloca dentro del proyecto, en los paquetes, comúnmente con el nombre de carpeta "<b>lib</b>", despues ir al archivo POM y colocar la dependencia.
>
    <dependency>
        <groupId>com.microsoft.sqlserver</groupId>
        <artifactId>mssql-jdbc</artifactId>
        <version>10.2.0.jre11</version>
    </dependency>
>

Posteriormente se debe de habilitar el puerto 1433 (comúnmente para SQLServer el puerto es 1433), para esto abrir <b> SQL Server 2022 Configuration Manager </b>, ir a <b>SQL Server Network Configuration</b>, click derecho y ver propiedades de <b>TCP/IP</b>, en IP Addresses buscar IPAII y colocar el puerto 1433, el puerto dinámico colocarlo en 0, reiniciar el servicio de SQL Server y por ultimo, en tu proyecto crear la clase Conexion

>
    package uni.edu.conexion;

    import java.sql.Connection;
    import java.sql.DriverManager;
    import java.sql.SQLException;

    public class ConexionSQLServer {
        public static Connection obtenerConexion() {
            String db = "universidad"; //nombre de tu base de datos
            String url = "jdbc:sqlserver://localhost:1433;databaseName=" + db + ";encrypt=false";
            String usuario = "sa"; //usuario para acceder a la base de datos
            String contraseña = "software"; //clave para acceder a la baes de datos
            Connection conexion = null;

            try {
                conexion = DriverManager.getConnection(url, usuario, contraseña);
            } catch (SQLException e) {
                System.out.println("Error de conexión: " + e.getMessage());
            }

            return conexion;
        }
    }
>

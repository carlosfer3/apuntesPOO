import java.sql.*;

public class ConexionSQL {
    public static void main(String[] args) {
        String url = "jdbc:sqlserver://localhost:1433;databaseName=NombreDeTuBase;encrypt=true;trustServerCertificate=true";
        String user = "tu_usuario";
        String password = "tu_contraseña";

		String selectSQL = "SELECT id, nombre, edad FROM Personas";

		try (Connection conn = DriverManager.getConnection(url, user, password);
			 Statement stmt = conn.createStatement();
			 ResultSet rs = stmt.executeQuery(selectSQL)) {

			while (rs.next()) {
				int id = rs.getInt("id");
				String nombre = rs.getString("nombre");
				int edad = rs.getInt("edad");

				System.out.println(id + " - " + nombre + " - " + edad);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		String insertSQL = "INSERT INTO Personas (nombre, edad) VALUES ('Juan', 30)";

		try (Connection conn = DriverManager.getConnection(url, user, password);
			 PreparedStatement pstmt = conn.prepareStatement(insertSQL))
			 {
			pstmt.executeUpdate();
			System.out.println("Dato insertado con éxito.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
    }
}

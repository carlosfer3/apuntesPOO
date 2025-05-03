package conexion;

public class ConexionBD {
    private static ConexionBD instancia;
    
    private ConexionBD() {};
    
    public static synchronized ConexionBD getInstancia() {
        if (instancia == null) {
            instancia = new ConexionBD();
        }
        
        return instancia;
    }
    
    public synchronized void ejecutarConsulta(String query) {
        System.out.println("La base de datos ejecuto correctamente la consulta");
    }
}

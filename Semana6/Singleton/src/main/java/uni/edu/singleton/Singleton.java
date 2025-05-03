package uni.edu.singleton;

import conexion.ConexionBD;

public class Singleton {

    public static void main(String[] args) {
        ConexionBD db = ConexionBD.getInstancia();
        
        db.ejecutarConsulta("SELECT * FROM USUARIOS");
    }
}

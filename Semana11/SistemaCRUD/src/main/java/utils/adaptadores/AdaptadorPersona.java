package utils.adaptadores;

import java.sql.ResultSet;
import java.sql.SQLException;
import fabrica.FabricaDePersona;
import fabrica.FabricaPersona;

import modelo.Persona;

public class AdaptadorPersona implements Adaptador<Persona>{
    private FabricaPersona fabrica = new FabricaDePersona();

    @Override
    public Persona adaptar(ResultSet rs) throws SQLException {
        String id = rs.getString("idPersona");
        String nombre = rs.getString("nombre");
        String apellido = rs.getString("apellido");
        String fecha = String.valueOf(rs.getDate("fechaNacimiento"));
        String direccion = rs.getString("direccion");
        String telefono = rs.getString("telefono");
        DatosPersona datos = new DatosPersona(id, nombre, apellido, fecha, direccion, telefono);
        
        return fabrica.fabricar(datos);
    }
}

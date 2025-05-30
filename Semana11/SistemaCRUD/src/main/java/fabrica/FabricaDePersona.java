package fabrica;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import modelo.Persona;
import utils.adaptadores.DatosPersona;

public class FabricaDePersona implements FabricaPersona {

    @Override
    public Persona fabricar(DatosPersona datos) {
        String id = datos.getId();
        String nombre = datos.getNombre();
        String apellido = datos.getApellido();
        String direccion = datos.getDireccion();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate fechaNacimiento = LocalDate.parse(datos.getFechaNacimiento(), formatter);

        int telefono = Integer.parseInt(datos.getTelefono());

        if(id.equals("")) {
            return new Persona(nombre, apellido, fechaNacimiento, direccion, telefono);
        }
        return new Persona(Integer.parseInt(id), nombre, apellido, fechaNacimiento, direccion, telefono);
    }
}

package utils.adaptadores;

public class DatosPersona {
    private final String id;
    private final String nombre;
    private final String apellido;
    private final String fechaNacimiento;
    private final String direccion;
    private final String telefono;
    
    public DatosPersona(String nombre, String apellido, String fechaNacimiento, String direccion, String telefono) {
        this.id = "";
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.telefono = telefono;
    }
    public DatosPersona(String id, String nombre, String apellido, String fechaNacimiento, String direccion, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getId() {
        return id;
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }
    
}

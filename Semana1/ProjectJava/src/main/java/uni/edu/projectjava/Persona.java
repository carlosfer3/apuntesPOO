package uni.edu.projectjava;

public class Persona{
    private String nombre;
    private String apellido;
    private int edad;
    private String dni;
    private String nacionalidad;
    
    public Persona() {
        nombre = "Juanito";
        apellido = "Perez";
        edad = 18;
    }
    //sobrecarga del constructor (overload)
    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    
    public void Representar() {
        System.out.println("Hola, soy " + nombre + " " + apellido + " y tengo " + edad + " anios\n");
    }
    
}

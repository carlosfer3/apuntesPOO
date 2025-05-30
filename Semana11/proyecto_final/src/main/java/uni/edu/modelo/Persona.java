package uni.edu.modelo;

import java.time.LocalDate;

public class Persona {
    private int id;
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;
    private String direccion;
    private String distrito;
    private int telefono;
    
    public Persona(int id, String nombre, String apellido, LocalDate fechaNacimiento, String direccion, String distrito, int telefono) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.distrito = distrito;
        this.telefono = telefono;
    }
    
    public Persona(String nombre, String apellido, LocalDate fechaNacimiento, String direccion, String distrito, int telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.distrito = distrito;
        this.telefono = telefono;
    }
    
    public Persona() {}
    
    public int getId() {
        return id;
    }
    
    public String getDistrito() {
        return distrito;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getApellido() {
        return apellido;
    }
    
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }
    
    public String getDireccion() {
        return direccion;
    }
    
    public int getTelefono() {
        return telefono;
    }
    
    public String toString() {
        return "id: " + id + "\nPersona: " + nombre + " " + apellido + "\nFecha de Nacimiento: " + this.getFechaNacimiento();
    }
}

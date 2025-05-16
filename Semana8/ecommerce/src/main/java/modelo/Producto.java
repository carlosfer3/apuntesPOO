package modelo;

public abstract class Producto {
    private String nombre;
    private double precio;
    private String categoria;
    private String descripcion;
    private String plataforma;
    
    public Producto(String nombre, double precio, String categoria, String descripcion, String plataforma) {
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
        this.descripcion = descripcion;
        this.plataforma = plataforma;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public String getPlataforma() {
        return plataforma;
    }
    
    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }
    
    public String mostrarInfo() {
        return "\tNombre: " + nombre + 
                "\tDescripcion: " + descripcion +
                "\tPrecio: " + precio +
                "\tCategoria: " + categoria +
                "\tPlataforma: " + plataforma;
    }
}

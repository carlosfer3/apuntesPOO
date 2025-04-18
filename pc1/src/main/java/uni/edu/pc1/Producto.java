package uni.edu.pc1;

abstract class Producto implements Calculable, Describible{
    private String nombre;
    private final double precio;
    private final double precioigv;
    private int cantidad;
    private String codigo;
    
    public Producto(String nombre, double precio, int cantidad, String codigo) {
        this.nombre = nombre;
        this.precio = precio;
        this.precioigv = (double) Math.round(precio * 118) / 100;
        this.cantidad = cantidad;
        this.codigo = codigo;
    }
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
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
    
    public double getPrecioigv() {
        return precioigv;
    }
    
    @Override
    public String getDescripcion() {
        return "\n\tProducto: " + getNombre()
                + "\n\tCodigo de Prod.: " + getCodigo()
                + "\n\tPrecio Unitario: S/" + getPrecio()
                + "\n\tPrecio IGB: S/" + getPrecioigv()
                + "\n\tCantidad: " + getCantidad();
    }
}

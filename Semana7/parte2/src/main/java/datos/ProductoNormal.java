package datos;

public class ProductoNormal implements Producto{
    private String nombre;
    private int cantidad;
    
    public ProductoNormal(String nombre, int cantidad){
        this.nombre = nombre;
        this.cantidad = cantidad;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public synchronized int getCantidad(){
        return cantidad;
    }
    
    @Override
    public synchronized void actualizarCantidad(int cantidad){
        this.cantidad = cantidad;
    }
}

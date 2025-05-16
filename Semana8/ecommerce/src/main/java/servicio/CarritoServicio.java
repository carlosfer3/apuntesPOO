package servicio;

import java.util.ArrayList;
import java.util.List;
import modelo.Producto;

public class CarritoServicio {
    private List<Producto> carrito = new ArrayList<>();
    
    public void agregarAlCarrito(Producto producto) {
        carrito.add(producto);
    }
    
    public void eliminarDelCarrito(String nombre) {
        System.out.println("por el momento no se puede eliminar un producto del carrito");
    }
    
    public void vaciarCarrito() {
        carrito.clear();
    }
    
    public List<Producto> obtenerProductos() {
        return carrito;
    }
   
}

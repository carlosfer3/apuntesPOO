package datos;

import java.util.List;

public interface GestionInventario {
    void agregarProducto(String nombre, int cantidad);
    ProductoNormal obtenerProducto(String nombre);
    List<ProductoNormal> obtenerProductos();
    void realizarOperacion(String nombre, int cantidad);
    
}

package operaciones;

import datos.Inventario;
import datos.ProductoNormal;
import javax.swing.JOptionPane;

public class TransferenciaInventario extends OperacionInventario {
    private Inventario inventarioDestino;
    
    public TransferenciaInventario(String producto, int cantidad, Inventario InventarioDestino){
        super(producto, cantidad);
        this.inventarioDestino = InventarioDestino;
    }
    
    public void validarProducto(Inventario inventario){
        super.validarProducto(inventario, true); 
        
        ProductoNormal productoExistente = inventario.obtenerProducto(producto);
        if(productoExistente.getCantidad() < cantidad){
            JOptionPane.showMessageDialog(null, "No hay sufciente cantidad para transferir.");
            throw new IllegalArgumentException();
        }
    }
    @Override
    public void ejecutar(Inventario inventario){
        validarProducto(inventario);
        
        // Obtener el producto en el inventario origen
        ProductoNormal productoExistente = inventario.obtenerProducto(producto);
        
        // Reducir la cantidad del producto en el inventario origen
        productoExistente.actualizarCantidad(productoExistente.getCantidad()- cantidad);
        
        ProductoNormal productoDestino = inventarioDestino.obtenerProducto(producto);
        if (productoDestino != null){
            productoDestino.actualizarCantidad(productoExistente.getCantidad() + cantidad);
        } else {
            inventarioDestino.agregarProducto(producto, cantidad);
        }
        
        JOptionPane.showMessageDialog(null, "Transferencia realizada con exito.");
        
    }
    
}

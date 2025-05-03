package operaciones;

import datos.Inventario;
import datos.ProductoNormal;

public class MostrarInventario {
    public static String obtenerInventario(Inventario inventario){
        StringBuilder inventarioText = new StringBuilder("Inventario:\n");
        
        for (ProductoNormal producto : inventario.obtenerProductos()) {
            inventarioText.append(producto.getNombre())
                          .append(" - Cantidad: ")
                          .append(producto.getCantidad())
                          .append("\n");
        }

        return inventarioText.toString();
    }
    
}

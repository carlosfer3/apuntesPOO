package servicio;

import java.util.List;
import modelo.Cliente;
import modelo.Pedido;
import modelo.Producto;
import pago.FormaDePago;
import pago.PagoTarjeta;

public class PedidoServicio {
    private final CarritoServicio carrito;
    private FormaDePago pago;

    public PedidoServicio(CarritoServicio carrito) {
        this.carrito = carrito;
        this.pago = new PagoTarjeta();
    }

    public Pedido crearPedido(Cliente cliente) {
        List<Producto> productosCarrito = carrito.obtenerProductos();
        if (productosCarrito.isEmpty()) {
            System.out.println("El carrito está vacío. No se puede realizar el pedido.");
            return null;
        }

        return new Pedido("001", productosCarrito, cliente, pago, this.calcularImporte());
    }

    public double calcularImporte() {
        double total = 0;
        for(Producto p : carrito.obtenerProductos()) {
            total += p.getPrecio();
        }
        
        return total;
    }
} 
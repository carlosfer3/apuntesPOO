package servicio;

import base.GestorDePedidos;
import modelo.Pedido;

public class ProcesadorPedido extends Thread{
    private final Pedido pedido;
    private GestorDePedidos gestorPedidos;
    
    public ProcesadorPedido(Pedido pedido) {
        this.pedido = pedido;
    }
    
    @Override
    public void run() {
        gestorPedidos = GestorDePedidos.getInstancia();
        gestorPedidos.agregarPedido(pedido);
        System.out.println("Procesando pedido " + pedido.getIdPedido());
        gestorPedidos.mostrarPedidosDelGestor();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        gestorPedidos.pedidoEntregar(pedido.getIdPedido());
        gestorPedidos.mostrarPedidosDelGestor();
        System.out.println("Pedido listo: " + pedido.getIdPedido() + " para enviar a la direccion: " + pedido.getCliente().getDireccion());
    }
}

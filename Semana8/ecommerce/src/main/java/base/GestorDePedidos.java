package base;

import java.util.HashMap;
import modelo.Pedido;

public class GestorDePedidos {
    private static GestorDePedidos instancia;
    private HashMap<String, Pedido> pedidosLista= new HashMap<>();
    
    private GestorDePedidos() {}
    
    public static synchronized GestorDePedidos getInstancia() {
        if (instancia == null) {
            instancia = new GestorDePedidos();
        }
        
        return instancia;
    }
    
    public synchronized void agregarPedido(Pedido pedido) {
        pedidosLista.put(pedido.getIdPedido(), pedido);
    }
    
    public synchronized void pedidoEntregar(String idPedido) {
        pedidosLista.remove(idPedido);
    }
    
    public synchronized void mostrarPedidosDelGestor() {
        System.out.println("Pedidos en el gestor de pedidos: ");
        for(Pedido p : pedidosLista.values()) {
            System.out.println("\tId Pedido: " + p.getIdPedido());
        }
    }
}

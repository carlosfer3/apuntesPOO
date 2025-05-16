package fabrica.comprobante;

import modelo.Comprobante;
import modelo.Pedido;

public interface ComprobanteFabrica {
    public Comprobante crearComprobante(Pedido pedidoRealizado);
}

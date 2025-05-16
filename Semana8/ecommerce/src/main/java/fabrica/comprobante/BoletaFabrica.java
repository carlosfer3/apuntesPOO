package fabrica.comprobante;

import modelo.Comprobante;
import modelo.Pedido;
import java.time.LocalDate;

public class BoletaFabrica implements ComprobanteFabrica{
    @Override
    public Comprobante crearComprobante(Pedido pedidoRealizado) {
        LocalDate fecha = LocalDate.now();
        
        return new Boleta("001", pedidoRealizado.getCliente(), pedidoRealizado.getProductos(), fecha, pedidoRealizado.getImporteTotal());
    }
}

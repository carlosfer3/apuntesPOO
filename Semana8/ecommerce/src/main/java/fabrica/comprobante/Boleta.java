package fabrica.comprobante;

import java.time.LocalDate;
import java.util.List;
import modelo.Cliente;
import modelo.Comprobante;
import modelo.Producto;

public class Boleta implements Comprobante{
    private String idBoleta;
    private Cliente cliente;
    private List<Producto> productos;
    private LocalDate fecha;
    private double importeTotal;
    
    public Boleta(String idBoleta, Cliente cliente, List<Producto> productos, LocalDate fecha, double importeTotal) {
        this.idBoleta = idBoleta;
        this.cliente = cliente;
        this.productos = productos;
        this.fecha = fecha;
        this.importeTotal = importeTotal;
    }
    
    @Override
    public void mostrar() {
        System.out.println("BOLETA DE COMPRA\n"
                + "\nid de Boleta: " + idBoleta
                + "\nfecha: " + fecha
                + "\nDatos del cliente: "
                + "\n\tNombre: " + cliente.getNombre()
                + "\n\tCorreo Electronico: " + cliente.getCorreo()
                + "\n\tDireccion de Domicilio: " + cliente.getDireccion()
                + "\nProductos: ");
        
        for(Producto p : productos) {
            System.out.println(p.mostrarInfo());
        }
        
        System.out.println("Importe Total: " + importeTotal);
    }
}

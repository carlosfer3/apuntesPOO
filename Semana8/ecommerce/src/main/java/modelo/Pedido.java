package modelo;

import java.util.ArrayList;
import java.util.List;
import pago.FormaDePago;

public class Pedido {
    private String idPedido;
    private List<Producto> productos = new ArrayList<>();
    private Cliente cliente;
    private FormaDePago formaPago;
    private double importeTotal;
    
    public Pedido(String idPedido, List<Producto> productos, Cliente cliente, FormaDePago formaPago, double importeTotal) {
        this.idPedido = idPedido;
        this.productos = productos;
        this.cliente = cliente;
        this.formaPago = formaPago;
        this.importeTotal = importeTotal;
    }

    public String getIdPedido() {
        return idPedido;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public FormaDePago getFormaPago() {
        return formaPago;
    }

    public double getImporteTotal() {
        return importeTotal;
    }
    
}

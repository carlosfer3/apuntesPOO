package uni.edu.pc1;

import java.util.ArrayList;

abstract class Comprobante implements Calculable, Describible{
    private final Cliente cliente;
    private final ArrayList<Producto> productos;
    private String codigocomprobante;
    private final String fecha;
    protected String tipocomprobante;
    static long rucempresa = 11316516853L;
    static String nombreempresa = "OXXO";
    static String direccion = "Avenida, El Polo 407";
    
    //Overload
    public Comprobante(Cliente cliente, String fecha, String codigocomprobante) {
        this.productos = new ArrayList<>();
        this.cliente = cliente;
        this.fecha = fecha;
        this.codigocomprobante = codigocomprobante;
    }
    public Comprobante(Cliente cliente, String codigocomprobante) {
        this.productos = new ArrayList<>();
        this.cliente = cliente;
        this.fecha = "01/01/2025";
        this.codigocomprobante = codigocomprobante;
    }
    
    public void AgregarProducto(Producto producto) {
        productos.add(producto);
    }
    
    @Override
    public double CalcularImporte() {
        double total = 0;
        for(Producto producto : productos) {
            total += producto.CalcularImporte();
        }
        total = (double) Math.round(total * 100) / 100;
        return total;
    }
    
    public Cliente getCliente() {
        return cliente;
    }
    
    public ArrayList<Producto> getProductos() {
        return productos;
    }
    
    public String getCodigocomprobante() {
        return codigocomprobante;
    }

    public void setCodigocomprobante(String codigocomprobante) {
        this.codigocomprobante = codigocomprobante;
    }
    
    public String getFechaFormateada() {
        return "Fecha (dd/mm/aa): " + fecha;
    }
    
    public String getTipocomprobante() {
        return tipocomprobante;
    }
    
    public long getRucempresa() {
        return rucempresa;
    }

    public String getNombreEmpresa() {
        return nombreempresa;
    }
    
    public String getDireccion() {
        return direccion;
    }
    
    abstract String GenerarComprobante();
}


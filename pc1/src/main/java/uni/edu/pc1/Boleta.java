/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uni.edu.pc1;

/**
 *
 * @author HP
 */
public class Boleta extends Comprobante{
    
    public Boleta(Cliente cliente, String fecha, String codigocomprobante) {
        super(cliente, fecha, codigocomprobante);
        this.tipocomprobante = "BOLETA";
    }
    public Boleta(Cliente cliente, String codigocomprobante) {
        super(cliente, codigocomprobante);
        this.tipocomprobante = "BOLETA";
    }
    
    @Override
    public String getDescripcion() {
        return "Boleta de venta a consumidor final";
    }
    
    @Override
    public String GenerarComprobante(){ 
        String resultado = getDescripcion() + "\n\n"
                + "\t" + getNombreEmpresa() + " S.A.C\n"
                + "RUC: " + getRucempresa() + "\n"
                + getDireccion() + "\n"
                + "-----------------------------------\n"
                + "BOLETA Nro: " + getCodigocomprobante() + "\n"
                + getFechaFormateada() + "\n" 
                + "-----------------------------------\n"
                + "Cliente: \n" + getCliente().getDescripcion()
                + "-----------------------------------\n"
                + "Productos:";
        for(Producto producto : getProductos()) {
            resultado += producto.getDescripcion();
        }
        resultado += "-----------------------------------\n"
                + "TOTAL A PAGAR: \tS/" + super.CalcularImporte()
                + "\nGracias por su compra:)\n"
                + "-----------------------------------\n"
                + "Documento sin valor tributario";
        
        return resultado;
    }
}

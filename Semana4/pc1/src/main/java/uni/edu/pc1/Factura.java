/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uni.edu.pc1;

/**
 *
 * @author HP
 */
public class Factura extends Comprobante{

    public Factura(Cliente cliente, String fecha, String codigocomprobante) {
        super(cliente, fecha, codigocomprobante);
        this.tipocomprobante = "FACTURA";
    }
    public Factura(Cliente cliente, String codigocomprobante) {
        super(cliente, codigocomprobante);
        this.tipocomprobante = "FACTURA";
    }
    
    @Override
    public String getDescripcion() {
        return "Factura electrónica con RUC";
    }
    
    @Override
    public String GenerarComprobante(){ 
        String resultado = getDescripcion() + "\n\n"
                + getNombreEmpresa() + " S.A.C\n"
                + "RUC: " + getRucempresa() + "\n"
                + getDireccion() + "\n"
                + "-----------------------------------\n"
                + "Factura Nro: " + getCodigocomprobante() + "\n"
                + getFechaFormateada() + "\n" 
                + "-----------------------------------\n"
                + "Cliente: \n" + getCliente().getDescripcion()
                + "-----------------------------------\n"
                + "Descripcion de Productos:";
        for(Producto producto : getProductos()) {
            resultado += producto.getDescripcion();
        }
        resultado += "-----------------------------------\n"
                + "TOTAL A PAGAR: \tS/" + super.CalcularImporte()
                + "\nForma de Pago: Contado\n"
                + "-----------------------------------\n"
                + "Representacion impresa de la Factura Electronica\n"
                + "Autorizado por SUNAT";
        
        return resultado;
    }
    
}

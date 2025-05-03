package uni.edu.pc1;

public class ProductoConDescuento extends Producto{
    private double descuento;

    public ProductoConDescuento(String nombre, double precio, int cantidad, String codigo, double descuento) {
        super(nombre, precio, cantidad, codigo);
        this.descuento = descuento;
    }

    public double getDescuento() {
        return getPrecioigv() * getCantidad() * descuento / 100;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
    
    @Override
    public double CalcularImporte() {
        return getPrecioigv() * getCantidad() - getDescuento();
    }
    
    @Override
    public String getDescripcion() {
        return super.getDescripcion() +
                "\n\tDescuento: S/" + getDescuento() +
                "\n\tImporte: S/" + CalcularImporte() + "\n";
    }
}

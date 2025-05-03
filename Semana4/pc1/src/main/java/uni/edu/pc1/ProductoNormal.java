package uni.edu.pc1;

public class ProductoNormal extends Producto{

    public ProductoNormal(String nombre, double precio, int cantidad, String codigo) {
        super(nombre, precio, cantidad, codigo);
    }

    @Override
    public double CalcularImporte() {
        return getPrecioigv() * getCantidad();
    }
    
    @Override
    public String getDescripcion() {
        return super.getDescripcion()
                + "\n\tImporte: " + CalcularImporte()
                + "\n";
    }
}

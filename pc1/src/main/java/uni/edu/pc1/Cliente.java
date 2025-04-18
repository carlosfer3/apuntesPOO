package uni.edu.pc1;

public class Cliente implements Describible{
    private String nombre;
    private String tipodoc;
    private String documento;

    public Cliente(String nombre, String tipodoc, String documento) {
        this.nombre = nombre;
        this.documento = documento;
        this.tipodoc = tipodoc;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getTipoDoc() {
        return tipodoc;
    }
    
    public void setTipodoc(String tipodoc) {
        this.tipodoc = tipodoc;
    }

    public String getDocumento() {
        return documento;
    }
    
    public void setDocumento(String documento) {
        this.documento = documento;
    }
    
    @Override
    public String getDescripcion() {
        return "\tNombre: " +
                nombre + "\n\t"
                + "Tipo de documento: "
                + tipodoc + "\n\t"
                + "Nro documento: "
                + documento + "\n";
    }
}

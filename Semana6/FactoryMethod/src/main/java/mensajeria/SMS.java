package mensajeria;

public class SMS implements Notificacion{
    
    @Override
    public void mandarMensaje() {
        System.out.println("Enviando un SMS con mensaje al contacto 925335928");
    }
}

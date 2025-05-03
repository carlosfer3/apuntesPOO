package mensajeria;

public class Email implements Notificacion{

    @Override
    public void mandarMensaje() {
        System.out.println("Enviando un email...");
    }
}

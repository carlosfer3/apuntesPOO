package mensajeria;

public class Push implements Notificacion{
    
    
    @Override
    public void mandarMensaje() {
        System.out.println("La aplicacion Spotify le envia un mensaje de alerta");
    }
}

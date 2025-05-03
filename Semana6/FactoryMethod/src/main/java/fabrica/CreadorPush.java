package fabrica;

import mensajeria.Notificacion;
import mensajeria.Push;

public class CreadorPush extends CreadorNotificacion{
    
    @Override
    public Notificacion crearNotificacion() {
        return new Push();
    }
}

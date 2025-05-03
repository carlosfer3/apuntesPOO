package fabrica;

import mensajeria.Notificacion;
import mensajeria.SMS;

public class CreadorSMS extends CreadorNotificacion{
    
    @Override
    public Notificacion crearNotificacion() {
        return new SMS();
    }
}

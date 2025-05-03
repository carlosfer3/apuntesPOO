package fabrica;

import mensajeria.Notificacion;
import mensajeria.Email;

public class CreadorEmail extends CreadorNotificacion{
    @Override
    public Notificacion crearNotificacion() {
        return new Email();
    }
}

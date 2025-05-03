package uni.edu.factorymethod;

import fabrica.*;
import mensajeria.Notificacion;

public class FactoryMethod {

    public static void main(String[] args) {
        CreadorNotificacion creadoremail = new CreadorEmail();
        CreadorNotificacion creadorsms = new CreadorSMS();
        CreadorNotificacion creadorpush = new CreadorPush();
        
        
        Notificacion email = creadoremail.crearNotificacion();
        Notificacion sms = creadorsms.crearNotificacion();
        Notificacion push = creadorpush.crearNotificacion();
        
        
        System.out.println("EMAIL");
        email.mandarMensaje();
        System.out.println("SMS");
        sms.mandarMensaje();
        System.out.println("PUSH");
        push.mandarMensaje();
    }
}

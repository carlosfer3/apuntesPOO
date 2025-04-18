package uni.edu.pe.mihilo;

import java.util.logging.Level;
import java.util.logging.Logger;

public class EjemploHilos {

public static void main(String[] args) {
        Buffer buffer = new Buffer();

        Thread productor = new Thread(() -> {
            try {
                for (int i = 0; i < 50; i++) {
                    buffer.producir();
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                System.out.println("Productor interrumpido.");
            }
        });

        Thread consumidor = new Thread(() -> {
            try {
                for (int i = 0; i < 50; i++) {
                    buffer.consumir();
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                System.out.println("Consumidor interrumpido.");
            }
        });

        productor.start();
        consumidor.start();
    }

    public static void main2(String[] args) {
        MiHilo hilo1 = new MiHilo("Hilo-1",3000,10);
        MiHilo hilo2 = new MiHilo("Hilo-2",5000,6);

        // Iniciar los hilos
        hilo1.start();
        hilo2.start();
        System.out.println("Ya inicio");
        try {
            hilo1.join();
            hilo2.join();
            System.out.println("Termino");
        } catch (InterruptedException ex) {
            Logger.getLogger(EjemploHilos.class.getName()).log(Level.SEVERE, null, ex);
        }

        // Mensaje del hilo principal (main)
        System.out.println("Hilos iniciados desde el hilo principal");
    }
}

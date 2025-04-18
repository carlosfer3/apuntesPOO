package uni.edu.pe.mihilo;

public class Buffer {
    private boolean disponible = false;

    synchronized void producir() throws InterruptedException {
        while (disponible) {
            wait(); // Espera hasta que se consuma
        }
        System.out.println("🛠️ Produciendo dato...");
        disponible = true;
        notify(); // Notifica al consumidor
    }

    synchronized void consumir() throws InterruptedException {
        while (!disponible) {
            wait(); // Espera hasta que se produzca
        }
        System.out.println("📥 Consumiendo dato...");
        disponible = false;
        notify(); // Notifica al productor
    }
}

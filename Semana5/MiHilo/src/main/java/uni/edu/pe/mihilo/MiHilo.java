package uni.edu.pe.mihilo;

// Clase que extiende Thread
class MiHilo extends Thread {
    private String nombre;
    private int valor;
    private int repeticion;

    public MiHilo(String nombre, int valor, int repeticion) {
        this.nombre = nombre;
        this.valor = valor;
        this.repeticion = repeticion;
    }
    

    // El método run es lo que se ejecuta cuando se inicia el hilo
    @Override
    public void run() {
        for (int i = 0; i < repeticion; i++) {
            System.out.println(nombre + " está corriendo: " + i);
            try {
                Thread.sleep(valor); // Pausa el hilo por 500 ms
                System.out.println("me dormi: " + nombre + " rep:" + i);
            } catch (InterruptedException e) {
                System.out.println(nombre + " fue interrumpido");
            }
        }
        System.out.println(nombre + " ha terminado.");
    }
}




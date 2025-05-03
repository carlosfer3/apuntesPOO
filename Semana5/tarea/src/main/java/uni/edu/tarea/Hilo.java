package uni.edu.tarea;

abstract class Hilo extends Thread{
    private int limite;
    
    public Hilo(int limite) {
        this.limite = limite;
    }

    public int getLimite() {
        return limite;
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }
    
}

package uni.edu.tarea;

public class SumaPares extends Hilo{
    public SumaPares(int limite) {
        super(limite);
    }
    
    @Override
    public void run() {
        int resultado = 0;
        for(int i = 0; i < super.getLimite(); i++) {
            if(i % 2 == 0) {
                resultado += i;
                System.out.println("La suma de pares hasta el numero " + i + " es " + resultado);
            }
        }
    }
}

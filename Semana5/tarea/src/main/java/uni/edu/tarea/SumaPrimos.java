package uni.edu.tarea;

public class SumaPrimos extends Hilo{
    public SumaPrimos(int limite) {
        super(limite);
    }
    
    public boolean EsPrimo(int numero) {
        if(numero == 0 || numero == 1) {
            return false;
        }
        
        for(int i = 2; i < numero; i++) {
            if(numero % i == 0) {
                return false;
            }
        }
        
        return true;
    }
    
    @Override
    public void run() {
        int resultado = 0;
        for(int i = 0; i < super.getLimite(); i++) {
            if(EsPrimo(i)) {
                resultado += i;
                System.out.println("La suma de primos hasta " + i + " es " + resultado);
            }
        }
    }
}

package uni.edu.tarea;

public class SumaImpares extends Hilo{
    public SumaImpares(int limite) {
        super(limite);
    }
    
    @Override
    public void run() {
        int resultado = 0;
        for(int i = 0; i < super.getLimite(); i++) {
            if(i % 2 != 0) {
                resultado += i;
                System.out.println("Suma de numeros impares hasta " + i + " es " + resultado);
            }
        }
    }
}

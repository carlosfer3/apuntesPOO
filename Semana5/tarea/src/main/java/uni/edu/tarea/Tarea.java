package uni.edu.tarea;

public class Tarea {

    public static void main(String[] args) {
        int limite = 100;
        SumaPares par = new SumaPares(limite);
        SumaImpares impar = new SumaImpares(limite);
        SumaPrimos primo = new SumaPrimos(limite);
        
        par.start();
        impar.start();
        primo.start();
        
        /*
        try{ 
            par.join();
            impar.join();
            primo.join();
        }   catch(InterruptedException e) {
            System.out.println("Error");
        }
*/
        
        System.out.println("Saliendo del programa");
    }
}

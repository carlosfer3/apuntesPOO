package uni.edu.concurrencia;

import java.util.HashMap;
import java.util.Random;

public class Notas {
    private HashMap<String, Integer> notas= new HashMap<>();
    Random random = new Random();
    
    public Notas(HashMap<String, Integer> notas) {
        this.notas = notas;
    }
    
    public synchronized void setNota(String alumno) {
        int nuevaNota = random.nextInt(21);
        
        notas.put(alumno, nuevaNota);
    }
    
    public synchronized int getNota(String alumno) {
        return notas.get(alumno);
    }
}

package uni.edu.concurrencia;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Hilo extends Thread{
    private int numero;
    private Notas notas;
    private ListaAlumnos lista;
    
    public Hilo(int numero, Notas notas, ListaAlumnos lista) {
        this.numero = numero;
        this.notas = notas;
        this.lista = lista;
    }
    
    @Override
    public void run() {
        for(int i = 0; i < 50; i++) {
            String nombreAlumno = lista.getNombreAlumno();
            notas.setNota(nombreAlumno);
            int nuevaNota = notas.getNota(nombreAlumno);
            System.out.println("El hilo numero " + numero + "cambio al alumno: " + nombreAlumno + 
                                "\tsu nueva nota: " + nuevaNota);
            
            try {
                Hilo.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}

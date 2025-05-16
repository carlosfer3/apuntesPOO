package uni.edu.concurrencia;

import java.util.List;
import java.util.Random;

public class ListaAlumnos {
    private List<Alumno> alumnos;
    Random random = new Random();
    
    public ListaAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }
    
    public synchronized String getNombreAlumno() {
        int numeroAzar = random.nextInt(alumnos.size());
        String nombre = alumnos.get(numeroAzar).getNombre();
        
        return nombre;
    }
}

package uni.edu.concurrencia;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Concurrencia {

    public static void main(String[] args) {
        List<Alumno> alumnos = new ArrayList<>();
        HashMap<String, Integer> notasLista = new HashMap<>();
        Alumno a1 = new Alumno("Carlos");
        Alumno a2 = new Alumno("Felipe");
        Alumno a3 = new Alumno("Yan");
        Alumno a4 = new Alumno("Alejandro");
        Alumno a5 = new Alumno("Romel");
        Alumno a6 = new Alumno("Albino");
        
        alumnos.add(a1);
        alumnos.add(a2);
        alumnos.add(a3);
        alumnos.add(a4);
        alumnos.add(a5);
        alumnos.add(a6);
        ListaAlumnos lista = new ListaAlumnos(alumnos);
        
        notasLista.put(a1.getNombre(), 20);
        notasLista.put(a2.getNombre(), 19);
        notasLista.put(a3.getNombre(), 18);
        notasLista.put(a4.getNombre(), 17);
        notasLista.put(a5.getNombre(), 16);
        notasLista.put(a6.getNombre(), 15);
        Notas notas = new Notas(notasLista);
        
        Hilo h1 = new Hilo(1, notas, lista);
        Hilo h2 = new Hilo(2, notas, lista);
        
        for(Alumno a : alumnos) {
            String nombre = a.getNombre();
            int nota = notas.getNota(nombre);
            System.out.println("Alumno: " + nombre + "\nNota: " + nota);
        }
        h1.start();
        h2.start();
    }
}

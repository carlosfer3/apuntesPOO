package uni.edu.projectjava;

public class ProjectJava {

    public static void main(String[] args) {
        Persona persona1 = new Persona();
        Persona persona2 = new Persona("Andrez", "Castro", 21);
        persona1.Representar();
        persona2.Representar();
        
        persona1.setApellido("Audante");
        persona1.setNombre("Carlos");
        persona1.setEdad(65);
        persona1.Representar();
        
        
        Profesor profesor = new Profesor("Carlos", "Sotelo", 62, "65539", 5);
        profesor.setNacionalidad("Peruano");
        profesor.setDni("92258336");
        profesor.Representar();
        System.out.println(profesor.getDni() + " " + profesor.getNacionalidad());
        profesor.Enseñar();
        profesor.Asistir();
        profesor.Enseñar();
        profesor.Retirarse();
        
        
        Alumno alumno = new Alumno("Ricco", "Rashuaman", 20, "20239845A", 1);
        alumno.Representar();
        alumno.setNacionalidad("venezolano");
        System.out.println("soy " + alumno.getNacionalidad());
        alumno.Asistir();
        alumno.Retirarse();
    }
}

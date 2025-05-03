package uni.edu.projectjava;

public class Profesor extends Persona implements MetodosInterface{
    private String codigoProfesor;
    private int tiempoEnseñando;
    private boolean seEncuentra = false;
    
    public Profesor(String nombre, String apellido, int edad, String codigoProfesor, int tiempoEnseñando) {
        super(nombre, apellido, edad);
        this.codigoProfesor = codigoProfesor;
        this.tiempoEnseñando = tiempoEnseñando;
    }
    
    @Override
    public void Asistir() {
        if(seEncuentra != true) {
            seEncuentra = true;
            System.out.println("El profesor llego a clase");
        }   else{
            System.out.println("El profesor ya se encuentra en la U");
        }
    }
    @Override
    public void Retirarse() {
        if(seEncuentra == true) {
            seEncuentra = false;
            System.out.println("El profesor se retira de la clase");
        }   else{
            System.out.println("El profesor no fue a clase");
        }
    }
    
    public void Enseñar() {
        if(seEncuentra == true) {
            System.out.println("El profesor empezo a dictar clase");
        }   else{
            System.out.println("El profesor no puede dictar la clase porque no asistio");
        }
    }
    
    @Override
    public void Representar() {
        super.Representar();
        System.out.println("Mi codigo de docencia es " + codigoProfesor
                + " y llevo enseñando " + tiempoEnseñando);
    }
}

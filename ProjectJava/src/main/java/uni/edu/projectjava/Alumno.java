package uni.edu.projectjava;

public class Alumno extends Persona implements MetodosInterface{
    private String codigoAlumno;
    private int ciclo;
    
    public Alumno(String nombre, String apellido, int edad, String codigoAlumno, int ciclo) {
        super(nombre, apellido, edad);
        this.codigoAlumno = codigoAlumno;
        this.ciclo = ciclo;
    }
    
    @Override
    public void Representar() {
        super.Representar();
        System.out.println("mi codigo de alumno es " + codigoAlumno + " y estoy en el " + ciclo + " ciclo");
        if(ciclo == 1) {
            System.out.println("Y si, soy cachimbo");
        }
    }
    @Override
    public void Asistir() {
        System.out.println(getNombre() + " asistio a clase");
    }
    @Override
    public void Retirarse() {
        System.out.println(getNombre() + " se retiro de la clase");
    }
}

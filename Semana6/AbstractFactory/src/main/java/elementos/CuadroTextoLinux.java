package elementos;

public class CuadroTextoLinux implements CuadroTexto {
    @Override
    public void escribir(String texto) {
        System.out.println("cuadro de texto de Linux: " + texto);
    }
}

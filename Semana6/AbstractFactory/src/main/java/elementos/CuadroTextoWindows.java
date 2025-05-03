package elementos;

public class CuadroTextoWindows implements CuadroTexto{
    @Override
    public void escribir(String texto) { 
        System.out.println("cuadro de texto de Windows: " + texto);
    }
}

package fabrica;

import elementos.Boton;
import elementos.Menu;
import elementos.CuadroTexto;

public interface FabricaDeElementos {
    public Boton crearBoton();
    public Menu crearMenu();
    public CuadroTexto crearCuadroTexto();
}

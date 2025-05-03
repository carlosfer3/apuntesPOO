package fabrica;

import elementos.Boton;
import elementos.CuadroTexto;
import elementos.Menu;
import elementos.BotonWindows;
import elementos.MenuWindows;
import elementos.CuadroTextoWindows;

public class FabricaWindows implements FabricaDeElementos{
    
    @Override
    public Boton crearBoton() {
        return new BotonWindows();
    };
    
    @Override
    public Menu crearMenu() {
        return new MenuWindows();
    };
    
    @Override
    public CuadroTexto crearCuadroTexto() {
        return new CuadroTextoWindows();
    };
}

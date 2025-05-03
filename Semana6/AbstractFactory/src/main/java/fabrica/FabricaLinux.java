package fabrica;

import elementos.Menu;
import elementos.Boton;
import elementos.CuadroTexto;
import elementos.MenuLinux;
import elementos.BotonLinux;
import elementos.CuadroTextoLinux;

public class FabricaLinux implements FabricaDeElementos{
    
    @Override
    public Boton crearBoton() {
        return new BotonLinux();
    }

    @Override
    public Menu crearMenu() {
        return new MenuLinux();
    }

    @Override
    public CuadroTexto crearCuadroTexto() {
        return new CuadroTextoLinux();
    }
    
}

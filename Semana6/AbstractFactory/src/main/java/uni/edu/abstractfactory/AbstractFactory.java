package uni.edu.abstractfactory;

import fabrica.*;
import elementos.Boton;
import elementos.CuadroTexto;
import elementos.Menu;

public class AbstractFactory {

    public static void main(String[] args) {
        FabricaDeElementos fabricaW = new FabricaWindows();
        FabricaDeElementos fabricaL = new FabricaLinux();
        
        Boton botonW = fabricaW.crearBoton();
        CuadroTexto cuadrotextoW = fabricaW.crearCuadroTexto();
        Menu menuW = fabricaW.crearMenu();
        
        Boton botonL = fabricaL.crearBoton();
        CuadroTexto cuadrotextoL = fabricaL.crearCuadroTexto();
        Menu menuL = fabricaL.crearMenu();
        
        botonW.dibujar();
        botonL.dibujar();
        
        cuadrotextoW.escribir("WINDOWS 11");
        cuadrotextoL.escribir("El inicio de todo, Linux");
        
        menuW.mostrar();
        menuL.mostrar();
    }
}

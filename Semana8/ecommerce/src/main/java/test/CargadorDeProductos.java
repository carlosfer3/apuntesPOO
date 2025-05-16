package test;

import base.BaseDeDatos;
import fabrica.producto.PS4Fabrica;
import fabrica.producto.PS5Fabrica;
import fabrica.producto.ProductoFabrica;
import java.util.ArrayList;
import java.util.List;
import modelo.Accesorio;
import modelo.Consola;
import modelo.Videojuego;

public class CargadorDeProductos {
    public static void cargarProductos(BaseDeDatos db) {
        List<Videojuego> videojuegos = new ArrayList<>();
        List<Consola> consolas = new ArrayList<>();
        List<Accesorio> accesorios = new ArrayList<>();
        
        ProductoFabrica fabricaPS4 = new PS4Fabrica();
        ProductoFabrica fabricaPS5 = new PS5Fabrica();
        
        Consola consolaPS4 = fabricaPS4.crearConsola();
        Consola consolaPS5 = fabricaPS5.crearConsola();
        consolas.add(consolaPS4);
        consolas.add(consolaPS5);
        
        String nombre = "Marvel's Spider-Man";
        double precio = 199.99;
        String descripcion = "Estás ante un Peter Parker mucho más experimentado en la lucha contra el crimen organizado en la Nueva York de Marvel. Al mismo tiempo, lucha para equilibrar su caótica vida personal y su carrera mientras carga con el destino de millones de neoyorquinos sobre sus hombros.";
        Videojuego videojuegoPS4 = fabricaPS4.crearVideojuego(nombre, precio, descripcion);
    
        nombre = "Marvel's Spider-Man 2";
        precio = 279.99;
        descripcion = "Los Spider-Men Peter Parker y Miles Morales regresan para una nueva y emocionante aventura de la aclamada franquicia Marvel's Spider-Man para PS5.";
        Videojuego videojuegoPS5 = fabricaPS5.crearVideojuego(nombre, precio, descripcion);
        
        videojuegos.add(videojuegoPS4);
        videojuegos.add(videojuegoPS5);
        
        nombre = "DualShock PS4";
        precio = 105;
        descripcion = "Mando para PS4 inalambrico";
        Accesorio accesorioPS4 = fabricaPS4.crearAccesorio(nombre, precio, descripcion);
        
        nombre = "DualShock PS5";
        precio = 291;
        descripcion = "Mando para PS5 inalambrico";
        Accesorio accesorioPS5 = fabricaPS5.crearAccesorio(nombre, precio, descripcion);
        
        accesorios.add(accesorioPS4);
        accesorios.add(accesorioPS5);
        
        db.setConsolas(consolas);
        db.setAccesorios(accesorios);
        db.setVideojuegos(videojuegos);
    }
}

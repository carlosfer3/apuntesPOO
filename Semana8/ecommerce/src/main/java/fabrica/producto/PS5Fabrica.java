package fabrica.producto;

import modelo.Accesorio;
import modelo.Consola;
import modelo.Videojuego;

public class PS5Fabrica implements ProductoFabrica{
    private final String plataforma = "PS5";
    @Override
    public Consola crearConsola() {
        return new Consola("Consola PS5", 2500, "Consola", "Consola de PS5 2TB", plataforma);
    }

    @Override
    public Videojuego crearVideojuego(String nombre, double precio, String descripcion) {
        return new Videojuego(nombre, precio, "Videojuego", descripcion, plataforma);
    }

    @Override
    public Accesorio crearAccesorio(String nombre, double precio, String descripcion) {
        return new Accesorio(nombre, precio, "Accesorio", descripcion, plataforma);
    }
}

package fabrica.producto;

import modelo.Accesorio;
import modelo.Consola;
import modelo.Videojuego;

public class PS4Fabrica implements ProductoFabrica{
    private final String plataforma = "PS4";
    @Override
    public Consola crearConsola() {
        return new Consola("Consola PS4", 1200, "Consola", "Consola de PS4 ultima edicion", plataforma);
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

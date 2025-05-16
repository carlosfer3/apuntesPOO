package fabrica.producto;

import modelo.Accesorio;
import modelo.Consola;
import modelo.Videojuego;

public interface ProductoFabrica {
    public Consola crearConsola();
    public Videojuego crearVideojuego(String nombre, double precio, String descripcion);
    public Accesorio crearAccesorio(String nombre, double precio, String descripcion);
}

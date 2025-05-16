package base;

import java.util.ArrayList;
import java.util.List;
import modelo.Accesorio;
import modelo.Consola;
import modelo.Producto;
import modelo.Videojuego;

public class BaseDeDatos {
    private static BaseDeDatos instancia;
    private List<Consola> consolas;
    private List<Accesorio> accesorios;
    private List<Videojuego> videojuegos;
    
    private BaseDeDatos() {}
    
    public static BaseDeDatos getInstancia() {
        if(instancia == null) {
            instancia = new BaseDeDatos();
        }
        
        return instancia;
    }
    
    public void setVideojuegos(List<Videojuego> videojuegos) {
        this.videojuegos = videojuegos;
    }
    
    public List<Producto> getVideojuegos() {
        return new ArrayList<>(videojuegos);
    }
    
    public void setConsolas(List<Consola> consolas) {
        this.consolas = consolas;
    }
    
    public List<Producto> getConsolas() {
        return new ArrayList<>(consolas);
    }
    
    public void setAccesorios(List<Accesorio> accesorios) {
        this.accesorios = accesorios;
    }
    
    public List<Producto> getAccesorios() {
        return new ArrayList<>(accesorios);
    }
    
    public Producto getProducto(String nombre) {
        for(Producto p : consolas) {
            if(p.getNombre().equals(nombre)) {
                return p;
            }
        }
        for(Producto p : videojuegos) {
            if(p.getNombre().equals(nombre)) {
                return p;
            }
        }
        for(Producto p : accesorios) {
            if(p.getNombre().equals(nombre)) {
                return p;
            }
        }
        return null;
    }
}

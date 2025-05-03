package uni.edu.prototype;

import java.util.ArrayList;
import java.util.List;

public class Pokemon implements PokemonPrototype{
    private String nombre;
    private String tipo;
    private int nivel;
    private List<String> ataques = new ArrayList<>();
    
    public Pokemon(String nombre, String tipo, int nivel, List<String> ataques) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.nivel = nivel;
        this.ataques = ataques;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getTipo() {
        return tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public int getNivel() {
        return nivel;
    }
    
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    
    public void agregarAtaque(String ataque) {
        ataques.add(ataque);
    }
    
    public void eliminarAtaque(String ataque) {
        for (int i = 0; i < ataques.size(); i++) {
            String a = ataques.get(i);
            if (a.equals(ataque)) {
                ataques.remove(i);
                System.out.println("ataque " + ataque + " eliminado correctamente");
                
                return;
            }
        }
        
        System.out.println("El pokemon no tiene esa habilidad");
    }
    
    public List<String> getAtaques() {
        return ataques;
    }
    
    public void mostrarPokemon() {
        System.out.println("Pokemon{" +
                "nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                ", nivel=" + nivel +
                ", ataques=" + ataques +
                '}');
    }
    
    @Override
    public PokemonPrototype clonar() {
        List<String> ataquesClon = new ArrayList<>(ataques);
        return new Pokemon(nombre, tipo, nivel, ataquesClon);
    }
}

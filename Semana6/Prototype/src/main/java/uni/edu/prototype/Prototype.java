package uni.edu.prototype;

import java.util.List;
import java.util.ArrayList;

public class Prototype {

    public static void main(String[] args) {
        List<String> ataques = new ArrayList<>();
        ataques.add("Impactrueno");
        ataques.add("Placaje");

        Pokemon p1 = new Pokemon("Pikachu", "Eléctrico", 12, ataques);
        PokemonPrototype clon = p1.clonar(); // El tipo es PokemonPrototype
        Pokemon p2 = (Pokemon) clon;

        p2.setNombre("Raychu");
        p2.agregarAtaque("Rayo");
        p2.setNivel(p2.getNivel() + 1);

        System.out.println("Original:");
        p1.mostrarPokemon();
        System.out.println("Clon:");
        p2.mostrarPokemon();
    }
}

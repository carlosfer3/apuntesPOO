package uni.edu.builder;

import java.util.ArrayList;
import java.util.List;

public class ItinerarioBuilder {
    private String vuelo;
    private String hotel;
    private String cocheAlquiler;
    private List<String> excursiones = new ArrayList<>();

    // Métodos para agregar opciones al itinerario
    public ItinerarioBuilder agregarVuelo(String vuelo) {
        this.vuelo = vuelo;
        return this;
    }

    public ItinerarioBuilder agregarHotel(String hotel) {
        this.hotel = hotel;
        return this;
    }

    public ItinerarioBuilder agregarCocheAlquiler(String cocheAlquiler) {
        this.cocheAlquiler = cocheAlquiler;
        return this;
    }

    public ItinerarioBuilder agregarExcursion(String excursion) {
        this.excursiones.add(excursion);
        return this;
    }

    // Método para construir el objeto Itinerario
    public Itinerario construir() {
        Itinerario itinerario = new Itinerario();
        itinerario.setVuelo(vuelo);
        itinerario.setHotel(hotel);
        itinerario.setCocheAlquiler(cocheAlquiler);
        itinerario.setExcursiones(excursiones);
        return itinerario;
    }
}


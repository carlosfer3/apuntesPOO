package uni.edu.builder;

import java.util.Arrays;

public class Builder {
    public static void main(String[] args) {
        ItinerarioBuilder builder = new ItinerarioBuilder();

        Itinerario itinerario = builder
                .agregarVuelo("Vuelo a París")
                .agregarHotel("Hotel en París")
                .agregarCocheAlquiler("Coche en París")
                .agregarExcursion("Excursión a la Torre Eiffel")
                .agregarExcursion("Paseo en barco por el Sena")
                .construir();

        System.out.println(itinerario);
    }
}

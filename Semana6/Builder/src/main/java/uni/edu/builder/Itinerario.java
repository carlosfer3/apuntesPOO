package uni.edu.builder;

import java.util.List;

public class Itinerario {
    private String vuelo;
    private String hotel;
    private String cocheAlquiler;
    private List<String> excursiones;

    public String getVuelo() {
        return vuelo;
    }

    public void setVuelo(String vuelo) {
        this.vuelo = vuelo;
    }

    public String getHotel() {
        return hotel;
    }

    public void setHotel(String hotel) {
        this.hotel = hotel;
    }

    public String getCocheAlquiler() {
        return cocheAlquiler;
    }

    public void setCocheAlquiler(String cocheAlquiler) {
        this.cocheAlquiler = cocheAlquiler;
    }

    public List<String> getExcursiones() {
        return excursiones;
    }

    public void setExcursiones(List<String> excursiones) {
        this.excursiones = excursiones;
    }

    @Override
    public String toString() {
        return "Itinerario{" +
                "vuelo='" + vuelo + '\'' +
                ", hotel='" + hotel + '\'' +
                ", cocheAlquiler='" + cocheAlquiler + '\'' +
                ", excursiones=" + excursiones +
                '}';
    }
}

package utils.validadores;

import utils.validadores.Validador;
import utils.adaptadores.DatosPersona;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import javax.swing.JOptionPane;

public class ValidadorFechaNacimiento implements Validador {
    private Validador siguiente;

    public ValidadorFechaNacimiento() {}

    @Override
    public void setSiguiente(Validador siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public void validar(Object datos) throws Exception {
        if (!(datos instanceof DatosPersona)) {
            return;
        }

        DatosPersona dp = (DatosPersona) datos;

        String fechaStr = dp.getFechaNacimiento();

        if (!validarFecha(fechaStr)) {
            JOptionPane.showMessageDialog(
                null,
                "Fecha de nacimiento inválida o formato incorrecto (yyyy-MM-dd)",
                "Error registro Persona",
                JOptionPane.ERROR_MESSAGE
            );
            throw new Exception();
        }

        if (siguiente != null) {
            siguiente.validar(datos);
        }
    }

    private boolean validarFecha(String fechaStr) {
        if (fechaStr == null || fechaStr.trim().isEmpty()) {
            return false;
        }

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        try {
            LocalDate fecha = LocalDate.parse(fechaStr, formato);

            // Ejemplo: no permitir fechas futuras
            if (fecha.isAfter(LocalDate.now())) {
                return false;
            }

            return true;
        } catch (DateTimeParseException e) {
            return false;
        }
    }
}


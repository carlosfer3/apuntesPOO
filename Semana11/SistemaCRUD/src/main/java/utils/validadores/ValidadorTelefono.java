package utils.validadores;

import utils.validadores.Validador;
import utils.adaptadores.DatosPersona;
import javax.swing.JOptionPane;

public class ValidadorTelefono implements Validador {
    private Validador siguiente;

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
        String telefono = dp.getTelefono();

        if (telefono == null || telefono.trim().isEmpty()) {
            JOptionPane.showMessageDialog(
                null,
                "Debe de ingresar un numero de telefono",
                "Error registro Persona",
                JOptionPane.ERROR_MESSAGE
            );
            throw new Exception();
        }

        if (!telefono.matches("\\d{9}")) {
            JOptionPane.showMessageDialog(
                null,
                "Teléfono inválido. Debe tener 9 dígitos y solo contener números",
                "Error registro Persona",
                JOptionPane.ERROR_MESSAGE
            );
            throw new Exception();
        }
        
        if (telefono.charAt(0) != '9') {
            JOptionPane.showMessageDialog(
                null,
                "El primer digito de un numero telefonico es siempre con 9",
                "Error registro Persona",
                JOptionPane.ERROR_MESSAGE
            );
            throw new Exception();
        }

        if (siguiente != null) {
            siguiente.validar(datos);
        }
    }
}


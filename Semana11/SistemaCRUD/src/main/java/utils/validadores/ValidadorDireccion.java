package utils.validadores;

import utils.validadores.Validador;
import utils.adaptadores.DatosPersona;
import javax.swing.JOptionPane;

public class ValidadorDireccion implements Validador{
    private Validador siguiente;
    public ValidadorDireccion(){}
    
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

        if (dp.getApellido() == null || dp.getApellido().trim().isEmpty()) {
            JOptionPane.showMessageDialog(
                null,
                "Debe de ingresar una direccion",
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

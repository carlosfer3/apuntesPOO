package utils.validadores;

import utils.validadores.Validador;
import utils.adaptadores.DatosPersona;
import javax.swing.JOptionPane;

public class ValidadorApellido implements Validador{
    private Validador siguiente;
    public ValidadorApellido(){}
    
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
        String apellido = dp.getApellido();

        if (apellido == null || apellido.trim().isEmpty()) {
            JOptionPane.showMessageDialog(
                null,
                "Debe de ingresar un apellido",
                "Error registro Persona",
                JOptionPane.ERROR_MESSAGE
            );
            throw new Exception();
        }
        
        char[] caracteres = apellido.toCharArray();
        for (char c : caracteres) {
            if (Character.isDigit(c)) {
                JOptionPane.showMessageDialog(
                    null,
                    "El apellido no debe de contener numeros",
                    "Error registro Persona",
                    JOptionPane.ERROR_MESSAGE
                );
                throw new Exception();
            }
        }

        if (siguiente != null) {
            siguiente.validar(datos);
        }
    }
}

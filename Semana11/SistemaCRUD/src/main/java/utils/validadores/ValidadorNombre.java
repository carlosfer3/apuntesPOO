package utils.validadores;

import utils.adaptadores.DatosPersona;
import javax.swing.JOptionPane;

public class ValidadorNombre implements Validador{
    private Validador siguiente;
    public ValidadorNombre(){}
    
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
        String nombre = dp.getNombre();

        if (nombre == null || nombre.trim().isEmpty()) {
            JOptionPane.showMessageDialog(
                null,
                "Debe de ingresar un nombre",
                "Error registro Persona",
                JOptionPane.ERROR_MESSAGE
            );
            throw new Exception();
        }
        
        char[] caracteres = nombre.toCharArray();
        for (char c : caracteres) {
            if (Character.isDigit(c)) {
                JOptionPane.showMessageDialog(
                    null,
                    "El nombre no debe de contener numeros",
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

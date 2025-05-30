package utils.validadores;

import utils.adaptadores.DatosPersona;

public class ValidadorPersona implements TipoValidador{
    private Validador cadena;
    private DatosPersona datos;

    public ValidadorPersona(DatosPersona datos) {
        this.datos = datos;
        
        Validador valNombre = new ValidadorNombre();
        Validador valApellido = new ValidadorApellido();
        Validador valFecha = new ValidadorFechaNacimiento();
        Validador valDireccion = new ValidadorDireccion();
        Validador valTelefono = new ValidadorTelefono();

        valNombre.setSiguiente(valApellido);
        valApellido.setSiguiente(valFecha);
        valFecha.setSiguiente(valDireccion);
        valDireccion.setSiguiente(valTelefono);

        this.cadena = valNombre;
    }

    public void iniciarCadenaDeResponsabilidad() throws Exception{
        cadena.validar(datos);
    }
}

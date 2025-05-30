package fabrica;

import modelo.Persona;
import utils.adaptadores.DatosPersona;

public interface FabricaPersona {
    public Persona fabricar(DatosPersona datos);
}

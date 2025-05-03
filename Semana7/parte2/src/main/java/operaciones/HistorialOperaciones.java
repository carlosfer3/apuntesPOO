package operaciones;

import java.util.ArrayList;
import java.util.List;

public class HistorialOperaciones {
    private List<String> historial = new ArrayList<>();
    private static HistorialOperaciones instancia;
    
    private HistorialOperaciones() {};
    
    public static HistorialOperaciones getInstancia() {
        if(instancia == null) {
            instancia = new HistorialOperaciones();
        }
        return instancia;
    }
    
    public void agregarOperacion(String operacion){
        historial.add(operacion);
    }
    
    public List<String> obtenerHistorial(){
        return historial;
    }
}

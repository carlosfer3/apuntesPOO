package utils.validadores;

public interface Validador {
    public void setSiguiente (Validador siguiente);
    void validar(Object datos) throws Exception;
}

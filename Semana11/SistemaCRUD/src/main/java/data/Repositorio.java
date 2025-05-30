package data;

import java.util.List;

public interface Repositorio<T> {
    void agregar(T elemento);
    T obtener(int id);
    void eliminar(int id);
    void actualizar(int id, T elemento);
    List<T> listar(); // agrega esto también
}

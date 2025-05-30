package utils.adaptadores;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface Adaptador <T>{
    T adaptar(ResultSet rs) throws SQLException;
}

package uni.edu.modelo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import uni.edu.conexion.Conexion;

public class DistritoDAO {
    public List<String> obtenerDistritos() {
        List<String> distritos = new ArrayList<>();
        try {
            Connection conexion = Conexion.getConexion();
            String query = "Select * from distrito";
            PreparedStatement st = conexion.prepareStatement(query);
            ResultSet rs = st.executeQuery();
            
            while (rs.next()) {
                distritos.add(rs.getString(1));
            }
            
            conexion.close();
            st.close();
            rs.close();
        }   catch(Exception e) {
            e.printStackTrace();
        }  
        
        return distritos;
    }
}

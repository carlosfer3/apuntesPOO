package uni.edu.modelo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import uni.edu.conexion.Conexion;
import uni.edu.modelo.Persona;

public class PersonaDAO {
    private Connection conexion = null;
    private PreparedStatement st = null;
    private ResultSet rs = null;
    
    public PersonaDAO() {}
    
    public int actualizarPersona(Persona p) {
        conexion = Conexion.getConexion();
        int resultado = 0;
        String query = "Update persona set nombre = ?,"
                + "apellido = ?,"
                + "fechaNacimiento = ?,"
                + "direccion = ?,"
                + "distrito = ?"
                + "telefono = ? "
                + " where idPersona = ?";
        try {
            st = conexion.prepareStatement(query);
            st.setString(1, p.getNombre());
            st.setString(2, p.getApellido());
            st.setDate(3, java.sql.Date.valueOf(p.getFechaNacimiento()));
            st.setString(4, p.getDireccion());
            st.setString(5, p.getDistrito());
            st.setInt(6, p.getTelefono());
            st.setInt(7, p.getId());
            resultado = st.executeUpdate();
            
        }   catch(Exception e) {
            e.printStackTrace();
        }   finally {
            try {
                if (conexion != null) {
                    conexion.close();
                }
                if (st != null) {
                    st.close();
                }
            }   catch(Exception e) {
                e.printStackTrace();
            }
        }
        
        return resultado;
    }
    
    public Persona obtenerPersona(String id) {
        Persona p = null;
        conexion = Conexion.getConexion();
        String query = "Select * from persona where idPersona = ?";
        
        try {
            st = conexion.prepareStatement(query);
            st.setInt(1, Integer.parseInt(id));
            rs = st.executeQuery();
            if (rs.next()) {
                p = new Persona(
                        rs.getInt("idPersona"),
                        rs.getString("nombre"),
                        rs.getString("apellido"),
                        rs.getDate("fechaNacimiento").toLocalDate(),
                        rs.getString("direccion"),
                        rs.getString("distrito"),
                        rs.getInt("telefono")
                );
            }
            
        }   catch(Exception e) {
            e.printStackTrace();
        }   finally {
            try {
                if (conexion != null) {
                    conexion.close();
                }
                if (st != null) {
                    st.close();
                }
            }   catch(Exception e) {
                e.printStackTrace();
            }
        }
        
        return p;
    }
    
    public int eliminar(String id) {
        conexion = Conexion.getConexion();
        String query = "Delete from persona where idPersona=?";
        int resultado = 0;
        
        try {
            st = conexion.prepareStatement(query);
            st.setInt(1, Integer.parseInt(id));
            
            resultado = st.executeUpdate();
        }   catch(Exception e) {
            e.printStackTrace();
        }   finally {
            try {
                if (conexion != null) {
                    conexion.close();
                }
                
                if (st != null) {
                    st.close();
                }
            }   catch (Exception e) {
                e.printStackTrace();
            }
        }
        
        return resultado;
    }
    
    public int registrar(Persona p){
        conexion = Conexion.getConexion();
        String query = "Insert into Persona (nombre, apellido, fechanacimiento, direccion, distrito, telefono) values (?, ?, ?, ?, ?, ?)";
        int resultado = 0;
        
        try {
            st = conexion.prepareStatement(query);
            st.setString(1, p.getNombre());
            st.setString(2, p.getApellido());
            st.setDate(3, java.sql.Date.valueOf(p.getFechaNacimiento()));
            st.setString(4, p.getDireccion());
            st.setString(5, p.getDistrito());
            st.setInt(6, p.getTelefono());
            
            resultado = st.executeUpdate();
        }   catch (Exception e) {
            e.printStackTrace();
        }   finally {
            try {
                if (conexion != null) {
                   conexion.close(); 
                }
                
                if (st != null) {
                    st.close();
                }
                
            }   catch(Exception e) {
                e.printStackTrace();
            }
        }
        
        return resultado;
    }
    
    public ArrayList<Persona> listarPersonas(){
        ArrayList<Persona> personas = new ArrayList<>();
        try {
            conexion = Conexion.getConexion();
            String query = "exec selectAllPersonas";
            st = conexion.prepareStatement(query);
            rs = st.executeQuery();
            
            while (rs.next()) {
                int id = rs.getInt("idPersona");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                LocalDate fecha = rs.getDate("fechaNacimiento").toLocalDate();
                String direccion = rs.getString("direccion");
                String distrito = rs.getString("distrito");
                int telefono = rs.getInt("telefono");
                
                Persona p = new Persona(id, nombre, apellido, fecha, direccion, distrito, telefono);
                personas.add(p);
            }
        }   catch(Exception e) {
            e.printStackTrace();
        }   finally{ 
            try {
                if (conexion != null) {
                    conexion.close();
                }
                
                if (st != null) {
                    st.close();
                }
                
                if (rs != null) {
                    rs.close();
                }
            }   catch(Exception e) {
                e.printStackTrace();
            }
        }
        
        return personas;
    }
}

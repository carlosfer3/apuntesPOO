package data;

import data.Repositorio;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import modelo.Persona;
import utils.adaptadores.Adaptador;

public class RepositorioPersonas implements Repositorio<Persona>{
    
    private Connection conexion;
    private Adaptador<Persona> adaptador;
    
    public RepositorioPersonas(Connection conexion, Adaptador<Persona> adaptador) {
        this.conexion = conexion;
        this.adaptador = adaptador;
    }
    
    @Override
    public void agregar(Persona p) {
        String sql = "INSERT INTO persona (nombre, apellido, fechaNacimiento, direccion, telefono) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setString(1, p.getNombre());
            stmt.setString(2, p.getApellido());
            stmt.setDate(3, Date.valueOf(p.getFechaNacimiento()));
            stmt.setString(4, p.getDireccion());
            stmt.setInt(5, p.getTelefono());
            
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    @Override
    public Persona obtener(int id) {
        String sql = "SELECT * FROM persona WHERE idPersona = ?";
        try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                return adaptador.adaptar(rs);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void eliminar(int id) {
        String sql = "DELETE FROM persona WHERE idPersona = ?";
        try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void actualizar(int id, Persona p) {
        String sql = "UPDATE persona SET nombre = ?, apellido = ?, fechaNacimiento = ? WHERE idPersona = ?";
        try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setString(1, p.getNombre());
            stmt.setString(2, p.getApellido());
            stmt.setDate(3, Date.valueOf(p.getFechaNacimiento()));
            stmt.setInt(4, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Persona> listar() {
        List<Persona> lista = new ArrayList<>();
        String sql = "SELECT * FROM persona";
        try (Statement stmt = conexion.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                lista.add(adaptador.adaptar(rs));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

}

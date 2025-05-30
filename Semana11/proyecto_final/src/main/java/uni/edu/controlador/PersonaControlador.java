package uni.edu.controlador;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.time.LocalDate;
import uni.edu.modelo.Persona;
import uni.edu.modelo.dao.DistritoDAO;
import uni.edu.modelo.dao.PersonaDAO;

public class PersonaControlador extends HttpServlet {

    private PersonaDAO pdao = new PersonaDAO();
    private DistritoDAO ddao = new DistritoDAO();
    private final String pagListar = "/vista/personas.jsp";
    private final String pagNuevo = "/vista/nuevo.jsp";
    private final String urlPrincipal = "/proyecto_final/PersonaControlador";
    private final String pagActualizar = "/vista/actualizar.jsp";

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String accion = request.getParameter("accion");
        
        if (accion == null) {
            this.listar(request, response);
        }   else {
            switch (accion) {
                case "nuevo":
                    this.nuevo(request, response);
                    break;
                    
                case "guardar":
                    this.guardar(request, response);
                    break;

                case "eliminar":
                    this.eliminar(request, response);
                    break;
                    
                case "actualizar":
                    this.actualizar(request, response);
                    break;
                
                case "actualizarPersona":
                    this.actualizarPersona(request, response);
                    break;
                default:
                    throw new AssertionError();
            }
        }   
    }

    protected void nuevo(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setAttribute("persona", new Persona());
        request.setAttribute("distritos", ddao.obtenerDistritos());
        request.getRequestDispatcher(pagNuevo).forward(request, response);
    }

    protected void listar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setAttribute("personas", pdao.listarPersonas());
        request.getRequestDispatcher(pagListar).forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

    private void guardar(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String fechaStr = request.getParameter("fecha");
        String direccion = request.getParameter("direccion");
        String distrito = request.getParameter("distrito");
        String telefonoStr = request.getParameter("telefono");

        String mensajeError = "";

        if (nombre == null || nombre.trim().isEmpty()) {
            mensajeError += "El nombre no puede estar vacío. ";
        }
        if (apellido == null || apellido.trim().isEmpty()) {
            mensajeError += "El apellido no puede estar vacío. ";
        }
        if (fechaStr == null || fechaStr.trim().isEmpty()) {
            mensajeError += "La fecha no puede estar vacía. ";
        }
        if (direccion == null || direccion.trim().isEmpty()) {
            mensajeError += "La dirección no puede estar vacía. ";
        }
        if (telefonoStr == null || telefonoStr.trim().isEmpty()) {
            mensajeError += "El teléfono no puede estar vacío. ";
        }

        LocalDate fechaNacimiento = null;
        try {
            fechaNacimiento = LocalDate.parse(fechaStr);
        } catch (Exception e) {
            mensajeError += "La fecha no tiene un formato válido (aaaa-mm-dd). ";
        }

        int telefono = 0;
        if (telefonoStr != null && telefonoStr.matches("\\d{9}")) {
            if (telefonoStr.startsWith("9")) {
                telefono = Integer.parseInt(telefonoStr);
            } else {
                mensajeError += "El teléfono debe comenzar con 9. ";
            }
        } else {
            mensajeError += "El teléfono debe tener exactamente 9 dígitos numéricos. ";
        }

        if (!mensajeError.isEmpty()) {
            Persona p = new Persona(nombre, apellido, fechaNacimiento, direccion, distrito, telefono);
            request.setAttribute("persona", p);
            request.setAttribute("error", mensajeError);
            request.getRequestDispatcher(pagNuevo).forward(request, response);
            return;
        }

        Persona p = new Persona(nombre, apellido, fechaNacimiento, direccion, distrito, telefono);
        if (pdao.registrar(p) != 0) {
            response.sendRedirect(urlPrincipal);
        } else {
            request.setAttribute("persona", p);
            request.getRequestDispatcher(pagNuevo).forward(request, response);
        }
    }


    private void eliminar(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException{
        String id = request.getParameter("id");
        int resultado = pdao.eliminar(id);
        response.sendRedirect(urlPrincipal);
    }

    private void actualizar(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException{
        String id = request.getParameter("id");
        Persona p = pdao.obtenerPersona(id);
        request.setAttribute("persona", p);
        request.setAttribute("distritos", ddao.obtenerDistritos());
        request.getRequestDispatcher(pagActualizar).forward(request, response);
    }

    private void actualizarPersona(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException{
        String id = request.getParameter("id");
        Persona p = new Persona(
                Integer.parseInt(id),
                request.getParameter("nombre"),
                request.getParameter("apellido"),
                LocalDate.parse(request.getParameter("fecha")),
                request.getParameter("direccion"),
                request.getParameter("distrito"),
                Integer.parseInt(request.getParameter("telefono"))
        );
        int resultado = pdao.actualizarPersona(p);
        response.sendRedirect(urlPrincipal);
    }

}

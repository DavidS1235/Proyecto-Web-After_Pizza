package controlador;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Usuario;
import modeloDAO.UsuarioDao;

@WebServlet(name = "ControlUsuario", urlPatterns = {"/ControlUsuario"})
public class ControlUsuario extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Usuario u = null;
        UsuarioDao uDao = new UsuarioDao();
        String acceso = null;
        String action = request.getParameter("accion");

        if (action.equalsIgnoreCase("registrar_Cliente")) {
            acceso = "registrate.jsp";//Registro de cliente
            String nombre = request.getParameter("uname");
            String email = request.getParameter("correo");
            String pass = request.getParameter("psw");
            String direccion = request.getParameter("direc");
            u = new Usuario("R002", nombre, email, pass, direccion,"");
            if (!uDao.agregarUsuario(u)) {
                request.setAttribute("Error", "Error, no se pudo registrar al usuario"); //ERROR DE BD
            }
        }
        if (action.equalsIgnoreCase("logueo")) {

            String email = request.getParameter("email");
            String pass = request.getParameter("psw");
            u = uDao.logeoUsuario(email, pass);
            if (u == null) {
                acceso = "logIn.jsp";
                request.setAttribute("Error", "Error, no se pudo acceder"); //ERROR DE BD
            } else {

                String idrol = u.getId_rol();
                String nom = u.getNombre();
                String corr = u.getEmail();
                String pasw = u.getPassword();
                String direc = u.getDomicilio();
                Usuario user = new Usuario(idrol, nom, corr, pasw, direc,"");
                request.setAttribute("usr", user);
                acceso = "index.jsp";//pagina index con datos de usuario
            }

        }

        RequestDispatcher rd = request.getRequestDispatcher(acceso);
        rd.forward(request, response);

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import javax.swing.text.html.HTML;
import modelo.Rol;
import modelo.Usuario;
import modelo.UsuarioRolDTO;
import modeloDAO.RolDao;
import modeloDAO.UsuarioDao;

/**
 *
 * @author David
 */
@MultipartConfig
@WebServlet(name = "ControlGestionUsuario", urlPatterns = {"/ControlGestionUsuario"})
public class ControlGestionUsuario extends HttpServlet {

    ArrayList<UsuarioRolDTO> lista = new ArrayList<>();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Usuario u = new Usuario();
        UsuarioDao uDao = new UsuarioDao();
        UsuarioRolDTO urDTO = new UsuarioRolDTO();

        RolDao rdao = new RolDao();
        ArrayList<Rol> listaRol = new ArrayList<>();

        String acceso = null;
        String action = request.getParameter("accion");
        String PaguinaListarUsuario = "Administrador/gestionUsuario/gestionUsuario.jsp";
        String PaguinaAgregarUsuario = "Administrador/gestionUsuario/user-agre.jsp";
        String PaguinaEditarUsuario = "Administrador/gestionUsuario/user-edit.jsp";

        if (action.equalsIgnoreCase("agregar")) {
            listaRol = rdao.listaTodosRoles();
            request.setAttribute("listaRol", listaRol);
            acceso = PaguinaAgregarUsuario;

        }
        if (action.equalsIgnoreCase("Agregar Usuario")) {
            String nombre = request.getParameter("Nombre");
            String rol = request.getParameter("Rol");
            String email = request.getParameter("email");
            String Domicilio = request.getParameter("domicilio");
            String contra = request.getParameter("pass");
            ////
            Part arch = request.getPart("foto");
            if (arch != null) {
                InputStream is = arch.getInputStream();//lee bineraios
                //AQUI TIENE QUE PONER TU PATH
                File f = new File("C:\\Users\\VICTOR\\Documents\\CICLO7\\DESARROLLO WEB INTEGRADO\\java\\ProyectoWeb\\ProyectoPizzaNigth\\web\\Administrador\\images\\FotoPerfil",
                        request.getPart("foto").getSubmittedFileName());
                FileOutputStream ous = new FileOutputStream(f);//write 
                int i = 0;
                while ((i = is.read()) != -1) {//
                    ous.write(i);
                 
                }
                ous.close();
                is.close();
                String foto = "Administrador/images/FotoPerfil/" + request.getPart("foto").getSubmittedFileName();
                uDao.agregarUsuario(u = new Usuario(rol, nombre, email, contra, Domicilio, foto));
            } else {
                uDao.agregarUsuario(u = new Usuario(rol, nombre, email, contra, Domicilio, ""));
            }

            action = "listar";
        }
        if (action.equalsIgnoreCase("eliminar")) {
            String id = request.getParameter("id");
            uDao.eliminarrUsuario(id);
            System.out.println(id);
            action = "listar";
        }
        if (action.equalsIgnoreCase("editar")) {
            listaRol = rdao.listaTodosRoles();
            request.setAttribute("listaRol", listaRol);
            acceso = PaguinaEditarUsuario;
            String id = request.getParameter("id");

            u = uDao.listarunUsuario(id);
            request.setAttribute("user", u);
        }
        if (action.equalsIgnoreCase("Editar Usuario")) {
            String idUser = request.getParameter("id");
            String nombre = request.getParameter("Nombre");
            String rol = request.getParameter("Rol");
            String email = request.getParameter("email");
            String Domicilio = request.getParameter("domicilio");
            String contra = request.getParameter("pass");
            String fotopa = request.getParameter("fotopath");

            if (request.getPart("foto").getSubmittedFileName().equals("")) {

                if (!uDao.editarUsuario(u = new Usuario(idUser, rol, nombre, email, contra, Domicilio, fotopa))) {
                    System.out.println("NO SE PUEDE MODIFICAR");
                }
                    System.out.println(fotopa);
                
            }else{
                Part arch = request.getPart("foto");
                InputStream is = arch.getInputStream();
                File f = new File("C:\\Users\\VICTOR\\Documents\\CICLO7\\DESARROLLO WEB INTEGRADO\\java\\ProyectoPizzaNigth\\web\\Administrador\\images\\FotoPerfil\\",
                        request.getPart("foto").getSubmittedFileName());
                FileOutputStream ous = new FileOutputStream(f);
                int i = 0;
                while ((i = is.read()) != -1) {
                    ous.write(i);

                }
                ous.close();
                is.close();
                String foto = "Administrador/images/FotoPerfil/" + request.getPart("foto").getSubmittedFileName();
                uDao.editarUsuario(u = new Usuario(idUser, rol, nombre, email, contra, Domicilio, foto));
            }
            action = "listar";
        }
        if (action.equalsIgnoreCase("listar")) {
            lista = uDao.listaTodosUsuarios();
            request.setAttribute("lista", lista);
            acceso = PaguinaListarUsuario;

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

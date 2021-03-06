/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Categoria;
import modeloDAO.*;

/**
 *
 * @author David
 */
@WebServlet(name = "ControlCategoria", urlPatterns = {"/ControlCategoria"})
public class ControlCategoria extends HttpServlet {

    ArrayList<Categoria> listacat = new ArrayList<>();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String pagAgregaCateg = "Administrador/categoria/categ-agregar.jsp";
        String pagModificaCateg = "Administrador/categoria/categ-modif.jsp";
        String pagCategoria = "Administrador/categoria/categ-listar.jsp";
        String acceso = null;

        String action = request.getParameter("accion");

        Categoria cat = new Categoria();
        CategoriaDao cdao = new CategoriaDao();

        // redirecciona a pag agregarcategoria
        if (action.equalsIgnoreCase("Agrega Categoria")) {
            acceso = pagAgregaCateg;
        }
        
        //ejecuta sentencia de agregar categoria
        if (action.equalsIgnoreCase("Agregar Categoria")) {
            String nom = request.getParameter("nomcateg");
            cdao.agregarCategoria(nom);
            action = "listarCategorias";
        }

        //Para redireccionar a pagina modificar categoria
        if (action.equalsIgnoreCase("modificaCategoria")) {
            String idCateg = request.getParameter("Id");
            
            cat = cdao.listarunaCategoria(idCateg);
            request.setAttribute("cate", cat);
            acceso = pagModificaCateg;
        }
        
        //Para ejecutar sentencia que modifique la categoria
        if (action.equalsIgnoreCase("Modificar categoria")) {
            String id = request.getParameter("idCateg");
            String nom = request.getParameter("nombre");
            cat.setId_categ(id);
            cat.setNom_categ(nom);
            cdao.editarCategoria(cat);
            action = "listarCategorias";
        }

        if (action.equalsIgnoreCase("eliminarCategoria")) {
            String idcat = request.getParameter("Id");
            cdao.eliminarCategoria(idcat);
            action = "listarCategorias";
        }

        if (action.equals("listarCategorias")) {
            listacat = cdao.listarCategorias();
            request.setAttribute("listacat", listacat);
            acceso = pagCategoria;
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

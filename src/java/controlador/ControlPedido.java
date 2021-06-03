/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Boleta;
import modelo.DetalleProductoDTO;
import modelo.Producto;
import modeloDAO.BoletaDao;
import modeloDAO.DetalleCompraDao;
import modeloDAO.ProductoDAO;

/**
 *
 * @author David
 */
@WebServlet(name = "ControlPedido", urlPatterns = {"/ControlPedido"})
public class ControlPedido extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String acceso = null;
        String action = request.getParameter("accion");
        String PaguinaListarPedidos = "Administrador/pedido/pedidos.jsp";
        String PaguinaAgregarPedidos = "Administrador/pedido/pedido-agregar.jsp";
        String PaguinaEditPedidos = "Administrador/pedido/pedido-edit.jsp";
        /*MODELO*/
        Boleta b;
        DetalleProductoDTO dpDTO;
        Producto p;
        /*DAO*/
        DetalleCompraDao dpDAO = new DetalleCompraDao();
        BoletaDao bDao = new BoletaDao();
        ProductoDAO pDao = new ProductoDAO();
        /*ARRAY*/
        ArrayList<DetalleProductoDTO> listaDTO = new ArrayList<>();
        ArrayList<Boleta> listaBoleta = new ArrayList<>();
        ArrayList<Producto> listaPro = new ArrayList<>();
        if (action.equalsIgnoreCase("agregar")) {
            acceso = PaguinaAgregarPedidos;
            listaBoleta = bDao.listaBoleta();
            request.setAttribute("listaBoleta", listaBoleta);
            listaPro = pDao.listarTodosProductos();
            request.setAttribute("listaProducto", listaPro);
        }
        if (action.equalsIgnoreCase("eliminar")) {
            String id = request.getParameter("id");
            if (!dpDAO.eliminarrDetalleCompra(id)) {
                System.out.println("Eliminado InCorrectamente");
            }
            action = "listar";
        }
        if (action.equalsIgnoreCase("editar")) {
            String id = request.getParameter("id");
            dpDTO = dpDAO.listarunDetalleComprao(id);
            request.setAttribute("DetalleCompra", dpDTO);
            System.out.println(id);
            
            listaBoleta = bDao.listaBoleta();
            request.setAttribute("listaBoleta", listaBoleta);
            listaPro = pDao.listarTodosProductos();
            request.setAttribute("listaProducto", listaPro);
             acceso = PaguinaEditPedidos;
        }
        if(action.equalsIgnoreCase("Editar Boleta")){
            String id = request.getParameter("id");
            String idProducto=request.getParameter("Producto");
            double precioUnitario=pDao.listarUnProducto(idProducto).getPrecioU();
            String idBoleta=request.getParameter("Boleta");
            int cant=Integer.parseInt(request.getParameter("Cantidad"));
            String estado=request.getParameter("Estado");
            
            if(!dpDAO.editarDetalleCompra(dpDTO=new DetalleProductoDTO(id, idProducto, idBoleta, cant, precioUnitario*cant, estado))){
                System.out.println("NO SE PUDO EDITAR");
            }
            action = "listar";
            
        }
        if (action.equalsIgnoreCase("Agregar Producto a Boleta")) {
            //dpDTO=new DetalleProductoDTO();
            String idProducto = request.getParameter("Producto");
            String idBoleta = request.getParameter("Boleta");
            int cant = Integer.parseInt(request.getParameter("Cantidad"));
            String estado = request.getParameter("Estado");
            p = pDao.listarUnProducto(idProducto);
            double preciooUnitario = p.getPrecioU();
            dpDAO.agregarDetalleCompra(dpDTO = new DetalleProductoDTO(idProducto, p.getNombre(), idBoleta, cant, estado, preciooUnitario));

            action = "listar";
        }
        if (action.equalsIgnoreCase("listar")) {
            listaDTO = dpDAO.listaTodosDetalleCompra();
            request.setAttribute("lista", listaDTO);
            acceso = PaguinaListarPedidos;
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

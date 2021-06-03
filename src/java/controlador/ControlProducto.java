package controlador;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import modelo.Categoria;
import modelo.Imagen;
import modelo.Producto;
import modeloDAO.CategoriaDao;
import modeloDAO.ProductoDAO;

//Añandimos una anotación que nos permitirá preparar el servlet para la recepción de archivos
@MultipartConfig
@WebServlet(name = "ControlProducto", urlPatterns = {"/ControlProducto"})
public class ControlProducto extends HttpServlet {

    ArrayList<Producto> lis = new ArrayList<>();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //AQUI TIENE QUE PONER TU PATH
        String rutaAlmacenarImg = "C:\\Users\\VICTOR\\Documents\\CICLO7\\DESARROLLO WEB INTEGRADO\\java\\ProyectoWeb\\ProyectoPizzaNigth\\web\\Administrador\\producto\\imagenes";
        File cargarImg = new File(rutaAlmacenarImg);//Referencia a la ruta de almacenamiento de imagen
        
        //Establecemos los formatos validos para el sistema
        String[] extensiones = {".ico", ".png", ".jpg", ".jpeg", ".gif"};
        Imagen img = new Imagen();
        Producto p;
        Categoria c = new Categoria();

        ProductoDAO pDAO = new ProductoDAO();
        CategoriaDao cDAO = new CategoriaDao();

        ArrayList<Categoria> lisC = new ArrayList<>();
        String acceso = "";
        //String acceso = null;
        String action = request.getParameter("accion");
        String PaguinaListarProducto = "Administrador/producto/prod-mod.jsp";
        String PaguinaEditarProducto = "Administrador/producto/formularioModProd.jsp";
        String PaguinaAgregarProducto = "Administrador/producto/prod-agre.jsp";
        if (action.equalsIgnoreCase("agregar")) {
            acceso = "Administrador/producto/prod-agre.jsp";
            lisC = cDAO.listarCategorias();
            request.setAttribute("listC", lisC);
        }
        if (action.equalsIgnoreCase("Agregar Producto")) {
            try {
                String codigoProducto = pDAO.obtenerCodP();
                String nombre = request.getParameter("nombre");
                String descripcion = request.getParameter("descripcion");
                Part imagen = request.getPart("imagen");
                String categoria = request.getParameter("categoria");
                double precioU = Double.parseDouble(request.getParameter("precio"));
                if (imagen == null) {
                    //No subio imagen
                    System.out.println("No selecciono ninguna imagen");
                    return;
                }
                img.setNombreArchivo(imagen.getSubmittedFileName());
                img.setExtensiones(extensiones);

                if (img.cumpleRequisitosExt()) {
                    img.setPart(imagen);
                    img.setCarpetaAlmacenarImg(cargarImg);
                    p = new Producto();
                    String foto = img.guardarImg(codigoProducto);
                    p.setNombre(nombre);
                    p.setDescripcion(descripcion);
                    p.setImagen(foto);
                    p.setCategoria(categoria);
                    p.setPrecioU(precioU);

                    pDAO.agregarP(p);
                }
                action = "listar";

            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("ERROR IMAGEN");
            }

        }
        if (action.equalsIgnoreCase("Eliminar Producto")) {
            String codigoProducto = request.getParameter("codigoP");
            String nombreImagen = request.getParameter("nombreImg");
            if (nombreImagen != null) {
                img.setCarpetaAlmacenarImg(cargarImg);
                img.eliminarImg(nombreImagen);
            }

            if (pDAO.eliminarP(codigoProducto)) {
                action = "listar";
            } else {
                System.out.println("ERROR BASE DE DATOS");
                action = "listar";
            }

        }
        if (action.equalsIgnoreCase("EditarProducto")) {
            p = new Producto();
            String codigoProducto = request.getParameter("codigoP");

            p = pDAO.listarUnProducto(codigoProducto);
            request.setAttribute("P", p);

            acceso = PaguinaEditarProducto;
        }
        if (action.equalsIgnoreCase("Modificar Producto")) {
            try {
                String idP = request.getParameter("codigoP");
                String nombre = request.getParameter("nombre");
                String descripcion = request.getParameter("descripcion");
                Part imagen = request.getPart("image");
                String nombreImagen = request.getParameter("img");
                double precioU = Double.parseDouble(request.getParameter("precio"));
                int numeroAleatorio;
                String codigoProdRandom = "";
                p=new Producto();
                p.setImagen(nombreImagen);

                if (imagen != null) {
                    img.setNombreArchivo(imagen.getSubmittedFileName());
                    img.setExtensiones(extensiones);

                    if (img.cumpleRequisitosExt()) {
                        img.setCarpetaAlmacenarImg(cargarImg);
                        img.eliminarImg(nombreImagen);

                        img.setPart(imagen);
                        img.setCarpetaAlmacenarImg(cargarImg);

                        img.setNombreArchivo(imagen.getSubmittedFileName());
                        img.setExtensiones(extensiones);

                        img.setPart(imagen);

                        numeroAleatorio = (int) (Math.random() * (99 - 1) + 1);
                        codigoProdRandom = idP + numeroAleatorio;

                        String foto = img.guardarImg(codigoProdRandom);
                        p.setImagen(foto);
                    }
                }

                p.setIdProducto(idP);
                p.setNombre(nombre);
                p.setDescripcion(descripcion);
                p.setPrecioU(precioU);

                pDAO.editarP(p);

                action="listar";

            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("ERROR IMAGEN");
            }

        }

        if (action.equalsIgnoreCase("listar")) {
            lis = pDAO.listarTodosProductos();
            request.setAttribute("lista", lis);
            acceso = PaguinaListarProducto;

        }
        RequestDispatcher rd = request.getRequestDispatcher(acceso);
        rd.forward(request, response);

    }

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

package org.apache.jsp.Administrador.producto;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class prod_002dagre_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"../styles/nav.css\">  \n");
      out.write("        <title>After Pizza</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div class=\"navbar\">\n");
      out.write("            <div class=\"text-nav\">\n");
      out.write("                <div class=\"dropdown padd\">\n");
      out.write("                    <button class=\"dropbtn\">Usuarios\n");
      out.write("                    </button>\n");
      out.write("                    <div class=\"dropdown-content\">\n");
      out.write("                        <a href=\"../gestionUsuario/emple-agre.jsp\">Agregar Empleados</a>\n");
      out.write("                        <a href=\"../gestionUsuario/emple-mod.jsp\">Lista Usuarios</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"dropdown padd\">\n");
      out.write("                    <button class=\"dropbtn\">Productos\n");
      out.write("                    </button>\n");
      out.write("                    <div class=\"dropdown-content\">\n");
      out.write("                        <a href=\"prod-agre.jsp\">Agregar</a>\n");
      out.write("                        <a href=\"prod-mod.jsp\">Lista Productos</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"dropdown padd\">\n");
      out.write("                    <button class=\"dropbtn\">Categoria\n");
      out.write("                    </button>\n");
      out.write("                    <div class=\"dropdown-content\">\n");
      out.write("                        <a href=\"../../ControlCategoria?accion=listarCategorias\">Lista de Categorias</a>\n");
      out.write("                        <!--<a href=\"#\">Modificar</a>-->\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"dropdown padd\">\n");
      out.write("                    <button class=\"dropbtn\">Pedido\n");
      out.write("                    </button>\n");
      out.write("                    <div class=\"dropdown-content\">\n");
      out.write("                        <a href=\"../pedido/pedidos.jsp\">Lista de pedidos</a>\n");
      out.write("                        <!--<a href=\"#\">Agregar</a>\n");
      out.write("                                      <a href=\"#\">Modificar</a>-->\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!--\n");
      out.write("                              <div class=\"home  padd\"><a href=\"#home\">Home</a></div>\n");
      out.write("                -->\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"container2\">\n");
      out.write("            <div class=\"tittle-E\">Zona Productos » Agregar</div>\n");
      out.write("            <div class=\"formulario\">\n");
      out.write("                <form action=\"../../ControlProducto\" method=\"POST\" enctype=\"multipart/form-data\">\n");
      out.write("\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-25\">\n");
      out.write("                            <label for=\"lname\">Nombre</label>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-75\">\n");
      out.write("                            <input type=\"text\" id=\"name\" name=\"nombre\" placeholder=\"Nombre\" required=\"\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-25\">\n");
      out.write("                            <label for=\"Description\">Descripción</label>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-75\">\n");
      out.write("                            <textarea rows=\"6\" cols=\"40\" name=\"descripcion\" placeholder=\"Descripción\" \n");
      out.write("                                      required=\"\" id=\"Lname\"></textarea>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-25\">\n");
      out.write("                            <label for=\"img\">Imagen</label>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-75\">\n");
      out.write("                            <input type=\"file\" id=\"img\" name=\"imagen\" placeholder=\"img\" onchange=\"validarImagen()\" \n");
      out.write("                                   required=\"\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    ");
      modeloDAO.CategoriaDao categoriaDAO = null;
      synchronized (_jspx_page_context) {
        categoriaDAO = (modeloDAO.CategoriaDao) _jspx_page_context.getAttribute("categoriaDAO", PageContext.PAGE_SCOPE);
        if (categoriaDAO == null){
          categoriaDAO = new modeloDAO.CategoriaDao();
          _jspx_page_context.setAttribute("categoriaDAO", categoriaDAO, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-25\">\n");
      out.write("                                <label for=\"Cargo\">Categoría</label>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-75\">\n");
      out.write("                                <select id=\"job-tittle\" name=\"categoria\">\n");
      out.write("                                ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            </select>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-25\">\n");
      out.write("                            <label for=\"lname\">Precio</label>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-75\">\n");
      out.write("                            <!--pattern: Expresión Regular-->\n");
      out.write("                            <input type=\"text\" id=\"name\" name=\"precio\" placeholder=\"Precio\" \n");
      out.write("                                   required pattern=\"[0-9]{2,3}(?.[0-9]{1,2})\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <br>\n");
      out.write("                        <input type=\"submit\" name=\"accion\" value=\"Agregar Producto\">\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("                <div class=\"tittle-E\">\n");
      out.write("                    <div class=\"b-agregar\">\n");
      out.write("                        <a class=\"b-editar\" href=\"../../index.jsp\">Regresar al menú principal</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <script type=\"text/javascript\" src=\"AlertaImg.js\"></script>            \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("catP");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${categoriaDAO.listarCategorias()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                    <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${catP.getId_categ()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${catP.getNom_categ()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\n");
          out.write("                                ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}

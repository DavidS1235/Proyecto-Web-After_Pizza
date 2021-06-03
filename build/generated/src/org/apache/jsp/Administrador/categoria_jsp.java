package org.apache.jsp.Administrador;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class categoria_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8;\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"styles/nav.css\">\n");
      out.write("        <title>After Pizza</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div class=\"navbar\">\n");
      out.write("            <div class=\"text-nav\">\n");
      out.write("                <div class=\"dropdown padd\">\n");
      out.write("                    <button class=\"dropbtn\">Empleados\n");
      out.write("                    </button>\n");
      out.write("                    <div class=\"dropdown-content\">\n");
      out.write("                        <a href=\"emple-agre.jsp\">Agregar</a>\n");
      out.write("                        <a href=\"emple-mod.jsp\">Modificar</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"dropdown padd\">\n");
      out.write("                    <button class=\"dropbtn\">Productos\n");
      out.write("                    </button>\n");
      out.write("                    <div class=\"dropdown-content\">\n");
      out.write("                        <a href=\"prod-agre.jsp\">Agregar</a>\n");
      out.write("                        <a href=\"prod-mod.jsp\">Modificar</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"dropdown padd\">\n");
      out.write("                    <button class=\"dropbtn\">Categoria\n");
      out.write("                    </button>\n");
      out.write("                    <div class=\"dropdown-content\">\n");
      out.write("                        <a href=\"categoria.jsp\">Agregar / Modificar</a>\n");
      out.write("                        <!--<a href=\"#\">Modificar</a>-->\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"dropdown padd\">\n");
      out.write("                    <button class=\"dropbtn\">Pedido\n");
      out.write("                    </button>\n");
      out.write("                    <div class=\"dropdown-content\">\n");
      out.write("                        <a href=\"pedidos.jsp\">Agregar / Modificar</a>\n");
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
      out.write("        <div class=\"container2\">\n");
      out.write("            <div class=\"tittle-E\">Categoria \n");
      out.write("                <div class=\"b-agregar\">\n");
      out.write("                    <button class=\"b-editar\">Agregar Categoria</button>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!--Tabla para visualizar Empleados-->\n");
      out.write("            <div class=\"table-container\">\n");
      out.write("                <table>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>Código</th>\n");
      out.write("                        <th>Nombre</th>\n");
      out.write("                        <th>Modificar</th>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>.</td>\n");
      out.write("                        <td>.</td>\n");
      out.write("                        <td><button class=\"b-editar\">Editar</button>\n");
      out.write("                            <button class=\"b-eliminar\">Eliminar</button>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>.</td>\n");
      out.write("                        <td>.</td>\n");
      out.write("                        <td><button class=\"b-editar\">Editar</button>\n");
      out.write("                            <button class=\"b-eliminar\">Eliminar</button>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>.</td>\n");
      out.write("                        <td>.</td>\n");
      out.write("                        <td><button class=\"b-editar\">Editar</button>\n");
      out.write("                            <button class=\"b-eliminar\">Eliminar</button>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>.</td>\n");
      out.write("                        <td>.</td>\n");
      out.write("                        <td><button class=\"b-editar\">Editar</button>\n");
      out.write("                            <button class=\"b-eliminar\">Eliminar</button>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("                <div class=\"tittle-E\">\n");
      out.write("                    <div class=\"b-agregar\">\n");
      out.write("                        <a class=\"b-editar\" href=\"../index.jsp\">Regresar al menú principal</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
}

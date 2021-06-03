package org.apache.jsp.Administrador.categoria;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class categoria_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8;\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"../styles/nav.css\">\n");
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
      out.write("            <div class=\"tittle-E\">Categorias \n");
      out.write("                <div class=\"b-agregar\"><br>\n");
      out.write("                    <a href=\"../../Administrador/categoria/categ-agregar.jsp\">\n");
      out.write("                        <button class=\"b-editar\" >Agregar Categoria</button> \n");
      out.write("                    </a>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!--Tabla para visualizar Categorias-->\n");
      out.write("            <div class=\"table-container\">\n");
      out.write("                <table>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>ID Categoría</th>\n");
      out.write("                        <th>Nombre</th>\n");
      out.write("                    </tr>\n");
      out.write("                    ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                </table>\n");
      out.write("                <div class=\"tittle-E\">\n");
      out.write("                    <div class=\"b-agregar\" >\n");
      out.write("                        <a class=\"b-editar\" href=\"../../index.jsp\">Regresar al menú principal</a>\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("lis");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lista}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                        <tr>\n");
          out.write("                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lis.getId_categ()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lis.getNom_categ()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                            <td>\n");
          out.write("                                <a href=\"../Administrador/categoria/categ-modif.jsp\">\n");
          out.write("                                    <button class=\"b-editar\" name=\"accion\" value=\"editaCateg\">Editar</button>\n");
          out.write("                                </a>\n");
          out.write("\n");
          out.write("                                <button class=\"b-eliminar\" name=\"accion\" value=\"eliminaCateg\">Eliminar</button>\n");
          out.write("                            </td>\n");
          out.write("                        </tr>\n");
          out.write("                    ");
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

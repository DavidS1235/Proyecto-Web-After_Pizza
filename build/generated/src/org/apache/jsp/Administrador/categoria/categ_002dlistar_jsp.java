package org.apache.jsp.Administrador.categoria;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class categ_002dlistar_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/Administrador/categoria/../styles/nav.css");
  }

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
      out.write("        <style>\n");
      out.write("            ");
      out.write("body {\r\n");
      out.write("  font-family: Arial, Helvetica, sans-serif;\r\n");
      out.write("  background-image: url(../images/admin3.jpg);\r\n");
      out.write("  background-position: center center;\r\n");
      out.write("  background-repeat: no-repeat;\r\n");
      out.write("  background-size: cover;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("* {\r\n");
      out.write("  margin: 0px;\r\n");
      out.write("  padding: 0px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".navbar {\r\n");
      out.write("  background-color: #04aa6d;\r\n");
      out.write("  display: block;\r\n");
      out.write("  position: sticky;\r\n");
      out.write("  top: 0;\r\n");
      out.write("  background-color: rgba(70, 69, 69, 0.822);\r\n");
      out.write("  font-family: sans-serif;\r\n");
      out.write("  text-align: center;\r\n");
      out.write("  line-height: 1;\r\n");
      out.write("  backdrop-filter: blur(10px);\r\n");
      out.write("  -webkit-backdrop-filter: blur(10px);\r\n");
      out.write("  max-width: 100%;\r\n");
      out.write("  max-height: 50%;\r\n");
      out.write("  padding: 0px 50px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".navbar a {\r\n");
      out.write("  float: left;\r\n");
      out.write("  font-size: 16px;\r\n");
      out.write("  text-align: center;\r\n");
      out.write("  padding: 14px 16px;\r\n");
      out.write("  text-decoration: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".padd {\r\n");
      out.write("  padding: 0.5rem;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".text-nav {\r\n");
      out.write("  display: flex;\r\n");
      out.write("  justify-content: space-between;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".dropdown .dropbtn {\r\n");
      out.write("  font-size: 16px;\r\n");
      out.write("  border: none;\r\n");
      out.write("  outline: none;\r\n");
      out.write("  color: rgb(218, 218, 218);\r\n");
      out.write("  padding: 14px 100px;\r\n");
      out.write("  background-color: inherit;\r\n");
      out.write("  font-family: inherit;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".navbar a:hover,\r\n");
      out.write(".dropdown:hover .dropbtn {\r\n");
      out.write("  background-color: #059b6400;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".dropdown-content {\r\n");
      out.write("  display: none;\r\n");
      out.write("  position: absolute;\r\n");
      out.write("  background-color: #f9f9f900;\r\n");
      out.write("  min-width: 160px;\r\n");
      out.write("  box-shadow: 0px 8px 16px 0px rgba(0, 0, 0, 0.2);\r\n");
      out.write("  z-index: 1;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".dropdown-content a {\r\n");
      out.write("  float: none;\r\n");
      out.write("  color: rgb(235, 235, 235);\r\n");
      out.write("  padding: 12px 100px;\r\n");
      out.write("  text-decoration: none;\r\n");
      out.write("  display: block;\r\n");
      out.write("  text-align: left;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".dropdown-content a:hover {\r\n");
      out.write("  background-color: rgb(54, 54, 54);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".dropdown:hover .dropdown-content {\r\n");
      out.write("  display: block;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".tittle-E {\r\n");
      out.write("  display: inline;\r\n");
      out.write("  font-size: 1.3rem;\r\n");
      out.write("  margin: 0 1rem;\r\n");
      out.write("  padding: 1rem 0 0.5rem 0;\r\n");
      out.write("  border-bottom: 1px solid black;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".tittle-E a{\r\n");
      out.write("    float: none;\r\n");
      out.write("  color: rgb(235, 235, 235);\r\n");
      out.write("  padding: 12px 100px;\r\n");
      out.write("  text-decoration: none;\r\n");
      out.write("  display: block;\r\n");
      out.write("  text-align: left;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("@media only screen and (max-width: 600px) {\r\n");
      out.write("  .text-nav {\r\n");
      out.write("    display: flex;\r\n");
      out.write("    flex-direction: column;\r\n");
      out.write("    justify-content: center;\r\n");
      out.write("    max-height: 20%;\r\n");
      out.write("    font-size: 0.8rem;\r\n");
      out.write("    padding: 0;\r\n");
      out.write("  }\r\n");
      out.write("}\r\n");
      out.write("/*empleados agregar*/\r\n");
      out.write("* {\r\n");
      out.write("  box-sizing: border-box;\r\n");
      out.write("}\r\n");
      out.write("input[type=\"text\"],\r\n");
      out.write("[type=\"number\"],\r\n");
      out.write("[type=\"email\"],\r\n");
      out.write("[type=\"tel\"],\r\n");
      out.write("[type=\"file\"],\r\n");
      out.write("[type=\"button\"],\r\n");
      out.write("select,\r\n");
      out.write("textarea {\r\n");
      out.write("  width: 100%;\r\n");
      out.write("  padding: 12px;\r\n");
      out.write("  border: 1px solid #ccc;\r\n");
      out.write("  border-radius: 4px;\r\n");
      out.write("  resize: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("label {\r\n");
      out.write("  padding: 12px 12px 12px 0;\r\n");
      out.write("  display: inline-block;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("input[type=\"submit\"] {\r\n");
      out.write("  background-color: #494949;\r\n");
      out.write("\r\n");
      out.write("  color: white;\r\n");
      out.write("  padding: 12px 20px;\r\n");
      out.write("  border: none;\r\n");
      out.write("  border-radius: 4px;\r\n");
      out.write("  cursor: pointer;\r\n");
      out.write("  float: right;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("input[type=\"submit\"]:hover {\r\n");
      out.write("  background-color: #2b2a2a;\r\n");
      out.write("}\r\n");
      out.write("/*idPedido, idUsuario y Estado*/\r\n");
      out.write("\r\n");
      out.write(".container2 {\r\n");
      out.write("  border-radius: 5px;\r\n");
      out.write("  background-color: #8d8a8aa8;\r\n");
      out.write("  padding: 4.5rem 2rem 8rem 2rem;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".col-25 {\r\n");
      out.write("  float: left;\r\n");
      out.write("  width: 25%;\r\n");
      out.write("  margin-top: 6px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".col-75 {\r\n");
      out.write("  float: left;\r\n");
      out.write("  width: 75%;\r\n");
      out.write("  margin-top: 6px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Clear floats after the columns */\r\n");
      out.write(".row:after {\r\n");
      out.write("  content: \"\";\r\n");
      out.write("  display: table;\r\n");
      out.write("  clear: both;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Responsive layout - when the screen is less than 600px wide, make the two columns stack on top of each other instead of next to each other */\r\n");
      out.write("@media screen and (max-width: 600px) {\r\n");
      out.write("  .col-25,\r\n");
      out.write("  .col-75,\r\n");
      out.write("  input[type=\"submit\"] {\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    margin-top: 0;\r\n");
      out.write("  }\r\n");
      out.write("}\r\n");
      out.write(".formulario {\r\n");
      out.write("  padding-bottom: 3rem;\r\n");
      out.write("  margin: 1rem 1rem;\r\n");
      out.write("}\r\n");
      out.write("/*Tabla visualizar empleados*/\r\n");
      out.write(".table-container {\r\n");
      out.write("  margin: 1rem;\r\n");
      out.write("  padding-bottom: 3rem;\r\n");
      out.write("}\r\n");
      out.write("table {\r\n");
      out.write("  border-collapse: collapse;\r\n");
      out.write("  width: 100%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("th,\r\n");
      out.write("td {\r\n");
      out.write("  padding: 8px;\r\n");
      out.write("  text-align: left;\r\n");
      out.write("  border-bottom: 1px solid #ddd;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("tr:hover {\r\n");
      out.write("  background-color: #dddbdb8e;\r\n");
      out.write("}\r\n");
      out.write("/*zona productos*/\r\n");
      out.write("::-webkit-file-upload-button {\r\n");
      out.write("  /*edicion subir imagen*/\r\n");
      out.write("  color: rgb(48, 197, 165);\r\n");
      out.write("  padding: 0.5em;\r\n");
      out.write("  resize: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/*botones*/\r\n");
      out.write("button {\r\n");
      out.write("  padding: 0.5rem;\r\n");
      out.write("}\r\n");
      out.write("/*B editar*/\r\n");
      out.write(".b-editar {\r\n");
      out.write("  background-color: #494949;\r\n");
      out.write("  border: none;\r\n");
      out.write("  color: white;\r\n");
      out.write("  cursor: pointer;\r\n");
      out.write("  border-radius: 3px;\r\n");
      out.write("}\r\n");
      out.write(".b-editar:hover {\r\n");
      out.write("  background-color: #2b2a2a;\r\n");
      out.write("}\r\n");
      out.write("/*B eliminar*/\r\n");
      out.write(".b-eliminar {\r\n");
      out.write("  background-color: #910905;\r\n");
      out.write("  border: none;\r\n");
      out.write("  color: white;\r\n");
      out.write("}\r\n");
      out.write(".b-eliminar:hover {\r\n");
      out.write("  background-color: #690704;\r\n");
      out.write("  border: none;\r\n");
      out.write("  color: white;\r\n");
      out.write("}\r\n");
      out.write(".b-agregar {\r\n");
      out.write("  float: right;\r\n");
      out.write("  padding: 0.8rem;\r\n");
      out.write("}\r\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("        <title>After Pizza - Categorias</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"navbar\">\n");
      out.write("            <div class=\"text-nav\">\n");
      out.write("                <div class=\"dropdown padd\">\n");
      out.write("                    <button class=\"dropbtn\">Usuarios\n");
      out.write("                    </button>\n");
      out.write("                    <div class=\"dropdown-content\">\n");
      out.write("                        <a href=\"Administrador/gestionUsuario/emple-agre.jsp\">Agregar Empleado</a>\n");
      out.write("                        <a href=\"Administrador/gestionUsuario/emple-mod.jsp\">Lista Usuarios</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"dropdown padd\">\n");
      out.write("                    <button class=\"dropbtn\">Productos\n");
      out.write("                    </button>\n");
      out.write("                    <div class=\"dropdown-content\">\n");
      out.write("                        <a href=\"Administrador/producto/prod-agre.jsp\">Agregar</a>\n");
      out.write("                        <a href=\"Administrador/producto/prod-mod.jsp\">Lista Productos</a>\n");
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
      out.write("                        <a href=\"Administrador/pedido/pedidos.jsp\">Lista de pedidos</a>\n");
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
      out.write("                    <a href=\"ControlCategoria?accion=Agrega Categoria\">\n");
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
      out.write("                        <a class=\"b-editar\" href=\"index.jsp\">Regresar al menú principal</a>\n");
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
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listacat}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
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
          out.write("                                <a href=\"ControlCategoria?accion=modificaCategoria&Id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lis.getId_categ()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                                    <button class=\"b-editar\" >Editar</button>\n");
          out.write("                                </a>\n");
          out.write("                                <a href=\"ControlCategoria?accion=eliminarCategoria&Id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lis.getId_categ()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                                    <button class=\"b-eliminar\" >Eliminar</button> \n");
          out.write("                                </a>\n");
          out.write("\n");
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

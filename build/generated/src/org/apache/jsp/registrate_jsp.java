package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registrate_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"styles/registrate.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"styles/index.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\"\n");
      out.write("              integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css\" rel=\"stylesheet\"\n");
      out.write("              integrity=\"sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6\" crossorigin=\"anonymous\">\n");
      out.write("        <title>Registrar Usuario</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div class=\"logIn\">\n");
      out.write("            <div class=\"tittle-create-account container\">\n");
      out.write("                Crea tu cuenta de After Pizza\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <form action=\"Control\" method=\"post\">\n");
      out.write("                <div class=\"imgcontainer\">\n");
      out.write("                    <img src=\"imagenes/logo-pizza.png\" alt=\"Avatar\" class=\"avatar\">\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <label for=\"uname\"><b>Nombre completo</b></label>\n");
      out.write("                    <input type=\"text\" placeholder=\"Ingresa Usuario\" name=\"uname\" required>\n");
      out.write("\n");
      out.write("                    <label for=\"e-mail\"><b>Correo electrónico</b></label>\n");
      out.write("                    <input type=\"email\" placeholder=\"Ingresa Correo electrónico\" name=\"correo\" required>\n");
      out.write("\n");
      out.write("                    <label for=\"psw\"><b>Contraseña</b></label>\n");
      out.write("                    <input type=\"password\" placeholder=\"Ingresa contraseña\" name=\"psw\" required>\n");
      out.write("\n");
      out.write("                    <label for=\"adrees\"><b>Dirección</b></label>\n");
      out.write("                    <input type=\"text\" placeholder=\"Ingresa Dirección\" name=\"direc\" required>\n");
      out.write("                    <!--<label for=\"adrees\"><b>Tipo de Domicilio</b></label>\n");
      out.write("                    <select name=\"type-adrees\" id=\"\">\n");
      out.write("                        <option value=\"casa\">Casa</option>\n");
      out.write("                        <option value=\"casa\">Condominio</option>\n");
      out.write("                        <option value=\"casa\">Quinta</option>\n");
      out.write("                    </select> -->\n");
      out.write("\n");
      out.write("                    <!--AQUÍ BOTON REGISTRAR-->\n");
      out.write("                    ");
if (request.getAttribute("Error") != null) {
                    
      out.write("\n");
      out.write("                    <input type=\"text\" hidden=\"\" id=\"txtAlert\" value=\"");
      out.print(request.getAttribute("Error").toString());
      out.write("\">\n");
      out.write("                    <script>\n");
      out.write("                        var mensaje = document.getElementById(\"txtAlert\").value;\n");
      out.write("                        alert(mensaje);\n");
      out.write("                    </script>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                    <button type=\"submit\" name=\"accion\" value=\"registrar_Cliente\">Crear cuenta</button>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"container botones\"> \n");
      out.write("                    <a href=\"index.jsp\"><button type=\"button\" class=\"cancelbtn\">Regresar</button></a>\n");
      out.write("                    <a href=\"logIn.jsp\"><button  id=\"Log-In\" value=\"registrar_Cliente\" >Log In</button></a>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("        </div>\n");
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

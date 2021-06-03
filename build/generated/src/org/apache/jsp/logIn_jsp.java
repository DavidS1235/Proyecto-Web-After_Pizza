package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class logIn_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"styles/logIn.css\">\n");
      out.write("        <title>FormularioLogin</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div class=\"logIn\">\n");
      out.write("            <form action=\"ControlUsuario\" method=\"post\">\n");
      out.write("                <div class=\"imgcontainer\">\n");
      out.write("                    <img src=\"https://www.pavilionweb.com/wp-content/uploads/2017/03/man-300x300.png\" alt=\"Avatar\"\n");
      out.write("                         class=\"avatar\">\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <label for=\"email\"><b>Correo</b></label>\n");
      out.write("                    <input type=\"text\" placeholder=\"Ingresa tu correo\" name=\"email\" required>\n");
      out.write("\n");
      out.write("                    <label for=\"psw\"><b>Contraseña</b></label>\n");
      out.write("                    <input type=\"password\" placeholder=\"Ingresa contraseña\" name=\"psw\" required>\n");
      out.write("\n");
      out.write("                    <!--AQUÍ BOTON LOGIN-->\n");
      out.write("                    <button type=\"submit\" name=\"accion\" value=\"logueo\">Login</button>\n");
      out.write("                    <label>\n");
      out.write("                        <input type=\"checkbox\" checked=\"checked\" name=\"remember\"> Recordar Contraseña\n");
      out.write("                    </label>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"container botones\"> <a href=\"index.jsp\"><button type=\"button\"\n");
      out.write("                                                                            class=\"cancelbtn\">Regresar</button></a>\n");
      out.write("                    <a href=\"registrate.jsp\"><button type=\"button\" id=\"registrate\">Registrate</button></a>\n");
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

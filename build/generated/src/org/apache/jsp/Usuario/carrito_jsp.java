package org.apache.jsp.Usuario;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class carrito_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <title>After Pizza</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"styles/has-tu-pedido.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"styles/carrito.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\"\n");
      out.write("              integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css\" rel=\"stylesheet\"\n");
      out.write("              integrity=\"sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6\" crossorigin=\"anonymous\">\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"nav-var\">\n");
      out.write("                <div class=\"log-area\">\n");
      out.write("                    <a href=\"../index.jsp\"><img src=\"imagenes/logo-pizza.png\" class=\"img-logo\" alt=\"\"></a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"nav-text\">\n");
      out.write("                    <div class=\"nav-text1\"><a id=\"link\">After pizza</a></div>\n");
      out.write("                    <div class=\"nav-text2\"><a href=\"../index.jsp\" id=\"link\">Haz tu pedido</a></div>\n");
      out.write("                    <div class=\"nav-text3\"><a href=\"../zona-de-cobertura.jsp\" id=\"link\">Zona de cobertura</a></div>\n");
      out.write("                    <div class=\"nav-text3\"><a href=\"carrito.jsp\" id=\"link\">Carrito</a></div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"nav-log-in\"><a href=\"../logIn.jsp\"><button type=\"button\" class=\"btn btn-primary\">Log\n");
      out.write("                            in</button></a></div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"area-work\">\n");
      out.write("                <div class=\"table-area\">\n");
      out.write("                    <table>\n");
      out.write("                        <tr>\n");
      out.write("                            <th>Item</th>\n");
      out.write("                            <th>Aticulo</th>\n");
      out.write("                            <th>Descripcion</th>\n");
      out.write("                            <th>Precio</th>\n");
      out.write("                            <th>Cantidad</th>\n");
      out.write("                            <th>Total</th>\n");
      out.write("                            <th>Acciones</th>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>.</td>\n");
      out.write("                            <td>.</td>\n");
      out.write("                            <td>.</td>\n");
      out.write("                            <td>.</td>\n");
      out.write("                            <td>.</td>\n");
      out.write("                            <td>.</td>\n");
      out.write("                            <td>\n");
      out.write("                                <button class=\"b-eliminar\">Eliminar</button>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>.</td>\n");
      out.write("                            <td>.</td>\n");
      out.write("                            <td>.</td>\n");
      out.write("                            <td>.</td>\n");
      out.write("                            <td>.</td>\n");
      out.write("                            <td>.</td>\n");
      out.write("                            <td>\n");
      out.write("                                <button class=\"b-eliminar\">Eliminar</button>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>.</td>\n");
      out.write("                            <td>.</td>\n");
      out.write("                            <td>.</td>\n");
      out.write("                            <td>.</td>\n");
      out.write("                            <td>.</td>\n");
      out.write("                            <td>.</td>\n");
      out.write("                            <td>\n");
      out.write("                                <button class=\"b-eliminar\">Eliminar</button>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>.</td>\n");
      out.write("                            <td>.</td>\n");
      out.write("                            <td>.</td>\n");
      out.write("                            <td>.</td>\n");
      out.write("                            <td>.</td>\n");
      out.write("                            <td>.</td>\n");
      out.write("                            <td>\n");
      out.write("                                <button class=\"b-eliminar\">Eliminar</button>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>.</td>\n");
      out.write("                            <td>.</td>\n");
      out.write("                            <td>.</td>\n");
      out.write("                            <td>.</td>\n");
      out.write("                            <td>.</td>\n");
      out.write("                            <td>.</td>\n");
      out.write("                            <td>\n");
      out.write("                                <button class=\"b-eliminar\">Eliminar</button>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                    </table>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-area\">\n");
      out.write("                    <form action=\"/action_page.php\">\n");
      out.write("                        <label for=\"country\"><b>Subtotal:</b></label>\n");
      out.write("                        <input type=\"text\" id=\"country\" name=\"country\" value=\"\" readonly><br><br>\n");
      out.write("                        <label for=\"country\"><b>Precio de envio:</b></label>\n");
      out.write("                        <input type=\"text\" id=\"country\" name=\"country\" value=\"\" readonly><br><br>\n");
      out.write("                        <label for=\"country\"><b>Descuento:</b></label>\n");
      out.write("                        <input type=\"text\" id=\"country\" name=\"country\" value=\"\" readonly><br><br>\n");
      out.write("                        <label for=\"country\"><b>Total a pagar:</b></label>\n");
      out.write("                        <input type=\"text\" id=\"country\" name=\"country\" value=\"\" readonly><br><br>\n");
      out.write("                        <label for=\"country\"><b>Ingrese núm de tarjeta:</b></label>\n");
      out.write("                        <input type=\"text\" id=\"country\" name=\"country\" value=\"\" required><br><br>\n");
      out.write("                        <input type=\"submit\" value=\"Realizar pago\">\n");
      out.write("                        <input type=\"submit\" value=\"Pagar\">\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!--*******************-->\n");
      out.write("            <footer class=\"footer\">\n");
      out.write("                <div class=\"footer_1\">\n");
      out.write("                    <img src=\"imagenes/logo-pizza.png\" alt=\"\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"footer_2\">\n");
      out.write("                    <div class=\"footer_2t\"> Conocenos</div>\n");
      out.write("                    <div>Zona de Cobertura</div>\n");
      out.write("                    <div>Términos y Condiciones de Uso</div>\n");
      out.write("                    <div>Aviso de Privacidad</div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"footer_3\">\n");
      out.write("                    <div class=\"footer_3t\">Redes sociales</div>\n");
      out.write("                    <div>Instagram</div>\n");
      out.write("                    <div>Facebook</div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"footer_4\">\n");
      out.write("                    <div class=\"footer_4t\">Mi cuenta</div>\n");
      out.write("                    <div>Pedir</div>\n");
      out.write("                    <div>Mis pedidos</div>\n");
      out.write("                </div>\n");
      out.write("            </footer>\n");
      out.write("\n");
      out.write("            <div class=\"btn-whatsapp\">\n");
      out.write("                <a href=\"https://api.whatsapp.com/send?phone=5199999999\" target=\"_blank\">\n");
      out.write("                    <img src=\"http://s2.accesoperu.com/logos/btn_whatsapp.png\" alt=\"\">\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <script src=\" https://code.jquery.com/jquery-3.2.1.slim.min.js\"\n");
      out.write("                    integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\">\n");
      out.write("            </script>\n");
      out.write("            <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\"\n");
      out.write("                    integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\"\n");
      out.write("            crossorigin=\"anonymous\"></script>\n");
      out.write("            <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\"\n");
      out.write("                    integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\"\n");
      out.write("            crossorigin=\"anonymous\"></script>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("\n");
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

package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Signin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/layouts/head.jsp");
    _jspx_dependants.add("/layouts/header.jsp");
    _jspx_dependants.add("/layouts/footer.jsp");
  }

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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>HTML-Es</title>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"styles/style.css\">\r\n");
      out.write("    <!-- Latest compiled and minified CSS -->\r\n");
      out.write("    <!--<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n");
      out.write("    <!-- Latest compiled and minified JavaScript -->\r\n");
      out.write("    <!--<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\" ></script>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"/scripts/bootstrap-3.3.7/dist/css/bootstrap-theme.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"/scripts/bootstrap-3.3.7/dist/css/bootstrap-theme.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"/scripts/bootstrap-3.3.7/dist/css/bootstrap.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"/scripts/bootstrap-3.3.7/dist/css/bootstrap.min.css\">\r\n");
      out.write("    <script src=\"/scripts/bootstrap-3.3.7/dist/js/bootstrap.js\"></script>\r\n");
      out.write("    <script src=\"/scripts/bootstrap-3.3.7/dist/js/bootstrap.min.js\"></script>\r\n");
      out.write("    <script src=\"/scripts/bootstrap-3.3.7/dist/js/npm.js\"></script>-->\r\n");
      out.write("    <!-- Lastest Jquery -->\r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.1.1.min.js\"></script>\r\n");
      out.write("    <script src=\"../scripts/jquery.js\"></script>\r\n");
      out.write("    <script src=\"../js/songun.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<header>\r\n");
      out.write("    <div>\r\n");
      out.write("          <img src=\"img/HTML5_1Color_White.png\" >\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"login\">\r\n");
      out.write("        <ul>\r\n");
      out.write("            <li>\r\n");
      out.write("                <a href=\"index.jsp\" > \r\n");
      out.write("                    Pagina Principal\r\n");
      out.write("                </a>\r\n");
      out.write("            </li>\r\n");
      out.write("            ");
 if (request.getSession(false).getAttribute("name") == null) {
      out.write("\r\n");
      out.write("            <li>\r\n");
      out.write("                <a href=\"Login.jsp\" title=\"Iniciar_Sesion\" >\r\n");
      out.write("                    Iniciar Sesion \r\n");
      out.write("                </a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li>\r\n");
      out.write("                <a href=\"Signin.jsp\" title=\"Registrarse\" >\r\n");
      out.write("                    Registrarse \r\n");
      out.write("                </a>\r\n");
      out.write("            </li>\r\n");
      out.write("            ");
} else if (request.getSession(false) != null) {
      out.write("\r\n");
      out.write("            <li>\r\n");
      out.write("                <div class=\"dropdown\">\r\n");
      out.write("                    <button onclick=\"dropdown()\" class=\"dropbtn\"> Mas </button>\r\n");
      out.write("                        <div id=\"myDropdown\" class=\"dropdown-content\">\r\n");
      out.write("                            <a href=\"Profile.jsp\" title=\"Perfil\" >\r\n");
      out.write("                                Perfil\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <a href=\"Logout\" title=\"Salir\" >\r\n");
      out.write("                                Salir\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </li>\r\n");
      out.write("            \r\n");
      out.write("            ");
};
      out.write("\r\n");
      out.write("        </ul>\r\n");
      out.write("    </div>  \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</header>\r\n");
      out.write("        <script type=\"text/javascript\">\r\n");
      out.write("            /* When the user clicks on the button, \r\n");
      out.write("            toggle between hiding and showing the dropdown content */\r\n");
      out.write("            function dropdown() {\r\n");
      out.write("                document.getElementById(\"myDropdown\").classList.toggle(\"show\");\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            // Close the dropdown menu if the user clicks outside of it\r\n");
      out.write("            window.onclick = function(event) {\r\n");
      out.write("                if (!event.target.matches('.dropbtn')) {\r\n");
      out.write("                    var dropdowns = document.getElementsByClassName(\"dropdown-content\");\r\n");
      out.write("                    var i;\r\n");
      out.write("                    for (i = 0; i < dropdowns.length; i++) {\r\n");
      out.write("                        var openDropdown = dropdowns[i];\r\n");
      out.write("                        if (openDropdown.classList.contains('show')) {\r\n");
      out.write("                            openDropdown.classList.remove('show');\r\n");
      out.write("                        }\r\n");
      out.write("                    }\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("        </script>\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("        <section>\r\n");
      out.write("            ");
 if (request.getAttribute("message") != null) {
      out.write("\r\n");
      out.write("            ");
      out.print( request.getAttribute("message"));
      out.write("\r\n");
      out.write("            <br>\r\n");
      out.write("            <br>\r\n");
      out.write("            <br>\r\n");
      out.write("            ");
 };
      out.write("\r\n");
      out.write("             <div class=\"containersign\">\r\n");
      out.write("                   <img src=\"img/register.png\">\r\n");
      out.write("               \r\n");
      out.write("                <table>\r\n");
      out.write("                    <form action=\"Signin\" method=\"post\" >\r\n");
      out.write("                        <tr>\r\n");
      out.write("                          <td><label></label></td>\r\n");
      out.write("                            <td><input type=\"text\" name=\"name\" placeholder=\"Nombre\"></td><br>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                         <td><label></label></td>\r\n");
      out.write("                            <td><input type=\"text\" name=\"username\"placeholder=\"Nombre de Usuario\"></td><br>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                          <td><label></label></td>\r\n");
      out.write("                            <td><input type=\"text\" name=\"email\"placeholder=\"Correo Electronico\"></td><br>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                          <td><label></label></td>\r\n");
      out.write("                            <td><input type=\"password\" name=\"password\"placeholder=\"Constraseña\"></td><br>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td></td>\r\n");
      out.write("                            \r\n");
      out.write("                            <td><input type=\"submit\" value=\"Registrarse\"></td>\r\n");
      out.write("                        </tr> \r\n");
      out.write("                      \r\n");
      out.write("                    </form>\r\n");
      out.write("            </table>\r\n");
      out.write("        </div>\r\n");
      out.write("        </section>\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<footer>\r\n");
      out.write("    HTML-Es All Rights Reserved \r\n");
      out.write("</footer>\r\n");
      out.write("  \r\n");
      out.write("    </body>\r\n");
      out.write("        \r\n");
      out.write("</html>");
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

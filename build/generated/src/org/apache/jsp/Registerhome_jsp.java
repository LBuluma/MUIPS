package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Registerhome_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Register</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"resources/css/bootstrap.min.css\" id=\"bootstrap-css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"resources/css/mdb.min.css\">\n");
      out.write("        <link  rel=\"stylesheet\"  href=\"muips.css\" >\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body class=\"body1\">\n");
      out.write("        <!--Navbar-->\n");
      out.write("        <nav class=\"navbar navbar-expand-lg fixed-top scrolling-navbar  \" style=\"background-color: whitesmoke\" >\n");
      out.write("            <div class=\"container\" >\n");
      out.write("                <a class=\"navbar-brand\" style=\"position: fixed; left:  10px\" href=\"#\"><strong>MUIPS</strong></a>\n");
      out.write("                <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent-7\" aria-controls=\"navbarSupportedContent-7\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                    <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                </button>\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent-7\">\n");
      out.write("                    <ul class=\"navbar-nav mr-auto\" style=\" position: relative; left:  1000px\">\n");
      out.write("                        <li class=\"nav-item active\"   >\n");
      out.write("                            <a class=\"nav-link\" href=\"Home.jsp\">Home <span class=\"sr-only\">(current)</span></a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link\" href=\"#\">About MUIPS</a>\n");
      out.write("                        </li>                       \n");
      out.write("                        <li class=\"nav-item\"  >\n");
      out.write("                            <a href=\"\" class=\"nav-link\" data-toggle=\"modal\" data-target=\"#modalLoginForm\" >Login</a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        <div class=\"container border border-light \" style=\"border-radius:  1.5em; height: 600px; \n");
      out.write("             width: 60%; margin-top: 100px; background-color: white\">\n");
      out.write("            <div class=\"h2-responsive text-center \" style=\"margin-top: 20px\"><strong> User Registration</strong></div>\n");
      out.write("            <hr>\n");
      out.write("            <div style=\"margin-left: 30px; margin-top: 30px\">\n");
      out.write("            <p> Select your user type:</p>\n");
      out.write("            <!-- Default unchecked -->\n");
      out.write("            <div class=\"custom-control custom-radio\">\n");
      out.write("                <input type=\"radio\" class=\"custom-control-input\" id=\"defaultUnchecked\" name=\"defaultExampleRadios\">\n");
      out.write("                <label class=\"custom-control-label  mb-4\" for=\"defaultUnchecked\">Public user</label>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!-- Default checked -->\n");
      out.write("            <div class=\"custom-control custom-radio\">\n");
      out.write("                <input type=\"radio\" class=\"custom-control-input\" id=\"defaultChecked\" name=\"defaultExampleRadios\" checked>\n");
      out.write("                <label class=\"custom-control-label  mb-4\" for=\"defaultChecked\">Professional user</label>\n");
      out.write("            </div>\n");
      out.write("          \n");
      out.write("            <p><strong>Public user:</strong>  This users include the victims' family members, victim's guardian, \n");
      out.write("                victim's friend, and other members of the public who are over 18 years of age. Registering as a Public User \n");
      out.write("                allows one access to enter new missing person cases or contribute relevant information to MUIPS feedback on posts, \n");
      out.write("                which will be vetted with the investigating agency prior to publication in the system, \n");
      out.write("                as well as provides the user with permission to view and search non-sensitive information in MUIPS.</p>\n");
      out.write("            \n");
      out.write("            <br>\n");
      out.write("            \n");
      out.write("            <p><strong>Professional users:</strong> include law enforcement officers, medical examiners,\n");
      out.write("                coroners, and other allied professionals. \n");
      out.write("                Professional User registration requires clearance from a criminal justice agency, and once vetted,\n");
      out.write("                the user will be granted heightened permissions within the MUIPS system, as appropriate; to access secure\n");
      out.write("                information, manage agency cases, and network with other criminal justice professionals.</p>\n");
      out.write("            <input class=\"btn-blue btn-block form-control\" type=\"submit\" value=\"Start Registration\">\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("    <script type=\"text/javascript\" src=\"resources/js/jquery-3.3.1.min.js\"></script>\n");
      out.write("    <!-- Bootstrap tooltips -->\n");
      out.write("    <script type=\"text/javascript\" src=\"resources/js/popper.min.js\"></script>\n");
      out.write("    <!-- Bootstrap core JavaScript -->\n");
      out.write("    <script type=\"text/javascript\" src=\"resources/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("    <script type=\"text/javascript\" src=\"resources/myjs.js\"></script>\n");
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

package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>MUIPS</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"resources/css/bootstrap.min.css\">\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"resources/css/mdb.min.css\">\n");
      out.write("       \n");
      out.write("   </head>\n");
      out.write("   <body >\n");
      out.write("       \n");
      out.write("        <header>\n");
      out.write("            <!--Navbar-->\n");
      out.write("            <nav class=\"navbar navbar-expand-lg navbar-dark fixed-top scrolling-navbar\" style=\" width: 100%\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <a class=\"navbar-brand\" style=\"position: relative; right: 530px\" href=\"#\"><strong>MUIPS</strong></a>\n");
      out.write("                    <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent-7\" aria-controls=\"navbarSupportedContent-7\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                        <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                    </button>\n");
      out.write("                    <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent-7\">\n");
      out.write("                        <ul class=\"navbar-nav mr-auto\" style=\"position: relative; left: 800px\">\n");
      out.write("                            <li class=\"nav-item active\">\n");
      out.write("                                <a class=\"nav-link\" href=\"#\">Home <span class=\"sr-only\">(current)</span></a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a class=\"nav-link\" href=\"#\">About MUIPS</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a class=\"nav-link\" href=\"Registerhome.jsp\">Register</a>\n");
      out.write("                            </li>\n");
      out.write("                        \n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                            <a  class=\"nav-link\" href=\"Login.jsp\"  >Login</a>\n");
      out.write("                        </li>\n");
      out.write("                            </ul>\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("            <!--Carousel Wrapper-->\n");
      out.write("            <div id=\"carousel-example-2\" class=\"carousel slide carousel-fade \" data-ride=\"carousel\">\n");
      out.write("                <!--Indicators-->\n");
      out.write("                <ol class=\"carousel-indicators\">\n");
      out.write("                    <li data-target=\"#carousel-example-2\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("                    <li data-target=\"#carousel-example-2\" data-slide-to=\"1\"></li>\n");
      out.write("                    <li data-target=\"#carousel-example-2\" data-slide-to=\"2\"></li>\n");
      out.write("                </ol>\n");
      out.write("                <!--/.Indicators-->\n");
      out.write("                <!--Slides-->\n");
      out.write("                <div class=\"carousel-inner\" role=\"listbox\">\n");
      out.write("                    <div class=\"carousel-item active\">\n");
      out.write("                        <div class=\"view\">\n");
      out.write("                            <img class=\"d-block w-100\" src=\"images/m1.jpg\"  style=\"height: 650px\" alt=\"First slide\">\n");
      out.write("                            <div class=\"mask rgba-black-light\"></div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"carousel-caption\">\n");
      out.write("\n");
      out.write("                            <p class=\"h3-responsive\">\"Hope is being able to see that there is light\n");
      out.write("                                despite all of the darkness.\"   - Desmond Tutu</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"carousel-item\">\n");
      out.write("                        <!--Mask color-->\n");
      out.write("                        <div class=\"view\">\n");
      out.write("                            <img class=\"d-block w-100\" src=\"images/m5.jpg\" style=\"height: 650px\" alt=\"Second slide\">\n");
      out.write("                            <div class=\"mask rgba-black-strong\"></div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"carousel-caption\">\n");
      out.write("                            <p class=\"h3-responsive\">\"No matter the number of times you fail you must be determined to succeed. \n");
      out.write("                                You must not lose hope. Don’t stop in your storm. Don’t give up so easily.\"   -Tony Narams</p>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"carousel-item\">\n");
      out.write("                        <!--Mask color-->\n");
      out.write("                        <div class=\"view\">\n");
      out.write("                            <img class=\"d-block w-100\" src=\"images/image.adapt.480.low.kenya_icc_elizabeth_njeri.jpg\"  style=\"height: 650px\"alt=\"Third slide\">\n");
      out.write("                            <div class=\"mask rgba-black-slight\"></div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"carousel-caption\">\n");
      out.write("\n");
      out.write("                            <p class=\"h3-responsive\">\"Be prepared, work hard, and hope for a little luck. Recognize that the harder you work and the better \n");
      out.write("                                prepared you are, the more luck you might have.\" -    Ed Bradley</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!--/.Slides-->\n");
      out.write("                <!--Controls-->\n");
      out.write("                <a class=\"carousel-control-prev\" href=\"#carousel-example-2\" role=\"button\" data-slide=\"prev\">\n");
      out.write("                    <span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\n");
      out.write("                    <span class=\"sr-only\">Previous</span>\n");
      out.write("                </a>\n");
      out.write("                <a class=\"carousel-control-next\" href=\"#carousel-example-2\" role=\"button\" data-slide=\"next\">\n");
      out.write("                    <span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\n");
      out.write("                    <span class=\"sr-only\">Next</span>\n");
      out.write("                </a>\n");
      out.write("                <!--/.Controls-->\n");
      out.write("            </div>\n");
      out.write("            <!--/.Carousel Wrapper-->\n");
      out.write("        </header>\n");
      out.write("            <!-- Main navigation -->\n");
      out.write("            <!--Main Layout-->\n");
      out.write("            <main>\n");
      out.write("                <div class=\"container\" >\n");
      out.write("                    <!--Grid row-->\n");
      out.write("                    <div class=\"row py-5\">\n");
      out.write("                        <!--Grid column-->\n");
      out.write("                        <div class=\"col-md-12 text-center\">\n");
      out.write("                            <p style=\"font-family: sans-serif; font-size: 20px;font-style: italic\">\"To be without hope is like\n");
      out.write("                                being without goals, what are you working towards?\" </p>\n");
      out.write("                            <p><strong>Catherine Pulsife</strong></p>\n");
      out.write("                        </div>\n");
      out.write("                        <!--Grid column-->\n");
      out.write("                    </div>\n");
      out.write("                    <!--Grid row-->\n");
      out.write("                </div>\n");
      out.write("            </main>\n");
      out.write("            <!--Main Layout-->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("    <script type=\"text/javascript\" src=\"resources/js/jquery-3.3.1.min.js\"></script>\n");
      out.write("    <!-- Bootstrap tooltips -->\n");
      out.write("    <script type=\"text/javascript\" src=\"resources/js/popper.min.js\"></script>\n");
      out.write("    <!-- Bootstrap core JavaScript -->\n");
      out.write("    <script type=\"text/javascript\" src=\"resources/js/bootstrap.min.js\"></script>\n");
      out.write("    <!-- MDB core JavaScript -->\n");
      out.write("    <script type=\"text/javascript\" src=\"resources/js/mdb.min.js\"></script>\n");
      out.write("\n");
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

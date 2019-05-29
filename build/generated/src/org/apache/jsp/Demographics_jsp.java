package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Demographics_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Person Information</title>\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"resources/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"resources/muips.css\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body id=\"page-top\">\n");
      out.write("\n");
      out.write("        <!-- Page Wrapper -->\n");
      out.write("        <div id=\"wrapper\">\n");
      out.write("\n");
      out.write("\n");
      out.write("            <!-- End of Sidebar -->\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Sidebar.jsp", out, false);
      out.write("\n");
      out.write("            <!-- Content Wrapper -->\n");
      out.write("            <div id=\"content-wrapper\" class=\"d-flex flex-column\">\n");
      out.write("\n");
      out.write("                <!-- Main Content -->\n");
      out.write("                <div id=\"content\">\n");
      out.write("                    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Navbar.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <!-- End of Topbar -->\n");
      out.write("                    <div class=\"container-fluid \" >\n");
      out.write("\n");
      out.write("                        <div class=\"card  border p-5\" >\n");
      out.write("\n");
      out.write("                            <!--Make post form-->\n");
      out.write("                            <form   action=\"ReportCase\" method=\"get\" >\n");
      out.write("                                <p class=\"h4 mb-1 text-center\"><strong>Missing Person Details</strong></p>\n");
      out.write("                                <hr>\n");
      out.write("                                <div class=\"form-row mb-1\">\n");
      out.write("                                    <label for=\"inputEmail4\">First Name:</label>\n");
      out.write("                                    <input type=\"text\" name=\"fname\" class=\"form-control\" id=\"inputFname\"  >\n");
      out.write("                                </div>\n");
      out.write("                                <!--second name-->\n");
      out.write("                                <div class=\"form-row mb-1\">\n");
      out.write("                                    <label for=\"inputPassword4\">Second Name:</label>\n");
      out.write("                                    <input type=\"text\" name=\"sname\" class=\"form-control\" id=\"inputSname\" >\n");
      out.write("                                </div>\n");
      out.write("                                <!--OB-->\n");
      out.write("                                <div class=\"form-row mb-1\">\n");
      out.write("                                    <label for=\"inputAddress\">Police OB number:</label>\n");
      out.write("                                    <input type=\"text\" name=\"ob\" class=\"form-control\" id=\"inputAddress\" required>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\" form-row mb-1\">\n");
      out.write("                                    <label for=\"inputPassword4\">Age:</label>\n");
      out.write("                                    <input type=\"number\" name=\"age\" class=\"form-control\" id=\"inputPassword4\" required min=\"1\" max=\"120\" required>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-check form-check-inline mb-1\"  >\n");
      out.write("                                    <input class=\"form-check-input\" type=\"radio\" name=\"gender\" id=\"inlineRadio1\" value=\"male\" required>\n");
      out.write("                                    <label class=\"form-check-label\" for=\"inlineRadio1\">Male</label>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-check form-check-inline mb-1\" >\n");
      out.write("                                    <input class=\"form-check-input\" type=\"radio\" name=\"gender\" id=\"inlineRadio2\" value=\"female\" required>\n");
      out.write("                                    <label class=\"form-check-label\" for=\"inlineRadio2\">Female</label>\n");
      out.write("                                </div>  \n");
      out.write("\n");
      out.write("                                <!--Ethnicity-->\n");
      out.write("                                <div class=\"form-row mb-1 \" >\n");
      out.write("\n");
      out.write("                                    <div class=\"form-group col-md-6\">\n");
      out.write("                                        <label for=\"inputEthnicity\">Ethnicity:</label>\n");
      out.write("                                        <select id=\"inputState\" class=\"form-control\" name=\"ethnic\">\n");
      out.write("                                            <option selected>Maasai</option>\n");
      out.write("                                            <option>Kikiyu</option>\n");
      out.write("                                            <option>Luo</option>\n");
      out.write("                                            <option>European</option>\n");
      out.write("                                            <option>Asian</option>\n");
      out.write("                                            <option>Borana</option>\n");
      out.write("                                            <option>Turkana</option>\n");
      out.write("                                            <option>Luhya</option>\n");
      out.write("                                            <option>Meru</option>\n");
      out.write("                                            <option>Embu</option>\n");
      out.write("                                            <option>Other</option>\n");
      out.write("\n");
      out.write("                                        </select>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <!--Tribe-->\n");
      out.write("                                    <div class=\"form-group col-md-6\">\n");
      out.write("                                        <label for=\"inputEthnicity\">Fluent language:</label>\n");
      out.write("                                        <input type=\"text\" name=\"language\" class=\"form-control\" id=\"inputZip\" >\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <!--Physical Description-->\n");
      out.write("                                <div class=\"form-row mb-1\" >\n");
      out.write("                                    <div class=\"form-group col-md-6\" >\n");
      out.write("                                        <label for=\"inputZip\">Height:</label>\n");
      out.write("                                        <input type=\"number\"name=\"height\" class=\"form-control\" id=\"inputZip\" placeholder=\"ft\" min=\"1.0\" max=\"10.0\" required>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group col-md-6\" >\n");
      out.write("                                        <label for=\"inputZip\">Weight:</label>\n");
      out.write("                                        <input type=\"number\" name=\"weight\" class=\"form-control\" id=\"inputZip\" placeholder=\"Kgs\" min=\"1\"  max=\"300\"required>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <hr>\n");
      out.write("\n");
      out.write("                                <div class=\"text-right mb-1\">\n");
      out.write("                                    <input type=\"text\" name=\"action\" value=\"demo\" hidden=\"true\">\n");
      out.write("                                    <button  class=\"btn btn-primary btn-block\" type=\"submit\" >Next</button>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <br>\n");
      out.write("                    <br>\n");
      out.write("                    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Footer.jsp", out, false);
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
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

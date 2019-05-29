package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class UnidentifiedDistinct_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Distinct Feature</title>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"resources/css/bootstrap.min.css\" id=\"bootstrap-css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"resources/muips.css\">         \n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body id=\"page-top\">\n");
      out.write("        <!-- Page Wrapper -->\n");
      out.write("        <div id=\"wrapper\">\n");
      out.write("            <!-- End of Sidebar -->\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "ProfSidenav.jsp", out, false);
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
      out.write("                    <!-- End of Topbar -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div class=\"card p-5\" style=\"\">\n");
      out.write("\n");
      out.write("                        <p class=\"h4 mb-4 text-center\"><strong>Distinct Feature Information</strong></p>\n");
      out.write("\n");
      out.write("                        <!-- Default form report -->\n");
      out.write("                        <form  action=\"UnidentifiedPersonReport\" method=\"post\" style=\"margin-top: 20px\">             \n");
      out.write("                            <hr >\n");
      out.write("                            <!-- Distinct feature type-->\n");
      out.write("                            <div class=\"form-row  mb-4\" style=\"margin-top: 20px\" name=\"disttype\">\n");
      out.write("                                <label for=\"inputType\">Type</label>\n");
      out.write("                                <select id=\"inputType\" class=\"form-control\">\n");
      out.write("                                    <option selected disabled>select</option>\n");
      out.write("                                    <option>Tattoo</option>\n");
      out.write("                                    <option>Piercing</option>\n");
      out.write("                                    <option>Scars and marks</option>\n");
      out.write("                                    <option>Jewelry</option>\n");
      out.write("                                    <option>Amputation</option>\n");
      out.write("                                    <option>Clothing</option>\n");
      out.write("                                    <option>Eye wear</option>\n");
      out.write("                                    <option>footwear</option>\n");
      out.write("                                    <option>Accessories</option>                                              \n");
      out.write("                                    <option>Other</option>\n");
      out.write("\n");
      out.write("                                </select>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <!--Description of the feature-->\n");
      out.write("                            <div class=\"form-row mb-4\" style=\"margin-top: 30px\">\n");
      out.write("                                <label for=\"inputType\">Description</label>\n");
      out.write("                                <textarea type=\"text\" class=\"form-control\" id=\"exampleFormControlTextarea6\" name=\"distd\" rows=\"5\" placeholder=\"Description...\"></textarea>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <label >Upload Photo:</label>\n");
      out.write("                            <div class=\"file-upload-wrapper\">\n");
      out.write("                                <input type=\"file\" id=\"input-file-now\" class=\"file-upload\" accept=\".png,.jpg,.jpeg\"/>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <br>\n");
      out.write("\n");
      out.write("                            <hr>\n");
      out.write("\n");
      out.write("                            <!--navigation buttons-->\n");
      out.write("                            <input type=\"text\" hidden=\"true\" name=\"action\" value=\"distinct\">\n");
      out.write("                            <div class=\"form-row\">\n");
      out.write("                                <a href=\"MissingPersonInfo.jsp\" class=\" btn btn-grey\" >Back</a>\n");
      out.write("                                <div class=\"col text-right\">\n");
      out.write("                                    <button class=\" btn btn-info\" type=\"submit\">Next</button>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("                    </div>   \n");
      out.write("                </div>\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Footer.jsp", out, false);
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("</body>\n");
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

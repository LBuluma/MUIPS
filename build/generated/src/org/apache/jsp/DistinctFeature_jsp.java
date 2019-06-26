package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class DistinctFeature_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"resources/css/bootstrap.min.css\" id=\"bootstrap-css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"resources/muips.css\">\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body id=\"page-top\">\n");
      out.write("        <!-- Page Wrapper -->\n");
      out.write("        <div id=\"wrapper\">\n");
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
      out.write("                    <!-- End of Topbar -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div class=\"card shadow\" style=\"height: 550px; width: 60%\">\n");
      out.write("                        <div class=\"card-header py-3\" >\n");
      out.write("                            <p class=\"h4 mb-1 text-center\"><strong>Distinct Feature Information</strong></p>\n");
      out.write("                        </div>\n");
      out.write("                        <ul class=\"nav nav-tabs\" id=\"myTab\" role=\"tablist\">\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a class=\"nav-link active\" id=\"home-tab\" data-toggle=\"tab\" href=\"#home\" role=\"tab\" aria-controls=\"home\" aria-selected=\"true\">Feature Information</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a class=\"nav-link \" id=\"info-tab\" data-toggle=\"tab\" href=\"#info\" role=\"tab\" aria-controls=\"info\" aria-selected=\"false\">Upload photo</a>\n");
      out.write("                            </li>\n");
      out.write("\n");
      out.write("                        </ul>\n");
      out.write("                        <div class=\"tab-content\" id=\"myTabContent\">\n");
      out.write("                            <div class=\"tab-pane fade show active\" id=\"home\" role=\"tabpanel\" aria-labelledby=\"home-tab\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                                <div class=\"container\" style=\"width: 75%\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    <!-- Default form report -->\n");
      out.write("                                    <form  action=\"ReportCase\" method=\"post\" >             \n");
      out.write("\n");
      out.write("                                        <!-- Distinct feature type-->\n");
      out.write("                                        <div class=\"form-row  mb-1\" style=\"margin-top: 30px\" >\n");
      out.write("                                            <label for=\"inputType\">Type:</label>\n");
      out.write("                                            <select id=\"inputType\" class=\"form-control\" name=\"disttype\"> \n");
      out.write("                                                <option selected disabled>...</option>\n");
      out.write("                                                <option selected>Tattoo</option>\n");
      out.write("                                                <option>Piercing</option>\n");
      out.write("                                                <option>Scars and marks</option>\n");
      out.write("                                                <option>Jewelry</option>\n");
      out.write("                                                <option>Amputation</option>\n");
      out.write("                                                <option>Clothing</option>\n");
      out.write("                                                <option>Eye wear</option>\n");
      out.write("                                                <option>footwear</option>\n");
      out.write("                                                <option>Accessories</option>                                              \n");
      out.write("                                                <option>Other</option>\n");
      out.write("\n");
      out.write("                                            </select>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                        <!--Description of the feature-->\n");
      out.write("                                        <div class=\"form-row mb-1\" >\n");
      out.write("                                            <label for=\"inputType\">Description:</label>\n");
      out.write("                                            <textarea type=\"text\" class=\"form-control\" id=\"exampleFormControlTextarea6\" name=\"distd\" rows=\"5\" placeholder=\"Description...\"></textarea>\n");
      out.write("                                        </div>\n");
      out.write("                                        <!--navigation buttons-->\n");
      out.write("                                        <input type=\"text\" hidden=\"true\" name=\"action\" value=\"distinct\">\n");
      out.write("                                       \n");
      out.write("\n");
      out.write("                                        <hr>\n");
      out.write("                                        <div class=\"form-row \" style=\"margin-top: 30px\">\n");
      out.write("                                            <a href=\"LocationInfo.jsp\" class=\" btn btn-info\" >Back</a>\n");
      out.write("                                            <div class=\"col text-right\">\n");
      out.write("                                                <button class=\" btn btn-primary\" type=\"submit\">Next</button>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"tab-pane fade\" id=\"info\" role=\"tabpanel\" aria-labelledby=\"info-tab\">\n");
      out.write("                                <form id=\"form\" action=\"FileUpload\" method=\"post\" enctype=\"multipart/form-data\">\n");
      out.write("                                    <div class=\"row\" style=\" margin-top: 30px; margin-left: 30px\">\n");
      out.write("                                        <div class=\"col-4\">\n");
      out.write("                                            <input id=\"uploadImage\" type=\"file\" accept=\"image/*\" name=\"image\" />\n");
      out.write("                                            <input  type=\"text\"  name=\"type\" value=\"distinct\" hidden />\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"col\">\n");
      out.write("                                            <button type=\"submit\" class=\"btn btn-primary\" >\n");
      out.write("                                                upload photo\n");
      out.write("                                            </button>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                </form>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Footer.jsp", out, false);
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <script type=\"text/javascript\" src=\"resources/js/jquery-3.3.1.min.js\"></script>\n");
      out.write("            <script type=\"text/javascript\" src=\"resources/js/AjaxFileUpload.js\"></script>\n");
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

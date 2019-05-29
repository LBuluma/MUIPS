package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class MissingPersonInfo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title> Person Information</title>\n");
      out.write("        <link href=\"resources/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"resources/muips.css\" rel=\"stylesheet\">\n");
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
      out.write("            <div id=\"content-wrapper\" class=\"d-flex flex-column\"  style=\"background-color: white\">\n");
      out.write("\n");
      out.write("                <!-- Main Content -->\n");
      out.write("                <div id=\"content\">\n");
      out.write("                    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Navbar.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <!-- End of Topbar -->\n");
      out.write("\n");
      out.write("                    <!-- Begin Page Content -->\n");
      out.write("                    <div class=\"card p-5\" style=\"height: 750px\" >\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <form  action=\"ReportCase\" method=\"post\">\n");
      out.write("\n");
      out.write("                            <p class=\"h4 mb-1 text-center\"><strong>Missing Person Information</strong></p>\n");
      out.write("                            <hr>\n");
      out.write("                            <!-- E-mail -->\n");
      out.write("                            <label>Huduma Number:</label>\n");
      out.write("                            <input type=\"text\" name=\"pid\" id=\"defaultRegisterFormEmail\" class=\"form-control mb-1\" required>\n");
      out.write("\n");
      out.write("                            <label>Date of last contact:</label>\n");
      out.write("\n");
      out.write("                            <input type=\"date\" name=\"lastContact\" id=\"defaultRegisterFormEmail\" class=\"form-control mb-1\" placeholder=\"Date of Last Contact\" required>\n");
      out.write("\n");
      out.write("                            <div class=\"form-row mb-1\" style=\"margin-top: 10px\">\n");
      out.write("\n");
      out.write("                                <div class=\"form-group col-md-6\">\n");
      out.write("                                    <label>Color:</label>\n");
      out.write("                                    <select id=\"inputState\" class=\"form-control\" name=\"pcolor\">\n");
      out.write("\n");
      out.write("                                        <option>white</option>\n");
      out.write("                                        <option>Latino</option>\n");
      out.write("                                        <option>Black</option>\n");
      out.write("                                        <option>Indian</option>\n");
      out.write("                                        <option>Chocolate</option>\n");
      out.write("                                        <option>Asian</option>\n");
      out.write("                                        <option>Other</option>\n");
      out.write("\n");
      out.write("                                    </select>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group col-md-6\">\n");
      out.write("                                    <label>Hair color:</label>\n");
      out.write("                                    <select id=\"inputState\" class=\"form-control\" name=\"hcolor\">\n");
      out.write("\n");
      out.write("                                        <option >Brown</option>\n");
      out.write("                                        <option>Black</option>\n");
      out.write("                                        <option>Sandy</option>\n");
      out.write("                                        <option>Gray/partially gray</option>\n");
      out.write("                                        <option>Red/Auburn</option>\n");
      out.write("                                        <option>Blue</option>\n");
      out.write("                                        <option>Green</option>\n");
      out.write("                                        <option>Orange</option>\n");
      out.write("                                        <option>Purple</option>\n");
      out.write("                                        <option>Pink</option>\n");
      out.write("                                        <option>Completely bald</option>\n");
      out.write("\n");
      out.write("                                    </select>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group mb-1\">\n");
      out.write("                                <label>Eye color:</label>\n");
      out.write("                                <select id=\"inputState\" class=\"form-control\" name=\"ecolor\">\n");
      out.write("\n");
      out.write("                                    <option >Black</option>\n");
      out.write("                                    <option>Blue</option>\n");
      out.write("                                    <option>Brown</option>\n");
      out.write("                                    <option>Green</option>\n");
      out.write("                                    <option>Hazel</option>\n");
      out.write("                                    <option>Pink</option>\n");
      out.write("                                    <option>Maroon</option>\n");
      out.write("                                    <option>Missing</option>\n");
      out.write("\n");
      out.write("                                </select>\n");
      out.write("                            </div>\n");
      out.write("                            <label>Description:</label>\n");
      out.write("                            <div class=\"form-group  mb-1\">\n");
      out.write("\n");
      out.write("                                <textarea type=\"text\" class=\"form-control \" name=\"pdesc\" id=\"exampleFormControlTextarea6\" rows=\"5\" placeholder=\"Physical description...\" required=\"\"></textarea>\n");
      out.write("                            </div>\n");
      out.write("                          \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <hr>\n");
      out.write("                            <div class=\"form-row mb-1\">\n");
      out.write("                                <a href=\"Demographics.jsp\" class=\" btn btn-info\"  >Back</a>\n");
      out.write("\n");
      out.write("                                <div class=\"col text-right \">\n");
      out.write("                                    <button class=\" btn btn-primary\" type=\"submit\" >Next</button>\n");
      out.write("                                </div>\n");
      out.write("                                <input type=\"text\" hidden=\"true\" name=\"action\" value=\"info\">\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </form>\n");
      out.write("                          <form id=\"form\" action=\"FileUpload\" method=\"post\" enctype=\"multipart/form-data\">\n");
      out.write("\n");
      out.write("                                <input id=\"uploadImage\" type=\"file\" accept=\"image/*\" name=\"image\" />\n");
      out.write("                                <input  type=\"text\"  name=\"type\" value=\"missing\" hidden />\n");
      out.write("                                <input class=\"btn btn-success\" type=\"submit\" value=\"Upload\" id=\"btn\">\n");
      out.write("                            </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div>    \n");
      out.write("                    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Footer.jsp", out, false);
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script type=\"text/javascript\" src=\"resources/js/jquery-3.3.1.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"resources/js/AjaxFileUpload.js\"></script>\n");
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

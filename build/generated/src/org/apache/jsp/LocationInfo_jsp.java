package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class LocationInfo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>More information</title>\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"resources/css/bootstrap.min.css\" id=\"bootstrap-css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"resources/css/mdb.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"resources/css/mdb.lite.min.css\">\n");
      out.write("        <link  rel=\"stylesheet\"  href=\"muips.css\" >\n");
      out.write("        <script type=\"text/javascript\" src=\"resources/js/jquery-3.3.1.min.js\"></script>\n");
      out.write("        <!-- Bootstrap tooltips -->\n");
      out.write("        <script type=\"text/javascript\" src=\"resources/js/popper.min.js\"></script>\n");
      out.write("        <!-- Bootstrap core JavaScript -->\n");
      out.write("        <script type=\"text/javascript\" src=\"resources/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body class=\"body1\" style=\"height: 100%\">\n");
      out.write("        <div class=\"wrapper\">\n");
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Sidenav.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("title", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("Dash", request.getCharacterEncoding()), out, false);
      out.write("\n");
      out.write("            <div class=\"content\" style=\"width: 100%\">\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Sidebar.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("title", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("Dash", request.getCharacterEncoding()), out, false);
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"container container1  p-5\" style=\"width: 60%;height: 800px; margin-top:30px\">\n");
      out.write("            <!-- Default form register -->\n");
      out.write("            <form  action=\"ReportCase\" method=\"post\">\n");
      out.write("                <p class=\"h4 mb-4 text-center\"><strong>Last Known Location</strong></p>\n");
      out.write("                <hr>   \n");
      out.write("                \n");
      out.write("                <div class=\"form-row mb-4\" style=\"margin-top: 30px\">\n");
      out.write("                          <label>County:</label>\n");
      out.write("                        <select id=\"inputType\" class=\"form-control\" name=\"county\">\n");
      out.write("                            <option selected disabled>Not selected...</option>\n");
      out.write("                            <option>Nakuru</option>\n");
      out.write("                            \n");
      out.write("                        </select>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                      <label>Constituency:</label>\n");
      out.write("                    <div class=\"form-row mb-4\" >\n");
      out.write("                        <select id=\"inputCon\" class=\"form-control\" required>\n");
      out.write("                        \n");
      out.write("                            <option selected>Nakuru Town West</option>\n");
      out.write("                            <option>Subukia</option>\n");
      out.write("                            <option>Nakuru Town</option>\n");
      out.write("                            <option>Nakuru Town East</option>\n");
      out.write("                            <option>Kuresoi North</option>\n");
      out.write("                            <option>Kuresoi South</option>\n");
      out.write("                            <option>Rongai</option>\n");
      out.write("                            <option>Molo</option>\n");
      out.write("                        </select>\n");
      out.write("                    </div>\n");
      out.write("              \n");
      out.write("                <div class=\"form-row mb-4\">\n");
      out.write("\n");
      out.write("                    <div class=\"col-6 \">\n");
      out.write("                       <label>Ward:</label>  \n");
      out.write("                        <!-- First name -->\n");
      out.write("                        <input type=\"text\" name=\"ward\" style=\"padding:15px 20px;\" id=\"defaultRegisterFormFirstName\" class=\"form-control\"required >\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <div class=\"col-6 \">\n");
      out.write("                         <label>Village:</label>\n");
      out.write("                        <!-- Last name -->\n");
      out.write("                        <input type=\"text\" name=\"village\" id=\"defaultRegisterFormLastName\" class=\"form-control\"  required>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div> \n");
      out.write("                <label>Investigation agency:</label>\n");
      out.write("                <input type=\"text\" name=\"org\" style=\"padding:15px 20px;\" id=\"defaultRegisterFormFirstName\" class=\"form-control mb-4\" required >\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("               \n");
      out.write("                <!-- Distinct Feature-->\n");
      out.write("                <div class=\"custom-control custom-checkbox custom-control-inline mb-4\" style=\"margin-top: 20px; margin-right: 150px\">\n");
      out.write("                    <input type=\"checkbox\" name=\"distinct\" value=\"dist\" class=\"custom-control-input\" id=\"defaultInline1\">\n");
      out.write("                    <label class=\"custom-control-label\" for=\"defaultInline1\">Had distinct feature e.g tattoo</label>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <!-- Default inline 2-->\n");
      out.write("                <div class=\"custom-control custom-checkbox custom-control-inline\">\n");
      out.write("                    <input type=\"checkbox\" name=\"transp\" value=\"trans\" class=\"custom-control-input\" id=\"defaultInline2\">\n");
      out.write("                    <label class=\"custom-control-label\" for=\"defaultInline2\">Had transportation e.g bike</label>\n");
      out.write("                </div>\n");
      out.write("                <hr>\n");
      out.write("                \n");
      out.write("                <input type=\"text\" hidden=\"true\" name=\"action\" value=\"location\">\n");
      out.write("                <div class=\"form-row\">\n");
      out.write("                 \n");
      out.write("                <a href=\"PersonalInformation.jsp\" class=\" btn btn-grey\"  >Back</a>\n");
      out.write("                <div class=\"col text-right\">\n");
      out.write("                <button class=\" btn btn-info\" type=\"submit\" >Finish</button>\n");
      out.write("                </div>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("        </div>   \n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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

package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Transportation_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title></title>\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"resources/css/bootstrap.min.css\" id=\"bootstrap-css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"resources/css/mdb.min.css\">\n");
      out.write("      \n");
      out.write("         <link href=\"mycss.css\" rel=\"stylesheet\" >\n");
      out.write("        <link rel=\"stylesheet\" href=\"muips.css\">\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\" src=\"resources/js/jquery-3.3.1.min.js\"></script>\n");
      out.write("        <!-- Bootstrap tooltips -->\n");
      out.write("        <script type=\"text/javascript\" src=\"resources/js/popper.min.js\"></script>\n");
      out.write("        <!-- Bootstrap core JavaScript -->\n");
      out.write("        <script type=\"text/javascript\" src=\"resources/js/bootstrap.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"resources/myjs.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("\n");
      out.write("    <body class='body1' style=\"height: 900px\">\n");
      out.write("         ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "UserHeader.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("title", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("Dash", request.getCharacterEncoding()), out, false);
      out.write("\n");
      out.write("        <main > \n");
      out.write("\n");
      out.write("        <div class=\"container border border-light p-5\" style=\"background-color: #fff; width: 50%; height: 800px; margin-top: 75px;\" >\n");
      out.write("            <!-- Default form register -->\n");
      out.write("            <form  action=\"ReportCase\" method=\"post\">\n");
      out.write("\n");
      out.write("                <p class=\"h4 mb-4 text-center\" ><strong>Transportation Information</strong></p>\n");
      out.write("                <hr>\n");
      out.write("                <div class=\"form-row mb-4\">\n");
      out.write("                    <div class=\"col-md-6\" >\n");
      out.write("                        <label>Type</label>\n");
      out.write("                        <select id=\"inputaTransType\" class=\"form-control\" name=\"transtype\">\n");
      out.write("                            <option selected disabled>select</option>\n");
      out.write("                            \n");
      out.write("                            <option>Bicycle</option>\n");
      out.write("                            <option>Motorbike</option>\n");
      out.write("                            <option>Scooter</option>\n");
      out.write("                            <option>Vehicle</option>\n");
      out.write("                            <option>Other</option>\n");
      out.write("\n");
      out.write("                        </select>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-6 \">\n");
      out.write("                        <label>Color:</label>\n");
      out.write("                        <select id=\"inputTransColor\" class=\"form-control\" name=\"transcolor\">\n");
      out.write("                            <option selected disabled=\"true\">select</option>\n");
      out.write("                            <option>Bicycle</option>\n");
      out.write("                            <option>Motorbike</option>\n");
      out.write("                            <option>Scooter</option>\n");
      out.write("                            <option>Vehicle</option>\n");
      out.write("                            <option>Other</option>\n");
      out.write("\n");
      out.write("                        </select>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                 <label>Model:</label>\n");
      out.write("                <div class=\"form-row mb-4\">\n");
      out.write("                    <input type=\"text\" name=\"model\"  id=\"defaultRegisterFormFirstName\" class=\"form-control\"  required >\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                  <label>Make:</label>\n");
      out.write("                <div class=\"form-row mb-4\">\n");
      out.write("                    <input type=\"text\" name=\"make\"  id=\"defaultRegisterFormFirstName\" class=\"form-control\" required >\n");
      out.write("                </div>       \n");
      out.write("                 \n");
      out.write("                  \n");
      out.write("                 <label>Description:</label>\n");
      out.write("                <div class=\"form-group mb-4\">\n");
      out.write("\n");
      out.write("                    <textarea class=\"form-control z-depth-1 \" name=\"transd\" id=\"exampleFormControlTextarea6\" rows=\"5\" placeholder=\"Vehicle description, bike description etc\"></textarea>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("               \n");
      out.write("                    <label  >Upload Photo:</label>\n");
      out.write("                    <div class=\"file-upload-wrapper\">\n");
      out.write("                        <input type=\"file\" id=\"input-file-now\" class=\"file-upload\" />\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                <br>\n");
      out.write("                 <hr>\n");
      out.write("\n");
      out.write("                <input type=\"text\" hidden=\"true\" name=\"action\" value=\"trans\">\n");
      out.write("                <div class=\"form-row\">\n");
      out.write("                <a href=\"DistinctFeature.jsp\" class=\" btn btn-grey\" >Back</a>\n");
      out.write("                <div class=\"col text-right\">\n");
      out.write("                <button class=\" btn btn-blue\" type=\"submit\" >Next</button>\n");
      out.write("                </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            </form>\n");
      out.write("        </div>   \n");
      out.write("         \n");
      out.write("        </main>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("    \n");
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

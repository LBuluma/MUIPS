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
      out.write("        <title></title>\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"resources/css/bootstrap.min.css\" id=\"bootstrap-css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"muips.css\">         \n");
      out.write("        <link rel=\"stylesheet\" href=\"resources/css/mdb.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"resources/css/mdb.lite.min.css\"\n");
      out.write("        <script type=\"text/javascript\" src=\"resources/js/jquery-3.3.1.min.js\"></script>\n");
      out.write("        <!-- Bootstrap tooltips -->\n");
      out.write("        <script type=\"text/javascript\" src=\"resources/js/popper.min.js\"></script>\n");
      out.write("        <!-- Bootstrap core JavaScript -->\n");
      out.write("        <script type=\"text/javascript\" src=\"resources/js/bootstrap.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body  class=\"body1\">\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "UserHeader.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("title", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("Dash", request.getCharacterEncoding()), out, false);
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"container container1 border border-light p-5\" style=\"width: 55%;height: 720px;margin-top: 75px\">\n");
      out.write("            <!-- Default form register -->\n");
      out.write("            <form  action=\"ReportCase\" method=\"post\">\n");
      out.write("\n");
      out.write("                <p class=\"h4 mb-4 text-center\"><strong>Missing Person Information</strong></p>\n");
      out.write("                <hr>\n");
      out.write("                <!-- E-mail -->\n");
      out.write("                <label>Huduma Number:</label>\n");
      out.write("                <input type=\"text\" name=\"pid\" id=\"defaultRegisterFormEmail\" class=\"form-control mb-4\" required>\n");
      out.write("\n");
      out.write("                <label>Date of last contact:</label>\n");
      out.write("\n");
      out.write("                <input type=\"date\" name=\"lastContact\" id=\"defaultRegisterFormEmail\" class=\"form-control mb-4\" placeholder=\"Date of Last Contact\" required>\n");
      out.write("\n");
      out.write("                \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"form-row\" style=\"margin-top: 10px\">\n");
      out.write("\n");
      out.write("                    <div class=\"form-group col-md-6\">\n");
      out.write("\n");
      out.write("                        <select id=\"inputState\" class=\"form-control\" name=\"pcolor\">\n");
      out.write("                            <option selected disabled=\"true\">Color</option>\n");
      out.write("                            <option>Nilotic</option>\n");
      out.write("                            <option>Cushitic</option>\n");
      out.write("                            <option>European</option>\n");
      out.write("                            <option>Asian</option>\n");
      out.write("                            <option>Other</option>\n");
      out.write("\n");
      out.write("                        </select>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group col-md-6\">\n");
      out.write("\n");
      out.write("                        <select id=\"inputState\" class=\"form-control\" name=\"hcolor\">\n");
      out.write("                            <option selected disabled=\"true\"> Hair Color</option>\n");
      out.write("                            <option >Nilotic</option>\n");
      out.write("                            <option>Cushitic</option>\n");
      out.write("                            <option>European</option>\n");
      out.write("                            <option>Asian</option>\n");
      out.write("                            <option>Other</option>\n");
      out.write("\n");
      out.write("                        </select>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                 <div class=\"form-group\">\n");
      out.write("\n");
      out.write("                        <select id=\"inputState\" class=\"form-control\" name=\"ecolor\">\n");
      out.write("                            <option selected disabled=\"true\"> Eye Color</option>\n");
      out.write("                            <option>Nilotic</option>\n");
      out.write("                            <option>Cushitic</option>\n");
      out.write("                            <option>European</option>\n");
      out.write("                            <option>Asian</option>\n");
      out.write("                            <option>Other</option>\n");
      out.write("\n");
      out.write("                        </select>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                <div class=\"form-group \">\n");
      out.write("\n");
      out.write("                    <textarea type=\"text\" class=\"form-control \" name=\"pdesc\" id=\"exampleFormControlTextarea6\" rows=\"5\" placeholder=\"Physical description...\" required=\"\"></textarea>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <hr style=\"margin-top: 30px\">\n");
      out.write("                <input type=\"text\" hidden=\"true\" name=\"action\" value=\"info\">\n");
      out.write("                <div class=\"form-row\">\n");
      out.write("                <a href=\"Demographics.jsp\" class=\" btn btn-grey form-inline\"  >Back</a>\n");
      out.write("                \n");
      out.write("                <div class=\"col text-right\">\n");
      out.write("                <button class=\" btn btn-blue form-inline text-right\" type=\"submit\" >Next</button>\n");
      out.write("                </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            </form>\n");
      out.write("        </div>    \n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
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

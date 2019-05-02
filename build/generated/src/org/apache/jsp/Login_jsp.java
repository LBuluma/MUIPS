package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Login</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"resources/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"resources/css/mdb.lite.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"resources/css/mdb.min.css\">\n");
      out.write("        <link href=\"mycss.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("        <script type=\"text/javascript\" src=\"../resources/js/jquery-3.3.1.min.js\"></script>\n");
      out.write("        <!-- Bootstrap tooltips -->\n");
      out.write("        <script type=\"text/javascript\" src=\"resources/js/popper.min.js\"></script>\n");
      out.write("        <!-- Bootstrap core JavaScript -->\n");
      out.write("        <script type=\"text/javascript\" src=\"resources/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form action=\"Login\" method=\"post\"  >\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"modal fade\" id=\"modalLoginForm\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\"\n");
      out.write("             aria-hidden=\"true\">\n");
      out.write("            <div class=\"modal-dialog\" role=\"document\">\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                    <div class=\"modal-header text-center\">\n");
      out.write("                        <h4 class=\"modal-title w-100 font-weight-bold\">Login</h4>\n");
      out.write("                        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("                            <span aria-hidden=\"true\">&times;</span>\n");
      out.write("                        </button>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-body mx-3\">\n");
      out.write("                        <div class=\"md-form mb-5\">\n");
      out.write("                            <i class=\"fas fa-user prefix grey-text\"></i>\n");
      out.write("                            <input type=\"text\"  name=\"email\" id=\"orangeForm-id\" class=\"form-control\" required placeholder=\"Email\">\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"md-form mb-5\">\n");
      out.write("                            <i class=\"fas fa-user prefix grey-text\"></i>\n");
      out.write("                            <input type=\"password\"  name=\"password\" id=\"orangeForm-fname\" class=\"form-control\" required placeholder=\"Password\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-footer d-flex justify-content-center\">\n");
      out.write("                        <button class=\"btn btn-blue-grey\" type=\"submit\">Login</button>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </form>\n");
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

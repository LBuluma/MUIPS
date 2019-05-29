package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Log_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <!-- Required meta tags-->\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    \n");
      out.write("\n");
      out.write("    <!-- Title Page-->\n");
      out.write("    <title>Login</title>\n");
      out.write("\n");
      out.write("        <!-- Bootstrap CSS-->\n");
      out.write("    <link href=\"resources/css/bootstrap.min.css\" rel=\"stylesheet\" media=\"all\">\n");
      out.write("\n");
      out.write("  \n");
      out.write("\n");
      out.write("    <!-- Main CSS-->\n");
      out.write("    <link href=\"resources/css/theme.css\" rel=\"stylesheet\" media=\"all\">\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body class=\"animsition\">\n");
      out.write("    <div class=\"page-wrapper \" >\n");
      out.write("        <div class=\"page-content--bge5\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"login-wrap\">\n");
      out.write("                    <div class=\"login-content \" style=\"width: 500px; height: 500px;\">\n");
      out.write("                                   \n");
      out.write("                                     <label class=\"text-center\" style=\"font-size: 22px; margin-top: 30px\">MUIPS LOGIN</label>             \n");
      out.write("                               \n");
      out.write("\n");
      out.write("                         \n");
      out.write("                        \n");
      out.write("                        <div class=\"login-form\" style=\"margin-top: 10px\">\n");
      out.write("                            <form action=\"\" method=\"post\" >\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label>Email Address</label>\n");
      out.write("                                    <input class=\"au-input au-input--full\" type=\"email\" name=\"email\" placeholder=\"Email\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label>Password</label>\n");
      out.write("                                    <input class=\"au-input au-input--full\" type=\"password\" name=\"password\" placeholder=\"Password\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"login-checkbox\">\n");
      out.write("                                  \n");
      out.write("                                  \n");
      out.write("                                </div>\n");
      out.write("                                <button class=\"au-btn au-btn--block btn-primary \" type=\"submit\">sign in</button>\n");
      out.write("                                \n");
      out.write("                            </form>\n");
      out.write("                            <div class=\"register-link\">\n");
      out.write("                                <p>\n");
      out.write("                                    Don't you have account?\n");
      out.write("                                    <a href=\"#\">Sign Up Here</a>\n");
      out.write("                                </p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    \n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
      out.write("<!-- end document-->");
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

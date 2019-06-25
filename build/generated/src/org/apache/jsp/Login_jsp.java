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
      out.write("    <head>\n");
      out.write("        <!-- Required meta tags-->\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Title Page-->\n");
      out.write("        <title>Login</title>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <link href=\"resources/css/bootstrap.min.css\" rel=\"stylesheet\" >\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body class=\"bg-gradient-primary\">\n");
      out.write("\n");
      out.write("        <div class=\"container border border p-5\" style=\"width: 600px; border-radius: 1em; margin-top: 100px;height: 475px; background-color: white\">\n");
      out.write("            <div class=\"container\" style=\"width: 500px;height: 450px; margin-top: 20px; \">\n");
      out.write("                <label class=\" h4 mb-4 \" style=\"margin-left: 145px; font-size: 20px\" >MUIPS Login</label>\n");
      out.write("                <form action=\"Login\" method=\"post\">\n");
      out.write("                <label>Email:</label>\n");
      out.write("                <input type=\"email\" name=\"email\" class=\"form-control mb-1\" id=\"inputSname\" required>\n");
      out.write("                <label>Password:</label>\n");
      out.write("                <input type=\"password\" name=\"password\" class=\"form-control mb-4 \" id=\"inputSname\" required >\n");
      out.write("                <input type=\"submit\" value=\"sign in\" class=\"btn btn-primary  form-control mb-2\">\n");
      out.write("                <p>\n");
      out.write("                    Don't you have account?\n");
      out.write("                    <a href=\"Registerhome.jsp\">Sign Up Here</a>\n");
      out.write("                </p>\n");
      out.write("            </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </body>\n");
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

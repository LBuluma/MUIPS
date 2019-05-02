package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AddNewUser_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"resources/css/bootstrap.min.css\">\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"resources/css/mdb.min.css\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Add new user</title>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    \n");
      out.write("    <main style=\"height: 900px\">\n");
      out.write("        <form action=\"AddUser\" method=\"post\"  >\n");
      out.write("\n");
      out.write("            <div class=\"container text-center border border-light p-5\" style=\"width: 700px;height: 800px;margin-top: 30px;\">\n");
      out.write("                <div class=\"alert alert-warning alert-dismissible fade show\" role=\"alert\">\n");
      out.write("                     <p class=\"text-danger\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.usrerr}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                     <p class=\"text-success\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.usrsuccess}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                    <button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-label=\"Close\">\n");
      out.write("                        <span aria-hidden=\"true\">&times;</span>\n");
      out.write("                    </button>\n");
      out.write("                </div>\n");
      out.write("               \n");
      out.write("                <p class=\"h4 mb-4\"><strong>User Details </strong></p>\n");
      out.write("                <hr>\n");
      out.write("                <!-- ID-->\n");
      out.write("                <div class=\"form-row mb-4\">\n");
      out.write("                    <label>ID:</label>\n");
      out.write("                    <i class=\"fas fa-user prefix grey-text\"></i>\n");
      out.write("                    <input type=\"text\" name=\"id\" id=\"orangeForm-id\" class=\"form-control validate\" required placeholder=\"Employee ID\">\n");
      out.write("                </div>\n");
      out.write("                <!-- first Name -->\n");
      out.write("                <div class=\"form-row mb-4\">\n");
      out.write("\n");
      out.write("                    <label>First Name:</label>\n");
      out.write("                    <i class=\"fas fa-user prefix grey-text\"></i>\n");
      out.write("                    <input type=\"text\" name=\"fname\" id=\"orangeForm-fname\" class=\"form-control validate\" required placeholder=\"First Name\">\n");
      out.write("                </div>\n");
      out.write("                <!-- second Name -->\n");
      out.write("                <div class=\"form-row mb-4\">\n");
      out.write("\n");
      out.write("                    <label>Second Name:</label>\n");
      out.write("                    <i class=\"fas fa-user prefix grey-text\"></i>\n");
      out.write("                    <input type=\"text\" name=\"sname\" id=\"orangeForm-sname\" class=\"form-control validate\" required placeholder=\"Second Name\">\n");
      out.write("                </div>\n");
      out.write("                <!-- E-mail -->\n");
      out.write("                <div class=\"form-row mb-4\">\n");
      out.write("                    <label>Email:</label>\n");
      out.write("                    <i class=\"fas fa-user prefix grey-text\"></i>\n");
      out.write("                    <input type=\"email\" name=\"email\" id=\"orangeForm-sname\" class=\"form-control validate\" required placeholder=\"Email\">\n");
      out.write("                </div>\n");
      out.write("                <!-- phone number -->\n");
      out.write("                <div class=\"form-row mb-4\">\n");
      out.write("                    <i class=\"fas fa-user prefix grey-text\"></i>\n");
      out.write("                    <label>Phone:</label>\n");
      out.write("                    <input type=\"text\" name=\"phone\" id=\"orangeForm-sname\" class=\"form-control validate\" required placeholder=\"Phone Number\">\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <hr>\n");
      out.write("                <div class=\"modal-footer d-flex justify-content-center\" style=\"position: relative; top: 20px\">\n");
      out.write("                    <button class=\"btn btn-blue\" type=\"submit\" >Add</button>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("    </main>  \n");
      out.write("\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("\n");
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

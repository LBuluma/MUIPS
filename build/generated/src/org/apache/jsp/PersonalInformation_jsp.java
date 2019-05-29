package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class PersonalInformation_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Registration</title>\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"resources/css/bootstrap.min.css\" id=\"bootstrap-css\">\n");
      out.write("        <link href=\"mycss.css\" rel=\"stylesheet\" >\n");
      out.write("        <link href=\"muips.css\" rel=\"stylesheet\" >\n");
      out.write("        <link rel=\"stylesheet\" href=\"resources/css/mdb.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"resources/css/mdb.lite.min.css\">\n");
      out.write("        <script type=\"text/javascript\" src=\"resources/js/jquery-3.3.1.min.js\"></script>\n");
      out.write("    \n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("              $(document).ready(function(){\n");
      out.write("                  $(\"#defaultRegisterFormPassword\").blur(funtion(){\n");
      out.write("                      var pass = $(\"#defaultRegisterFormPassword1\").val();\n");
      out.write("                      var cpass = $(\"#defaultRegisterFormPassword\").val();\n");
      out.write("                      if(cpass !== pass){\n");
      out.write("                          $(\"#passOut\").text(\"Confirm password should match password\");\n");
      out.write("                      }\n");
      out.write("                  });\n");
      out.write("                  \n");
      out.write("              });\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body   class=\"body1\" style=\"height: 800px\">\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!--Navbar-->\n");
      out.write("        <nav class=\"navbar navbar-expand-lg text-dark fixed-top scrolling-navbar\" style=\"background-color: white; \" >\n");
      out.write("            <div class=\"container\" >\n");
      out.write("                <a class=\"navbar-brand\" style=\"position: fixed; left:  0px\" href=\"#\"><strong>MUIPS</strong></a>\n");
      out.write("                <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent-7\" aria-controls=\"navbarSupportedContent-7\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                    <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                </button>\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent-7\">\n");
      out.write("                    <ul class=\"navbar-nav mr-auto\" >\n");
      out.write("                        <li class=\"nav-item active\">\n");
      out.write("                            <a class=\"nav-link\" href=\"Home.jsp\">Home <span class=\"sr-only\">(current)</span></a>\n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link\" href=\"PersonalInformation.jsp\">Register</a>\n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a href=\"Login.jsp\" class=\"nav-link\" >Login</a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"container container1 p-5\" style=\"width: 60%;height: 700px; margin-top: 100px\">\n");
      out.write("            <!-- Default form register -->\n");
      out.write("            <form  action=\"RegisterUser\" method=\"post\">\n");
      out.write("\n");
      out.write("                <p class=\"h4 text-center  mb-4\"><strong>Personal Information</strong></p>\n");
      out.write("                <hr>\n");
      out.write("\n");
      out.write("                <div class=\"form-row mb-4\" style=\"margin-top: 30px\">\n");
      out.write("\n");
      out.write("                    <div class=\"col \">\n");
      out.write("                        <!-- First name -->\n");
      out.write("                        <label>First name:</label>\n");
      out.write("                        <input type=\"text\" name=\"fname\" style=\"padding:15px 20px;\" id=\"defaultRegisterFormFirstName\" class=\"form-control\" required >\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col\">\n");
      out.write("                        <!-- Last name -->\n");
      out.write("                        <label>Last name:</label>\n");
      out.write("                        <input type=\"text\" name=\"sname\" id=\"defaultRegisterFormLastName\" class=\"form-control\"  required>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- E-mail -->\n");
      out.write("                <label>Huduma number:</label>\n");
      out.write("                <input type=\"text\" name=\"id\" id=\"defaultRegisterFormEmail\" class=\"form-control mb-4\" required>\n");
      out.write("                <!-- Password -->\n");
      out.write("                <label>Password</label>\n");
      out.write("                <input type=\"password\" name=\"password\" id=\"defaultRegisterFormPassword1\" class=\"form-control mb-4\" aria-describedby=\"defaultRegisterFormPasswordHelpBlock\" required>\n");
      out.write("                <small id=\"defaultRegisterFormPasswordHelpBlock\" class=\"form-text text-muted mb-4\"  pattern=\"(?=.*\\d)(?=.*[a-z]).{8,}\" style=\"color: blue\">\n");
      out.write("                    <strong> At least 8 characters and 1 digit</strong>\n");
      out.write("                </small>\n");
      out.write("                <label>Confirm Password:</label>\n");
      out.write("                <input type=\"password\"  name=\"cpassword\" id=\"defaultRegisterFormPassword\" class=\"form-control mb-4\"  aria-describedby=\"defaultRegisterFormPasswordHelpBlock\" required>\n");
      out.write("                <p id=\"passOut\"></p>\n");
      out.write("                <hr style=\"margin-top: 40px\">\n");
      out.write("                <!-- Sign up button -->\n");
      out.write("                <div class=\"form-row text-right\">\n");
      out.write("                    <button class=\" btn btn-info \" type=\"submit\">Next</button>\n");
      out.write("                    <input type=\"text\" hidden=\"true\" name=\"regtype\" value=\"personal\" >\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("        <!-- Bootstrap tooltips -->\n");
      out.write("        <script type=\"text/javascript\" src=\"resources/js/popper.min.js\"></script>\n");
      out.write("        <!-- Bootstrap core JavaScript -->\n");
      out.write("        <script type=\"text/javascript\" src=\"resources/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("\n");
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

package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ContactInformation_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"resources/css/mdb.min.css\">\n");
      out.write("        <link  rel=\"stylesheet\"  href=\"muips.css\" >\n");
      out.write("        <script type=\"text/javascript\" src=\"resources/js/jquery-3.3.1.min.js\"></script>\n");
      out.write("        <!-- Bootstrap tooltips -->\n");
      out.write("        <script type=\"text/javascript\" src=\"resources/js/popper.min.js\"></script>\n");
      out.write("        <!-- Bootstrap core JavaScript -->\n");
      out.write("        <script type=\"text/javascript\" src=\"resources/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\" src=\"resources/myjs.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body class=\"body1\">\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Login.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("title", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("Dash", request.getCharacterEncoding()), out, false);
      out.write("\n");
      out.write("        <!--Navbar-->\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-dark fixed-top scrolling-navbar blue-gradient-rgba \" >\n");
      out.write("            <div class=\"container\" >\n");
      out.write("                <a class=\"navbar-brand\" style=\"position: fixed; left:  0\" href=\"#\"><strong>MUIPS</strong></a>\n");
      out.write("                <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent-7\" aria-controls=\"navbarSupportedContent-7\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                    <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                </button>\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent-7\">\n");
      out.write("                    <ul class=\"navbar-nav mr-auto\" style=\" position: relative; left:  1000px\">\n");
      out.write("                        <li class=\"nav-item active\"   >\n");
      out.write("                            <a class=\"nav-link\" href=\"Home.jsp\">Home <span class=\"sr-only\">(current)</span></a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link\" href=\"#\">About MUIPS</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link\" href=\"PersonalInformation.jsp\">Register</a>\n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("                        <li class=\"nav-item\"  >\n");
      out.write("                            <a href=\"\" class=\"nav-link\" data-toggle=\"modal\" data-target=\"#modalLoginForm\" >Login</a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        <div class=\"container container1 border border-dark p-5\" style=\"width: 50%;height: 600px; margin-top: 75px\">\n");
      out.write("            <!-- Default form register -->\n");
      out.write("            <form class=\"text-center\" action=\"RegisterUser\" method=\"post\">\n");
      out.write("\n");
      out.write("                <p class=\"h4 mb-4\"><strong>Contact Information</strong></p>\n");
      out.write("                <hr>\n");
      out.write("                <!-- E-mail -->\n");
      out.write("                <input type=\"email\" name=\"email\" id=\"defaultRegisterFormEmail\" class=\"form-control mb-4\" placeholder=\"E-mail\" required>\n");
      out.write("\n");
      out.write("                <!-- Phone number -->\n");
      out.write("                <input type=\"text\"   name=\"phone\" id=\"defaultRegisterPhonePassword\" class=\"form-control mb-4\" placeholder=\"Phone number\" aria-describedby=\"defaultRegisterFormPhoneHelpBlock\" style=\"margin-bottom:  20px\" required>\n");
      out.write("\n");
      out.write("                <!-- Address -->\n");
      out.write("                <input type=\"text\" name=\"address\" id=\"defaultRegisterFormEmail\" class=\"form-control mb-4\" placeholder=\"Address\" required>\n");
      out.write("\n");
      out.write("                <div class=\"form-row mb-4\">\n");
      out.write("\n");
      out.write("                    <div class=\"col\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <select id=\"inputCounty\" class=\"form-control\">\n");
      out.write("                            <option selected disabled> County</option>\n");
      out.write("                            <option>Nakuru</option>                           \n");
      out.write("                        </select>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col\">\n");
      out.write("                        <select id=\"inputCon\" class=\"form-control\">\n");
      out.write("                            <option selected disabled>Constituency</option>\n");
      out.write("                            <option>Nakuru Town West</option>\n");
      out.write("                            <option>Subukia</option>\n");
      out.write("                            <option>Nakuru Town</option>\n");
      out.write("                            <option>Nakuru Town East</option>\n");
      out.write("                            <option>Kuresoi North</option>\n");
      out.write("                            <option>Kuresoi South</option>\n");
      out.write("                            <option>Rongai</option>\n");
      out.write("                            <option>Molo</option>\n");
      out.write("                        </select>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-row mb-4\">\n");
      out.write("\n");
      out.write("                    <div class=\"col\">\n");
      out.write("                        <!-- First name -->\n");
      out.write("                        <input type=\"text\" name=\"ward\" style=\"padding:15px 20px;\" id=\"defaultRegisterFormFirstName\" class=\"form-control\" placeholder=\"Ward \"required >\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col\">\n");
      out.write("                        <!-- Last name -->\n");
      out.write("                        <input type=\"text\" name=\"village\" id=\"defaultRegisterFormLastName\" class=\"form-control\" placeholder=\"village\" required>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <hr>\n");
      out.write("                <div class=\"form-row form-inline\">\n");
      out.write("                    <input type=\"text\" hidden=\"true\" name=\"regtype\" value=\"contact\">\n");
      out.write("                    <a href=\"PersonalInformation.jsp\" class=\" btn btn-grey form-inline\" >Back</a>\n");
      out.write("                    \n");
      out.write("                    <button class=\" btn btn-blue form-inline\" type=\"submit\"  style=\" \">Finish</button>\n");
      out.write("                  \n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            </form>\n");
      out.write("        </div>   \n");
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

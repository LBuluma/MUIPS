package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class PublicContactInfomation_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link  rel=\"stylesheet\"  href=\"resources/muips.css\" >\n");
      out.write("        <script type=\"text/javascript\" src=\"resources/vendor/jquery/jquery.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            $(document).ready(function () {\n");
      out.write("               $(\"#inputCounty\").change(function(){\n");
      out.write("                   var formData = {\n");
      out.write("                       'county' : $('#inputCounty').val()\n");
      out.write("                   };\n");
      out.write("                   $.ajax({\n");
      out.write("                       type:\"POST\",\n");
      out.write("                       url:\"RetriveConstituency\",\n");
      out.write("                       data: formData,\n");
      out.write("                       dataType:'json',\n");
      out.write("                       encode: true\n");
      out.write("                       \n");
      out.write("                   })\n");
      out.write("                           .done(function(data){\n");
      out.write("                              $(output).text(data);\n");
      out.write("                   });\n");
      out.write("               });\n");
      out.write("                \n");
      out.write("\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("       \n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body >\n");
      out.write("\n");
      out.write("        <!--Navbar-->\n");
      out.write("        <nav class=\"navbar navbar-expand-lg  fixed-top scrolling-navbar \" style=\"background-color: #f0f0f0\" >\n");
      out.write("            <div class=\"container\" style=\"color: black\" >\n");
      out.write("                <a class=\"navbar-brand\" style=\"position: fixed; left:  10px\" href=\"#\"><strong>MUIPS</strong></a>\n");
      out.write("                <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent-7\" aria-controls=\"navbarSupportedContent-7\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                    <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                </button>\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent-7\">\n");
      out.write("                    <ul class=\"navbar-nav mr-auto\" style=\" position: relative; left:  100%\">\n");
      out.write("                        <li class=\"nav-item active\"   >\n");
      out.write("                            <a class=\"nav-link\" href=\"Home.jsp\">Home <span class=\"sr-only\">(current)</span></a>\n");
      out.write("                        </li>\n");
      out.write("                        \n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link\" href=\"Login.jsp\">Login</a>\n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        <div class=\"card  p-5\" style=\"margin-top: 100px; width: 55%; height: 650px\">\n");
      out.write("            <!-- Default form register -->\n");
      out.write("            <form  action=\"RegisterUser\" method=\"post\">\n");
      out.write("\n");
      out.write("                <p class=\"h4 mb-1 text-center\"><strong>Contact Information</strong></p>\n");
      out.write("                <hr>\n");
      out.write("                <!-- E-mail -->\n");
      out.write("                <label>Email:</label>\n");
      out.write("                <input type=\"email\" name=\"email\" id=\"defaultRegisterFormEmail\" class=\"form-control mb-1\" required>\n");
      out.write("                <div  class=\"text-danger\" id=\"output\" ></div>\n");
      out.write("                <!-- Phone number -->\n");
      out.write("                <label>Phone number:</label>\n");
      out.write("                <input type=\"text\"   name=\"phone\" id=\"defaultRegisterPhonePassword\" class=\"form-control mb-1\"  aria-describedby=\"defaultRegisterFormPhoneHelpBlock\" style=\"margin-bottom:  20px\" required>\n");
      out.write("\n");
      out.write("                <!-- Address -->\n");
      out.write("                <label>Address:</label>\n");
      out.write("                <input type=\"text\" name=\"address\" id=\"defaultRegisterFormEmail\" class=\"form-control mb-1\" required>\n");
      out.write("\n");
      out.write("                <div class=\"form-row mb-1\">\n");
      out.write("\n");
      out.write("                    <div class=\"col\">\n");
      out.write("\n");
      out.write("                        <label>County:</label>\n");
      out.write("                        <select id=\"inputCounty\" class=\"form-control\" name=\"county\">\n");
      out.write("\n");
      out.write("                            <option selected>Nakuru</option>  \n");
      out.write("                            <option>Uasin Gishu</option>\n");
      out.write("                        </select>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col\">\n");
      out.write("                          <label>Constituency:</label>\n");
      out.write("                          <select id=\"inputCon\" class=\"form-control\"  name=\"constituency\">\n");
      out.write("                          \n");
      out.write("                            <option>Nakuru Town West</option>\n");
      out.write("                            <option selected>Subukia</option>\n");
      out.write("                            <option>Nakuru Town</option>\n");
      out.write("                            <option>Nakuru Town East</option>\n");
      out.write("                            <option>Kuresoi North</option>\n");
      out.write("                            <option>Kuresoi South</option>\n");
      out.write("                            <option>Rongai</option>\n");
      out.write("                            <option>Molo</option>\n");
      out.write("                        </select>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-row mb-1\">\n");
      out.write("\n");
      out.write("                    <div class=\"col\">\n");
      out.write("                        <!-- First name -->\n");
      out.write("                            <label>Ward:</label>\n");
      out.write("                        <input type=\"text\" name=\"ward\" style=\"padding:15px 20px;\" id=\"defaultRegisterFormFirstName\" class=\"form-control\" required >\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col\">\n");
      out.write("                        <!-- Last name -->\n");
      out.write("                         <label>Village:</label>\n");
      out.write("                        <input type=\"text\" name=\"village\" id=\"defaultRegisterFormLastName\" class=\"form-control\" required>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <hr>\n");
      out.write("                <div class=\"form-row \">\n");
      out.write("                    <input type=\"text\" hidden=\"true\" name=\"regtype\" value=\"contact\">\n");
      out.write("                    <a href=\"PersonalInformation.jsp\" class=\" btn btn-info\" >Back</a>\n");
      out.write("                    <div class=\" col text-right\"> \n");
      out.write("                        <button class=\" btn btn-primary \" type=\"submit\"  style=\" \">Finish</button>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            </form>\n");
      out.write("            <div id=\"output\">\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("        </div>   \n");
      out.write("       \n");
      out.write("        \n");
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

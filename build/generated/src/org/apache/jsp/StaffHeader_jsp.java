package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class StaffHeader_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"resources/css/bootstrap.min.css\" id=\"bootstrap-css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"resources/mycss.css\" id=\"bootstrap-css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"resources/css/mdb.min.css\">\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\" src=\"resources/js/jquery-3.3.1.min.js\"></script>\n");
      out.write("        <!-- Bootstrap tooltips -->\n");
      out.write("        <script type=\"text/javascript\" src=\"resources/js/popper.min.js\"></script>\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\" src=\"resources/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\" src=\"resources/myjs.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div id=\"mySidenav\" class=\"sidenav sidebar1 \"   >\n");
      out.write("            \n");
      out.write("            <a href=\"javascript:void(0)\" class=\"closebtn\" onclick=\"closeNav()\">&times;</a>\n");
      out.write("            \n");
      out.write("            <img src=\"images/image (4).png\" width=\"180px\" height=\"100px\" alt=\"Avatar\" style=\"position: relative;left: 30px\">\n");
      out.write("            <hr>\n");
      out.write("            \n");
      out.write("                     \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <ul class=\"nav navbar-nav side-nav\" style=\" margin-right: 50px\">\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"RetrieveProfile\"><i class=\"fa fa-fw fa-user-plus\"></i>  Profile</a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"#\" data-toggle=\"collapse\" data-target=\"#submenu-1\"><i class=\"fa fa-fw fa-search\"></i> Cases<i class=\"fa fa-fw fa-angle-down pull-right\"></i></a>\n");
      out.write("                    <ul id=\"submenu-1\" class=\"collapse\">\n");
      out.write("                        <li><a href=\"#\"><i class=\"fa fa-angle-double-right\"></i> Missing</a></li>\n");
      out.write("                        <li><a href=\"#\"><i class=\"fa fa-angle-double-right\"></i> Unclaimed</a></li>\n");
      out.write("                        <li><a href=\"#\"><i class=\"fa fa-angle-double-right\"></i> Unidentified</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("                 \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                <li>\n");
      out.write("                    <a href=\"UnidentifiedPersonDemographics.jsp\"><i class=\"fa fa-fw fa-paper-plane-o\"></i> Post</a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"faq\"><i class=\"fa fa-fw fa fa-question-circle\"></i> MENU 5</a>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <!-- /.navbar-collapse -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <!--/. Sidebar navigation -->\n");
      out.write("\n");
      out.write("\n");
      out.write("    <nav class=\"navbar navbar-expand-lg navbar-dark fixed-top scrolling-navbar\" style=\"background-color: grey\">\n");
      out.write("        <div class=\"float-left\">\n");
      out.write("                <span style=\"font-size:30px;cursor:pointer\" onclick=\"openNav()\" class=\"button-collapse\">&#9776;</span>\n");
      out.write("            </div>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            \n");
      out.write("            <a class=\"navbar-brand\" style=\"position: fixed; left:  50px\" href=\"#\"><strong>MUIPS</strong></a>\n");
      out.write("            <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent-7\" aria-controls=\"navbarSupportedContent-7\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("            </button>\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent-7\">\n");
      out.write("                <ul class=\"navbar-nav mr-auto\">\n");
      out.write("                 \n");
      out.write("                    <li class=\"nav-item\"  style=\"position: fixed; right:  0;top: 10px\">\n");
      out.write("                        <a href=\"Home.jsp\" class=\"nav-link\"  >Logout</a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </nav>\n");
      out.write("\n");
      out.write("\n");
      out.write("</nav>\n");
      out.write("</body>\n");
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

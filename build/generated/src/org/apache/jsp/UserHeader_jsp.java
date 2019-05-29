package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class UserHeader_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"resources/mycss.css\" id=\"bootstrap-css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css\" integrity=\"sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4\" crossorigin=\"anonymous\">\n");
      out.write("        <!-- Our Custom CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"Sidenav.css\">\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Font Awesome JS -->\n");
      out.write("        <script defer src=\"https://use.fontawesome.com/releases/v5.0.13/js/solid.js\" integrity=\"sha384-tzzSw1/Vo+0N5UhStP3bvwWPq+uvzCMfrN1fEFe+xBmv1C/AtVX5K0uZtmcHitFZ\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script defer src=\"https://use.fontawesome.com/releases/v5.0.13/js/fontawesome.js\" integrity=\"sha384-6OIrr52G08NpOFSZdxxz1xdNSndlD4vdcf/q2myIUVO0VsqaGHJsB0RaBE01VTOY\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div class=\"wrapper\">\n");
      out.write("            <!-- Sidebar  -->\n");
      out.write("            <nav id=\"sidebar\">\n");
      out.write("                <div class=\"sidebar-header\">\n");
      out.write("                    <h3>Bootstrap Sidebar</h3>\n");
      out.write("                    <strong>BS</strong>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <ul class=\"list-unstyled components\">\n");
      out.write("                    <li class=\"active\">\n");
      out.write("                        <a href=\"#homeSubmenu\" data-toggle=\"collapse\" aria-expanded=\"false\" class=\"dropdown-toggle\">\n");
      out.write("                            <i class=\"fas fa-home\"></i>\n");
      out.write("                            Home\n");
      out.write("                        </a>\n");
      out.write("                        <ul class=\"collapse list-unstyled\" id=\"homeSubmenu\">\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\">Home 1</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\">Home 2</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\">Home 3</a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"#\">\n");
      out.write("                            <i class=\"fas fa-briefcase\"></i>\n");
      out.write("                            About\n");
      out.write("                        </a>\n");
      out.write("                        <a href=\"#pageSubmenu\" data-toggle=\"collapse\" aria-expanded=\"false\" class=\"dropdown-toggle\">\n");
      out.write("                            <i class=\"fas fa-copy\"></i>\n");
      out.write("                            Pages\n");
      out.write("                        </a>\n");
      out.write("                        <ul class=\"collapse list-unstyled\" id=\"pageSubmenu\">\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\">Page 1</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\">Page 2</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\">Page 3</a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("\n");
      out.write("            </nav>\n");
      out.write("\n");
      out.write("            <!-- Page Content  -->\n");
      out.write("            <div id=\"content\">\n");
      out.write("\n");
      out.write("                <nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\n");
      out.write("                    <div class=\"container-fluid\">\n");
      out.write("\n");
      out.write("                        <button type=\"button\" id=\"sidebarCollapse\" class=\"btn btn-info\">\n");
      out.write("                            <i class=\"fas fa-align-left\"></i>\n");
      out.write("                            <span>Toggle Sidebar</span>\n");
      out.write("                        </button>\n");
      out.write("                    </div>\n");
      out.write("                </nav>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <!--/. Sidebar navigation -->\n");
      out.write("\n");
      out.write("\n");
      out.write("    <nav class=\"navbar navbar-expand-lg navbar-dark fixed-top scrolling-navbar\" style=\"background-color: grey\">\n");
      out.write("        <div class=\"float-left\">\n");
      out.write("            <span style=\"font-size:30px;cursor:pointer\" onclick=\"openNav()\" class=\"button-collapse\">&#9776;</span>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"container\">\n");
      out.write("\n");
      out.write("            <a class=\"navbar-brand\" style=\"position: fixed; left:  50px\" href=\"#\"><strong>MUIPS</strong></a>\n");
      out.write("            <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent-7\" aria-controls=\"navbarSupportedContent-7\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("            </button>\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent-7\">\n");
      out.write("                <ul class=\"navbar-nav mr-auto\">\n");
      out.write("\n");
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
      out.write("\n");
      out.write("<!-- jQuery CDN - Slim version (=without AJAX) -->\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("<!-- Popper.JS -->\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js\" integrity=\"sha384-cs/chFZiN24E4KMATLdqdvsezGxaGsi4hLGOzlXwp5UZB1LY//20VyM2taTB4QvJ\" crossorigin=\"anonymous\"></script>\n");
      out.write("<!-- Bootstrap JS -->\n");
      out.write("<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js\" integrity=\"sha384-uefMccjFJAIv6A+rW+L4AHf99KvxDjWSu1z9VI8SKNVmz4sk7buKt/6v9KI65qnm\" crossorigin=\"anonymous\"></script>\n");
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

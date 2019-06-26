package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AdminDashBoard_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Admin </title>\n");
      out.write("        <link href=\"resources/vendor/fontawesome-free/css/all.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Custom styles for this template -->\n");
      out.write("        <link href=\"resources/css/sb-admin-2.min.css\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body id=\"page-top\">\n");
      out.write("\n");
      out.write("        <!-- Page Wrapper -->\n");
      out.write("        <div id=\"wrapper\">\n");
      out.write("\n");
      out.write("\n");
      out.write("            <!-- End of Sidebar -->\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "AdminSidenav.jsp", out, false);
      out.write("\n");
      out.write("            <!-- Content Wrapper -->\n");
      out.write("            <div id=\"content-wrapper\" class=\"d-flex flex-column\">\n");
      out.write("\n");
      out.write("                <!-- Main Content -->\n");
      out.write("                <div id=\"content\">\n");
      out.write("                    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Navbar.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <!-- End of Topbar -->\n");
      out.write("                    <div class=\"container-fluid\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <!-- Content Row -->\n");
      out.write("                        <div class=\"row\">\n");
      out.write("\n");
      out.write("                            <!-- Earnings (Monthly) Card Example -->\n");
      out.write("                            <div class=\"col-xl-3 col-md-6 mb-4\">\n");
      out.write("                                <div class=\"card border-left-primary shadow h-100 py-2\">\n");
      out.write("                                    <div class=\"card-body\">\n");
      out.write("                                        <div class=\"row no-gutters align-items-center\">\n");
      out.write("                                            <div class=\"col mr-2\">\n");
      out.write("                                                <div class=\"font-weight-bold text-primary text-uppercase mb-1\"><a href=\"RetrieveUsers?action=all\"> View users</a></div>\n");
      out.write("                                                <p class=\" text-gray-800\"> View users existing in the system\n");
      out.write("                                                    using by clicking on the link above.</p>\n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <!-- Earnings (Monthly) Card Example -->\n");
      out.write("                            <div class=\"col-xl-3 col-md-6 mb-4\">\n");
      out.write("                                <div class=\"card border-left-success shadow h-100 py-2\">\n");
      out.write("                                    <div class=\"card-body\">\n");
      out.write("                                        <div class=\"row no-gutters align-items-center\">\n");
      out.write("                                            <div class=\"col mr-2\">\n");
      out.write("                                                <div class=\" font-weight-bold text-success text-uppercase mb-1\"><a href=\"RetrieveUsers?action=approve\">Approve users</a></div>\n");
      out.write("                                                <p class=\" text-gray-800\"> Approve users by clicking the link above.</p>\n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-xl-3 col-md-6 mb-4\" style=\"height: 200px\">\n");
      out.write("                                <div class=\"card border-left-info shadow h-100 py-2\">\n");
      out.write("                                    <div class=\"card-body\">\n");
      out.write("                                        <div class=\"row no-gutters align-items-center\">\n");
      out.write("                                            <div class=\"col mr-2\">\n");
      out.write("                                                <div class=\" font-weight-bold text-info text-uppercase mb-1\"><a href=\"RetrieveStatistics?action=all\">Statistics</a></div>\n");
      out.write("                                                <p class=\" text-gray-800\"> View summary of the posts made to the system as a whole.</p>\n");
      out.write("                                                <div class=\"row no-gutters align-items-center\">\n");
      out.write("                                                    <div class=\"col-auto\">\n");
      out.write("\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <div class=\"col\">\n");
      out.write("\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                              <!-- Earnings (Monthly) Card Example -->\n");
      out.write("                            <div class=\"col-xl-3 col-md-6 mb-4\">\n");
      out.write("                                <div class=\"card border-left-primary shadow h-100 py-2\">\n");
      out.write("                                    <div class=\"card-body\">\n");
      out.write("                                        <div class=\"row no-gutters align-items-center\">\n");
      out.write("                                            <div class=\"col mr-2\">\n");
      out.write("                                                <div class=\"font-weight-bold text-primary text-uppercase mb-1\"><a href=\"RetrieveUsers?action=revoked\"> Revoked users</a></div>\n");
      out.write("                                                <p class=\" text-gray-800\"> View revoked users\n");
      out.write("                                                    using by clicking on the link above.</p>\n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                       \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <!-- /.container-fluid -->\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <a class=\"scroll-to-top rounded\" href=\"#page-top\">\n");
      out.write("            <i class=\"fas fa-angle-up\"></i>\n");
      out.write("        </a>\n");
      out.write("\n");
      out.write("        <!-- Logout Modal-->\n");
      out.write("        <div class=\"modal fade\" id=\"logoutModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\n");
      out.write("            <div class=\"modal-dialog\" role=\"document\">\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                    <div class=\"modal-header\">\n");
      out.write("                        <h5 class=\"modal-title\" id=\"exampleModalLabel\">Ready to Leave?</h5>\n");
      out.write("                        <button class=\"close\" type=\"button\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("                            <span aria-hidden=\"true\">×</span>\n");
      out.write("                        </button>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-body\">Select \"Logout\" below if you are ready to end your current session.</div>\n");
      out.write("                    <div class=\"modal-footer\">\n");
      out.write("                        <button class=\"btn btn-secondary\" type=\"button\" data-dismiss=\"modal\">Cancel</button>\n");
      out.write("                        <a class=\"btn btn-primary\" href=\"login.jsp\">Logout</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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

package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class PublicDashBoard_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("         <link href=\"resources/vendor/fontawesome-free/css/all.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Custom styles for this template -->\n");
      out.write("        <link href=\"resources/css/sb-admin-2.min.css\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <body id=\"page-top\">\n");
      out.write("\n");
      out.write("        <!-- Page Wrapper -->\n");
      out.write("        <div id=\"wrapper\">\n");
      out.write("\n");
      out.write("\n");
      out.write("            <!-- End of Sidebar -->\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Sidebar.jsp", out, false);
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
      out.write("                        <!-- Page Heading -->\n");
      out.write("                        <div class=\"d-sm-flex align-items-center justify-content-between mb-4\">\n");
      out.write("                            <h1 class=\"h3 mb-0 text-gray-800\">Dashboard</h1>\n");
      out.write("                            <a href=\"#\" class=\"d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm\"><i class=\"fas fa-download fa-sm text-white-50\"></i> Generate Report</a>\n");
      out.write("                        </div>\n");
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
      out.write("                                                <div class=\"text-xs font-weight-bold text-primary text-uppercase mb-1\">New post</div>\n");
      out.write("                                                <div class=\"h5 mb-0 font-weight-bold text-gray-800\"></div>\n");
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
      out.write("                                                <div class=\"text-xs font-weight-bold text-success text-uppercase mb-1\">missing persons post</div>\n");
      out.write("                                                <div class=\"h5 mb-0 font-weight-bold text-gray-800\"></div>\n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <!-- Earnings (Monthly) Card Example -->\n");
      out.write("                            <div class=\"col-xl-3 col-md-6 mb-4\">\n");
      out.write("                                <div class=\"card border-left-info shadow h-100 py-2\">\n");
      out.write("                                    <div class=\"card-body\">\n");
      out.write("                                        <div class=\"row no-gutters align-items-center\">\n");
      out.write("                                            <div class=\"col mr-2\">\n");
      out.write("                                                <div class=\"text-xs font-weight-bold text-info text-uppercase mb-1\">Statistics</div>\n");
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
      out.write("\n");
      out.write("                            <!-- Pending Requests Card Example -->\n");
      out.write("                            <div class=\"col-xl-3 col-md-6 mb-4\">\n");
      out.write("                                <div class=\"card border-left-warning shadow h-100 py-2\">\n");
      out.write("                                    <div class=\"card-body\">\n");
      out.write("                                        <div class=\"row no-gutters align-items-center\">\n");
      out.write("                                            <div class=\"col mr-2\">\n");
      out.write("                                                <div class=\"text-xs font-weight-bold text-warning text-uppercase mb-1\">uindentified persons posts</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <!-- Content Row -->\n");
      out.write("\n");
      out.write("                            <!-- Color System -->\n");
      out.write("                            <div class=\"row\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                                <div class=\"col-lg-6 mb-4\">\n");
      out.write("\n");
      out.write("                                    <!-- Illustrations -->\n");
      out.write("                                    <div class=\"card shadow mb-4\">\n");
      out.write("                                        <div class=\"card-header py-3\">\n");
      out.write("                                            <h6 class=\"m-0 font-weight-bold text-primary\">Illustrations</h6>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"card-body\">\n");
      out.write("                                            <div class=\"text-center\">\n");
      out.write("                                                <img class=\"img-fluid px-3 px-sm-4 mt-3 mb-4\" style=\"width: 25rem;\" src=\"img/undraw_posting_photo.svg\" alt=\"\">\n");
      out.write("                                            </div>\n");
      out.write("                                            <p>Add some quality, svg illustrations to your project courtesy of <a target=\"_blank\" rel=\"nofollow\" href=\"https://undraw.co/\">unDraw</a>, a constantly updated collection of beautiful svg images that you can use completely free and without attribution!</p>\n");
      out.write("                                            <a target=\"_blank\" rel=\"nofollow\" href=\"https://undraw.co/\">Browse Illustrations on unDraw &rarr;</a>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"col-lg-6 mb-4\">\n");
      out.write("                                    <!-- Approach -->\n");
      out.write("                                    <div class=\"card shadow mb-4\">\n");
      out.write("                                        <div class=\"card-header py-3\">\n");
      out.write("                                            <h6 class=\"m-0 font-weight-bold text-primary\">Development Approach</h6>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"card-body\">\n");
      out.write("                                            <p>SB Admin 2 makes extensive use of Bootstrap 4 utility classes in order to reduce CSS bloat and poor page performance. Custom CSS classes are used to create custom components and custom utility classes.</p>\n");
      out.write("                                            <p class=\"mb-0\">Before working with this theme, you should become familiar with the Bootstrap framework, especially the utility classes.</p>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <!-- /.container-fluid -->\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("                    <a class=\"scroll-to-top rounded\" href=\"#page-top\">\n");
      out.write("    <i class=\"fas fa-angle-up\"></i>\n");
      out.write("  </a>\n");
      out.write("\n");
      out.write("  <!-- Logout Modal-->\n");
      out.write("  <div class=\"modal fade\" id=\"logoutModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\n");
      out.write("    <div class=\"modal-dialog\" role=\"document\">\n");
      out.write("      <div class=\"modal-content\">\n");
      out.write("        <div class=\"modal-header\">\n");
      out.write("          <h5 class=\"modal-title\" id=\"exampleModalLabel\">Ready to Leave?</h5>\n");
      out.write("          <button class=\"close\" type=\"button\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("            <span aria-hidden=\"true\">×</span>\n");
      out.write("          </button>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"modal-body\">Select \"Logout\" below if you are ready to end your current session.</div>\n");
      out.write("        <div class=\"modal-footer\">\n");
      out.write("          <button class=\"btn btn-secondary\" type=\"button\" data-dismiss=\"modal\">Cancel</button>\n");
      out.write("          <a class=\"btn btn-primary\" href=\"login.html\">Logout</a>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
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

package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class PublicHelp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Prof Help</title>\n");
      out.write("        <link href=\"resources/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("    <body id=\"page-top\">\n");
      out.write("\n");
      out.write("        <!-- Page Wrapper -->\n");
      out.write("        <div id=\"wrapper\">\n");
      out.write("\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Sidebar.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div id=\"content-wrapper\" class=\"d-flex flex-column\">\n");
      out.write("\n");
      out.write("                <!-- Main Content -->\n");
      out.write("                <div id=\"content\">\n");
      out.write("                    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Navbar.jsp", out, false);
      out.write("\n");
      out.write("                    <div class=\"card shadow\" style=\"width: 80%; margin: auto \">\n");
      out.write("                        <div class=\"card-header py-3\" >\n");
      out.write("                                    <div class=\"accordion\" id=\"accordionExample\">\n");
      out.write("                                        <div class=\"card\">\n");
      out.write("                                            <div class=\"card-header\" id=\"headingOne\">\n");
      out.write("                                                <h2 class=\"mb-0\">\n");
      out.write("                                                    <button class=\"btn btn-link\" type=\"button\" data-toggle=\"collapse\" data-target=\"#collapseOne\" aria-expanded=\"true\" aria-controls=\"collapseOne\">\n");
      out.write("                                                      How to add a new case?\n");
      out.write("                                                    </button>\n");
      out.write("                                                </h2>\n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("                                            <div id=\"collapseOne\" class=\"collapse show\" aria-labelledby=\"headingOne\" data-parent=\"#accordionExample\">\n");
      out.write("                                                <div class=\"card-body\">\n");
      out.write("                                                    \n");
      out.write("                                                    <p>1. Click on \"New post\" in the side navigation </p>\n");
      out.write("                                                    <p>2. Fill in the unidentified person information and click next</p>\n");
      out.write("                                                    <p> 3. Fill the form for describing the unidentified person and click next</p>\n");
      out.write("                                                    <p> 4. Fill the location information </p>\n");
      out.write("                                                    <p>(make sure to check the distinct feature option if the person has any unique feature, e.g spectacles, tattoo)</p>\n");
      out.write("                                                    <p> 5. Optional if \"has distinct feature was selected\" . Fill  the feature description and upload photo.</p>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"card\">\n");
      out.write("                                            <div class=\"card-header\" id=\"headingTwo\">\n");
      out.write("                                                <h2 class=\"mb-0\">\n");
      out.write("                                                    <button class=\"btn btn-link collapsed\" type=\"button\" data-toggle=\"collapse\" data-target=\"#collapse2\" aria-expanded=\"false\" aria-controls=\"collapseTwo\">\n");
      out.write("                                                         How to view posts?\n");
      out.write("                                                        </button>\n");
      out.write("                                                </h2>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div id=\"collapse2\" class=\"collapse\" aria-labelledby=\"headingTwo\" data-parent=\"#accordionExample\">\n");
      out.write("                                                <div class=\"card-body\">\n");
      out.write("                                                    <p>1. Click on the \"Posts\" option to view station post and your posts</p>\n");
      out.write("                                                    <p>2. Click on the \"View posts\" option to missing or unidentified person posts </p>\n");
      out.write("                                                     \n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"card\">\n");
      out.write("                                            <div class=\"card-header\" id=\"headingThree\">\n");
      out.write("                                                <h2 class=\"mb-0\">\n");
      out.write("                                                    <button class=\"btn btn-link collapsed\" type=\"button\" data-toggle=\"collapse\" data-target=\"#collapseThree\" aria-expanded=\"false\" aria-controls=\"collapseThree\">\n");
      out.write("                                                        How to filter posts to a few posts?\n");
      out.write("                                                    </button>\n");
      out.write("                                                </h2>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div id=\"collapseThree\" class=\"collapse\" aria-labelledby=\"headingThree\" data-parent=\"#accordionExample\">\n");
      out.write("                                                <div class=\"card-body\">\n");
      out.write("                                                    <p>1. Click on the \"search\" link on the side navigation </p>\n");
      out.write("                                                    <p>2.Enter the description of the person you are searching for</p>\n");
      out.write("                                                    <p>3. Click the \"search\" button to view results</p>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                           <div class=\"card\">\n");
      out.write("                                            <div class=\"card-header\" id=\"headingThree\">\n");
      out.write("                                                <h2 class=\"mb-0\">\n");
      out.write("                                                    <button class=\"btn btn-link collapsed\" type=\"button\" data-toggle=\"collapse\" data-target=\"#collapseFour\" aria-expanded=\"false\" aria-controls=\"collapseThree\">\n");
      out.write("                                                        How to view statistics?\n");
      out.write("                                                    </button>\n");
      out.write("                                                </h2>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div id=\"collapseFour\" class=\"collapse\" aria-labelledby=\"headingThree\" data-parent=\"#accordionExample\">\n");
      out.write("                                                <div class=\"card-body\">\n");
      out.write("                                                    <p>1. Click on the \"Statistics\" option on the side navigation </p>\n");
      out.write("                                                    <p>2. Select the constituency</p>\n");
      out.write("                                                    <p>3. Select the date range that is desired </p>\n");
      out.write("                                                    <p>4. Click \"search\" or click \"generate report\" button</p>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            \n");
      out.write("        \n");
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

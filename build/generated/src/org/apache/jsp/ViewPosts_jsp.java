package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ViewPosts_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>View Cases</title>\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"resources/css/bootstrap.min.css\" id=\"bootstrap-css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"resources/css/mdb.min.css\" id=\"bootstrap-css\">\n");
      out.write("\n");
      out.write("        <link  rel=\"stylesheet\"  href=\"resources/Table.css\" >\n");
      out.write("        <script type=\"text/javascript\" src=\"resources/js/jquery-3.3.1.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"resources/js/popper.min.js\"></script>\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\" src=\"resources/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\" src=\"resources/mynewjs.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div class=\"col-3 \" style=\"margin-right: 100px\">\n");
      out.write("            <input type=\"text\" class=\"search form-control \" placeholder=\"Search\">\n");
      out.write("        </div>\n");
      out.write("        <span class=\"counter pull-right\"></span>\n");
      out.write("        <table class=\"table table-striped table-bordered table-sm  results\">\n");
      out.write("            <thead>\n");
      out.write("                <tr>\n");
      out.write("                    <th>#</th>\n");
      out.write("                    <th class=\"th-sm\">Name / Surname</th>\n");
      out.write("                    <th class=\"th-sm\">Job</th>\n");
      out.write("                    <th class=\"th-sm\">City</th>\n");
      out.write("                </tr>\n");
      out.write("                <tr class=\"warning no-result\">\n");
      out.write("                    <td colspan=\"4\"><i class=\"fa fa-warning\"></i> No result</td>\n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("                \n");
      out.write("                    <tr>\n");
      out.write("                        <th scope=\"row\"></th>\n");
      out.write("                        <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usrs['1']}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                        <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usrs['1']}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                        <td>22-19-2019</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <th scope=\"row\"></th>\n");
      out.write("                        <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usrs['2']}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                        <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usrs['2']}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                        <td>Istanbul</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <th scope=\"row\"></th>\n");
      out.write("                        <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usrs['3']}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                        <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usrs['3']}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                        <td>Istanbul</td>\n");
      out.write("                    </tr>\n");
      out.write("           \n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
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

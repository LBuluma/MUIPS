package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class LocationInfo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>More information</title>\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"resources/css/bootstrap.min.css\" id=\"bootstrap-css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"resources/muips.css\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Sidebar.jsp", out, false);
      out.write("\n");
      out.write("            <!-- Content Wrapper -->\n");
      out.write("            <div id=\"content-wrapper\" class=\"d-flex flex-column\" style=\"background-color: white\"> \n");
      out.write("\n");
      out.write("                <!-- Main Content -->\n");
      out.write("                <div id=\"content\">\n");
      out.write("                    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Navbar.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("                    <div class=\"card shadow\" style=\"width: 60%;;height: 650px  \">\n");
      out.write("                        <div class=\"card-header py-3\" >\n");
      out.write("                            <p class=\"h4 mb-1 text-center\"><strong>Last Known Location</strong></p>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <div class=\"container\" style=\"width: 80%; margin-top: 30px\">\n");
      out.write("                            <!-- Default form register -->\n");
      out.write("                            <form  action=\"ReportCase\" method=\"post\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                                <label>Police station of report:</label>\n");
      out.write("                                <div class=\"form-row mb-1\" >\n");
      out.write("                                    <select name=\"org\" class=\"form-control\" >\n");
      out.write("                                        ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                    </select>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"form-row mb-1\" >\n");
      out.write("\n");
      out.write("                                    <label>County:</label>\n");
      out.write("                                    <select id=\"inputType\" class=\"form-control\" name=\"county\" required=\"\">\n");
      out.write("\n");
      out.write("                                        <option>Nakuru</option>\n");
      out.write("\n");
      out.write("                                    </select>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <label>Constituency:</label>\n");
      out.write("                                <div class=\"form-row mb-1\" >\n");
      out.write("                                    <select id=\"inputCon\" class=\"form-control\" name=\"constituency\" required>\n");
      out.write("\n");
      out.write("                                        <option selected>Nakuru Town West</option>\n");
      out.write("                                        <option>Subukia</option>\n");
      out.write("                                        <option>Nakuru Town</option>\n");
      out.write("                                        <option>Nakuru Town East</option>\n");
      out.write("                                        <option>Kuresoi North</option>\n");
      out.write("                                        <option>Kuresoi South</option>\n");
      out.write("                                        <option>Rongai</option>\n");
      out.write("                                        <option>Molo</option>\n");
      out.write("                                    </select>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                <div class=\"form-row \">\n");
      out.write("                                    <label>Ward:</label>  \n");
      out.write("                                    <!-- First name -->\n");
      out.write("                                    <input type=\"text\" name=\"ward\" style=\"padding:15px 20px;\" id=\"defaultRegisterFormFirstName\" class=\"form-control\"required >\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"form-row \">\n");
      out.write("                                    <label>Village:</label>\n");
      out.write("                                    <!-- Last name -->\n");
      out.write("                                    <input type=\"text\" name=\"village\" id=\"defaultRegisterFormLastName\" class=\"form-control mb-1\"    required>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                <!-- Distinct Feature-->\n");
      out.write("                                <div class=\"custom-control custom-checkbox custom-control-inline mb-1\" style=\"margin-top: 20px;\">\n");
      out.write("                                    <input type=\"checkbox\" name=\"distinct\" value=\"dist\" class=\"custom-control-input\" id=\"defaultInline1\">\n");
      out.write("                                    <label class=\"custom-control-label\" for=\"defaultInline1\">Had distinct feature e.g tattoo</label>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <!-- Default inline 2-->\n");
      out.write("                                <div class=\"custom-control custom-checkbox custom-control-inline\">\n");
      out.write("                                    <input type=\"checkbox\" name=\"transp\" value=\"trans\" class=\"custom-control-input\" id=\"defaultInline2\">\n");
      out.write("                                    <label class=\"custom-control-label\" for=\"defaultInline2\">Had transportation e.g bike</label>\n");
      out.write("                                </div>\n");
      out.write("                                <hr>\n");
      out.write("\n");
      out.write("                                <input type=\"text\" hidden=\"true\" name=\"action\" value=\"location\">\n");
      out.write("                                <div class=\"form-row\">\n");
      out.write("\n");
      out.write("                                    <a href=\"MissingPersonInfo.jsp\" class=\" btn btn-info\"  >Back</a>\n");
      out.write("                                    <div class=\"col text-right\">\n");
      out.write("                                        <button class=\" btn btn-primary\" type=\"submit\" >Next</button>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </form>\n");
      out.write("                        </div> \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Footer.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("org");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\n");
          out.write("                                            <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${org.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${org.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\n");
          out.write("\n");
          out.write("                                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}

package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ProfPersonalInformation_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Registration</title>\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"resources/css/bootstrap.min.css\" id=\"bootstrap-css\">\n");
      out.write("\n");
      out.write("        <link href=\"resources/muips.css\" rel=\"stylesheet\" >\n");
      out.write("        <link rel=\"stylesheet\" href=\"resources/css/mdb.min.css\">\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\" src=\"resources/vendor/jquery/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            $(document).ready(function () {\n");
      out.write("                $(\"#defaultRegisterFormPassword\").blur(function () {\n");
      out.write("                    var pass = $(\"#defaultRegisterFormPassword1\").val();\n");
      out.write("                    var cpass = $(\"#defaultRegisterFormPassword\").val();\n");
      out.write("                    if (cpass !== pass) {\n");
      out.write("                        $(\"#passOut\").text(\"Confirm password should match password field\");\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body  style=\"height: 900px\" >\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!--Navbar-->\n");
      out.write("        <nav class=\"navbar navbar-expand-lg fixed-top scrolling-navbar  \" style=\"background-color: whitesmoke;height: 70px\" >\n");
      out.write("            <div class=\"container\"  >\n");
      out.write("                <a class=\"navbar-brand\" style=\"position: absolute; left:  10px; top: 20px\" href=\"#\"><strong>MUIPS</strong></a>\n");
      out.write("                <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent-7\" aria-controls=\"navbarSupportedContent-7\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                    <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                </button>\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent-7\">\n");
      out.write("                    <ul class=\"navbar-nav mr-auto\" style=\" position: absolute; right: 10px; top: 20px\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <li class=\"nav-item\"  >\n");
      out.write("                            <a href=\"Login.jsp\" class=\"nav-link\"  >Login</a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("        <div class=\"card p-5\"  style=\" margin-top: 100px; height: 850px; width: 55%\" >\n");
      out.write("            <!-- Default form register -->\n");
      out.write("            <form  action=\"RegisterUser\" method=\"post\">\n");
      out.write("\n");
      out.write("                <p class=\"h4 text-center  mb-1\"><strong> Registration</strong></p>\n");
      out.write("                <hr>\n");
      out.write("\n");
      out.write("                <div class=\"form-row mb-1\">\n");
      out.write("\n");
      out.write("                    <div class=\"col \">\n");
      out.write("                        <!-- First name -->\n");
      out.write("                        <label>First name:</label>\n");
      out.write("                        <input type=\"text\" name=\"fname\" style=\"padding:15px 20px;\" pattern=\"^[A-Za-z]+$\" class=\"form-control\" required >\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col\">\n");
      out.write("                        <!-- Last name -->\n");
      out.write("                        <label>Last name:</label>\n");
      out.write("                        <input type=\"text\" name=\"sname\" id=\"defaultRegisterFormLastName\"  pattern=\"^[A-Za-z]+$\" class=\"form-control\"  required>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- E-mail -->\n");
      out.write("                <label>Employee Id:</label>\n");
      out.write("                <input type=\"text\" name=\"id\" id=\"defaultRegisterFormEmail\" class=\"form-control mb-1\" required>\n");
      out.write("                <!-- Password -->\n");
      out.write("                <!-- E-mail -->\n");
      out.write("                <label>Email:</label>\n");
      out.write("                <input type=\"email\" name=\"email\" id=\"defaultRegisterFormEmail\" class=\"form-control mb-1\" required>\n");
      out.write("                <div  class=\"text-danger\" id=\"output\" ></div>\n");
      out.write("                <!-- Phone number -->\n");
      out.write("                <label>Phone number:</label>\n");
      out.write("                <input type=\"text\"   name=\"phone\" id=\"defaultRegisterPhonePassword\" pattern=\"^[+]*[(]{0,1}[0-9]{1,4}[)]{0,1}[-\\s\\./0-9]*$\" class=\"form-control mb-1\"  maxlength=\"10\" minlength=\"10\" required>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"form-row mb-1\" >\n");
      out.write("                    <label>Organization:</label>\n");
      out.write("                    <select name=\"org\" class=\"form-control\" >\n");
      out.write("                        ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                    </select>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <label>Password:</label>\n");
      out.write("                <input type=\"password\" name=\"password\" id=\"defaultRegisterFormPassword1\" class=\"form-control mb-1\" pattern=\"(?=.*\\d)(?=.*[a-z]).{8,}\" required>\n");
      out.write("                <small id=\"defaultRegisterFormPasswordHelpBlock\" class=\"form-text text-muted mb-1\"  style=\"color: blue\">\n");
      out.write("                    <strong> At least 8 characters and 1 digit</strong>\n");
      out.write("                </small>\n");
      out.write("                <label>Confirm Password:</label>\n");
      out.write("                <input type=\"password\"  name=\"cpassword\" id=\"defaultRegisterFormPassword\" class=\"form-control mb-1\"  aria-describedby=\"defaultRegisterFormPasswordHelpBlock\" required>\n");
      out.write("                <p class=\"text-danger\" id=\"passOut\"></p>\n");
      out.write("                <hr >\n");
      out.write("                <!-- Sign up button -->\n");
      out.write("                <div class=\"form-row text-right\">\n");
      out.write("                    <button class=\" btn btn-primary \" type=\"submit\">Sign up</button>\n");
      out.write("                    <input type=\"text\" hidden=\"true\" name=\"regtype\" value=\"prof\" >\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
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
          out.write("                            <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${org.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${org.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\n");
          out.write("\n");
          out.write("                        ");
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

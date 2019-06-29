package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ViewStat_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_if_test.release();
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("        <title>View posts</title>\n");
      out.write("\n");
      out.write("        <!-- Custom fonts for this template -->\n");
      out.write("        <link href=\"resources/vendor/fontawesome-free/css/all.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/jqueryui/1.12.1/jquery-ui.css\">\n");
      out.write("\n");
      out.write("        <!-- Custom styles for this template -->\n");
      out.write("        <link href=\"resources/css/sb-admin-2.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Custom styles for this page -->\n");
      out.write("        <link href=\"resources/vendor/datatables/dataTables.bootstrap4.min.css\" rel=\"stylesheet\">\n");
      out.write("        <style>\n");
      out.write("\n");
      out.write("            .map-container{\n");
      out.write("                overflow:hidden;\n");
      out.write("                padding-bottom:56.25%;\n");
      out.write("                position:relative;\n");
      out.write("                height:0;\n");
      out.write("            }\n");
      out.write("            .map-container iframe{\n");
      out.write("                left:0;\n");
      out.write("                top:0;\n");
      out.write("                height:100%;\n");
      out.write("                width:100%;\n");
      out.write("                position:absolute;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body id=\"page-top\">\n");
      out.write("\n");
      out.write("        <!-- Page Wrapper -->\n");
      out.write("        <div id=\"wrapper\">\n");
      out.write("\n");
      out.write("            ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("            ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("            ");
      if (_jspx_meth_c_if_2(_jspx_page_context))
        return;
      out.write("\n");
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
      out.write("\n");
      out.write("                    <!-- Begin Page Content -->\n");
      out.write("                    <div class=\"container-fluid\">\n");
      out.write("                        <form method=\"post\" action=\"RetrieveStatistics\">\n");
      out.write("                            <div class=\"form-row mb-4\">\n");
      out.write("                                <div class=\"col-2 \" >\n");
      out.write("                                    <label>Select constituency:</label>\n");
      out.write("                                    <select id=\"inputState\" class=\"form-control\" name=\"constituency\" required>\n");
      out.write("                                        <option>Nakuru Town West</option>\n");
      out.write("                                        <option>Subukia</option>\n");
      out.write("                                        <option>Nakuru Town</option>\n");
      out.write("                                        <option>Nakuru Town East</option>\n");
      out.write("                                        <option>Kuresoi North</option>\n");
      out.write("                                        <option>Kuresoi South</option>\n");
      out.write("                                        <option>Rongai</option>\n");
      out.write("                                        <option>Molo</option>\n");
      out.write("                                        <option>Whole county</option>\n");
      out.write("                                    </select>\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"row\" style=\"margin-left: 40px\">\n");
      out.write("                                    <div class=\"col\" >\n");
      out.write("                                        <label>Date from:</label>\n");
      out.write("                                        <input type=\"text\" id=\"datepicker\"  name=\"startDate\" class=\"form-Inline\" required >\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col\" style=\"margin-top: 30px\">\n");
      out.write("                                        <label>To:</label>\n");
      out.write("                                        <input type=\"text\" id=\"datepicker1\" name=\"stopDate\" class=\"form-Inline\" required>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-2  \" style=\"margin-top: 30px\" >\n");
      out.write("                                    <input type=\"submit\" class=\"btn btn-primary\" value=\"search\" >\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <input type=\"text\" name=\"action\" value=\"cons\" hidden>\n");
      out.write("                        </form>\n");
      out.write("                        <form action=\"PrintReport\" method=\"post\">\n");
      out.write("                            <button type=\"submit\" class=\"d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm\" disabled  id=\"btn1\"><i class=\"fas fa-download fa-sm text-white-50\"></i> Generate Report</button>\n");
      out.write("\n");
      out.write("                            <input type=\"text\" id=\"date1\" name=\"startDate\" hidden>\n");
      out.write("                            <input type=\"text\" id=\"date2\" name=\"stopDate\" hidden>\n");
      out.write("\n");
      out.write("                        </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <!-- DataTales Example -->\n");
      out.write("                        <div class=\"card shadow mb-4\">\n");
      out.write("                            <div class=\"card-header py-3\">\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <!--Card content-->\n");
      out.write("                            <div class=\"card-body\">\n");
      out.write("\n");
      out.write("                                <canvas id=\"myChart\"></canvas>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <!-- /.container-fluid -->\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <!-- End of Main Content -->\n");
      out.write("\n");
      out.write("        <!-- Footer -->\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Footer.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("        <!-- End of Footer -->\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- End of Content Wrapper -->\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <!-- End of Page Wrapper -->\n");
      out.write("\n");
      out.write("    <!-- Scroll to Top Button-->\n");
      out.write("    <a class=\"scroll-to-top rounded\" href=\"#page-top\">\n");
      out.write("        <i class=\"fas fa-angle-up\"></i>\n");
      out.write("    </a>\n");
      out.write("\n");
      out.write("    <!-- Logout Modal-->\n");
      out.write("    <div class=\"modal fade\" id=\"logoutModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\n");
      out.write("        <div class=\"modal-dialog\" role=\"document\">\n");
      out.write("            <div class=\"modal-content\">\n");
      out.write("                <div class=\"modal-header\">\n");
      out.write("                    <h5 class=\"modal-title\" id=\"exampleModalLabel\">Ready to Leave?</h5>\n");
      out.write("                    <button class=\"close\" type=\"button\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("                        <span aria-hidden=\"true\">×</span>\n");
      out.write("                    </button>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"modal-body\">Select \"Logout\" below if you are ready to end your current session.</div>\n");
      out.write("                <div class=\"modal-footer\">\n");
      out.write("                    <button class=\"btn btn-secondary\" type=\"button\" data-dismiss=\"modal\">Cancel</button>\n");
      out.write("                    <a class=\"btn btn-primary\" href=\"login.html\">Logout</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <script type=\"text/javascript\" src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.4/umd/popper.min.js\"></script>\n");
      out.write("\n");
      out.write("    <script type=\"text/javascript\" src=\"resources/vendor/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.8.2/js/mdb.min.js\"></script>\n");
      out.write("    <script src=\"https://code.jquery.com/ui/1.12.1/jquery-ui.js\"></script>\n");
      out.write("\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("        // Animations initialization\n");
      out.write("        new WOW().init();\n");
      out.write("\n");
      out.write("    </script>\n");
      out.write("\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("        $(function () {\n");
      out.write("            $(\"#datepicker\").datepicker({maxDate: \"D\", dateFormat: \"dd-mm-yy\"});\n");
      out.write("            $(\"#datepicker1\").datepicker({maxDate: \"D\", dateFormat: \"dd-mm-yy\"});\n");
      out.write("        });\n");
      out.write("    </script>\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("        $(\"#datepicker1\").change(function () {\n");
      out.write("            $(\"#btn1\").prop(\"disabled\", false);\n");
      out.write("        });\n");
      out.write("    </script>\n");
      out.write("\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("        $(\"#btn1\").click(function () {\n");
      out.write("            var x = $(\"#datepicker\").val();\n");
      out.write("            var y = $(\"#datepicker1\").val();\n");
      out.write("                    $(\"#date1\").val(x) ;\n");
      out.write("                    $(\"#date2\").val(y) ;\n");
      out.write("\n");
      out.write("        });\n");
      out.write("    </script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <script>\n");
      out.write("        // Line\n");
      out.write("        var ctx = document.getElementById(\"myChart\").getContext('2d');\n");
      out.write("        var myChart = new Chart(ctx, {\n");
      out.write("            type: 'bar',\n");
      out.write("            data: {\n");
      out.write("                labels: [\"Missing open\", \"Unidentified Open\", \"Unidentified resolved\", \"Missing resolved\"],\n");
      out.write("                datasets: [{\n");
      out.write("                        label: '# of Uploads',\n");
      out.write("                        data: [");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${openM}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(',');
      out.write(' ');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${openU}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(',');
      out.write(' ');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${resolvedU}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(',');
      out.write(' ');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${resolvedM}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("],\n");
      out.write("                        backgroundColor: [\n");
      out.write("                            'rgba(255, 99, 132, 0.2)',\n");
      out.write("                            'rgba(54, 162, 235, 0.2)',\n");
      out.write("                            'rgba(255, 206, 86, 0.2)',\n");
      out.write("                            'rgba(75, 192, 192, 0.2)',\n");
      out.write("                            'rgba(153, 102, 255, 0.2)',\n");
      out.write("                            'rgba(255, 159, 64, 0.2)'\n");
      out.write("                        ],\n");
      out.write("                        borderColor: [\n");
      out.write("                            'rgba(255,99,132,1)',\n");
      out.write("                            'rgba(54, 162, 235, 1)',\n");
      out.write("                            'rgba(255, 206, 86, 1)',\n");
      out.write("                            'rgba(75, 192, 192, 1)',\n");
      out.write("                            'rgba(153, 102, 255, 1)',\n");
      out.write("                            'rgba(255, 159, 64, 1)'\n");
      out.write("                        ],\n");
      out.write("                        borderWidth: 1\n");
      out.write("                    }]\n");
      out.write("            },\n");
      out.write("            options: {\n");
      out.write("                scales: {\n");
      out.write("                    yAxes: [{\n");
      out.write("                            ticks: {\n");
      out.write("                                beginAtZero: true\n");
      out.write("                            }\n");
      out.write("                        }]\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        });\n");
      out.write("    </script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    HttpServletRequest request = (HttpServletRequest)_jspx_page_context.getRequest();
    HttpServletResponse response = (HttpServletResponse)_jspx_page_context.getResponse();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.role =='prof'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                <!-- End of Sidebar -->\n");
        out.write("                ");
        org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "ProfSidenav.jsp", out, false);
        out.write("\n");
        out.write("                <!-- Content Wrapper -->\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    HttpServletRequest request = (HttpServletRequest)_jspx_page_context.getRequest();
    HttpServletResponse response = (HttpServletResponse)_jspx_page_context.getResponse();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.role == 'publicuser'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                <!-- End of Sidebar -->\n");
        out.write("                ");
        org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Sidebar.jsp", out, false);
        out.write("\n");
        out.write("                <!-- Content Wrapper -->\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_if_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    HttpServletRequest request = (HttpServletRequest)_jspx_page_context.getRequest();
    HttpServletResponse response = (HttpServletResponse)_jspx_page_context.getResponse();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent(null);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.role == 'admin'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                <!-- End of Sidebar -->\n");
        out.write("                ");
        org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "AdminSidenav.jsp", out, false);
        out.write("\n");
        out.write("                <!-- Content Wrapper -->\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }
}

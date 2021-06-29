package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class updateAccount_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/headerAdmin.jsp");
  }

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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <!-- Required meta tags -->\n");
      out.write("        <meta charset=\"utf-8\" />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\" />\n");
      out.write("        <title>Admin Page</title>\n");
      out.write("\n");
      out.write("        <link href=\"assets/css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"assets/vendors/mdi/css/materialdesignicons.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container-scroller\">\n");
      out.write("            <div class=\"container-fluid page-body-wrapper\">\n");
      out.write("                <div class=\"content-wrapper pb-0\">\n");
      out.write("                    ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"page-header flex-wrap\">\n");
      out.write("            <h3 class=\"mb-0\"> Hi, welcome back! <span class=\"pl-0 h6 pl-sm-2 text-muted d-inline-block\"></span>\n");
      out.write("            </h3>\n");
      out.write("            <div class=\"d-flex\">\n");
      out.write("                <!-- <button type=\"button\" class=\"btn btn-sm bg-white btn-icon-text border\">\n");
      out.write("               <i class=\"mdi mdi-email btn-icon-prepend\"></i> Email </button>-->\n");
      out.write("                <button type=\"button\" class=\"btn btn-sm bg-warning btn-icon-text border ml-3\"><a href=\"HomeAdminServlet\">Home</a> </button>\n");
      out.write("                <button type=\"button\" class=\"btn btn-sm bg-white btn-icon-text border ml-3\">\n");
      out.write("                    <i class=\"mdi mdi-account-circle btn-icon-prepend\"></i>Welcome ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.userName.userName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</button>\n");
      out.write("                    <button type=\"button\" class=\"btn btn-sm ml-3 btn-success\"><a href=\"LogoutServlet\">Đăng xuất</a> </button>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-xl-3 col-lg-12 stretch-card grid-margin\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <a class=\"col-xl-12 col-md-6 stretch-card grid-margin grid-margin-sm-0 pb-sm-3\" href=\"UserInAdminServlet\" style=\"text-decoration:none \">\n");
      out.write("                        <div class=\"card bg-warning\">\n");
      out.write("                            <div class=\"card-body px-3 py-4\">\n");
      out.write("                                <div class=\"d-flex justify-content-between align-items-start\">\n");
      out.write("                                    <div class=\"color-card\">\n");
      out.write("                                        <p class=\"mb-0 color-card-head\">User</p>\n");
      out.write("                                        <h2 class=\"text-white\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.countUser}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("<span class=\"h5\">   User</span>\n");
      out.write("                                        </h2>\n");
      out.write("                                    </div>\n");
      out.write("                                    <i class=\"card-icon-indicator mdi mdi-account-circle bg-inverse-icon-warning\"></i>\n");
      out.write("                                </div>\n");
      out.write("                                <h6 class=\"text-white\">18.33% Since last month</h6>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </a>\n");
      out.write("                    <a class=\"col-xl-12 col-md-6 stretch-card grid-margin grid-margin-sm-0 pb-sm-3\" href=\"ProductInAdminServlet\" style=\"text-decoration:none \">\n");
      out.write("                        <div class=\"card bg-danger\">\n");
      out.write("                            <div class=\"card-body px-3 py-4\">\n");
      out.write("                                <div class=\"d-flex justify-content-between align-items-start\">\n");
      out.write("                                    <div class=\"color-card\">\n");
      out.write("                                        <p class=\"mb-0 color-card-head\">Product</p>\n");
      out.write("                                        <h2 class=\"text-white\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.countProduct}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("<span class=\"h5\">   Items</span>\n");
      out.write("                                        </h2>\n");
      out.write("                                    </div>\n");
      out.write("                                    <i class=\"card-icon-indicator mdi mdi-cube-outline bg-inverse-icon-danger\"></i>\n");
      out.write("                                </div>\n");
      out.write("                                <h6 class=\"text-white\">13.21% Since last month</h6>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </a>\n");
      out.write("                    <a class=\"col-xl-12 col-md-6 stretch-card grid-margin grid-margin-sm-0 pb-sm-3\" href=\"OrderInAdminServlet\" style=\"text-decoration:none \">\n");
      out.write("                        <div class=\"card bg-primary\">\n");
      out.write("                            <div class=\"card-body px-3 py-4\">\n");
      out.write("                                <div class=\"d-flex justify-content-between align-items-start\">\n");
      out.write("                                    <div class=\"color-card\">\n");
      out.write("                                        <p class=\"mb-0 color-card-head\">Orders</p>\n");
      out.write("                                        <h2 class=\"text-white\"> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.countOrder}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" <span class=\"h5\"> Orders</span>\n");
      out.write("                                        </h2>\n");
      out.write("                                    </div>\n");
      out.write("                                    <i class=\"card-icon-indicator mdi mdi-cart bg-inverse-icon-primary\"></i>\n");
      out.write("                                </div>\n");
      out.write("                                <h6 class=\"text-white\">67.98% Since last month</h6>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </a>\n");
      out.write("                    <a class=\"col-xl-12 col-md-6 stretch-card pb-sm-3 pb-lg-0\" href=\"#\" style=\"text-decoration:none \">\n");
      out.write("                        <div class=\"card bg-success\">\n");
      out.write("                            <div class=\"card-body px-3 py-4\">\n");
      out.write("                                <div class=\"d-flex justify-content-between align-items-start\">\n");
      out.write("                                    <div class=\"color-card\">\n");
      out.write("                                        <p class=\"mb-0 color-card-head\">Review</p>\n");
      out.write("                                        <h2 class=\"text-white\">2368</h2>\n");
      out.write("                                    </div>\n");
      out.write("                                    <i class=\"card-icon-indicator mdi mdi-message-text bg-inverse-icon-success\"></i>\n");
      out.write("                                </div>\n");
      out.write("                                <h6 class=\"text-white\">20.32% Since last month</h6>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-xl-9 stretch-card grid-margin\">\n");
      out.write("                <div class=\"card\">\n");
      out.write("                    <div class=\"card-body\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-sm-7\">\n");
      out.write("                                <h5>Business Survey</h5>\n");
      out.write("                                <p class=\"text-muted\"> Show overview jan 2018 - Dec 2019 <a class=\"text-muted font-weight-medium pl-2\" href=\"#\"><u>See Details</u></a>\n");
      out.write("                                </p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-sm-4\">\n");
      out.write("                                <div class=\"card mb-3 mb-sm-0\">\n");
      out.write("                                    <div class=\"card-body py-3 px-4\">\n");
      out.write("                                        <p class=\"m-0 survey-head\">Today Earnings</p>\n");
      out.write("                                        <div class=\"d-flex justify-content-between align-items-end flot-bar-wrapper\">\n");
      out.write("                                            <div>\n");
      out.write("                                                <h3 class=\"m-0 survey-value\">$5,300</h3>\n");
      out.write("                                                <p class=\"text-success m-0\">-310 avg. sales</p>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div id=\"earningChart\" class=\"flot-chart\"></div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"col-sm-4\">\n");
      out.write("                                <div class=\"card mb-3 mb-sm-0\">\n");
      out.write("                                    <div class=\"card-body py-3 px-4\">\n");
      out.write("                                        <p class=\"m-0 survey-head\">Product Sold</p>\n");
      out.write("                                        <div class=\"d-flex justify-content-between align-items-end flot-bar-wrapper\">\n");
      out.write("                                            <div>\n");
      out.write("                                                <h3 class=\"m-0 survey-value\">$9,100</h3>\n");
      out.write("                                                <p class=\"text-danger m-0\">-310 avg. sales</p>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div id=\"productChart\" class=\"flot-chart\"></div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-sm-4\">\n");
      out.write("                                <div class=\"card\">\n");
      out.write("                                    <div class=\"card-body py-3 px-4\">\n");
      out.write("                                        <p class=\"m-0 survey-head\">Today Orders</p>\n");
      out.write("                                        <div class=\"d-flex justify-content-between align-items-end flot-bar-wrapper\">\n");
      out.write("                                            <div>\n");
      out.write("                                                <h3 class=\"m-0 survey-value\">$4,354</h3>\n");
      out.write("                                                <p class=\"text-success m-0\">-310 avg. sales</p>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div id=\"orderChart\" class=\"flot-chart\"></div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <!-- CHoox nayf -->\n");
      out.write("                    <div class=\"col-12 grid-margin stretch-card\">\n");
      out.write("                        <div class=\"card\">\n");
      out.write("                            <div class=\"card-body\">\n");
      out.write("                                <h4 class=\"card-title\">Form Create a new Account</h4>\n");
      out.write("                                <p class=\"card-description\">(*) cannot empty</p>\n");
      out.write("                                <form class=\"forms-sample\" action=\"UpdateAccountServlet\" method=\"post\">\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label for=\"exampleInputName1\">UserName</label>\n");
      out.write("                                        <input type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.userName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"form-control\" id=\"exampleInputName1\" placeholder=\"Name\" name=\"userName\" disabled=\"\"/>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label for=\"exampleInputEmail3\">Full Name</label>\n");
      out.write("                                        <input type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.fullName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"form-control\" id=\"exampleInputEmail3\" placeholder=\"Full Name\" name=\"fullName\"/>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label for=\"exampleSelectGender\">Gender</label>\n");
      out.write("                                        <select class=\"form-control\" id=\"exampleSelectGender\" name=\"gender\">\n");
      out.write("                                            <option value=\"\" disabled selected hidden>Select Gender</option>\n");
      out.write("                                            <option\n");
      out.write("                                                ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write(" name=\"gender\" value=\"false\">\n");
      out.write("                                                FeMale</option>\n");
      out.write("\n");
      out.write("                                            <option\n");
      out.write("                                                ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write(" name=\"gender\" value=\"true\">\n");
      out.write("                                                Male</option>\n");
      out.write("                                        </select>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label for=\"exampleSelectGender\">ROLE</label>\n");
      out.write("                                            <select class=\"form-control\" id=\"exampleSelectGender\" name=\"role\">\n");
      out.write("                                                <option value=\"\" disabled selected hidden>Select Role</option>\n");
      out.write("                                                <option value=\"ROLE_user\" ");
      if (_jspx_meth_c_if_2(_jspx_page_context))
        return;
      out.write(">\n");
      out.write("                                                    User</option>\n");
      out.write("                                                <option value=\"ROLE_member\" ");
      if (_jspx_meth_c_if_3(_jspx_page_context))
        return;
      out.write(">\n");
      out.write("                                                    Member</option>\n");
      out.write("                                                <option value=\"ROLE_admin\" ");
      if (_jspx_meth_c_if_4(_jspx_page_context))
        return;
      out.write(">\n");
      out.write("                                                    Admin</option>\n");
      out.write("                                            </select>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label for=\"exampleInputEmail3\">Phone</label>\n");
      out.write("                                        <input type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.phone}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"form-control\" id=\"exampleInputEmail3\" placeholder=\"Phone\" name=\"phone\"/>\n");
      out.write("                                    </div><div class=\"form-group\">\n");
      out.write("                                        <label for=\"exampleInputEmail3\">Address</label>\n");
      out.write("                                        <input type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.address}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"form-control\" id=\"exampleInputEmail3\" placeholder=\"Address\" name=\"address\"/>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label for=\"exampleInputPassword4\">Password</label>\n");
      out.write("                                        <input type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.password}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"form-control\" id=\"exampleInputPassword4\" placeholder=\"Password\"  name=\"password\" required=\"\"/>\n");
      out.write("                                    </div>\n");
      out.write("                                    <button type=\"submit\" class=\"btn btn-primary mr-2\"> Submit </button>\n");
      out.write("                                    <button class=\"btn btn-light\">Cancel</button>\n");
      out.write("                                </form>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>               \n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>");
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
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.gender == false}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" \n");
        out.write("                                                    selected=\"selected\"\n");
        out.write("                                                ");
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
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.gender == true}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" \n");
        out.write("                                                    selected=\"selected\"\n");
        out.write("                                                ");
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
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent(null);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.role =='ROLE_user'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                        selected=\"selected\"\n");
        out.write("                                                    ");
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

  private boolean _jspx_meth_c_if_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_3.setPageContext(_jspx_page_context);
    _jspx_th_c_if_3.setParent(null);
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.role =='ROLE_member'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                        selected=\"selected\"\n");
        out.write("                                                    ");
        int evalDoAfterBody = _jspx_th_c_if_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
    return false;
  }

  private boolean _jspx_meth_c_if_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_4.setPageContext(_jspx_page_context);
    _jspx_th_c_if_4.setParent(null);
    _jspx_th_c_if_4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.role =='ROLE_admin'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_4 = _jspx_th_c_if_4.doStartTag();
    if (_jspx_eval_c_if_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                        selected=\"selectd\"\n");
        out.write("                                                    ");
        int evalDoAfterBody = _jspx_th_c_if_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
    return false;
  }
}

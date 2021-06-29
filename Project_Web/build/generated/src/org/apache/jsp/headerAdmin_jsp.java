package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class headerAdmin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"page-header flex-wrap\">\n");
      out.write("                        <h3 class=\"mb-0\"> Hi, welcome back! <span class=\"pl-0 h6 pl-sm-2 text-muted d-inline-block\"></span>\n");
      out.write("                        </h3>\n");
      out.write("                        <div class=\"d-flex\">\n");
      out.write("                            <!-- <button type=\"button\" class=\"btn btn-sm bg-white btn-icon-text border\">\n");
      out.write("                           <i class=\"mdi mdi-email btn-icon-prepend\"></i> Email </button>-->\n");
      out.write("                            <button type=\"button\" class=\"btn btn-sm bg-white btn-icon-text border ml-3\">\n");
      out.write("                                <i class=\"mdi mdi-printer btn-icon-prepend\"></i>Welcome ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.userName.userName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</button>\n");
      out.write("                            <button type=\"button\" class=\"btn btn-sm ml-3 btn-success\"><a>  Add User</a> </button>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-xl-3 col-lg-12 stretch-card grid-margin\">\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <a class=\"col-xl-12 col-md-6 stretch-card grid-margin grid-margin-sm-0 pb-sm-3\" href=\"#\" style=\"text-decoration:none \">\n");
      out.write("                                    <div class=\"card bg-warning\">\n");
      out.write("                                        <div class=\"card-body px-3 py-4\">\n");
      out.write("                                            <div class=\"d-flex justify-content-between align-items-start\">\n");
      out.write("                                                <div class=\"color-card\">\n");
      out.write("                                                    <p class=\"mb-0 color-card-head\">User</p>\n");
      out.write("                                                    <h2 class=\"text-white\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.countUser}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("<span class=\"h5\">   User</span>\n");
      out.write("                                                    </h2>\n");
      out.write("                                                </div>\n");
      out.write("                                                <i class=\"card-icon-indicator mdi mdi-basket bg-inverse-icon-warning\"></i>\n");
      out.write("                                            </div>\n");
      out.write("                                            <h6 class=\"text-white\">18.33% Since last month</h6>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </a>\n");
      out.write("                                <a class=\"col-xl-12 col-md-6 stretch-card grid-margin grid-margin-sm-0 pb-sm-3\" href=\"listProduct.jsp\" style=\"text-decoration:none \">\n");
      out.write("                                    <div class=\"card bg-danger\">\n");
      out.write("                                        <div class=\"card-body px-3 py-4\">\n");
      out.write("                                            <div class=\"d-flex justify-content-between align-items-start\">\n");
      out.write("                                                <div class=\"color-card\">\n");
      out.write("                                                    <p class=\"mb-0 color-card-head\">Product</p>\n");
      out.write("                                                    <h2 class=\"text-white\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.countProduct}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("<span class=\"h5\">   Items</span>\n");
      out.write("                                                    </h2>\n");
      out.write("                                                </div>\n");
      out.write("                                                <i class=\"card-icon-indicator mdi mdi-cube-outline bg-inverse-icon-danger\"></i>\n");
      out.write("                                            </div>\n");
      out.write("                                            <h6 class=\"text-white\">13.21% Since last month</h6>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </a>\n");
      out.write("                                <a class=\"col-xl-12 col-md-6 stretch-card grid-margin grid-margin-sm-0 pb-sm-3\" href=\"#\" style=\"text-decoration:none \">\n");
      out.write("                                    <div class=\"card bg-primary\">\n");
      out.write("                                        <div class=\"card-body px-3 py-4\">\n");
      out.write("                                            <div class=\"d-flex justify-content-between align-items-start\">\n");
      out.write("                                                <div class=\"color-card\">\n");
      out.write("                                                    <p class=\"mb-0 color-card-head\">Orders</p>\n");
      out.write("                                                    <h2 class=\"text-white\"> $1,753.<span class=\"h5\">00</span>\n");
      out.write("                                                    </h2>\n");
      out.write("                                                </div>\n");
      out.write("                                                <i class=\"card-icon-indicator mdi mdi-briefcase-outline bg-inverse-icon-primary\"></i>\n");
      out.write("                                            </div>\n");
      out.write("                                            <h6 class=\"text-white\">67.98% Since last month</h6>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </a>\n");
      out.write("                                <a class=\"col-xl-12 col-md-6 stretch-card pb-sm-3 pb-lg-0\" href=\"#\" style=\"text-decoration:none \">\n");
      out.write("                                    <div class=\"card bg-success\">\n");
      out.write("                                        <div class=\"card-body px-3 py-4\">\n");
      out.write("                                            <div class=\"d-flex justify-content-between align-items-start\">\n");
      out.write("                                                <div class=\"color-card\">\n");
      out.write("                                                    <p class=\"mb-0 color-card-head\">Review</p>\n");
      out.write("                                                    <h2 class=\"text-white\">2368</h2>\n");
      out.write("                                                </div>\n");
      out.write("                                                <i class=\"card-icon-indicator mdi mdi-account-circle bg-inverse-icon-success\"></i>\n");
      out.write("                                            </div>\n");
      out.write("                                            <h6 class=\"text-white\">20.32% Since last month</h6>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-xl-9 stretch-card grid-margin\">\n");
      out.write("                            <div class=\"card\">\n");
      out.write("                                <div class=\"card-body\">\n");
      out.write("                                    <div class=\"row\">\n");
      out.write("                                        <div class=\"col-sm-7\">\n");
      out.write("                                            <h5>Business Survey</h5>\n");
      out.write("                                            <p class=\"text-muted\"> Show overview jan 2018 - Dec 2019 <a class=\"text-muted font-weight-medium pl-2\" href=\"#\"><u>See Details</u></a>\n");
      out.write("                                            </p>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"row\">\n");
      out.write("                                        <div class=\"col-sm-4\">\n");
      out.write("                                            <div class=\"card mb-3 mb-sm-0\">\n");
      out.write("                                                <div class=\"card-body py-3 px-4\">\n");
      out.write("                                                    <p class=\"m-0 survey-head\">Today Earnings</p>\n");
      out.write("                                                    <div class=\"d-flex justify-content-between align-items-end flot-bar-wrapper\">\n");
      out.write("                                                        <div>\n");
      out.write("                                                            <h3 class=\"m-0 survey-value\">$5,300</h3>\n");
      out.write("                                                            <p class=\"text-success m-0\">-310 avg. sales</p>\n");
      out.write("                                                        </div>\n");
      out.write("                                                        <div id=\"earningChart\" class=\"flot-chart\"></div>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                        <div class=\"col-sm-4\">\n");
      out.write("                                            <div class=\"card mb-3 mb-sm-0\">\n");
      out.write("                                                <div class=\"card-body py-3 px-4\">\n");
      out.write("                                                    <p class=\"m-0 survey-head\">Product Sold</p>\n");
      out.write("                                                    <div class=\"d-flex justify-content-between align-items-end flot-bar-wrapper\">\n");
      out.write("                                                        <div>\n");
      out.write("                                                            <h3 class=\"m-0 survey-value\">$9,100</h3>\n");
      out.write("                                                            <p class=\"text-danger m-0\">-310 avg. sales</p>\n");
      out.write("                                                        </div>\n");
      out.write("                                                        <div id=\"productChart\" class=\"flot-chart\"></div>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"col-sm-4\">\n");
      out.write("                                            <div class=\"card\">\n");
      out.write("                                                <div class=\"card-body py-3 px-4\">\n");
      out.write("                                                    <p class=\"m-0 survey-head\">Today Orders</p>\n");
      out.write("                                                    <div class=\"d-flex justify-content-between align-items-end flot-bar-wrapper\">\n");
      out.write("                                                        <div>\n");
      out.write("                                                            <h3 class=\"m-0 survey-value\">$4,354</h3>\n");
      out.write("                                                            <p class=\"text-success m-0\">-310 avg. sales</p>\n");
      out.write("                                                        </div>\n");
      out.write("                                                        <div id=\"orderChart\" class=\"flot-chart\"></div>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
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

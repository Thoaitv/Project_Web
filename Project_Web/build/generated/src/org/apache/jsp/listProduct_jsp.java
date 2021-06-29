package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class listProduct_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/headerAdmin.jsp");
  }

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
      out.write("                    <div class=\"row\">\n");
      out.write("\n");
      out.write("                        <form action=\"DeleteProductServlet\" method=\"post\">\n");
      out.write("                            <!-- CHoox nayf -->\n");
      out.write("                            <div class=\"col-lg-12 grid-margin stretch-card\">\n");
      out.write("                                <div class=\"card\">\n");
      out.write("                                    <div class=\"card-body\">\n");
      out.write("                                        <div class=\"row\">\n");
      out.write("                                            <div class=\"col-sm-7\">\n");
      out.write("                                                <h5>List Product</h5>\n");
      out.write("                                                <p class=\"text-muted\"> Show overview jan 2018 - Dec 2019 <a class=\"text-muted font-weight-medium pl-2\" href=\"#\"><u>See Details</u></a>\n");
      out.write("                                                </p>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"col-sm-5 text-md-right\">\n");
      out.write("                                                <button type=\"submit\" class=\"btn btn-icon-text mb-3 mb-sm-0 btn-inverse-primary font-weight-normal\">\n");
      out.write("                                                    <i class=\"mdi mdi-email btn-icon-prepend\"></i>Delete</button>\n");
      out.write("                                                <button type=\"button\" class=\"btn btn-icon-text mb-3 mb-sm-0 btn-inverse-primary font-weight-normal\">\n");
      out.write("                                                    <a href=\"AddNewProductServlet\"> <i class=\"mdi mdi-email btn-icon-prepend\"></i>Add new Product </a> </button>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                        <div class=\"table-responsive\">\n");
      out.write("                                            <table class=\"table table-striped\">\n");
      out.write("                                                <thead>\n");
      out.write("                                                    <tr>\n");
      out.write("                                                        <th>\n");
      out.write("                                                            <label class=\"form-check-label\">\n");
      out.write("                                                                <input type=\"checkbox\" class=\"form-check-input\" id=\"checkAll\"/></label>\n");
      out.write("                                                        </th>\n");
      out.write("                                                        <th>Product ID</th>\n");
      out.write("                                                        <th>Product Name</th>\n");
      out.write("                                                        <th>Price</th>\n");
      out.write("                                                        <th>Quantity</th>\n");
      out.write("                                                        <th>Image</th>\n");
      out.write("                                                        <th>View item</th>\n");
      out.write("                                                        <th>Update Product</th>\n");
      out.write("\n");
      out.write("                                                    </tr>\n");
      out.write("                                                </thead>\n");
      out.write("                                                <tbody>\n");
      out.write("                                                    ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                                </tbody>\n");
      out.write("                                            </table>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("                        <script>\n");
      out.write("                            let userSelection = document.getElementsByClassName('checkbox');\n");
      out.write("                            let checkAll = document.getElementById('checkAll');\n");
      out.write("\n");
      out.write("                            checkAll.addEventListener('click', () => {\n");
      out.write("                                if (checkAll.checked == true) {\n");
      out.write("                                    for (let i = 1; i < userSelection.length; i++) {\n");
      out.write("                                        document.getElementById(i).checked = true;\n");
      out.write("                                    }\n");
      out.write("                                } else {\n");
      out.write("                                    for (let i = 1; i < userSelection.length; i++) {\n");
      out.write("                                        document.getElementById(i).checked = false;\n");
      out.write("                                    }\n");
      out.write("                                }\n");
      out.write("                            });\n");
      out.write("                        </script>\n");
      out.write("                    </div>\n");
      out.write("                </div>               \n");
      out.write("            </div>\n");
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
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.listProduct}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("p");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                                        <tr>\n");
          out.write("                                                            <td>\n");
          out.write("                                                                <label class=\"form-check-label\" >\n");
          out.write("                                                                    <input type=\"checkbox\" class=\"form-check-input\" id=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${loop.count}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"/></label>\n");
          out.write("                                                            </td>\n");
          out.write("                                                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.productId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.productName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.quantity}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                                            <td class=\"py-1\">\n");
          out.write("                                                                <img src=\"images/products/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"\"/>\n");
          out.write("                                                            </td>\n");
          out.write("                                                            <td>\n");
          out.write("                                                                <i class=\"mdi mdi-eye\" style=\"font-size:1.5rem; padding-left: 10px; \"></i>\n");
          out.write("                                                            </td>\n");
          out.write("                                                            <td style=\"padding-left: 3rem;\">\n");
          out.write("                                                                <label class=\"badge badge-danger\"><a  style=\"color: #1b00ffe3;\" href=\"UpdateProductServlet?productId=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.productId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">Update</a></label>\n");
          out.write("                                                            </td><!--\n");
          out.write("                                                            <td>\n");
          out.write("                                                                <label class=\"badge badge-warning\">Đợi</label>\n");
          out.write("                                                            </td>-->\n");
          out.write("                                                        </tr>\n");
          out.write("                                                    ");
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

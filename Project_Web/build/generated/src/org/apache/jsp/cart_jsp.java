package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cart_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/footer.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <!-- Basic -->\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("\n");
      out.write("        <!-- Mobile Metas -->\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\n");
      out.write("        <!-- Site Metas -->\n");
      out.write("        <title>ThewayShop - Ecommerce Bootstrap 4 HTML Template</title>\n");
      out.write("        <meta name=\"keywords\" content=\"\">\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("        <!-- Site Icons -->\n");
      out.write("        <link rel=\"shortcut icon\" href=\"images/favicon.ico\" type=\"image/x-icon\">\n");
      out.write("        <link rel=\"apple-touch-icon\" href=\"images/apple-touch-icon.png\">\n");
      out.write("\n");
      out.write("        <!-- Bootstrap CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("        <!-- Site CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("        <!-- Responsive CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/responsive.css\">\n");
      out.write("        <!-- Custom CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/custom.css\">\n");
      out.write("\n");
      out.write("        <!--[if lt IE 9]>\n");
      out.write("          <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\n");
      out.write("          <script src=\"https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js\"></script>\n");
      out.write("        <![endif]-->\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <!-- Start Main Top -->\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("\n");
      out.write("        <!-- Mobile Metas -->\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\n");
      out.write("        <!-- Site Metas -->\n");
      out.write("        <title>ThewayShop - Ecommerce Bootstrap 4 HTML Template</title>\n");
      out.write("        <meta name=\"keywords\" content=\"\">\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("        <!-- Site Icons -->\n");
      out.write("        <link rel=\"shortcut icon\" href=\"images/favicon.ico\" type=\"image/x-icon\">\n");
      out.write("        <link rel=\"apple-touch-icon\" href=\"images/apple-touch-icon.png\">\n");
      out.write("\n");
      out.write("        <!-- Bootstrap CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("        <!-- Site CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("        <!-- Responsive CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/responsive.css\">\n");
      out.write("        <!-- Custom CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/custom.css\">\n");
      out.write("\n");
      out.write("        <!--[if lt IE 9]>\n");
      out.write("          <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\n");
      out.write("          <script src=\"https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js\"></script>\n");
      out.write("        <![endif]-->\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!-- Start Main Top -->\n");
      out.write("        <div class=\"main-top\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-6 col-md-6 col-sm-12 col-xs-12\">\n");
      out.write("                        <div class=\"text-slid-box\">\n");
      out.write("                            <div id=\"offer-box\" class=\"carouselTicker\">\n");
      out.write("                                <ul class=\"offer-box\">\n");
      out.write("                                    <li>\n");
      out.write("                                        <i class=\"fab fa-opencart\"></i> Off 10%! Shop Now Man\n");
      out.write("                                    </li>\n");
      out.write("                                    <li>\n");
      out.write("                                        <i class=\"fab fa-opencart\"></i> 50% - 80% off on Fashion\n");
      out.write("                                    </li>\n");
      out.write("                                    <li>\n");
      out.write("                                        <i class=\"fab fa-opencart\"></i> 20% off Entire Purchase Promo code: offT20\n");
      out.write("                                    </li>\n");
      out.write("                                    <li>\n");
      out.write("                                        <i class=\"fab fa-opencart\"></i> Off 50%! Shop Now\n");
      out.write("                                    </li>\n");
      out.write("                                    <li>\n");
      out.write("                                        <i class=\"fab fa-opencart\"></i> Off 10%! Shop Now Man\n");
      out.write("                                    </li>\n");
      out.write("                                    <li>\n");
      out.write("                                        <i class=\"fab fa-opencart\"></i> 50% - 80% off on Fashion\n");
      out.write("                                    </li>\n");
      out.write("                                    <li>\n");
      out.write("                                        <i class=\"fab fa-opencart\"></i> 20% off Entire Purchase Promo code: offT20\n");
      out.write("                                    </li>\n");
      out.write("                                    <li>\n");
      out.write("                                        <i class=\"fab fa-opencart\"></i> Off 50%! Shop Now\n");
      out.write("                                    </li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-6 col-md-6 col-sm-12 col-xs-12\">\n");
      out.write("                        <div class=\"custom-select-box\">\n");
      out.write("                            <select id=\"basic\" class=\"selectpicker show-tick form-control\" data-placeholder=\"$ USD\">\n");
      out.write("                                <option>¥ JPY</option>\n");
      out.write("                                <option>$ USD</option>\n");
      out.write("                                <option>€ EUR</option>\n");
      out.write("                            </select>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"right-phone-box\">\n");
      out.write("                            <p>Call US :- <a href=\"#\"> +11 900 800 100</a></p>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"our-link\">\n");
      out.write("                            <ul>\n");
      out.write("                                ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                <li><a href=\"#\">My Account</a></li>\n");
      out.write("                                <li><a href=\"#\">Our location</a></li>\n");
      out.write("                                <li><a href=\"#\">Contact Us</a></li>\n");
      out.write("                                    ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                    ");
      if (_jspx_meth_c_if_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- End Main Top -->\n");
      out.write("\n");
      out.write("        <header class=\"main-header\">\n");
      out.write("            <!-- Start Navigation -->\n");
      out.write("            <nav class=\"navbar navbar-expand-lg navbar-light bg-light navbar-default bootsnav\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <!-- Start Header Navigation -->\n");
      out.write("                    <div class=\"navbar-header\">\n");
      out.write("                        <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbar-menu\" aria-controls=\"navbars-rs-food\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                            <i class=\"fa fa-bars\"></i>\n");
      out.write("                        </button>\n");
      out.write("                        <a class=\"navbar-brand\" href=\"HomeServlet\"><img src=\"images/logo.png\" class=\"logo\" alt=\"\"></a>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- End Header Navigation -->\n");
      out.write("\n");
      out.write("                    <!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("                    <div class=\"collapse navbar-collapse\" id=\"navbar-menu\">\n");
      out.write("                        <ul class=\"nav navbar-nav ml-auto\" data-in=\"fadeInDown\" data-out=\"fadeOutUp\">\n");
      out.write("                            <li class=\"nav-item\"><a class=\"nav-link\" href=\"HomeServlet\">Home</a></li>\n");
      out.write("                            <li class=\"nav-item\"><a class=\"nav-link\" href=\"aboutUs.jsp\">About Us</a></li>\n");
      out.write("                            <li class=\"dropdown active megamenu-fw\">\n");
      out.write("                                <a href=\"#\" class=\"nav-link dropdown-toggle arrow\" data-toggle=\"dropdown\">Product</a>\n");
      out.write("                                <ul class=\"dropdown-menu megamenu-content\" role=\"menu\">\n");
      out.write("                                    <li>\n");
      out.write("                                        <div class=\"row\">\n");
      out.write("                                            <div class=\"col-menu col-md-3\">\n");
      out.write("                                                <h6 class=\"title\">Top</h6>\n");
      out.write("                                                <div class=\"content\">\n");
      out.write("                                                    <ul class=\"menu-col\">\n");
      out.write("                                                        <li><a href=\"shop.html\">Jackets</a></li>\n");
      out.write("                                                        <li><a href=\"shop.html\">Shirts</a></li>\n");
      out.write("                                                        <li><a href=\"shop.html\">Sweaters & Cardigans</a></li>\n");
      out.write("                                                        <li><a href=\"shop.html\">T-shirts</a></li>\n");
      out.write("                                                    </ul>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                            <!-- end col-3 -->\n");
      out.write("                                            <div class=\"col-menu col-md-3\">\n");
      out.write("                                                <h6 class=\"title\">Bottom</h6>\n");
      out.write("                                                <div class=\"content\">\n");
      out.write("                                                    <ul class=\"menu-col\">\n");
      out.write("                                                        <li><a href=\"shop.html\">Swimwear</a></li>\n");
      out.write("                                                        <li><a href=\"shop.html\">Skirts</a></li>\n");
      out.write("                                                        <li><a href=\"shop.html\">Jeans</a></li>\n");
      out.write("                                                        <li><a href=\"shop.html\">Trousers</a></li>\n");
      out.write("                                                    </ul>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                            <!-- end col-3 -->\n");
      out.write("                                            <div class=\"col-menu col-md-3\">\n");
      out.write("                                                <h6 class=\"title\">Clothing</h6>\n");
      out.write("                                                <div class=\"content\">\n");
      out.write("                                                    <ul class=\"menu-col\">\n");
      out.write("                                                        <li><a href=\"shop.html\">Top Wear</a></li>\n");
      out.write("                                                        <li><a href=\"shop.html\">Party wear</a></li>\n");
      out.write("                                                        <li><a href=\"shop.html\">Bottom Wear</a></li>\n");
      out.write("                                                        <li><a href=\"shop.html\">Indian Wear</a></li>\n");
      out.write("                                                    </ul>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"col-menu col-md-3\">\n");
      out.write("                                                <h6 class=\"title\">Accessories</h6>\n");
      out.write("                                                <div class=\"content\">\n");
      out.write("                                                    <ul class=\"menu-col\">\n");
      out.write("                                                        <li><a href=\"shop.html\">Bags</a></li>\n");
      out.write("                                                        <li><a href=\"shop.html\">Sunglasses</a></li>\n");
      out.write("                                                        <li><a href=\"shop.html\">Fragrances</a></li>\n");
      out.write("                                                        <li><a href=\"shop.html\">Wallets</a></li>\n");
      out.write("                                                    </ul>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                            <!-- end col-3 -->\n");
      out.write("                                        </div>\n");
      out.write("                                        <!-- end row -->\n");
      out.write("                                    </li>\n");
      out.write("                                </ul>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"dropdown\">\n");
      out.write("                                <a href=\"#\" class=\"nav-link dropdown-toggle arrow\" data-toggle=\"dropdown\">SHOP</a>\n");
      out.write("                                <ul class=\"dropdown-menu\">\n");
      out.write("                                    <li><a href=\"CartServlet\">Cart</a></li>\n");
      out.write("                                                                        <li><a href=\"OrderServlet\">Checkout</a></li>\n");
      out.write("                                  \n");
      out.write("                                    <li><a href=\"my-account.html\">My Account</a></li>\n");
      out.write("                                    <li><a href=\"wishlist.html\">Wishlist</a></li>\n");
      out.write("                                    <li><a href=\"shop-detail.html\">Shop Detail</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"nav-item\"><a class=\"nav-link\" href=\"service.jsp\">Our Service</a></li>\n");
      out.write("                            <li class=\"nav-item\"><a class=\"nav-link\" href=\"contactUs.jsp\">Contact Us</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- /.navbar-collapse -->\n");
      out.write("\n");
      out.write("                    <!-- Start Atribute Navigation -->\n");
      out.write("                    <div class=\"attr-nav\">\n");
      out.write("                        <ul>\n");
      out.write("                            <li class=\"search\"><a href=\"#\"><i class=\"fa fa-search\"></i></a></li>\n");
      out.write("\n");
      out.write("                            ");
      if (_jspx_meth_c_if_3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                ");
      if (_jspx_meth_c_if_4(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- End Atribute Navigation -->\n");
      out.write("                </div>\n");
      out.write("                <!-- Start Side Menu -->\n");
      out.write("                <div class=\"side\">\n");
      out.write("                    <a href=\"#\" class=\"close-side\"><i class=\"fa fa-times\"></i></a>\n");
      out.write("                    <li class=\"cart-box\">\n");
      out.write("                        <ul class=\"cart-list\">\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\" class=\"photo\"><img src=\"images/img-pro-01.jpg\" class=\"cart-thumb\" alt=\"\" /></a>\n");
      out.write("                                <h6><a href=\"#\">Delica omtantur </a></h6>\n");
      out.write("                                <p>1x - <span class=\"price\">$80.00</span></p>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\" class=\"photo\"><img src=\"images/img-pro-02.jpg\" class=\"cart-thumb\" alt=\"\" /></a>\n");
      out.write("                                <h6><a href=\"#\">Omnes ocurreret</a></h6>\n");
      out.write("                                <p>1x - <span class=\"price\">$60.00</span></p>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\" class=\"photo\"><img src=\"images/img-pro-03.jpg\" class=\"cart-thumb\" alt=\"\" /></a>\n");
      out.write("                                <h6><a href=\"#\">Agam facilisis</a></h6>\n");
      out.write("                                <p>1x - <span class=\"price\">$40.00</span></p>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"total\">\n");
      out.write("                                <a href=\"#\" class=\"btn btn-default hvr-hover btn-cart\">VIEW CART</a>\n");
      out.write("                                <span class=\"float-right\"><strong>Total</strong>: $180.00</span>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                </div>\n");
      out.write("                <!-- End Side Menu -->\n");
      out.write("            </nav>\n");
      out.write("            <!-- End Navigation -->\n");
      out.write("        </header>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("        <!-- End Main Top -->\n");
      out.write("\n");
      out.write("        <!-- Start Top Search -->\n");
      out.write("        <div class=\"top-search\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"input-group\">\n");
      out.write("                    <span class=\"input-group-addon\"><i class=\"fa fa-search\"></i></span>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" placeholder=\"Search\">\n");
      out.write("                    <span class=\"input-group-addon close-search\"><i class=\"fa fa-times\"></i></span>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- End Top Search -->\n");
      out.write("\n");
      out.write("        <!-- Start All Title Box -->\n");
      out.write("        <div class=\"all-title-box\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-12\">\n");
      out.write("                        <h2>Cart</h2>\n");
      out.write("                        <ul class=\"breadcrumb\">\n");
      out.write("                            <li class=\"breadcrumb-item\"><a href=\"#\">Shop</a></li>\n");
      out.write("                            <li class=\"breadcrumb-item active\">Cart</li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- End All Title Box -->\n");
      out.write("\n");
      out.write("        <!-- Start Cart  -->\n");
      out.write("        <div class=\"cart-box-main\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-12\">\n");
      out.write("                        <div class=\"table-main table-responsive\">\n");
      out.write("                            <table class=\"table\">\n");
      out.write("                                <thead>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <th>Images</th>\n");
      out.write("                                        <th>Product Name</th>\n");
      out.write("                                        <th>Price</th>\n");
      out.write("                                        <th>Quantity</th>\n");
      out.write("                                        <th>Size</th>\n");
      out.write("\n");
      out.write("                                        <th>Total</th>\n");
      out.write("                                        <th>Remove</th>\n");
      out.write("                                    </tr>\n");
      out.write("                                </thead>\n");
      out.write("                                <tbody>\n");
      out.write("                                    ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                </tbody>\n");
      out.write("                            </table>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"row my-5\">\n");
      out.write("                    <div class=\"col-lg-6 col-sm-6\">\n");
      out.write("                        <div class=\"coupon-box\">\n");
      out.write("                            <div class=\"input-group input-group-sm\">\n");
      out.write("                                <input class=\"form-control\" placeholder=\"Enter your coupon code\" aria-label=\"Coupon code\" type=\"text\">\n");
      out.write("                                <div class=\"input-group-append\">\n");
      out.write("                                    <button class=\"btn btn-theme\" type=\"button\">Apply Coupon</button>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-6 col-sm-6\">\n");
      out.write("                        <div class=\"update-box\">\n");
      out.write("                            <input value=\"Update Cart\" type=\"submit\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"row my-5\">\n");
      out.write("                    <div class=\"col-lg-8 col-sm-12\"></div>\n");
      out.write("                    <div class=\"col-lg-4 col-sm-12\">\n");
      out.write("                        <div class=\"order-box\">\n");
      out.write("                            <h3>Order summary</h3>\n");
      out.write("                            <div class=\"d-flex\">\n");
      out.write("                                <h4>Sub Total</h4>\n");
      out.write("                                <div class=\"ml-auto font-weight-bold\"> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.totalAmount}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"d-flex\">\n");
      out.write("                                <h4>Discount</h4>\n");
      out.write("                                <div class=\"ml-auto font-weight-bold\"> $ 0 </div>\n");
      out.write("                            </div>\n");
      out.write("                            <hr class=\"my-1\">\n");
      out.write("                            <div class=\"d-flex\">\n");
      out.write("                                <h4>Coupon Discount</h4>\n");
      out.write("                                <div class=\"ml-auto font-weight-bold\"> $ 0 </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"d-flex\">\n");
      out.write("                                <h4>Tax</h4>\n");
      out.write("                                <div class=\"ml-auto font-weight-bold\"> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.totalAmount * 0.1}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"d-flex\">\n");
      out.write("                                <h4>Shipping Cost</h4>\n");
      out.write("                                <div class=\"ml-auto font-weight-bold\"> Free </div>\n");
      out.write("                            </div>\n");
      out.write("                            <hr>\n");
      out.write("                            <div class=\"d-flex gr-total\">\n");
      out.write("                                <h5>Grand Total</h5>\n");
      out.write("                                <div class=\"ml-auto h5\"> $ ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.totalAmount +(sessionScope.totalAmount * 0.1)}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" </div>\n");
      out.write("                            </div>\n");
      out.write("                            <hr> </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-12 d-flex shopping-box\"><a href=\"CheckOutServlet\" class=\"ml-auto btn hvr-hover\">Checkout</a> </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- End Cart -->\n");
      out.write("\n");
      out.write("        <!-- Start Instagram Feed  -->\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("\n");
      out.write("        <!-- Mobile Metas -->\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\n");
      out.write("        <!-- Site Metas -->\n");
      out.write("        <title>ThewayShop - Ecommerce Bootstrap 4 HTML Template</title>\n");
      out.write("        <meta name=\"keywords\" content=\"\">\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("        <!-- Site Icons -->\n");
      out.write("        <link rel=\"shortcut icon\" href=\"images/favicon.ico\" type=\"image/x-icon\">\n");
      out.write("        <link rel=\"apple-touch-icon\" href=\"images/apple-touch-icon.png\">\n");
      out.write("\n");
      out.write("        <!-- Bootstrap CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("        <!-- Site CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("        <!-- Responsive CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/responsive.css\">\n");
      out.write("        <!-- Custom CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/custom.css\">\n");
      out.write("\n");
      out.write("        <!--[if lt IE 9]>\n");
      out.write("          <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\n");
      out.write("          <script src=\"https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js\"></script>\n");
      out.write("        <![endif]-->\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!-- Start Instagram Feed  -->\n");
      out.write("        <div class=\"instagram-box\">\n");
      out.write("            <div class=\"main-instagram owl-carousel owl-theme\">\n");
      out.write("                <div class=\"item\">\n");
      out.write("                    <div class=\"ins-inner-box\">\n");
      out.write("                        <img src=\"images/instagram-img-01.jpg\" alt=\"\" />\n");
      out.write("                        <div class=\"hov-in\">\n");
      out.write("                            <a href=\"#\"><i class=\"fab fa-instagram\"></i></a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"item\">\n");
      out.write("                    <div class=\"ins-inner-box\">\n");
      out.write("                        <img src=\"images/instagram-img-02.jpg\" alt=\"\" />\n");
      out.write("                        <div class=\"hov-in\">\n");
      out.write("                            <a href=\"#\"><i class=\"fab fa-instagram\"></i></a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"item\">\n");
      out.write("                    <div class=\"ins-inner-box\">\n");
      out.write("                        <img src=\"images/instagram-img-03.jpg\" alt=\"\" />\n");
      out.write("                        <div class=\"hov-in\">\n");
      out.write("                            <a href=\"#\"><i class=\"fab fa-instagram\"></i></a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"item\">\n");
      out.write("                    <div class=\"ins-inner-box\">\n");
      out.write("                        <img src=\"images/instagram-img-04.jpg\" alt=\"\" />\n");
      out.write("                        <div class=\"hov-in\">\n");
      out.write("                            <a href=\"#\"><i class=\"fab fa-instagram\"></i></a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"item\">\n");
      out.write("                    <div class=\"ins-inner-box\">\n");
      out.write("                        <img src=\"images/instagram-img-05.jpg\" alt=\"\" />\n");
      out.write("                        <div class=\"hov-in\">\n");
      out.write("                            <a href=\"#\"><i class=\"fab fa-instagram\"></i></a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"item\">\n");
      out.write("                    <div class=\"ins-inner-box\">\n");
      out.write("                        <img src=\"images/instagram-img-06.jpg\" alt=\"\" />\n");
      out.write("                        <div class=\"hov-in\">\n");
      out.write("                            <a href=\"#\"><i class=\"fab fa-instagram\"></i></a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"item\">\n");
      out.write("                    <div class=\"ins-inner-box\">\n");
      out.write("                        <img src=\"images/instagram-img-07.jpg\" alt=\"\" />\n");
      out.write("                        <div class=\"hov-in\">\n");
      out.write("                            <a href=\"#\"><i class=\"fab fa-instagram\"></i></a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"item\">\n");
      out.write("                    <div class=\"ins-inner-box\">\n");
      out.write("                        <img src=\"images/instagram-img-08.jpg\" alt=\"\" />\n");
      out.write("                        <div class=\"hov-in\">\n");
      out.write("                            <a href=\"#\"><i class=\"fab fa-instagram\"></i></a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"item\">\n");
      out.write("                    <div class=\"ins-inner-box\">\n");
      out.write("                        <img src=\"images/instagram-img-09.jpg\" alt=\"\" />\n");
      out.write("                        <div class=\"hov-in\">\n");
      out.write("                            <a href=\"#\"><i class=\"fab fa-instagram\"></i></a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"item\">\n");
      out.write("                    <div class=\"ins-inner-box\">\n");
      out.write("                        <img src=\"images/instagram-img-05.jpg\" alt=\"\" />\n");
      out.write("                        <div class=\"hov-in\">\n");
      out.write("                            <a href=\"#\"><i class=\"fab fa-instagram\"></i></a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- End Instagram Feed  -->\n");
      out.write("        <!-- Start Footer  -->\n");
      out.write("        <footer>\n");
      out.write("            <div class=\"footer-main\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-lg-4 col-md-12 col-sm-12\">\n");
      out.write("                            <div class=\"footer-widget\">\n");
      out.write("                                <h4>About ThewayShop</h4>\n");
      out.write("                                <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.\n");
      out.write("                                </p>\n");
      out.write("                                <ul>\n");
      out.write("                                    <li><a href=\"#\"><i class=\"fab fa-facebook\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("                                    <li><a href=\"#\"><i class=\"fab fa-twitter\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("                                    <li><a href=\"#\"><i class=\"fab fa-linkedin\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("                                    <li><a href=\"#\"><i class=\"fab fa-google-plus\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("                                    <li><a href=\"#\"><i class=\"fa fa-rss\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("                                    <li><a href=\"#\"><i class=\"fab fa-pinterest-p\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("                                    <li><a href=\"#\"><i class=\"fab fa-whatsapp\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-lg-4 col-md-12 col-sm-12\">\n");
      out.write("                            <div class=\"footer-link\">\n");
      out.write("                                <h4>Information</h4>\n");
      out.write("                                <ul>\n");
      out.write("                                    <li><a href=\"#\">About Us</a></li>\n");
      out.write("                                    <li><a href=\"#\">Customer Service</a></li>\n");
      out.write("                                    <li><a href=\"#\">Our Sitemap</a></li>\n");
      out.write("                                    <li><a href=\"#\">Terms &amp; Conditions</a></li>\n");
      out.write("                                    <li><a href=\"#\">Privacy Policy</a></li>\n");
      out.write("                                    <li><a href=\"#\">Delivery Information</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-lg-4 col-md-12 col-sm-12\">\n");
      out.write("                            <div class=\"footer-link-contact\">\n");
      out.write("                                <h4>Contact Us</h4>\n");
      out.write("                                <ul>\n");
      out.write("                                    <li>\n");
      out.write("                                        <p><i class=\"fas fa-map-marker-alt\"></i>Address: Michael I. Days 3756 <br>Preston Street Wichita,<br> KS 67213 </p>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li>\n");
      out.write("                                        <p><i class=\"fas fa-phone-square\"></i>Phone: <a href=\"tel:+1-888705770\">+1-888 705 770</a></p>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li>\n");
      out.write("                                        <p><i class=\"fas fa-envelope\"></i>Email: <a href=\"mailto:contactinfo@gmail.com\">contactinfo@gmail.com</a></p>\n");
      out.write("                                    </li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("        <!-- End Footer  -->\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write(">\n");
      out.write("    <!-- End Footer  -->\n");
      out.write("\n");
      out.write("    <!-- Start copyright  -->\n");
      out.write("    <div class=\"footer-copyright\">\n");
      out.write("        <p class=\"footer-company\">All Rights Reserved. &copy; 2018 <a href=\"#\">ThewayShop</a> Design By :\n");
      out.write("            <a href=\"https://html.design/\">html design</a></p>\n");
      out.write("    </div>\n");
      out.write("    <!-- End copyright  -->\n");
      out.write("\n");
      out.write("    <a href=\"#\" id=\"back-to-top\" title=\"Back to top\" style=\"display: none;\">&uarr;</a>\n");
      out.write("\n");
      out.write("    <!-- ALL JS FILES -->\n");
      out.write("    <script src=\"js/jquery-3.2.1.min.js\"></script>\n");
      out.write("    <script src=\"js/popper.min.js\"></script>\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("    <!-- ALL PLUGINS -->\n");
      out.write("    <script src=\"js/jquery.superslides.min.js\"></script>\n");
      out.write("    <script src=\"js/bootstrap-select.js\"></script>\n");
      out.write("    <script src=\"js/inewsticker.js\"></script>\n");
      out.write("    <script src=\"js/bootsnav.js.\"></script>\n");
      out.write("    <script src=\"js/images-loded.min.js\"></script>\n");
      out.write("    <script src=\"js/isotope.min.js\"></script>\n");
      out.write("    <script src=\"js/owl.carousel.min.js\"></script>\n");
      out.write("    <script src=\"js/baguetteBox.min.js\"></script>\n");
      out.write("    <script src=\"js/form-validator.min.js\"></script>\n");
      out.write("    <script src=\"js/contact-form-script.js\"></script>\n");
      out.write("    <script src=\"js/custom.js\"></script>\n");
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
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                    <li><span style=\"color: #575758;\">Welcome ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user.userName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</span></li>\n");
        out.write("                                    ");
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
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                    <li><a href=\"login.jsp\">Login</a></li>\n");
        out.write("                                    ");
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
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                    <li><a href=\"LogoutServlet\">Logout</a></li>\n");
        out.write("                                    ");
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
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user!=null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                <li class=\"side-menu\"><a href=\"CartServlet\">\n");
        out.write("                                        <i class=\"fa fa-shopping-bag\"></i>\n");
        out.write("                                        <span class=\"badge\">3</span>\n");
        out.write("                                    </a></li>\n");
        out.write("                                ");
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
    _jspx_th_c_if_4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_4 = _jspx_th_c_if_4.doStartTag();
    if (_jspx_eval_c_if_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                <li class=\"side-menu\"><a href=\"login.jsp\">\n");
        out.write("                                        <i class=\"fa fa-shopping-bag\"></i>\n");
        out.write("                                        <span class=\"badge\">3</span>\n");
        out.write("                                    </a></li>\n");
        out.write("                                ");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.listCart}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("c");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                        <tr>\n");
          out.write("                                            <td class=\"thumbnail-img\">\n");
          out.write("                                                <a href=\"#\">\n");
          out.write("                                                    <img class=\"img-fluid\" src=\"images/products/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.product.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"\" />\n");
          out.write("                                                </a>\n");
          out.write("                                            </td>\n");
          out.write("                                            <td class=\"name-pr\">\n");
          out.write("                                                <a href=\"#\">\n");
          out.write("                                                    ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.product.productName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                                                </a>\n");
          out.write("                                            </td>\n");
          out.write("                                            <td class=\"price-pr\">\n");
          out.write("                                                <p>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.product.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("                                            </td>\n");
          out.write("\n");
          out.write("\n");
          out.write("                                            <td class=\"cart_quantity\">\n");
          out.write("                                                <div class=\"cart_quantity_button\">\n");
          out.write("                                                    <a class=\"cart_quantity_down\" href=\"UpdateQuantityInCart?cartId=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.cartId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&status=down&quantity=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.quantity}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"> - </a>\n");
          out.write("                                                    <input class=\"cart_quantity_input\" type=\"text\" name=\"quantity\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.quantity}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" autocomplete=\"off\" size=\"2\">\n");
          out.write("                                                    <a class=\"cart_quantity_up\" href=\"UpdateQuantityInCart?cartId=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.cartId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&status=up&quantity=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.quantity}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"> + </a>\n");
          out.write("                                                </div>\n");
          out.write("                                            </td>\n");
          out.write("\n");
          out.write("                                            <td class=\"cart-size\">\n");
          out.write("                                                <div class=\"form-group size-st\">\n");
          out.write("                                                    <select id=\"basic\" class=\"selectpicker show-tick form-control\">\n");
          out.write("                                                        <option value=\"0\">Size</option>\n");
          out.write("                                                        <option value=\"0\">S</option>\n");
          out.write("                                                        <option value=\"1\">M</option>\n");
          out.write("                                                        <option value=\"1\">L</option>\n");
          out.write("                                                        <option value=\"1\">XL</option>\n");
          out.write("                                                        <option value=\"1\">XXL</option>\n");
          out.write("                                                        <option value=\"1\">3XL</option>\n");
          out.write("                                                        <option value=\"1\">4XL</option>\n");
          out.write("                                                    </select>\n");
          out.write("                                                </div>\n");
          out.write("                                            </td>\n");
          out.write("\n");
          out.write("                                            <td class=\"total-pr\">\n");
          out.write("                                                <p>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.product.price * c.quantity}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("                                            </td>\n");
          out.write("                                            <td class=\"remove-pr\">\n");
          out.write("                                                <a href=\"DeleteInCartServlet?cartId=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.cartId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                                                    <i class=\"fas fa-times\"></i>\n");
          out.write("                                                </a>\n");
          out.write("                                            </td>\n");
          out.write("                                        </tr>\n");
          out.write("                                    ");
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

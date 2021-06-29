package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class wishList_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/header.jsp");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<!-- Basic -->\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("\n");
      out.write("    <!-- Mobile Metas -->\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\n");
      out.write("    <!-- Site Metas -->\n");
      out.write("    <title>ThewayShop - Ecommerce Bootstrap 4 HTML Template</title>\n");
      out.write("    <meta name=\"keywords\" content=\"\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("    <!-- Site Icons -->\n");
      out.write("    <link rel=\"shortcut icon\" href=\"images/favicon.ico\" type=\"image/x-icon\">\n");
      out.write("    <link rel=\"apple-touch-icon\" href=\"images/apple-touch-icon.png\">\n");
      out.write("\n");
      out.write("    <!-- Bootstrap CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("    <!-- Site CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("    <!-- Responsive CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/responsive.css\">\n");
      out.write("    <!-- Custom CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/custom.css\">\n");
      out.write("\n");
      out.write("    <!--[if lt IE 9]>\n");
      out.write("      <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\n");
      out.write("      <script src=\"https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js\"></script>\n");
      out.write("    <![endif]-->\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    ");
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
      out.write("                                <li><a href=\"HomeAdminServlet\">Admin</a></li>\n");
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
      out.write("\n");
      out.write("                                    <li>\n");
      out.write("                                        ");
      if (_jspx_meth_c_if_3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                    ");
      if (_jspx_meth_c_if_4(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            </li>\n");
      out.write("\n");
      out.write("                            <!--<li><a href=\"OrderServlet\">Checkout</a></li>-->\n");
      out.write("                            <li>\n");
      out.write("                                ");
      if (_jspx_meth_c_if_5(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                ");
      if (_jspx_meth_c_if_6(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            </li>\n");
      out.write("                            <li><a href=\"my-account.html\">My Account</a></li>\n");
      out.write("                            <li><a href=\"wishlist.html\">Wishlist</a></li>\n");
      out.write("                            <li><a href=\"shop-detail.html\">Shop Detail</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link\" href=\"service.jsp\">Our Service</a></li>\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link\" href=\"contactUs.jsp\">Contact Us</a></li>\n");
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
      if (_jspx_meth_c_if_7(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                ");
      if (_jspx_meth_c_if_8(_jspx_page_context))
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
      out.write("    <!-- Start Top Search -->\n");
      out.write("    <div class=\"top-search\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"input-group\">\n");
      out.write("                <span class=\"input-group-addon\"><i class=\"fa fa-search\"></i></span>\n");
      out.write("                <input type=\"text\" class=\"form-control\" placeholder=\"Search\">\n");
      out.write("                <span class=\"input-group-addon close-search\"><i class=\"fa fa-times\"></i></span>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- End Top Search -->\n");
      out.write("\n");
      out.write("    <!-- Start All Title Box -->\n");
      out.write("    <div class=\"all-title-box\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-12\">\n");
      out.write("                    <h2>Wishlist</h2>\n");
      out.write("                    <ul class=\"breadcrumb\">\n");
      out.write("                        <li class=\"breadcrumb-item\"><a href=\"#\">Shop</a></li>\n");
      out.write("                        <li class=\"breadcrumb-item active\">Wishlist</li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- End All Title Box -->\n");
      out.write("\n");
      out.write("    <!-- Start Wishlist  -->\n");
      out.write("    <div class=\"wishlist-box-main\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-12\">\n");
      out.write("                    <div class=\"table-main table-responsive\">\n");
      out.write("                        <table class=\"table\">\n");
      out.write("                            <thead>\n");
      out.write("                                <tr>\n");
      out.write("                                    <th>Images</th>\n");
      out.write("                                    <th>Product Name</th>\n");
      out.write("                                    <th>Unit Price </th>\n");
      out.write("                                    <th>Stock</th>\n");
      out.write("                                    <th>Add Item</th>\n");
      out.write("                                    <th>Remove</th>\n");
      out.write("                                </tr>\n");
      out.write("                            </thead>\n");
      out.write("                            <tbody>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td class=\"thumbnail-img\">\n");
      out.write("                                        <a href=\"#\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<img class=\"img-fluid\" src=\"images/img-pro-01.jpg\" alt=\"\" />\n");
      out.write("\t\t\t\t\t\t\t\t</a>\n");
      out.write("                                    </td>\n");
      out.write("                                    <td class=\"name-pr\">\n");
      out.write("                                        <a href=\"#\">\n");
      out.write("\t\t\t\t\t\t\t\t\tLorem ipsum dolor sit amet\n");
      out.write("\t\t\t\t\t\t\t\t</a>\n");
      out.write("                                    </td>\n");
      out.write("                                    <td class=\"price-pr\">\n");
      out.write("                                        <p>$ 80.0</p>\n");
      out.write("                                    </td>\n");
      out.write("                                    <td class=\"quantity-box\">In Stock</td>\n");
      out.write("                                    <td class=\"add-pr\">\n");
      out.write("                                        <a class=\"btn hvr-hover\" href=\"#\">Add to Cart</a>\n");
      out.write("                                    </td>\n");
      out.write("                                    <td class=\"remove-pr\">\n");
      out.write("                                        <a href=\"#\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"fas fa-times\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t</a>\n");
      out.write("                                    </td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td class=\"thumbnail-img\">\n");
      out.write("                                        <a href=\"#\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<img class=\"img-fluid\" src=\"images/img-pro-02.jpg\" alt=\"\" />\n");
      out.write("\t\t\t\t\t\t\t\t</a>\n");
      out.write("                                    </td>\n");
      out.write("                                    <td class=\"name-pr\">\n");
      out.write("                                        <a href=\"#\">\n");
      out.write("\t\t\t\t\t\t\t\t\tLorem ipsum dolor sit amet\n");
      out.write("\t\t\t\t\t\t\t\t</a>\n");
      out.write("                                    </td>\n");
      out.write("                                    <td class=\"price-pr\">\n");
      out.write("                                        <p>$ 60.0</p>\n");
      out.write("                                    </td>\n");
      out.write("                                    <td class=\"quantity-box\">In Stock</td>\n");
      out.write("                                    <td class=\"add-pr\">\n");
      out.write("                                        <a class=\"btn hvr-hover\" href=\"#\">Add to Cart</a>\n");
      out.write("                                    </td>\n");
      out.write("                                    <td class=\"remove-pr\">\n");
      out.write("                                        <a href=\"#\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"fas fa-times\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t</a>\n");
      out.write("                                    </td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td class=\"thumbnail-img\">\n");
      out.write("                                        <a href=\"#\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<img class=\"img-fluid\" src=\"images/img-pro-03.jpg\" alt=\"\" />\n");
      out.write("\t\t\t\t\t\t\t\t</a>\n");
      out.write("                                    </td>\n");
      out.write("                                    <td class=\"name-pr\">\n");
      out.write("                                        <a href=\"#\">\n");
      out.write("\t\t\t\t\t\t\t\t\tLorem ipsum dolor sit amet\n");
      out.write("\t\t\t\t\t\t\t\t</a>\n");
      out.write("                                    </td>\n");
      out.write("                                    <td class=\"price-pr\">\n");
      out.write("                                        <p>$ 30.0</p>\n");
      out.write("                                    </td>\n");
      out.write("                                    <td class=\"quantity-box\">In Stock</td>\n");
      out.write("                                    <td class=\"add-pr\">\n");
      out.write("                                        <a class=\"btn hvr-hover\" href=\"#\">Add to Cart</a>\n");
      out.write("                                    </td>\n");
      out.write("                                    <td class=\"remove-pr\">\n");
      out.write("                                        <a href=\"#\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"fas fa-times\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t</a>\n");
      out.write("                                    </td>\n");
      out.write("                                </tr>\n");
      out.write("                            </tbody>\n");
      out.write("                        </table>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- End Wishlist -->\n");
      out.write("\n");
      out.write("    <!-- Start Instagram Feed  -->\n");
      out.write("    <div class=\"instagram-box\">\n");
      out.write("        <div class=\"main-instagram owl-carousel owl-theme\">\n");
      out.write("            <div class=\"item\">\n");
      out.write("                <div class=\"ins-inner-box\">\n");
      out.write("                    <img src=\"images/instagram-img-01.jpg\" alt=\"\" />\n");
      out.write("                    <div class=\"hov-in\">\n");
      out.write("                        <a href=\"#\"><i class=\"fab fa-instagram\"></i></a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"item\">\n");
      out.write("                <div class=\"ins-inner-box\">\n");
      out.write("                    <img src=\"images/instagram-img-02.jpg\" alt=\"\" />\n");
      out.write("                    <div class=\"hov-in\">\n");
      out.write("                        <a href=\"#\"><i class=\"fab fa-instagram\"></i></a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"item\">\n");
      out.write("                <div class=\"ins-inner-box\">\n");
      out.write("                    <img src=\"images/instagram-img-03.jpg\" alt=\"\" />\n");
      out.write("                    <div class=\"hov-in\">\n");
      out.write("                        <a href=\"#\"><i class=\"fab fa-instagram\"></i></a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"item\">\n");
      out.write("                <div class=\"ins-inner-box\">\n");
      out.write("                    <img src=\"images/instagram-img-04.jpg\" alt=\"\" />\n");
      out.write("                    <div class=\"hov-in\">\n");
      out.write("                        <a href=\"#\"><i class=\"fab fa-instagram\"></i></a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"item\">\n");
      out.write("                <div class=\"ins-inner-box\">\n");
      out.write("                    <img src=\"images/instagram-img-05.jpg\" alt=\"\" />\n");
      out.write("                    <div class=\"hov-in\">\n");
      out.write("                        <a href=\"#\"><i class=\"fab fa-instagram\"></i></a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"item\">\n");
      out.write("                <div class=\"ins-inner-box\">\n");
      out.write("                    <img src=\"images/instagram-img-06.jpg\" alt=\"\" />\n");
      out.write("                    <div class=\"hov-in\">\n");
      out.write("                        <a href=\"#\"><i class=\"fab fa-instagram\"></i></a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"item\">\n");
      out.write("                <div class=\"ins-inner-box\">\n");
      out.write("                    <img src=\"images/instagram-img-07.jpg\" alt=\"\" />\n");
      out.write("                    <div class=\"hov-in\">\n");
      out.write("                        <a href=\"#\"><i class=\"fab fa-instagram\"></i></a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"item\">\n");
      out.write("                <div class=\"ins-inner-box\">\n");
      out.write("                    <img src=\"images/instagram-img-08.jpg\" alt=\"\" />\n");
      out.write("                    <div class=\"hov-in\">\n");
      out.write("                        <a href=\"#\"><i class=\"fab fa-instagram\"></i></a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"item\">\n");
      out.write("                <div class=\"ins-inner-box\">\n");
      out.write("                    <img src=\"images/instagram-img-09.jpg\" alt=\"\" />\n");
      out.write("                    <div class=\"hov-in\">\n");
      out.write("                        <a href=\"#\"><i class=\"fab fa-instagram\"></i></a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"item\">\n");
      out.write("                <div class=\"ins-inner-box\">\n");
      out.write("                    <img src=\"images/instagram-img-05.jpg\" alt=\"\" />\n");
      out.write("                    <div class=\"hov-in\">\n");
      out.write("                        <a href=\"#\"><i class=\"fab fa-instagram\"></i></a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- End Instagram Feed  -->\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- Start Footer  -->\n");
      out.write("    <footer>\n");
      out.write("        <div class=\"footer-main\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-4 col-md-12 col-sm-12\">\n");
      out.write("                        <div class=\"footer-widget\">\n");
      out.write("                            <h4>About ThewayShop</h4>\n");
      out.write("                            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.\n");
      out.write("                                </p>\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"#\"><i class=\"fab fa-facebook\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("                                <li><a href=\"#\"><i class=\"fab fa-twitter\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("                                <li><a href=\"#\"><i class=\"fab fa-linkedin\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("                                <li><a href=\"#\"><i class=\"fab fa-google-plus\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("                                <li><a href=\"#\"><i class=\"fa fa-rss\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("                                <li><a href=\"#\"><i class=\"fab fa-pinterest-p\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("                                <li><a href=\"#\"><i class=\"fab fa-whatsapp\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-4 col-md-12 col-sm-12\">\n");
      out.write("                        <div class=\"footer-link\">\n");
      out.write("                            <h4>Information</h4>\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"#\">About Us</a></li>\n");
      out.write("                                <li><a href=\"#\">Customer Service</a></li>\n");
      out.write("                                <li><a href=\"#\">Our Sitemap</a></li>\n");
      out.write("                                <li><a href=\"#\">Terms &amp; Conditions</a></li>\n");
      out.write("                                <li><a href=\"#\">Privacy Policy</a></li>\n");
      out.write("                                <li><a href=\"#\">Delivery Information</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-4 col-md-12 col-sm-12\">\n");
      out.write("                        <div class=\"footer-link-contact\">\n");
      out.write("                            <h4>Contact Us</h4>\n");
      out.write("                            <ul>\n");
      out.write("                                <li>\n");
      out.write("                                    <p><i class=\"fas fa-map-marker-alt\"></i>Address: Michael I. Days 3756 <br>Preston Street Wichita,<br> KS 67213 </p>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <p><i class=\"fas fa-phone-square\"></i>Phone: <a href=\"tel:+1-888705770\">+1-888 705 770</a></p>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <p><i class=\"fas fa-envelope\"></i>Email: <a href=\"mailto:contactinfo@gmail.com\">contactinfo@gmail.com</a></p>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </footer>\n");
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
        out.write("                                        <li><a href=\"CartServlet\">Cart</a></li>\n");
        out.write("\n");
        out.write("                                    ");
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
        out.write("                                        <a href=\"login.jsp\" class=\"auth-form-subtitle\">Cart</a>\n");
        out.write("                                    ");
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

  private boolean _jspx_meth_c_if_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_5 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_5.setPageContext(_jspx_page_context);
    _jspx_th_c_if_5.setParent(null);
    _jspx_th_c_if_5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user!=null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_5 = _jspx_th_c_if_5.doStartTag();
    if (_jspx_eval_c_if_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                    <a class=\"cart\" href=\"OrderServlet?productId=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.productId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">Order</a>\n");
        out.write("                                ");
        int evalDoAfterBody = _jspx_th_c_if_5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_5);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_5);
    return false;
  }

  private boolean _jspx_meth_c_if_6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_6 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_6.setPageContext(_jspx_page_context);
    _jspx_th_c_if_6.setParent(null);
    _jspx_th_c_if_6.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_6 = _jspx_th_c_if_6.doStartTag();
    if (_jspx_eval_c_if_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                    <a href=\"login.jsp\" class=\"auth-form-subtitle\">Order</a>\n");
        out.write("                                ");
        int evalDoAfterBody = _jspx_th_c_if_6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_6);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_6);
    return false;
  }

  private boolean _jspx_meth_c_if_7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_7 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_7.setPageContext(_jspx_page_context);
    _jspx_th_c_if_7.setParent(null);
    _jspx_th_c_if_7.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user!=null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_7 = _jspx_th_c_if_7.doStartTag();
    if (_jspx_eval_c_if_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                <li class=\"side-menu\"><a href=\"CartServlet\">\n");
        out.write("                                        <i class=\"fa fa-shopping-bag\"></i>\n");
        out.write("                                        <span class=\"badge\">3</span>\n");
        out.write("                                    </a></li>\n");
        out.write("                                ");
        int evalDoAfterBody = _jspx_th_c_if_7.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_7);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_7);
    return false;
  }

  private boolean _jspx_meth_c_if_8(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_8 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_8.setPageContext(_jspx_page_context);
    _jspx_th_c_if_8.setParent(null);
    _jspx_th_c_if_8.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_8 = _jspx_th_c_if_8.doStartTag();
    if (_jspx_eval_c_if_8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                <li class=\"side-menu\"><a href=\"login.jsp\">\n");
        out.write("                                        <i class=\"fa fa-shopping-bag\"></i>\n");
        out.write("                                        <span class=\"badge\">3</span>\n");
        out.write("                                    </a></li>\n");
        out.write("                                ");
        int evalDoAfterBody = _jspx_th_c_if_8.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_8);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_8);
    return false;
  }
}

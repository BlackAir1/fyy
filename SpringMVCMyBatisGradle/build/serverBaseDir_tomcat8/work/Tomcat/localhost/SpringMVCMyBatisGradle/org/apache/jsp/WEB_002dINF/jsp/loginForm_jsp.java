/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.23
 * Generated at: 2017-07-24 07:43:00 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class loginForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("<!-- /.website title -->\r\n");
      out.write("<title>Backyard login</title>\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no\">\r\n");
      out.write("\r\n");
      out.write("<!-- CSS Files -->\r\n");
      out.write("<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" media=\"screen\">\r\n");
      out.write("<link href=\"css/font-awesome.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"fonts/icon-7-stroke/css/pe-icon-7-stroke.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"css/animate.css\" rel=\"stylesheet\" media=\"screen\">\r\n");
      out.write("<link href=\"css/owl.theme.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"css/owl.carousel.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<!-- Colors -->\r\n");
      out.write("<link href=\"css/css-index.css\" rel=\"stylesheet\" media=\"screen\">\r\n");
      out.write("<!-- <link href=\"css/css-index-green.css\" rel=\"stylesheet\" media=\"screen\"> -->\r\n");
      out.write("<!-- <link href=\"css/css-index-purple.css\" rel=\"stylesheet\" media=\"screen\"> -->\r\n");
      out.write("<!-- <link href=\"css/css-index-red.css\" rel=\"stylesheet\" media=\"screen\"> -->\r\n");
      out.write("<!-- <link href=\"css/css-index-orange.css\" rel=\"stylesheet\" media=\"screen\"> -->\r\n");
      out.write("<!-- <link href=\"css/css-index-yellow.css\" rel=\"stylesheet\" media=\"screen\"> -->\r\n");
      out.write("\r\n");
      out.write("<!-- Google Fonts -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"fyy3\" />\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("  \r\n");
      out.write("<body data-spy=\"scroll\" data-target=\"#navbar-scroll\">\r\n");
      out.write("\r\n");
      out.write("<!-- /.preloader -->\r\n");
      out.write("<div id=\"preloader\"></div>\r\n");
      out.write("<div id=\"top\"></div>\r\n");
      out.write("\r\n");
      out.write("<!-- /.parallax full screen background image -->\r\n");
      out.write("<div class=\"fullscreen landing parallax\" style=\"background-image:url('images/bg.jpg');\" data-img-width=\"2000\" data-img-height=\"1333\" data-diff=\"100\">\r\n");
      out.write("\t\r\n");
      out.write("\t<div class=\"overlay\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"col-md-7\">\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<!-- /.logo -->\r\n");
      out.write("\t\t\t\t\t<div class=\"logo wow fadeInDown\"> <a href=\"\"><img src=\"images/logo.png\" alt=\"logo\"></a></div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<!-- /.main title -->\r\n");
      out.write("\t\t\t\t\t<div>&nbsp;</div>\r\n");
      out.write("\t\t\t\t    <div>&nbsp;</div>\r\n");
      out.write("\t\t\t\t    <div>&nbsp;</div>\r\n");
      out.write("\t\t\t\t \t\t<h1 class=\"wow fadeInLeft\">\r\n");
      out.write("\t\t\t\t\t\tBackyard Bookstore\r\n");
      out.write("\t\t\t\t\t\t</h1>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<!-- /.header paragraph -->\r\n");
      out.write("\t\t\t\t\t\t\t  \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div> \r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<!-- /.signup form -->\r\n");
      out.write("\t\t\t\t<div class=\"col-md-5\">\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div class=\"signup-header wow fadeInUp\">\r\n");
      out.write("\t\t\t\t\t\t<h2 class=\"form-title text-center\">Login</h2>\r\n");
      out.write("\t\t\t\t\t\t<h4 class=\"form-title text-center\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.message }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</h4>\r\n");
      out.write("\t\t\t\t        <h4 class=\"form-title text-center\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.success }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</h4>\r\n");
      out.write("\t\t\t\t\t\t<form class=\"form-header\" action=\"customerLogin\" role=\"form\" method=\"POST\" id=\"login_form\" name=\"form1\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"hidden\" name=\"u\" value=\"503bdae81fde8612ff4944435\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"hidden\" name=\"id\" value=\"bfdba52708\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input class=\"form-control input-lg\" name=\"name\" id=\"name\" type=\"text\" placeholder=\"Your username\" required>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input class=\"form-control input-lg\" name=\"password\" id=\"p\" type=\"password\" placeholder=\"Your password\" required>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group last\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"submit\" class=\"btn btn-warning btn-block btn-lg\" value=\"µÇÂ¼\">\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t <div > <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/registerForm\" style=\"font-size:15px\" >register</a></div>\r\n");
      out.write("\t\t\t\t\t\t\t <div > <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/findPassword \" style=\"font-size:15px\">findPassword</a></div>\r\n");
      out.write("                             <div > <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/userLoginForm\" style=\"font-size:15px\">manager login</a></div>\r\n");
      out.write("         <div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t</div>\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div> \r\n");
      out.write("\t</div> \r\n");
      out.write("</div>\r\n");
      out.write(" \r\n");
      out.write("\t\r\n");
      out.write("\t<!-- /.javascript files -->\r\n");
      out.write("    <script src=\"js/jquery.js\"></script>\r\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("    <script src=\"js/custom.js\"></script>\r\n");
      out.write("    <script src=\"js/jquery.sticky.js\"></script>\r\n");
      out.write("\t<script src=\"js/wow.min.js\"></script>\r\n");
      out.write("\t<script src=\"js/owl.carousel.min.js\"></script>\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\tnew WOW().init();\r\n");
      out.write("\t</script>\r\n");
      out.write("  </body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

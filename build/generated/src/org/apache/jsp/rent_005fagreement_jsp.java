package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class rent_005fagreement_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<style>\n");
      out.write("body, html {\n");
      out.write("  height: 100%;\n");
      out.write("  margin: 0;\n");
      out.write("  font-family: Arial, Helvetica, sans-serif;\n");
      out.write("}\n");
      out.write("\n");
      out.write("* {\n");
      out.write("  box-sizing: border-box;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".bg-image {\n");
      out.write("  /* Full height */\n");
      out.write("  height: 50%; \n");
      out.write("  \n");
      out.write("  /* Center and scale the image nicely */\n");
      out.write("  background-position: center;\n");
      out.write("  background-repeat: no-repeat;\n");
      out.write("  background-size: cover;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Images used */\n");
      out.write(".img1 { background-image: url(\"img/v1.jpg\"); }\n");
      out.write(".img2 { background-image: url(\"img/v3.jpg\"); }\n");
      out.write(".img3 { background-image: url(\"img/v2.jpg\"); }\n");
      out.write(".img4 { background-image: url(\"img/v4.jpg\"); }\n");
      out.write(".img5 { background-image: url(\"img/v6.jpg\"); }\n");
      out.write(".img6 { background-image: url(\"img/v5.jpg\"); }\n");
      out.write("\n");
      out.write("/* Position text in the middle of the page/image */\n");
      out.write(".bg-text {\n");
      out.write("  background-color: rgb(0,0,0); /* Fallback color */\n");
      out.write("  background-color: rgba(0,0,0, 0.4); /* Black w/opacity/see-through */\n");
      out.write("  color: white;\n");
      out.write("  font-weight: bold;\n");
      out.write("  font-size: 80px;\n");
      out.write("  border: 10px solid #f1f1f1;\n");
      out.write("  position: fixed;\n");
      out.write("  top: 50%;\n");
      out.write("  left: 50%;\n");
      out.write("  transform: translate(-50%, -50%);\n");
      out.write("  z-index: 2;\n");
      out.write("  width: 80%;\n");
      out.write("  padding: 20px;\n");
      out.write("  text-align: center;\n");
      out.write("}\n");
      out.write(".bitt {\n");
      out.write("  background-color: rgb(0,0,0); /* Fallback color */\n");
      out.write("  background-color: rgba(0,0,0, 0.4); /* Black w/opacity/see-through */\n");
      out.write("  color: white;\n");
      out.write("  font-weight: bold;\n");
      out.write("  font-size: 80px;\n");
      out.write("  border: 10px solid #f1f1f1;\n");
      out.write("  position: fixed;\n");
      out.write("  transform: translate(-50%, -50%);\n");
      out.write("  top: 80%;\n");
      out.write("  left: 48%;\n");
      out.write("  z-index: 2;\n");
      out.write("  width: 350px;\n");
      out.write("  padding: 20px;\n");
      out.write("  text-align: center;\n");
      out.write("}\n");
      out.write("input[type=submit]\n");
      out.write("{\n");
      out.write("    width: 300px;\n");
      out.write("    height: 100px;\n");
      out.write("    font-size: 30px;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<div class=\"bg-image img1\"></div>\n");
      out.write("<div class=\"bg-image img2\"></div>\n");
      out.write("<div class=\"bg-image img3\"></div>\n");
      out.write("<div class=\"bg-image img4\"></div>\n");
      out.write("<div class=\"bg-image img5\"></div>\n");
      out.write("<div class=\"bg-image img6\"></div>\n");
      out.write("\n");
      out.write("<div class=\"bg-text\">Congratulations!!Your application have been selected.</div><br>\n");
      out.write("<div class=\"bitt\"><input type=\"submit\" value=\"Logout\"></div>\n");
      out.write("</body>\n");
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

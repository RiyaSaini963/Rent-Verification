package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class resi_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link href=\"style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1 align=\"center\"> RESIDENT APPLICATION FORM</h1>\n");
      out.write("        <hr>\n");
      out.write("        <h3 style=\"margin-left: 850px\">PERSONAL DETAILS</h3>\n");
      out.write("        \n");
      out.write("         \n");
      out.write("        <form method=\"post\" action=\"resi\">\n");
      out.write("            <table align=\"center\">\n");
      out.write("                <tr><td style=\"width: 250\"> NAME</td><td><input type=\"text\" name=\"name\"></td></tr>\n");
      out.write("                <tr><td style=\"width: 250\">GENDER</td><td><input type=\"radio\" name=\"gender\" value=\"male\">MALE<input type=\"radio\" value=\"female\" name=\"gender\">FEMALE</td></tr>\n");
      out.write("                <tr><td style=\"width: 250\">DOB</td><td><input type=\"date\" name=\"dob\" placeholder=\"yyyy-mm-dd\"></td></tr>\n");
      out.write("                <tr><td style=\"width: 250\">MOBILE NUMBER</td><td><input type=\"text\" name=\"mob_no\" placeholder=\"10-digits\" minlength=\"10\" maxlength=\"10\"></td></tr>\n");
      out.write("                <tr> <td style=\"width: 250\">AADHAAR NUMBER</td><td><input type=\"text\" name=\"aadhaar\" placeholder=\"12-digits\" minlength=\"12\" maxlength=\"12\"></td></tr>\n");
      out.write("                <tr><td style=\"width: 250\">OCCUPATION</td><td><input type=\"text\" name=\"occupation\"></td></tr>\n");
      out.write("            </table>\n");
      out.write("            <br>\n");
      out.write("            <center><input class=\"sub sub1\" type=\"submit\" value=\"NEXT\"></center>\n");
      out.write("          </form>\n");
      out.write("\n");
      out.write("          \n");
      out.write("      \n");
      out.write("\n");
      out.write("       \n");
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

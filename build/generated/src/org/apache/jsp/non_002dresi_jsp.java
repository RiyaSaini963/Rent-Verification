package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class non_002dresi_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <h1 align=\"center\"><u>NON RESIDENT APPLICATION FORM</u></h1><p>\n");
      out.write("        <hr>\n");
      out.write("        <h3 style=\"margin-left: 820px\">PERSONAL DETAILS</h3>\n");
      out.write("        <form method=\"post\" action=\"check\">\n");
      out.write("            <table align=\"center\">\n");
      out.write("                <tr>\n");
      out.write("                <td>NAME </td><td></td><td><input type=\"text\" name=\"name\"><p></td>\n");
      out.write("            </tr>\n");
      out.write("             <tr>\n");
      out.write("                <td>NATIONALITY </td><td></td><td><input type=\"text\" name=\"nationality\"><p></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>GENDER </td><td></td><td><input type=\"radio\" name=\"rad\">MALE  <input type=\"radio\" name=\"rad\">FEMALE<p></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>D.O.B </td><td></td><td><input type=\"date\" name=\"dob\"><p></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>PASSPORT NUMBER </td><td></td><td><input type=\"text\" name=\"p_no\" minlength=\"9\" maxlength=\"9\"><p></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>DATE OF EXPIRY </td><td></td> <td> <input type=\"date\" name=\"p_date\"> </td><p>\n");
      out.write("                       \n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>TYPE OF VISA </td><td></td><td> <input type=\"text\" name=\"visa\"><p>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>ISSUE NUMBER </td><td></td><td><input type=\"text\" name=\"issue_no\" min=\"8\" max=\"8\"><p></td>\n");
      out.write("            </tr> \n");
      out.write("               <tr>\n");
      out.write("                   <td>DATE OF EXPIRY </td><td></td><td> <input type=\"date\" name=\"ex\"> </td><p>\n");
      out.write("                       \n");
      out.write("            </tr>\n");
      out.write("               <tr><td> MOBILE NUMBER </td><td></td><td> <input type=\"tel\" name=\"mob_no\" minlength=\"10\" maxlength=\"10\" placeholder=\"10 digits\"><p></td></tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>OCCUPATION </td><td></td><td><input type=\"text\" name=\"occupation\"><p></td>\n");
      out.write("            </tr>\n");
      out.write("            </table>\n");
      out.write("            <hr>\n");
      out.write("            <h3 style=\"margin-left: 820px\">RESIDENTIAL DETAILS </h3>\n");
      out.write("            <table align=\"center\">\n");
      out.write("            <tr>\n");
      out.write("                <td>PERMANENT ADDRESS </td><td></td><td><input type=\"text\" name=\"p_add\"><p></td>\n");
      out.write("            </tr>\n");
      out.write("             <tr>\n");
      out.write("                <td>CURRENT ADDRESS </td><td></td><td><input type=\"text\" name=\"c_add\"><p></td>\n");
      out.write("            </tr>\n");
      out.write("            </table>\n");
      out.write("            <br>\n");
      out.write("            <center><input type=\"submit\" value=\"NEXT\"></center>\n");
      out.write("        </form>\n");
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

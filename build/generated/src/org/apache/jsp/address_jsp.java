package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class address_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Apartment and landlord </title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\">\n");
      out.write("        <script> function fun()\n");
      out.write("            { var x= document.getElementById(\"DIV\");\n");
      out.write("                if(x.style.display === \"none\")\n");
      out.write("                { x.style.display = \"block\";\n");
      out.write("                }\n");
      out.write("                else{ x.style.display =\"none\";\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("           </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <h1 align=\"center\"> APARTMENT AND LANDLORD </h1> <br><br><br><br>\n");
      out.write("\n");
      out.write("        \n");
      out.write("        <form class=\"formstyle\" method=\"post\" action=\"add\">\n");
      out.write("        <table align=\"center\">\n");
      out.write("            <tr>\n");
      out.write("                <td> PERMANENT ADDRESS</td><td> <input type=\"text\" name=\"add1\"><p></td>\n");
      out.write("            \n");
      out.write("            <tr>\n");
      out.write("                <td>STATE</td><td> <input type=\"text\" name=\"state\"><p></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("                    PIN CODE </td><td> <input type=\"text\" name=\"zip\"><p></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("                    COUNTRY <td><select>\n");
      out.write("        <option>INDIA</option>\n");
      out.write("        <option>U.S.A</option>\n");
      out.write("                </td>\n");
      out.write("                    \n");
      out.write("            </select><p></p></tr>\n");
      out.write("            </table>\n");
      out.write("            <br>\n");
      out.write("            <center><font color=\"green\"><b> PERMANENT ADDRESS SAME AS CURRENT ADDRESS </b><input type=\"radio\" name=\"rad\" onclick=\"fun()\">YES \n");
      out.write("             <input type=\"radio\" name=\"rad\">NO\n");
      out.write("             \n");
      out.write("             <div id=\"DIV\">\n");
      out.write("                 <table align=\"center\">\n");
      out.write("            <tr>\n");
      out.write("                <td> ADDRESS  </td><td> <input type=\"text\" name=\"ca\"><p></td>\n");
      out.write("                        \n");
      out.write("            <tr>\n");
      out.write("                <td>STATE</td><td> <input type=\"text\" name=\"cs\"><p></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("                    PIN CODE </td><td> <input type=\"text\" name=\"cz\"><p></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("                    COUNTRY <td><select>\n");
      out.write("        <option>INDIA</option>\n");
      out.write("        <option>U.S.A</option>\n");
      out.write("                </td>\n");
      out.write("                    \n");
      out.write("            </select><p></p></tr>\n");
      out.write("            </table>\n");
      out.write("             </div>\n");
      out.write("             <br>\n");
      out.write("        <button class=\"sub sub1\" name=\"submit\" value=\"SUBMIT\">SUBMIT</button>\n");
      out.write("        <input type=\"hidden\" id=\"textbox\" name=\"phone\">\n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("  \n");
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
}

package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class tenant_005fdetails_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("<style>\n");
      out.write("body, html {\n");
      out.write("  height: 100%;\n");
      out.write("  font-family: Arial, Helvetica, sans-serif;\n");
      out.write("  font-size: 30px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("* {\n");
      out.write("  box-sizing: border-box;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".row {\n");
      out.write("  display: -ms-flexbox; /* IE10 */\n");
      out.write("  display: flex;\n");
      out.write("  -ms-flex-wrap: wrap; /* IE10 */\n");
      out.write("  flex-wrap: wrap;\n");
      out.write("  margin: 0 -16px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".col-25 {\n");
      out.write("  -ms-flex: 25%; /* IE10 */\n");
      out.write("  flex: 25%;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".col-50 {\n");
      out.write("  -ms-flex: 50%; /* IE10 */\n");
      out.write("  flex: 50%;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".col-75 {\n");
      out.write("  -ms-flex: 75%; /* IE10 */\n");
      out.write("  flex: 75%;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".col-25,\n");
      out.write(".col-50,\n");
      out.write(".col-75 {\n");
      out.write("  padding: 0 16px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".container {\n");
      out.write("  background-color: #f2f2f2;\n");
      out.write("  padding: 5px 20px 15px 20px;\n");
      out.write("  border: 1px solid lightgrey;\n");
      out.write("  border-radius: 3px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=text] {\n");
      out.write("  width: 100%;\n");
      out.write("  margin-bottom: 20px;\n");
      out.write("  padding: 12px;\n");
      out.write("  border: 1px solid #ccc;\n");
      out.write("  border-radius: 3px;\n");
      out.write("  font-size: 30px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("label {\n");
      out.write("  margin-bottom: 10px;\n");
      out.write("  display: block;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".icon-container {\n");
      out.write("  margin-bottom: 20px;\n");
      out.write("  padding: 7px 0;\n");
      out.write("  font-size: 24px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".btn {\n");
      out.write("  background-color: #4CAF50;\n");
      out.write("  color: white;\n");
      out.write("  padding: 12px;\n");
      out.write("  margin: 10px 0;\n");
      out.write("  border: none;\n");
      out.write("  width: 100%;\n");
      out.write("  border-radius: 3px;\n");
      out.write("  cursor: pointer;\n");
      out.write("  font-size: 17px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".btn:hover {\n");
      out.write("  background-color: #45a049;\n");
      out.write("}\n");
      out.write("\n");
      out.write("a {\n");
      out.write("  color: #2196F3;\n");
      out.write("}\n");
      out.write("\n");
      out.write("hr {\n");
      out.write("  border: 1px solid lightgrey;\n");
      out.write("}\n");
      out.write("\n");
      out.write("span.price {\n");
      out.write("  float: right;\n");
      out.write("  color: grey;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Responsive layout - when the screen is less than 800px wide, make the two columns stack on top of each other instead of next to each other (also change the direction - make the \"cart\" column go on top) */\n");
      out.write("@media (max-width: 800px) {\n");
      out.write("  .row {\n");
      out.write("    flex-direction: column-reverse;\n");
      out.write("  }\n");
      out.write("  .col-25 {\n");
      out.write("    margin-bottom: 20px;\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<h2>Tenant Details</h2>\n");
      out.write("<div class=\"row\">\n");
      out.write("  <div class=\"col-75\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <form method=\"post\" action=\"tdetails\">\n");
      out.write("      \n");
      out.write("        <div class=\"row\">\n");
      out.write("          <div class=\"col-50\">\n");
      out.write("            <label for=\"fname\"> Full Name</label>\n");
      out.write("            <input type=\"text\" id=\"fname\" name=\"name\" disabled=\"\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${n}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("            \n");
      out.write("            <label for=\"email\"> Mobile Number</label>\n");
      out.write("            <input type=\"text\" id=\"email\" name=\"phn\" disabled=\"\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ph}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("            \n");
      out.write("            <label for=\"adr\"> Occupation</label>\n");
      out.write("            <input type=\"text\" id=\"adr\" name=\"occ\" disabled=\"\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${occ}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("            \n");
      out.write("            <label for=\"city\"> Date Of Birth</label>\n");
      out.write("            <input type=\"text\" id=\"city\" name=\"dob\" disabled=\"\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dob}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("            \n");
      out.write("            <label for=\"city\">Identity Verification Status</label>\n");
      out.write("            <input type=\"text\" id=\"city\" name=\"iv\" disabled=\"\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${is}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("\n");
      out.write("            <label for=\"city\"> Police Verification Status</label>\n");
      out.write("            <input type=\"text\" id=\"city\" name=\"ip\" disabled=\"\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pv}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("            \n");
      out.write("            <label for=\"city\"> Rent amount</label>\n");
      out.write("            <input type=\"text\" id=\"city\" name=\"amt\">\n");
      out.write("               \n");
      out.write("\n");
      out.write("        </div>          \n");
      out.write("        </div>\n");
      out.write("        <label>\n");
      out.write("            <input type=\"checkbox\" checked=\"checked\" name=\"per\">I hereby declare that I have checked all the details and \n");
      out.write("            allow tenant to rent-out my apartment if details furnished by him/her found true.Any discrepancy found will \n");
      out.write("            be reported. \n");
      out.write("        </label>\n");
      out.write("        <input type=\"submit\" value=\"Continue to checkout\" class=\"btn\">\n");
      out.write("        <input type=\"hidden\" id=\"textbox\" name=\"id\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("        <input type=\"hidden\" id=\"textbox\" name=\"ph\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ph}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("\n");
      out.write("      </form>\n");
      out.write("        \n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  \n");
      out.write("</div>\n");
      out.write("\n");
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

package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Contact_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<div class=\"hs\">\n");
      out.write("    <center>\n");
      out.write("        \n");
      out.write("        <span style=\"font-size: 35px;color: brown;font-style: normal;\">Contact Us</span>\n");
      out.write("        <form>\n");
      out.write("            <table width=\"800\" border=\"1\" cellpadding=\"10\" bgcolor=\"lightpink\">\n");
      out.write("                <tr><td width=\"400\">Name</td><td><input type=\"text\" name=\"name\"></td></tr>\n");
      out.write("                <tr><td width=\"400\">Email</td><td><input type=\"password\" name=\"mail\"></td></tr>\n");
      out.write("                <tr><td width=\"400\">Phone Number</td><td><input type=\"text\" name=\"ph\"></td></tr>\n");
      out.write("<tr><td width=\"400\">Massage</td><td><input type=\"text\" name=\"msg\"></td></tr>\n");
      out.write("<tr><td width=\"400\"></td><td><input type=\"submit\" name=\"Submit\"></td></tr>\n");
      out.write("            </table>\n");
      out.write("        </form>\n");
      out.write("</center>\n");
      out.write("</div>\n");
      out.write("               \n");
      out.write("               ");
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

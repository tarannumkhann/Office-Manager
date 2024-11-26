package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import DB.DBConnect;

public final class EditProfile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/AdminHeader.jsp");
  }

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

      out.write('\n');
      out.write('\n');
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("<title>Virtual Office</title>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/coin-slider.css\" />\n");
      out.write("<script type=\"text/javascript\" src=\"js/cufon-yui.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/droid_sans_400-droid_sans_700.font.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery-1.4.2.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/script.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/coin-slider.min.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div class=\"main\">\n");
      out.write("  <div class=\"header\">\n");
      out.write("    <div class=\"header_resize\">\n");
      out.write("     \n");
      out.write("      <div class=\"logo\">\n");
      out.write("        <h1><a href=\"index.html\"><span>Office</span>Manager</a>(<i>Admin<i>)</h1>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"clr\"></div>\n");
      out.write("      <div class=\"menu_nav\" style=\"width: 1200px;\">\n");
      out.write("        <ul>\n");
      out.write("          <li class=\"active\"><a href=\"AddEmployee.jsp\"><span>Add Employee</span></a></li>\n");
      out.write("          <li><a href=\"SearchEmployee.jsp\"><span>Search Employee</span></a></li>\n");
      out.write("          <li><a href=\"EmployeeList.jsp\"><span>Employee List  </span></a></li>\n");
      out.write("          <li><a href=\"AttendanceReport.jsp\"><span>Attendance Report</span></a></li>\n");
      out.write("          <li><a href=\"ChangePassword.jsp\"><span>Change Password</span></a></li>\n");
      out.write("          <li><a href=\"Logout\"><span>Logout</span></a></li>\n");
      out.write("        </ul>\n");
      out.write("      </div> </div>\n");
      out.write("      </div>\n");
      out.write("      </div> \n");
      out.write("     ");
      out.write("\n");
      out.write("<div>\n");
      out.write("    <center>\n");
      out.write("        <br>\n");
      out.write("        <span style=\"font-size: 30px;color:brown;font-style: normal;\">Edit Profile</span>\n");
      out.write("        <br><br>\n");
      out.write("        ");

            String user = session.getAttribute("user").toString();
            DBConnect db = new DBConnect();
            if (request.getParameter("code") == null) {
                db.pstmt = db.con.prepareStatement("select * from emp_mstr where ecode=?");
                db.pstmt.setString(1, user);
                db.rst = db.pstmt.executeQuery();
                if (db.rst.next()) {
                    out.println("<form action=#>");
                    out.println("<table width='600' border='1' cellpadding='10'>");
                    out.println("<tr><td width='400'>Employee Code(User)</td><td><input type='number' name='code' value=" + db.rst.getString(1) + "></td></tr>");

                    out.println("<tr><td width='400'>Employee Name</td><td><input type='text' name='name'  value=" + db.rst.getString(2) + "></td></tr>");
                    out.println("<tr><td width='400'>Date of Birth</td><td><input type='date' name='dob'  value=" + db.rst.getString(3) + "></td></tr>");
                    out.println("<tr><td width='400'>Gender</td><td><input type='text' name='gen' value=" + db.rst.getString(4) + "></td></tr>");
                    out.println("<tr><td width='400'>Post</td><td><input type='text' name='post'  value=" + db.rst.getString(5) + "></td></tr>");
                    out.println("<tr><td width='400'>Address</td><td><input type='text' name='addr'  value=" + db.rst.getString(6) + "></td></tr>");
                    out.println("<tr><td width='400'>City</td><td><input type='text' name='city'  value=" + db.rst.getString(7) + "></td></tr>");
                    out.println(" <tr><td width='400'>Contact</td><td><input type='number' name='cont'  value=" + db.rst.getString(8) + "></td></tr>");
                    out.println("<tr><td width='400'>Email</td><td><input type='email' name='mail'  value=" + db.rst.getString(9) + "></td></tr>");
                    out.println("<tr><td width='400'>Id Name</td><td><input type='text' name='idname'  value=" + db.rst.getString(10) + "></td></tr>");
                    out.println("<tr><td width='400'>Id Number</td><td><input type='number' name='idno'  value=" + db.rst.getString(11) + "></td></tr>");
                    out.println("<tr><td width='400'><input type='submit' value='Update'></td><td><input type='reset' value='Reset'></td></tr>");

                    out.println("</table> </form>");

                } else {
                    response.sendRedirect("EmployeeHome.jsp?msg=Data Not Found");
                }
            } else {
                String code = request.getParameter("code");
                String name = request.getParameter("name");
                String dob = request.getParameter("dob");
                String post = request.getParameter("post");
                String addr = request.getParameter("addr");
                String city = request.getParameter("city");
                String cont = request.getParameter("cont");
                String mail = request.getParameter("mail");
                String idname = request.getParameter("idname");
                String idno = request.getParameter("idno");
                String gen = request.getParameter("gen");

                db.pstmt = db.con.prepareStatement("UPDATE emp_mstr SET ename=?,edob=?,egender=?,epost=?,eaddr=?,ecity=?,econt=?,email=?,idname=?,idno=? WHERE ecode=?");
                db.pstmt.setString(1, name);
                db.pstmt.setString(2, dob);
                db.pstmt.setString(3, gen);
                db.pstmt.setString(4, post);
                db.pstmt.setString(5, addr);
                db.pstmt.setString(6, city);
                db.pstmt.setString(7, cont);
                db.pstmt.setString(8, mail);
                db.pstmt.setString(9, idname);
                db.pstmt.setString(10, idno);
                db.pstmt.setString(11, code);
                int i = db.pstmt.executeUpdate();
                if (i > 0) {

                    response.sendRedirect("AdminHome.jsp?msg=Record Update Successfully");

                }

            }


        
      out.write('\n');
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

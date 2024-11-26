package admin;
import DB.DBConnect;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Blockemp extends HttpServlet {

    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
           
            String ecode = request.getParameter("ecode");
            DBConnect db = new DBConnect();
           
            if (ecode.equals("1")) {
                db.pstmt = db.con.prepareStatement("INSERT INTO login(ac_status) values('0')");
               
               
                int i = db.pstmt.executeUpdate();
                if (i > 0) {
                    response.sendRedirect("EmployeeHome.jsp?CheckIn");
                }

            } else {
               out.println("not match");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

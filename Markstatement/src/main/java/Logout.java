import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Logout
 */
@WebServlet("/Logout")
public class Logout extends HttpServlet {
     public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
    	 PrintWriter pw=res.getWriter();
    	 HttpSession h1=req.getSession();
    	 h1.getAttribute("");
    	 h1.invalidate();
    	 pw.print("Logged out Successfully");
     }
}
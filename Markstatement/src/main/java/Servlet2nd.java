import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Servlet2nd
 */
@WebServlet("/Servlet2nd")
public class Servlet2nd extends HttpServlet {
    public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
    	int REG=Integer.parseInt(req.getParameter("us"));
    	String DOB=req.getParameter("pas");
    	Connection cn;
		try {
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vsb", "root", "Lokesh@123");
			String str="select * from marks where REG=? and DOB=?";
			PreparedStatement ps=cn.prepareStatement(str);
			ps.setInt(1,REG);
			ps.setString(2,DOB);
			ResultSet resu=ps.executeQuery();
			if(resu.next()) {
				int Tamil=resu.getInt(3);
				int English=resu.getInt(4);
				int Maths=resu.getInt(5);
				int Science=resu.getInt(6);
				int Social=resu.getInt(7);
				String Status=resu.getString(8);
				HttpSession h1=req.getSession();
				h1.setAttribute("Tamil", Tamil);
				HttpSession h2=req.getSession();
				h2.setAttribute("English",English);
				HttpSession h3=req.getSession();
				h3.setAttribute("Maths", Maths);
				HttpSession h4=req.getSession();
				h4.setAttribute("Science", Science);
				HttpSession h5=req.getSession();
				h5.setAttribute("Social", Social);
				HttpSession h6=req.getSession();
				h6.setAttribute("Status", Status);
				RequestDispatcher rs1=req.getRequestDispatcher("loginjsp.jsp");
				rs1.forward(req, res);
			}
			else {
				RequestDispatcher rs1=req.getRequestDispatcher("Wrong.html");
				rs1.forward(req, res);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
    }

}
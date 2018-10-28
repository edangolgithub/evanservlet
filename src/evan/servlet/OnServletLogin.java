package evan.servlet;

import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.http.*;


public class OnServletLogin extends HttpServlet {
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
		{
			PrintWriter pw=res.getWriter();
			res.setContentType("text/html");

			String user=req.getParameter("userName");
			String pass=req.getParameter("userPassword");

			if(user.equals("evan")&&pass.equals("evan")) 
	                 pw.println("Login Success...!"); 
	                else
	                 pw.println("Login Failed...!");
			 pw.close();

		}
protected void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
{
	PrintWriter wr=res.getWriter();
	res.setContentType("text/html");
	String user=req.getParameter("userName");
	String pass=req.getParameter("userPassword");
	wr.println("<h1>");
	wr.println(user);
	wr.println(pass);
	wr.println("</h1>");
}

}

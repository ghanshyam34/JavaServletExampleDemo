import javax.servlet.*;
import java.io.*;
import java.sql.*;
/**
 *
 * @author Ghanshyam
 */
public class mathServlet extends GenericServlet
{
	public void service(ServletRequest request,ServletResponse response)throws ServletException,IOException
	{

		PrintWriter pw=response.getWriter();
		//read input values
		String s1=request.getParameter("fno");
		String s2=request.getParameter("sno");
		String s3=request.getParameter("s1");

		//wrapping
		int a=Integer.parseInt(s1.trim());
		int b=Integer.parseInt(s1.trim());

		String msg="";
		int c=0;




            if(s3.equals("add"))
            {
				c=a+b;
				msg="addition :";
			}
			else if(s3.equals("subtract"))
		         {
				    c=a-b;
				    msg="subtraction :";
		         }
				 else
		         {
					 c=a*b;
				     msg="multiplication :";
				 }

			  pw.println("<center><h2>");
  			  pw.println(msg+" - "+c);
			  pw.println("</h2></center>");


			  pw.close();

	}//service close
}//class close

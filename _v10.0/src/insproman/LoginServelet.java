package insproman;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoginServelet extends HttpServlet{
	   Statement stmt;

	public void doPost(HttpServletRequest request , HttpServletResponse response)
	{
		String username=request.getParameter("uname");
		String password=request.getParameter("psw");
		Connection conn = null;
	    stmt = null;
	   try{

	      conn = DbHelper.getConnection();
	      stmt = conn.createStatement();
	      String get = "SELECT pwd FROM info WHERE mail='"+username+"'; ";
	      ResultSet rs= stmt.executeQuery(get);
    	  PrintWriter outp=response.getWriter();

	      if(rs.next())
	      {
	    	  
	    	 String pass=rs.getString("pwd");
	    	 
	    	  if(password.equals(pass))
		      {
	    		  
		    	  response.sendRedirect("facil.jsp");
		      }
		      else
		      {
		    	  outp.println("Password is incorrect !! Unable to login");
		      }
	      }
	      else
	      {
	    	  System.out.println("user is not registered ");
	      }
	     
	      
	   }catch(Exception e){
		   System.out.print(e.getMessage());
	   }
		
	}

}

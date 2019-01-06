package insproman;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.io.PrintWriter;


import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import com.mysql.cj.protocol.Resultset;

public class SignUpServelet  extends HttpServlet {
	   String mail;String pwd;String pwdr;
	   Statement stmt;
	   PrintWriter out;
		
	protected void doPost(HttpServletRequest request, HttpServletResponse response) {
		try {
			out=response.getWriter();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		mail=request.getParameter("email");
		pwd=request.getParameter("psw");
		 pwdr=request.getParameter("psw-repeat");
		Connection conn = null;
		    stmt = null;
		   try{
		     

		      conn = DbHelper.getConnection();
		      stmt = conn.createStatement();
		    
		      
		   }catch(Exception e){
			   System.out.print(e.getMessage());
		   }
	
		     		   
		if(pwd.equals(pwdr)) {
		try {
			boolean hasLetter = false;
	        boolean hasDigit = false;

	        if (pwd.length() >= 8) {
	            for (int i = 0; i < pwd.length(); i++) {
	                char x = pwd.charAt(i);
	                if (Character.isLetter(x)) {

	                    hasLetter = true;
	                }

	                else if (Character.isDigit(x)) {

	                    hasDigit = true;
	                }

	                // no need to check further, break the loop
	                if(hasLetter && hasDigit){

	                    break;
	                }

	            }
	            if (hasLetter && hasDigit) {
//	                System.out.println("STRONG");
	                String query = "INSERT INTO info (mail, pwd) VALUES ('"+mail+"',' "+pwd+"'); ";
	    			stmt.executeUpdate(query);
	    			

	    			response.sendRedirect("facil.jsp");
	            } else {
	                out.println("NOT STRONG!! go enter a strong password to register");
	            }
	        }
	        else
	        {
			
                out.println("Enter a password of length greater than 8!! go back and do it to register");
			 } 
	        stmt.close();
		      conn.close();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.print(e.getMessage());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		else
		{
		
				out.println("The passwords do not match ");
			
		}
	}


}
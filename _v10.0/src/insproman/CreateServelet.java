
package insproman;

import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.io.PrintWriter;
import java.util.Date;  


import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CreateServelet extends HttpServlet {
	String name;String processs;String description;String level11;String level22;String level33;
	 String level44;int id;String level55;String level66;  Statement stmt;String levels;
	 private int result1,result2,result3,result4,result5,result6,permission;
	 private java.sql.Date sqdate;
  protected void doPost(HttpServletRequest request , HttpServletResponse response)
  {
	  
	  Connection conn = null;
	    Statement stmt = null;
	    try{
		    

		      conn =DbHelper.getConnection();
		      stmt = conn.createStatement();
           }
	    catch(Exception e){
			   System.out.print(e.getMessage());
			   
}
	    try {
	    	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
	        Date date = new Date();
	      sqdate = new java.sql.Date(date.getTime());
	        System.out.println(dateFormat.format(sqdate));  
	      name=request.getParameter("process");
	  	  description=request.getParameter("description");
	  	  levels=request.getParameter("permission");
	  	  level11=request.getParameter("level1");
	  	  level22=request.getParameter("level2");
	  	  level33=request.getParameter("level3");
	  	  level44=request.getParameter("level4");//INTEGER - integer class //int - data type
	  	  level55=request.getParameter("level5");
	  	  level66=request.getParameter("level6");
//	  	System.out.println(result1+"");
	  	  if(level11==null)
	  		  result1=-1;
	  	  else
	  		  result1 = Integer.parseInt(level11);
	  	  
	  	  if(level22==null)
	  		  result2=-1;
	  	  else
	  		  result2 = Integer.parseInt(level22);
	  	  if(level33==null)
	  		  result3=-1;
	  	  else
	  		  result3 = Integer.parseInt(level33);
	  	 if(level44==null)
	  		 result4=-1;
	  	 else
	  		 result4 = Integer.parseInt(level44);
	  	 if(level55==null)
	  		 result5=-1;
	  	 else
	  		 result5 = Integer.parseInt(level55);
	  	 if(level66==null)
	  		 result6=-1;
	  	 else
	  		 result6 = Integer.parseInt(level66);
	  	 permission=Integer.parseInt(levels);
	  	String query = "INSERT INTO process (id, name,date, description,levels,level_a_id,level_b_id,level_c_id,level_d_id,level_e_id,level_f_id) VALUES ('"+id+"',' "+name+"','"+sqdate+"','"+description+" ','"+permission+"','"+result1+"','"+result2+"','"+result3+"','"+result4+"','"+result5+"','"+result6+"'); ";   
	  	stmt.executeUpdate(query);
	//  	stmt.executeUpdate(query);
		
	  	PrintWriter out=response.getWriter();
	  	out.print("Process sucessfully created :)");
//		response.sendRedirect("facil.jsp");
		   //rs.close();
		 stmt.close();
	      conn.close();
	     
	    }
		
	    catch(SQLException se){
	        //Handle errors for JDBC_/
	    	se.printStackTrace();
	     }catch(Exception e){
	        //Handle errors for Class.forName
	        e.printStackTrace();
	     }finally{
	        //finally block used to close resources
	        try{
	           if(stmt!=null)
	              conn.close();
	        }catch(SQLException se){
	        }// do nothing
	        try{
	           if(conn!=null)
	              conn.close();
	        }catch(SQLException se){
	           se.printStackTrace();
	        }//end finally try
	     }//end try
	    
	     System.out.println("Goodbye!");
}
}
package insproman;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;


public class ApplyServelet extends HttpServlet {
	private String id,app_name,app_desc,appp_id;
	private int ide;
	PrintWriter write;
	int appp;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) {
		 id= request.getParameter("key");
		 app_name=request.getParameter("applicant");
		 app_desc=request.getParameter("a_desc");
		 if(id==null) {
			 System.out.println("khali hai");
		 }
		 else
		 ide=Integer.parseInt(id);
		 try {
			write=response.getWriter();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Connection con=DbHelper.getConnection();
		try {
			Statement state=con.createStatement();
			String doit="INSERT INTO applied(app_id,p_id,applicant,app_desc)VALUES(''"+appp+"','"+ide+"','"+app_name+"','"+app_desc+"');" ;
			state.executeUpdate(doit);
			System.out.println("nhiiii");
			write.println("applied succesfully!!!!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

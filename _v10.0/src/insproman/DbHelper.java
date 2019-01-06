package insproman;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
public class DbHelper {
	
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	   static final String DB_URL = "jdbc:mysql://localhost:3306/ipm";

		  static final String USER = "root";
		  static final String PASS = "lnmiit";
			public static ArrayList<Process> pps;
		
	public static Connection getConnection(){
		
		try {
			Connection conn = null;
			Class.forName(JDBC_DRIVER); 		
			conn = DriverManager.getConnection(DB_URL,USER,PASS);
			System.out.print("Connection Established!");
			return conn;
		}
		catch (ClassNotFoundException e) {
			System.out.print(e.getMessage());
			return null;
		}
		catch (SQLException e2) {
			System.out.print(e2.getMessage());
			return null;
		}	
	}
	public static boolean add() 
	{
		
		Connection c=getConnection();
		 Statement stmt;
		try {
			String name_v,description_v;
			int levels_v,id_v;
			Date date_v;
			int[] permission_ids_v=new int[6] ;

			stmt = c.createStatement();
			String cmd="select * from process";
	    	ResultSet rs=stmt.executeQuery(cmd);
	    	
	    	while(rs.next())
	    	{
	    		id_v=rs.getInt("id");
	    		name_v=rs.getString("name");
	    		description_v=rs.getString("description");
	    		levels_v=rs.getInt("levels");
	    		date_v = rs.getTimestamp("date");
	    		permission_ids_v[0]=rs.getInt("level_a_id");
	    		permission_ids_v[1]=rs.getInt("level_b_id");
	    		permission_ids_v[2]=rs.getInt("level_c_id");
	    		permission_ids_v[3]=rs.getInt("level_d_id");
	    		permission_ids_v[4]=rs.getInt("level_e_id");
	    		permission_ids_v[5]=rs.getInt("level_f_id");
	    		pps.add(new Process(id_v, name_v, description_v, levels_v, date_v, permission_ids_v));
	    		
	    	}

			stmt.close();
		      c.close();
	    	return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;

		
	}
}

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<link rel="stylesheet" type="text/css" href="css/view.css">

</head>
<body>


    <%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%
String driver = "com.mysql.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost:3306/ipm";
String userid = "root";
String password = "lnmiit";
try  
{
Class.forName(driver);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}
Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;
//ResultSet resultSet1 = null;
//String Id = request.getParameter("eventId");
%>
 <section>
  <!--for demo wrap-->
  <h1><marquee behavior="alternate"><b>CURRENT PROCESS</b></marquee></h1>
  <div class="tbl-header">
    <table cellpadding="0" cellspacing="0" border="0">
      <thead>
        <tr>
          <th>Name</th>
          <th>Description</th>
          <th>Date</th>
          <th>Permission Levels</th>
        </tr>
      </thead>
    </table>
  </div>
  
  <div class="tbl-content">
    <table cellpadding="10" cellspacing="5" border="1">
          <tbody>
<%
					try{
					connection = DriverManager.getConnection(connectionUrl, userid, password);
					statement=connection.createStatement();
					resultSet = statement.executeQuery("select * from process");
					while(resultSet.next()){
						int iid=resultSet.getInt("id");
						System.out.println(resultSet.getString("name"));

					%>
					<% java.util.Date newDate = resultSet.getTimestamp("date");%>

 		<tr>
        <td><a href="Application.jsp?key=<%= iid %>"><%= resultSet.getString("name") %></a></td>
          <td><%= resultSet.getString("description") %></td>
          <td><%= newDate %></td>
          <td><%= resultSet.getInt("levels") %></td>
        </tr>
        
					 
					<%
					}
					} 
					catch (Exception e) 
					{
						e.printStackTrace();
					}
					%>
	</tbody>
    </table>
  </div>
</section>
		                      
</body>
</html>
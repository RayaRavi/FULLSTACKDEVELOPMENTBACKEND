<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*,java.util.*"%>
<%
String fname = request.getParameter("fname");
String lname = request.getParameter("lname");
String email = request.getParameter("email");
String userid = request.getParameter("userid");
String password = request.getParameter("password");
try {
 Class.forName("oracle.jdbc.driver.OracleDriver");
 Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "system");
 Statement st = conn.createStatement();
 int i = st.executeUpdate("insert into users(fname,lname,email,userid,password)values('" + fname + "','" + lname
 + "','" + email + "','" + userid + "','" + password + "')");
 out.println("Thank you for register ! Please <a href='login.html'>Login</a> to continue.");
} catch (Exception e) {
 System.out.print(e);
 e.printStackTrace();
}
%>

<%@page import="java.sql.*,java.util.*"%>
<%
String userid = request.getParameter("usr");
session.putValue("userid", userid);
String password = request.getParameter("password");
try {
Class.forName("oracle.jdbc.driver.OracleDriver");
 Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "system");
Statement st = con.createStatement();
ResultSet rs = st.executeQuery("select * from users where userid='" + userid + "' and password='" + password + "'");

 rs.next();
 if (rs.getString("password").equals(password) && rs.getString("userid").equals(userid)) {
    response.sendRedirect("index.html");
 } else {
   response.sendRedirect("/fsd1/login.html");
 }
} catch (Exception e) {
 e.printStackTrace();
}
%>
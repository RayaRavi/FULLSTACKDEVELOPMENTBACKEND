//Java program to fetch and display the information from table using RESULTSET
import java.sql.*;
class FetchDisplay
{
	public static void main(String[] args)
	{
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver Registered.....");
			Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","always03,");
			System.out.println("Connection established successfully....");
			Statement s=c.createStatement();
			String sql="select * from B9";
			ResultSet rs=s.executeQuery(sql);
			while(rs.next())
			{
				System.out.println(rs.getString("name")+"\t"+rs.getInt("id"));
				//System.out.println(rs.getInt("id"));
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}


/* OUTPUT:

Driver Registered.....
Connection established successfully....
Ravi    1
hello   3
hello   3-->this is printed because we execute previous update program and other program with insertion of same records as 3,hello...

*/
			
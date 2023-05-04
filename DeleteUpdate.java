//Java program to delete and update values
import java.sql.*;
class DeleteUpdate
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","always03,");
		System.out.println("Connection established successfully.....");
		Statement s=c.createStatement();
		String sql="update B9 set name='hello' where id=3";
		s.executeUpdate(sql);
		String sql1="delete from B9 where id=2";
		s.execute(sql1);
		System.out.println("Values are updated and deleted the selected rows...");
	}

}


/*

OUTPUT:

Connection established successfully.....
Values are updated and deleted the selected rows...

BEFORE UPDATE AND DELETE:

select * from B9;

        ID NAME
---------- --------------------
         1 Ravi
         2 Raya
         3 RRR
         2 Raya
         3 RRR

AFTER UPDATE AND DELETE:

select * from B9;

        ID NAME
---------- --------------------
         1 Ravi
         3 hello
         3 hello

*/
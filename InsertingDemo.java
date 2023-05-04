//Java program to insert values into table using addBatch() and executeBatch()
import java.sql.*;
class InsertingDemo
{
	public static void main(String args[])
	{
		try{

			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver Registered Successfully");
			Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","always03,");
			System.out.println("Connection established successfully...");
			Statement st=c.createStatement();
			st.addBatch("insert into B9 values(2,'Raya')");
			st.addBatch("insert into B9 values(3,'RRR')");
			st.executeBatch();
			System.out.println("Values inserted into the table successfully....");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}


}


/*

OUTPUT:

Driver Registered Successfully
Connection established successfully...
Values inserted into the table successfully....

select * from B9;

        ID NAME
---------- --------------------
         1 Ravi
         2 Raya
         3 RRR

*/
// Java program to insert records dynamically using PREPARED STATEMENT
import java.util.Scanner;
import java.sql.*;
class InsertDynamically
{
	public static void main(String args[])
	{
		try{
			int id;
			String name;
			Scanner st=new Scanner(System.in);
			System.out.println("Enter id");
			id=st.nextInt();
			System.out.println("Enter name");
			name=st.next();
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","always03,");
			PreparedStatement s=c.prepareStatement("insert into B9 values(?,?)");
			s.setInt(1,id);
			s.setString(2,name);
			int i=s.executeUpdate();
			System.out.println(i+" records inserted");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

/*

OUTPUT:

Enter id
7
Enter name
Srinivas Rao
1 records inserted

TABLE DATA:

 select * from B9;

        ID NAME
---------- --------------------
         1 Ravi
         3 hello
         3 hello
         7 Srinivas

*/
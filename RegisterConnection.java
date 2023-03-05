import java.sql.*;
class RegisterConnection
{
    public static void main(String args[])
    {
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("Driver Registered Successfully");
            Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhostserver:1521:XE","system","system");
            System.out.println("Connection Established Successfully.....");
            Statement s=c.createStatement();
            String s2="create table ABC(id integer primary key,name varchar2(20))";
            String sq="insert into ABC(id,name) values (1,'Ravi'),(2,'RRR')";
            s.execute(s2);
            s.execute(sq);
            System.out.println("Table values inserted successfully...");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
// program for the Search application using AWT
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
class SearchApplication extends Frame implements ActionListener
{
Label l1;
TextField t1;
Button b;
SearchApplication()
{
setSize(300,300);
setVisible(true);
setLayout(new FlowLayout());
l1=new Label("Enter roll Number");
t1=new TextField(20);
b=new Button("Search");
add(l1);
add(t1);
add(b);
b.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection c=DriverManager.getConnection("jdbc:oracle:thin:@ntsocietyserver:1521:oralbrce","scott","tiger");
PreparedStatement s=c.prepareStatement("select * from RB9 where id=?");
String num=t1.getText();
s.setString(1,num);
ResultSet rs=s.executeQuery();
int x=0;
while(rs.next())
{
System.out.println(rs.getString(1)+" "+rs.getString(2));
x++;
}
if(x==0)
System.out.println("record not found");
}
catch(Exception ex)
{
System.out.println(ex);
}
}

}
class Search
{
public static void main(String[] args)
{
SearchApplication sa=new SearchApplication();
}
}

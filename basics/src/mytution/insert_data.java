package mytution;

import java.sql.Connection;
import java.sql.Statement;

public class insert_data 
{
	public static void main(String arg[])
	{
	Connection con;
	Statement stmt;
	
	int count;
	try {
		con=myconnection.createConection();
	String  str="Insert into mybank(name,balance) values('kkk',45000)";
	stmt=con.createStatement();
	
count =stmt.executeUpdate(str);
if(count>0)
{
	System.out.println("Recotd is Saved");
}
	}
	catch(Exception ee)
	{
		System.out.println(ee.getMessage());
	}
}
}

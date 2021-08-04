package mytution;

import java.sql.Connection;
import java.sql.DriverManager;
public class myconnection{
	public static Connection createConection() throws Exception
	{
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
	Connection	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/umang_data","root","admin");
		return con;
	}

}






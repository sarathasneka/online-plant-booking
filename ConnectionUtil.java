package register;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {
	public static Connection getDBConnect() 
	{
		Connection con = null;
	try {
		Class.forName("oracle.jdbc.OracleDriver");
		con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
		} 
	catch (ClassNotFoundException e) {
		
		e.printStackTrace();
		System.out.println("driver jar doesn't there");
	
		} catch (SQLException e) {
		
		e.printStackTrace();
		System.out.println("user_name or password may wrong");
	}
	
	return con;
			
	}
	
}

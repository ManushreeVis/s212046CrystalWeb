package utility;


import java.sql.Connection;
import java.sql.DriverManager;

public class DBConn {
	static Connection conn;
	public static Connection getMySQLConnection() throws Exception{
	
		Class.forName("com.mysql.cj.jdbc.Driver");
//		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/crystal","root","root");
		return conn;
		
	}

}

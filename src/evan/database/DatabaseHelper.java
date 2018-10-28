package evan.database;

import java.sql.*;

public class DatabaseHelper {

	public static String DatabaseName="school";
	public static String DatabaseUrl="jdbc:mysql://localhost:3306/"+DatabaseName+"?useSSL=false";
	public static String DatabaseUser="root";
	public static String DatabasePassword="";
	public static String DatabaseDriver="com.mysql.cj.jdbc.Driver";
	public static Connection con=null;
	
	public static Connection GetConnection() throws ClassNotFoundException, SQLException
	{
	    Class.forName(DatabaseDriver);
		con=DriverManager.getConnection(DatabaseUrl, DatabaseUser, DatabasePassword);
		
		return con;
	}
	
}

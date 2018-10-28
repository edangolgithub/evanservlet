package evan.database;

import java.sql.*;

public class Dao {
	private DatabaseHelper database;
	Connection con=null;
	public ResultSet GetAllStudents() throws SQLException, ClassNotFoundException
	{
		con=database.GetConnection();
		PreparedStatement stmt=con.prepareStatement("select * from student");
		return stmt.executeQuery();
	}

}

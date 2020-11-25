import java.io.*;
class ConnectionTest
{
	public static void main(String args[]);
	{
	try{
	class.forName("sun.jdbc.odbc.jdbcodbcDriver");
	System.out.println("Driver Loaded");
	String url="jdbc.odbc."
	Connection con=DriverManager.getConnection(url);
	system.out.println("Connection to database created");
	}
	catch(SQLException e)
	{
		system.out.println("SQL Error");
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	}
}

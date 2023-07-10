package org.jsp.Elibrary.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//To get Data base connection while writing jdbc code
public class DB 
{
	public static Connection getCon()
	{
		Connection connection = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=12345");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return connection;
	}
}

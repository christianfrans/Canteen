/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package canteens.Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Christian Frans Mukuan
 */
public class DBConnection {
	public static Connection open()
	{
		Connection con;
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			
			String url="jdbc:mysql://localhost:3306/canteens";

			String username ="root";
			String password="";
			con = DriverManager.getConnection(url, username, password);
			
			return con;
		}
		catch (ClassNotFoundException | SQLException e)
		{
			System.err.println(e);
			return null;
		}
	}
}

package com.hrms.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class DBUtils {
	static final String url;
	static final String username;
	static final String password;
	
	static {
		ResourceBundle rb = ResourceBundle.getBundle("dbdetails");
		url = rb.getString("url");
		username = rb.getString("username");
		password = rb.getString("password");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	static Connection connectToDatabase() throws SQLException {
		return DriverManager.getConnection(url,username,password);
	}
	
	static void closeConnection(Connection conn) throws SQLException {
		if(conn != null) {
			conn.close();
		}
	}
}

package com.hrms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


import com.hrms.dto.Employee;
import com.hrms.dto.EmployeeImpl;
import com.hrms.exception.EmployeeException;
import com.hrms.tablesprint.ConsoleColors;

public class Login {
	public static boolean adminLogin() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Username");
		String username = sc.next();
		System.out.println("Enter Password");
		String password = sc.next();
		System.out.println(ConsoleColors.RESET);
		
		if(username.equals("admin") && password.equals("admin111")) {
			return true;
		}else {
			return false;
		}
		
	}
	
	
	public static EmployeeImpl employeeLogin() throws EmployeeException {
		EmployeeImpl emp = new EmployeeImpl();
		
		Scanner sc = new Scanner(System.in);
		
		Connection conn = null;
		
		try {
			conn = DBUtils.connectToDatabase();
			System.out.println("Enter your Email");
			String email = sc.next();
			
			System.out.println("Enter your Password");
			String password = sc.next();
			System.out.println(ConsoleColors.RESET);
			String selectquery = "SELECT * FROM EMPLOYEE WHERE EMAIL = ?";
			PreparedStatement ps = conn.prepareStatement(selectquery);
			ps.setString(1, email);
			
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				emp.setId(rs.getInt("id"));
				emp.setFirstName(rs.getString("firstName"));
				emp.setLastName(rs.getString("lastName"));
				emp.setMobile(rs.getString("mobile"));
				emp.setEmail(rs.getString("email"));
				emp.setPassword(rs.getString("password"));
				emp.setDateOfBirth(rs.getString("dateOfBirth"));
				emp.setAddress(rs.getString("address"));
				emp.setSalary(rs.getInt("salary"));
   				emp.setDateOfJoining(rs.getString("dateofjoining"));
   				emp.setDepartmentId(rs.getInt("departmentId"));
   				
   				if(!emp.getPassword().equals(password)) {
   					throw new EmployeeException("Please check the password and try again later");
   				}
			}else {
					throw new EmployeeException("The Entered Email does not exist!");
				}
			
			
			
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		return emp;
		
	}
}

package com.hrms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.hrms.dto.Department;
import com.hrms.dto.DepartmentImpl;
import com.hrms.exception.DepartmentException;
import com.hrms.tablesprint.ConsoleColors;

public class DepartmentDaoImpl implements DepartmentDao {

	@Override
	public void addDepartment(DepartmentImpl dept) throws DepartmentException {
		// TODO Auto-generated method stub
		Connection conn = null;
		
		
		try {
			conn = DBUtils.connectToDatabase();
//			System.out.println("Connection successful");
			String addquery = "INSERT INTO DEPARTMENT(deptName) VALUE (?)";
			
//			System.out.println("Connection Successful");
			PreparedStatement ps = conn.prepareStatement(addquery);
			ps.setString(1, dept.getName());
			
			if(ps.executeUpdate()>0) {
				System.out.println(ConsoleColors.GREEN_BOLD + "Department Added Successfully" + ConsoleColors.RESET);
			}else {
				System.out.println(ConsoleColors.RED_BOLD + "Something Went Wrong" + ConsoleColors.RESET);
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			throw new DepartmentException("Department Adding Failed");
		}
		finally {
			try {
				DBUtils.closeConnection(conn);
//				System.out.println("Connection closed");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	
	}

	@Override
	public List<DepartmentImpl> getAllDepartment() throws DepartmentException {
		List<DepartmentImpl> list=new ArrayList();
		
		try (Connection con=DBUtils.connectToDatabase()){
			PreparedStatement ps=con.prepareStatement("select * from  department");
			ResultSet rs=ps.executeQuery();
		    while(rs.next()) {
		    	int id=rs.getInt("id");
				String name=rs.getString("name");
				DepartmentImpl d=new DepartmentImpl();
				d.setId(rs.getInt("id"));
				d.setName(rs.getString("name"));
				list.add(d);
				
		    }
		} catch (SQLException e) {
			// TODO: handle exception
			throw new DepartmentException(e.getMessage());
		}
		
		if(list.size()==0)
			throw new DepartmentException("No Department found");
		
		return list;
	}

	@Override
	public void updateDepartment(DepartmentImpl dept) throws DepartmentException {
		// TODO Auto-generated method stub
		Connection conn = null;
		
		try {
			conn = DBUtils.connectToDatabase();
			String updatequery = "update department set name=? where id=?";
			PreparedStatement ps = conn.prepareStatement(updatequery);
			ps.setString(1,dept.getName());
			ps.setInt(2,dept.getId());
			
			if(ps.executeUpdate()>0) {
				System.out.println(ConsoleColors.GREEN_BOLD + "Updated Successfully" + ConsoleColors.RESET);
			}else {
				System.out.println(ConsoleColors.RED_BOLD + "Something Went Wrong" + ConsoleColors.RESET);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				DBUtils.closeConnection(conn);
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	

}

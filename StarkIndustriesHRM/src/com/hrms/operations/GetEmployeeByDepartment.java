package com.hrms.operations;

import java.util.List;
import java.util.Scanner;

import com.hrms.dao.EmployeeDao;
import com.hrms.dao.EmployeeDaoImpl;
import com.hrms.dto.EmployeeImpl;
import com.hrms.exception.EmployeeException;
import com.hrms.ui.PrintTable;

public class GetEmployeeByDepartment {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Department Id: ");
		int deptId=sc.nextInt();
		
		EmployeeDao dao=new EmployeeDaoImpl();
		try {
			List<EmployeeImpl>list=dao.employeeByDepartment(deptId);
			PrintTable.printEmployeeList(list);;
			//System.out.println(list);
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
}

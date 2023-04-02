package com.hrms.operations;

import java.util.Scanner;
import com.hrms.dao.EmployeeDao;
import com.hrms.dao.EmployeeDaoImpl;
import com.hrms.dto.EmployeeImpl;
import com.hrms.exception.EmployeeException;

public class AddNewEmployee {
	public static void main(String[] args) throws EmployeeException {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter First Name of Employee");
		String fname=sc.next();
		System.out.println("Enter Last Name of Employee");
		String lname=sc.next();
		System.out.println("Enter Mobile of Employee");
		String mob=sc.next();
		System.out.println("Enter Email of Employee");
		String email=sc.next();
		System.out.println("Enter DOB of Employee in yyyy-mm-dd format");
		String dob=sc.next();
		System.out.println("Enter Address of Employee");
		sc.nextLine();
		String add=sc.nextLine();
		System.out.println("Enter Salary of Employee");
		int sal=sc.nextInt();
		System.out.println("Enter Joining Date of Employee in yyyy-mm-dd format");
		String jd=sc.next();
		System.out.println("Enter Department ID for Employee");
		int did=sc.nextInt();
		String pass=fname+'@'+lname+"123";
		
		EmployeeDao empdao = new EmployeeDaoImpl();
		empdao.registerEmployee(new EmployeeImpl(fname,lname,mob,email,pass,dob,add,sal,jd,did));
		
		
	
	}
}

package com.hrms.operations;

import java.util.Scanner;

import com.hrms.dao.DepartmentDao;
import com.hrms.dao.DepartmentDaoImpl;
import com.hrms.dto.DepartmentImpl;
import com.hrms.exception.DepartmentException;

public class UpdateDepartment {
	public static void main(String[] args) throws DepartmentException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Depatment ID");
		int deptid = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter New Name for Department");
		String newdeptname = sc.nextLine();
		
		DepartmentDao deptdao = new DepartmentDaoImpl();
		
		try {
			deptdao.updateDepartment(new DepartmentImpl(deptid, newdeptname));
		} catch (DepartmentException e) {
			// TODO Auto-generated catch block
			throw new DepartmentException("Department Update Failed");
		}
		
	}
}	

package com.hrms.operations;

import java.util.Scanner;
import com.hrms.dao.DepartmentDao;
import com.hrms.dao.DepartmentDaoImpl;
import com.hrms.dto.DepartmentImpl;
import com.hrms.exception.DepartmentException;

public class AddDepartment {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Department Name");
		String deptname = sc.nextLine();
		
		DepartmentDao deptdao = new DepartmentDaoImpl();
		try {
//			System.out.println(deptname);
			deptdao.addDepartment(new DepartmentImpl(deptname));
		} catch (DepartmentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		sc.close();
	}
}

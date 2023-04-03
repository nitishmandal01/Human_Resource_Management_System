package com.hrms.operations;

import java.util.List;

import com.hrms.dao.DepartmentDao;
import com.hrms.dao.DepartmentDaoImpl;
import com.hrms.dto.DepartmentImpl;
import com.hrms.exception.DepartmentException;
import com.hrms.ui.PrintTable;

public class GetAllDepartment {
	public static void main(String[] args) {
		
		DepartmentDao dao=new DepartmentDaoImpl();
		
		try {
			List<DepartmentImpl>list=dao.getAllDepartment();
			
			PrintTable.printDepartment(list);
		} catch (DepartmentException e) {
			System.out.println(e.getMessage());
		}
	}
}

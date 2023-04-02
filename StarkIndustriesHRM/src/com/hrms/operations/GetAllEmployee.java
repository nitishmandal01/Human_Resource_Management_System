package com.hrms.operations;

import java.util.List;

import com.hrms.dao.EmployeeDao;
import com.hrms.dao.EmployeeDaoImpl;
import com.hrms.dto.EmployeeImpl;
import com.hrms.exception.EmployeeException;
import com.hrms.tablesprint.PrintTable;

public class GetAllEmployee {
public static void main(String[] args) throws EmployeeException {
		
		EmployeeDao dao=new EmployeeDaoImpl();
		
		try {
			List<EmployeeImpl>list=dao.getAllEmployee();
			
			PrintTable.printEmployeeList(list);

		} catch (EmployeeException e) {
			System.out.println(e.getMessage());
		}
	}
}

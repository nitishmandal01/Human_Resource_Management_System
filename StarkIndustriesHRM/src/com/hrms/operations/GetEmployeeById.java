package com.hrms.operations;

import com.hrms.dao.EmployeeDao;
import com.hrms.dao.EmployeeDaoImpl;
import com.hrms.exception.EmployeeException;
import com.hrms.ui.PrintTable;

public class GetEmployeeById {
	public static void main(int id) {
		// TODO Auto-generated method stub
		
		EmployeeDao dao=new EmployeeDaoImpl();
		try {
//			System.out.println(dao.getEmployeeByID(id));
			PrintTable.printSingleEmployee(dao.getEmployeeByID(id));
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

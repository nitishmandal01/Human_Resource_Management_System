package com.hrms.operations;


import com.hrms.dao.EmployeeDao;
import com.hrms.dao.EmployeeDaoImpl;
import com.hrms.exception.EmployeeException;

public class ChangeEmployeePassword {
	public static void main(int id) {
		EmployeeDao empdao=new EmployeeDaoImpl();
		
		
		try {
			empdao.changeEmpPassword(id);
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

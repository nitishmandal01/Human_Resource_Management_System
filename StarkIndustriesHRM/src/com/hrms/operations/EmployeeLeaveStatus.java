package com.hrms.operations;

import java.util.List;
import com.hrms.dao.LeavesDao;
import com.hrms.dao.LeavesDaoImpl;
import com.hrms.dto.LeavesImpl;
import com.hrms.exception.LeavesException;
import com.hrms.ui.PrintTable;

public class EmployeeLeaveStatus {
	public static void main(int empid) throws LeavesException {
		
		LeavesDao dao=new LeavesDaoImpl();
		try {
//			System.out.println(dao.getEmployeeByID(id));
			List<LeavesImpl> list = dao.employeeLeaveStatus(empid);
			PrintTable.employeeLeaveStatusPrint(list);
		} catch (LeavesException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

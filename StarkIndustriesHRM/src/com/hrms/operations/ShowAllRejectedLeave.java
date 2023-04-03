package com.hrms.operations;

import java.util.List;

import com.hrms.dao.LeavesDao;
import com.hrms.dao.LeavesDaoImpl;
import com.hrms.dto.LeavesImpl;
import com.hrms.exception.LeavesException;
import com.hrms.ui.PrintTable;

public class ShowAllRejectedLeave {
public static void main(String[] args) {
	LeavesDao leave=new LeavesDaoImpl();
	List<LeavesImpl> list=null;
	try {
		
		list = leave.showAllRejectLeave();
		//System.out.println(list);
		PrintTable.printLeaveList(list);
	} catch (LeavesException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}

package com.hrms.operations;

import java.util.Scanner;

import com.hrms.dao.LeavesDao;
import com.hrms.dao.LeavesDaoImpl;
import com.hrms.exception.LeavesException;
import com.hrms.ui.ConsoleColors;

public class ApplyLeave {
public static void main(int id, String fname,String lname,int departmentid) {
	 
	Scanner sc=new Scanner(System.in);
	System.out.println(ConsoleColors.BLUE_BOLD);
	System.out.println("Leave from Date in yyyy-mm-dd format");
	String startDate=sc.next();
	System.out.println("Leave till Date in yyyy-mm-dd format");
	String endDate=sc.next();
	System.out.println(ConsoleColors.RESET);
	LeavesDao l=new LeavesDaoImpl();
	
	try {
		l.requestLeave(id, startDate, endDate,fname,lname,departmentid);
	} catch (LeavesException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}

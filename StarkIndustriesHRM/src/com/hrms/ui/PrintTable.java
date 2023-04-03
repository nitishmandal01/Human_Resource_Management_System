package com.hrms.ui;

import java.util.List;

import com.hrms.dto.DepartmentImpl;
import com.hrms.dto.Employee;
import com.hrms.dto.EmployeeImpl;
import com.hrms.dto.LeavesImpl;


public class PrintTable {
	public static void printDepartment(List<DepartmentImpl> list) {
		try {
			System.out.println();

			System.out.println(ConsoleColors.CYAN_BOLD+ "╔══════════DEPARTMENT LIST════════════╗");
			Thread.sleep(30);
			System.out.printf("%10s %15s", "║ DEPARTMENT ID ║","   DEPARTMENT NAME  ║");  
			System.out.println();   

			System.out.println("╠═════════════════════════════════════╣");
			
		} catch (InterruptedException e) {}
		
		
		for(int i=0; i<list.size(); i++){  
			System.out.format("║"+"%10s %27s", list.get(i).getId(), list.get(i).getName()+ "║"); 
			System.out.println();
			try {
			if(i==list.size()-1) {
				Thread.sleep(30);

				System.out.println("╚═════════════════════════════════════╝");
			}
			else {
				Thread.sleep(30);
				System.out.println("╚═════════════════════════════════════╝");
			}
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
		}  
		 
		System.out.println(ConsoleColors.RESET);
		
	}
	
	public static void printSingleEmployee(Employee employee) {
		System.out.println();

		try {

		System.out.println(ConsoleColors.CYAN_BOLD+ "╔══════════EMPLOYEE DETAILS═════════╗");
		Thread.sleep(20);
		System.out.println("");
		Thread.sleep(20);
		System.out.println("   EmployeeID : "+employee.getId());
		Thread.sleep(20);
		System.out.println("   Name       : "+employee.getFirstName()+" "+employee.getLastName());
		Thread.sleep(20);
		System.out.println("   Mobile     : "+employee.getMobile());
		Thread.sleep(20);
		System.out.println("   Email      : "+employee.getEmail());
		Thread.sleep(20);
		System.out.println("   Password   : "+employee.getPassword());
		Thread.sleep(20);
		System.out.println("   DOB        : "+employee.getDateOfBirth());
		Thread.sleep(20);
		System.out.println("   Address    : "+employee.getAddress());
		Thread.sleep(20);
		System.out.println("   Salary     : "+employee.getSalary());
		Thread.sleep(20);
		System.out.println("   DOJ        : "+employee.getDateOfJoining());
		Thread.sleep(20);
		System.out.println("   DEPT.ID    : "+employee.getDepartmentId());
		Thread.sleep(20);

		System.out.println("╚═══════════════════════════════════╝");
		Thread.sleep(20);
		} catch (InterruptedException e1) {}
		try {
			Thread.sleep(3000);
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
		System.out.println(ConsoleColors.RESET);
	}
	
public static void printEmployeeList(List<EmployeeImpl>list){
		
		int fnl=10,lnl=10,eml=0,psl=0,adl=0;
		for(int i=0; i<list.size(); i++) {
			EmployeeImpl e=list.get(i);
			fnl=Math.max(fnl, e.getFirstName().length());
			lnl=Math.max(lnl, e.getLastName().length());
			eml=Math.max(eml, e.getEmail().length());
			psl=Math.max(psl, e.getPassword().length());
			adl=Math.max(adl, e.getAddress().length());
		}
 
		System.out.println();
		System.out.println(ConsoleColors.CYAN_BOLD+ "════════════════════════════════════════════════════════════════════════════════════════");
		
		for(EmployeeImpl e: list){ 
			 
			String eid=e.getId()+"                                       ";
			String fname=e.getFirstName()+"                              ";
			String lname=e.getLastName()+"                               ";
			String mob=e.getMobile()+"                                   ";
			String email=e.getEmail()+"                                  ";
			String pass=e.getPassword()+"                                ";
			String dob=e.getDateOfBirth()+"                              ";
			String add=e.getAddress()+"                                  ";
			String sal=e.getSalary()+"                                   ";
			String hd=e.getDateOfJoining()+"                             ";
			String did=e.getDepartmentId()+"                             ";
			
			System.out.println();
			try {
			System.out.println("   EMP-ID  : "+eid.substring(0, 12)+"FIRST NAME    : "+fname.substring(0, psl+1)+"LAST-NAME    : "+lname.substring(0,lnl+3));
			Thread.sleep(20);
			System.out.println("   DEPT-ID : "+did.substring(0, 12)+"DATE OF BIRTH : "+dob.substring(0,   psl+1)+"JOINING DATE : "+hd.substring(0,lnl+3));
			Thread.sleep(20);
			System.out.println("   SALARY  : "+sal.substring(0, 12)+"PASSWORD      : "+pass.substring(0,  psl+1)+"EMAIL        : "+email.substring(0,eml+3));
			Thread.sleep(20);
			System.out.println("   MOBILE  : "+mob.substring(0, 12)+"ADDRESS       : "+add.substring(0, adl+3));
			Thread.sleep(20);
			System.out.println();
			Thread.sleep(20);
			System.out.println("════════════════════════════════════════════════════════════════════════════════════════");
			Thread.sleep(20);
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
			
		} 
		System.out.println(ConsoleColors.RESET);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {}
		 
	}

public static void printLeaveList(List<LeavesImpl>list) {
	for(LeavesImpl leave:list) {
		try {
		System.out.println(ConsoleColors.CYAN_BOLD+ "═══════════════════════════════════");
		System.out.println();
		System.out.println("EMPLOYEE ID   : "+leave.getEmployeeId());
		Thread.sleep(20);
		System.out.println("EMPLOYEE NAME : "+leave.getFirstName()+" "+leave.getLastName());
		Thread.sleep(20);
		System.out.println("DEPARTMENT ID : "+leave.getDepartmentId());
		Thread.sleep(20);
		System.out.println("START DATE    : "+leave.getLeaveStart());
		Thread.sleep(20);
		System.out.println("END DATE      : "+leave.getLeaveEnd());
		Thread.sleep(20);
		System.out.println("STATUS        : "+leave.getStatus());
		Thread.sleep(20);
		System.out.println();
		} catch (InterruptedException e) {}
	}
	System.out.println("═══════════════════════════════════");
	System.out.println(ConsoleColors.RESET);
}


public static void employeeLeaveStatusPrint(List<LeavesImpl>list) {
	System.out.println(ConsoleColors.CYAN_BOLD+ "═══════════LEAVE STATUS═══════════");
	for(LeavesImpl leave:list) {
		try {
		
		System.out.println();
		System.out.println("EMPLOYEE NAME : "+leave.getFirstName()+" "+leave.getLastName());
		Thread.sleep(20);
		System.out.println("LEAVE FROM    : "+leave.getLeaveStart());
		Thread.sleep(20);
		System.out.println("LEAVE TILL    : "+leave.getLeaveEnd());
		Thread.sleep(20);
		if(leave.getStatus() == "Approved") {
			System.out.println("STATUS        : "+ ConsoleColors.GREEN+ leave.getStatus());
		}else if(leave.getStatus() == "Rejected") {
			System.err.println("STATUS        : "+ leave.getStatus());
		}else {
			System.out.println("STATUS        : "+ leave.getStatus());
		}
		
		Thread.sleep(20);
		System.out.println();
		} catch (InterruptedException e) {}
	}
	System.out.println("═══════════════════════════════════");
	System.out.println(ConsoleColors.RESET);
}
}

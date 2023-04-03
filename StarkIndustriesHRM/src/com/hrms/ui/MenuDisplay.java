package com.hrms.ui;

import java.util.Scanner;

import com.hrms.dto.Employee;
import com.hrms.dto.EmployeeImpl;
import com.hrms.exception.DepartmentException;
import com.hrms.exception.EmployeeException;
import com.hrms.exception.LeavesException;
import com.hrms.operations.AddDepartment;
import com.hrms.operations.AddNewEmployee;
import com.hrms.operations.ApplyLeave;
import com.hrms.operations.ChangeEmployeeDepartment;
import com.hrms.operations.ChangeEmployeePassword;
import com.hrms.operations.EmployeeLeaveStatus;
import com.hrms.operations.GetAllDepartment;
import com.hrms.operations.GetAllEmployee;
import com.hrms.operations.GetEmployeeByDepartment;
import com.hrms.operations.GetEmployeeById;
import com.hrms.operations.PendingLeaves;
import com.hrms.operations.ShowAllApprovedLeaves;
import com.hrms.operations.ShowAllRejectedLeave;
import com.hrms.operations.UpdateDepartment;
import com.hrms.operations.UpdateEmployee;

public class MenuDisplay {
	public static void admin() throws DepartmentException, EmployeeException, InterruptedException {
		int choice = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println();
			System.out.println(ConsoleColors.GREEN_BOLD +"WELCOME TO ADMIN PANEL" + ConsoleColors.RESET);
			System.out.println(ConsoleColors.GREEN_BOLD +"CHOOSE FROM BELOW" + ConsoleColors.RESET);
			System.out.println(ConsoleColors.BLUE_BOLD +" 1.Add Department");
			Thread.sleep(200);
			System.out.println(" 2.View All Departments");
			Thread.sleep(200);
			System.out.println(" 3.Update Department");
			Thread.sleep(200);
			System.out.println(" 4.Add new Employee");
			Thread.sleep(200);
			System.out.println(" 5.Display All Employee's");
			Thread.sleep(200);
			System.out.println(" 6.Change Employee Department");
			Thread.sleep(200);
			System.out.println(" 7.Change Employee Password");
			Thread.sleep(200);
			System.out.println(" 8.Get Employee By Id");
			Thread.sleep(200);
			System.out.println(" 9.Get Employee By Department");
			Thread.sleep(200);
			System.out.println(" 10.Update Employee");
			Thread.sleep(200);
			System.out.println(" 11.View Pending Leave Requests");
			Thread.sleep(200);
			System.out.println(" 12.View Approved Leave Requests");
			Thread.sleep(200);
			System.out.println(" 13.View Rejected Leave Requests");
			Thread.sleep(200);
			System.out.println(" Press 0 to Logout");
			Thread.sleep(200);			
			System.out.println(ConsoleColors.BLUE_BOLD);
    		choice=sc.nextInt();
    		System.out.println(ConsoleColors.RESET);
			
			switch(choice) {
			case 1:
				AddDepartment.main(null);
				break;
				
			case 2:
				GetAllDepartment.main(null);
				break;
				
			case 3:
				UpdateDepartment.main(null);
				break;
			case 4:
				AddNewEmployee.main(null);
				break;
			case 5:
				GetAllEmployee.main(null);
				break;
			case 6:
				ChangeEmployeeDepartment.main(null);
				break;
			case 7:
				System.out.println("Enter Employee Id");
				int empid = sc.nextInt();
				ChangeEmployeePassword.main(empid);
				break;
			case 8:
				System.out.println("Enter Employee Id");
				int id = sc.nextInt();
				GetEmployeeById.main(id);
				break;
			case 9:
				GetEmployeeByDepartment.main(null);
				break;
			case 10:
				System.out.println("Enter ID of Employee");
				int id1=sc.nextInt();
				UpdateEmployee.main(id1);
				break;
			case 11:
				PendingLeaves.main(null);
				break;
			case 12:
				ShowAllApprovedLeaves.main(null);
				break;
			case 13:
				ShowAllRejectedLeave.main(null);
				break;
			case 0:
				System.out.println(ConsoleColors.GREEN+"Thank you see you again!!!");
				System.exit(0);
				break;
			default:
				System.err.println("Please Enter valid Input");
			}
			
			
			
		}while(choice != 0);
		
	}
	
	
    public static void employee(EmployeeImpl employee) throws InterruptedException {
    	
    	Scanner sc=new Scanner(System.in);
    	
    	int choice = 0;
    	do {
    		
    	    	System.out.println();
    	    	System.out.println(ConsoleColors.GREEN_BOLD +"WELCOME TO ADMIN PANEL" + ConsoleColors.RESET);
    			System.out.println(ConsoleColors.GREEN_BOLD +"CHOOSE FROM BELOW" + ConsoleColors.RESET);
    			System.out.println(ConsoleColors.BLUE_BOLD +" 1.  View Profile");
    			
    			System.out.println(" 2.  Update Profile");
    			Thread.sleep(300);
    			System.out.println(" 3.  Change Password");
    			Thread.sleep(300);
    			System.out.println(" 4.  Apply for Leave");
    			Thread.sleep(300);
    			System.out.println(" 5.  Check Leave Status");
    			Thread.sleep(300);
    			System.out.println(" 0.  EXIT"+ConsoleColors.RESET);
    			Thread.sleep(300);
    			System.out.println();
    	    	System.out.println(ConsoleColors.BLUE_BOLD);
    		choice=sc.nextInt();
    		System.out.println(ConsoleColors.RESET);
    		switch(choice) {
    		case 1:
    			GetEmployeeById.main(employee.getId());

    			break;
    		case 2:
    			UpdateEmployee.main(employee.getId());

    			break;
    		case 3:
    			ChangeEmployeePassword.main(employee.getId());

    			break;
    		case 4:
    			ApplyLeave.main(employee.getId(),employee.getFirstName(),employee.getLastName(),employee.getDepartmentId());

    			break;
    			
    		case 5:
    			try {
					EmployeeLeaveStatus.main(employee.getId());
				} catch (LeavesException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
    			break;
    		case 0:
    			System.out.println(ConsoleColors.GREEN +"Thank You See You Again!!");
    			System.exit(0);
    			break;
    			default:
    				System.err.println("Wrong Input");
    		}
    	}while(choice != 0);
    	
    	
    }
    
    
    public static void welcomeEmployee(Employee employee) {
		try {

			System.out.println();
			Thread.sleep(500);
			System.out.println(ConsoleColors.CYAN_BOLD+"　WELCOME TO EMPLOYEE PANEL "+ConsoleColors.RESET);
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
    
}

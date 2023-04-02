package com.hrms.dao;

import java.util.List;

import com.hrms.dto.Employee;
import com.hrms.dto.EmployeeImpl;
import com.hrms.exception.EmployeeException;

public interface EmployeeDao {
	/**
	 * This method will take Employee Object as a Parameter to add New Employee to database and Return type is void
	 * @param Employee Object
	 * @throws EmployeeException
	 */
	public void registerEmployee(EmployeeImpl employee) throws EmployeeException;
	
	/**
	 * This method will Produce the List of Employee Object's which is present in database
	 * @return List of Employee Objects
	 * @throws EmployeeException
	 */
	public List<EmployeeImpl> getAllEmployee()throws EmployeeException;
	
	/**
	 * This method will take employee Id, and Department id which is taken by the user as a parameter to Change the Employee's Department and Return type is void
	 * @param employeeID
	 * @param newDepartmentID entered by the user
	 * @throws EmployeeException
	 */
	public void changeDepartment(int employeeID, int newDepartmentID) throws EmployeeException;
	
	/**
	 * This method will take employee id as a Parameter to change their password
	 * @param employee id
	 * @throws EmployeeException
	 */
	public void changeEmpPassword(int id) throws EmployeeException;
	
	/**
	 * This method will take employee id as a parameter to produce particular employee
	 * @param employee id
	 * @return Employee object
	 * @throws EmployeeException
	 */
	public Employee getEmployeeByID(int id)throws EmployeeException;
	
	/**
	 * This method will take department id as a parameter to produce the employee's who are in that Department
	 * @param department id
	 * @return List of Employee's who belongs to particular Department
	 * @throws EmployeeException
	 */
	public List<EmployeeImpl> employeeByDepartment(int id)throws EmployeeException;
	
	/**
	 * This method is used to Update the Employee details
	 * @param Column of the table in database
	 * @param Value entered by the user
	 * @param employee id
	 * @throws EmployeeException
	 */
	public void updateEmployee(String Column, String typeName, int id) throws EmployeeException;
	
}

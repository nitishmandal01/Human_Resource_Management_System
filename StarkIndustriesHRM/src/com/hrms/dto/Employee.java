package com.hrms.dto;

public interface Employee {
	/**
	 * This method is used to get the Employee Id
	 * @return Employee Id
	 */
	public int getId();
	/**
	 * This method is used to set Employee Id
	 * @param Employee id
	 */
	
	public void setId(int id);
	/**
	 * This method is used to get the First Name of Employee
	 * @return Employee's First Name
	 */
	public String getFirstName();
	
	/**
	 * This method is used to set Employee First Name
	 * @param firstName
	 */
	public void setFirstName(String firstName);
	
	/**
	 * This method is used to get the Last Name of Employee
	 * @return Employee's Last Name
	 */
	public String getLastName();
	
	/**
	 * This method is used to set Employee LastName
	 * @param lastName
	 */
	public void setLastName(String lastName);
	/**
	 * This method is used to get the Mobile Number of the Employee
	 * @return Employee's Mobile Number
	 */
	public String getMobile();
	
	/**
	 * This method is used to set Employee Mobile Number
	 * @param mobile
	 */
	public void setMobile(String mobile);
	/**
	 * This method is used to get the Email of Employee
	 * @return Employee's Email Id
	 */
	public String getEmail();
	
	/**
	 * This method is used to set Employee Email Id
	 * @param email
	 */
	public void setEmail(String email);
	/**
	 * This method is used to get the Password of Employee
	 * @return Employee's Password
	 */
	public String getPassword();
	
	/**
	 * This method is used to set Employee Password
	 * @param password
	 */
	public void setPassword(String password);
	/**
	 * This method is used to get the Date of Birth of Employee
	 * @return Employee's Date Of Birth
	 */
	public String getDateOfBirth();
	
	/**
	 * This method is used to set Employee Date of Birth
	 * @param dateOfBirth
	 */
	
	public void setDateOfBirth(String dateOfBirth);
	/**
	 * This method is used to get the Address of the Employee
	 * @return Employee's Address
	 */
	public String getAddress();
	
	/**
	 * This method is used to set Employee Address
	 * @param address
	 */
	public void setAddress(String address);
	/**
	 * This method is used to get the Salary of Employee
	 * @return Employee's Salary
	 */
	public int getSalary();
	
	/**
	 * This method is used to set Employee Salary
	 * @param salary
	 */
	public void setSalary(int salary);
	/**
	 * This method is used to get the Date of Joining of the Employee
	 * @return Employee's Date of Joining
	 */
	public String getDateOfJoining();
	
	/**
	 * This method is used to set Employee Date of Joining
	 * @param dateOfJoining
	 */
	public void setDateOfJoining(String dateOfJoining);
	/**
	 * This method is used to get the Department Id of the Employee
	 * @return Employee's Department Id
	 */
	public int getDepartmentId();
	
	/**
	 * This method is used to set Employee Department Id
	 * @param departmentId
	 */
	public void setDepartmentId(int departmentId);
}

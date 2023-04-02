package com.hrms.dto;

public interface Leaves {
	/**
	 * This method is to get Employee Id
	 * @return Employee Id
	 */
	public int getEmployeeId();

	/**
	 * This method is used to set Employee id
	 * @param employeeId
	 */
	public void setEmployeeId(int employeeId);

	/**
	 * This method is to get Employee First Name
	 * @return
	 */
	public String getFirstName();

	/**
	 * This method is used to set Employee FirstName
	 * @param firstName
	 */
	public void setFirstName(String firstName);

	/**
	 * This method is to get Employee Last Name
	 * @return
	 */
	public String getLastName();

	/**
	 * This method is used to set Employee Last Name
	 * @param lastName
	 */
	public void setLastName(String lastName);

	/**
	 * This method is to get Employee Department Id
	 * @return departmentId
	 */
	public int getDepartmentId();

	/**
	 * This method is used to set Employee Department Id
	 * @param departmentId
	 */
	public void setDepartmentId(int departmentId);

	/**
	 * This method is to get Employee Leave Start Date
	 * @return Leave Start Date
	 */
	public String getLeaveStart();

	/**
	 * This method is used to set Employee Leave Start Date
	 * @param leaveStart
	 */
	public void setLeaveStart(String leaveStart);

	/**
	 * This method is to get Employee Leave End Date
	 * @return Leave End Date
	 */
	public String getLeaveEnd();

	/**
	 * This method is used to set Employee Leave End Date
	 * @param leaveEnd
	 */
	public void setLeaveEnd(String leaveEnd);

	/**
	 * This method is to get Employee Leave Status
	 * @return Leave Status
	 */
	public String getStatus();

	/**
	 * This method is used to set Employee Leave Status
	 * @param status
	 */
	public void setStatus(String status);
	
	/**
	 * This method is used to set Employee Leave Id
	 * @param leaveid
	 */
	public void setLeaveId(int leaveid);
	
	/**
	 * This method is to get Employee Leave ID
	 * @return Leave Id
	 */
	public int getLeaveId();
}

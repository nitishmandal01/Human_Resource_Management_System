package com.hrms.dao;

import java.util.List;

import com.hrms.dto.LeavesImpl;
import com.hrms.exception.LeavesException;

public interface LeavesDao {
	
	/**
	 * This method is used for Employee to request for a leave.
	 * @param employee id
	 * @param startDate(Leave From)
	 * @param endDate(Leave Till)
	 * @param FirstName
	 * @param LastName
	 * @param departmentid
	 * @throws LeavesException
	 */
	public void requestLeave(int id, String startDate, String endDate,String fname, String lname,int departmentid) throws LeavesException;
	
	/**
	 * This method is used to check all Approved Leaves
	 * @return List of Leaves Object's
	 * @throws LeavesException
	 */
	public List<LeavesImpl> approvedLeave() throws LeavesException;
	
	/**
	 * This method is used to Display all the Rejected Leaves List
	 * @return List of Leaves Object's
	 * @throws LeavesException
	 */
	public List<LeavesImpl> showAllRejectLeave() throws LeavesException;
	
	/**
	 * This method is used to Display all the Pending Leaves List
	 * @return List of Leaves Object
	 * @throws LeavesException
	 * @throws InterruptedException
	 */
	public List<LeavesImpl> pendingLeaves() throws LeavesException, InterruptedException;
	
	/**
	 * This method is used for Employee's to check the status of their applied Leaves
	 * @param Employee Id
	 * @return List of Leaves Object's
	 * @throws LeavesException
	 */
	public List<LeavesImpl> employeeLeaveStatus(int id) throws LeavesException;

}

package com.hrms.dto;

public class LeavesImpl implements Leaves{
	private int employeeId;
	private String firstName;
	private String lastName;
	private int departmentId;
	private String leaveStart;
	private String leaveEnd;
	private String status;
	private int leaveid;
	
	public LeavesImpl() {
		super();
	}
	
	public LeavesImpl(int employeeId, String firstName, String lastName, int departmentId, String leaveStart,
			String leaveEnd, String status) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.departmentId = departmentId;
		this.leaveStart = leaveStart;
		this.leaveEnd = leaveEnd;
		this.status = status;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public String getLeaveStart() {
		return leaveStart;
	}

	public void setLeaveStart(String leaveStart) {
		this.leaveStart = leaveStart;
	}

	public String getLeaveEnd() {
		return leaveEnd;
	}

	public void setLeaveEnd(String leaveEnd) {
		this.leaveEnd = leaveEnd;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "LeavesImpl [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", departmentId=" + departmentId + ", leaveStart=" + leaveStart + ", leaveEnd=" + leaveEnd
				+ ", status=" + status + "]";
	}

	@Override
	public void setLeaveId(int leaveid) {
		// TODO Auto-generated method stub
		this.leaveid = leaveid;
	}

	@Override
	public int getLeaveId() {
		// TODO Auto-generated method stub
		return leaveid;
	}
	
	
	
}

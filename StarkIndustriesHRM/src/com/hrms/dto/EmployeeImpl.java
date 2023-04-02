package com.hrms.dto;

public class EmployeeImpl implements Employee{
	private int id;
	private String firstName;
	private String lastName;
	private String mobile;
	private String email;
	private String password;
	private String dateOfBirth;
	private String address;
	private int salary;
	private String dateOfJoining;
	private int departmentId;
	
	public EmployeeImpl() {
		super();
	}
	
	public EmployeeImpl(String firstName, String lastName, String mobile, String email, String password,
			String dateOfBirth, String address, int salary, String dateOfJoining, int departmentId) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobile = mobile;
		this.email = email;
		this.password = password;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
		this.salary = salary;
		this.dateOfJoining = dateOfJoining;
		this.departmentId = departmentId;
	}
	
	public EmployeeImpl(int id,String firstName, String lastName, String mobile, String email, String password,
			String dateOfBirth, String address, int salary, String dateOfJoining, int departmentId) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobile = mobile;
		this.email = email;
		this.password = password;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
		this.salary = salary;
		this.dateOfJoining = dateOfJoining;
		this.departmentId = departmentId;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
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
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(String dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	
	@Override
	public String toString() {
		return "EmployeeImpl [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", mobile=" + mobile
				+ ", email=" + email + ", password=" + password + ", dateOfBirth=" + dateOfBirth + ", address="
				+ address + ", salary=" + salary + ", dateOfJoining=" + dateOfJoining + ", departmentId=" + departmentId
				+ "]";
	}
	
	
}

package com.hrms.dto;

public interface Department {
	/**
	 * This method is used to get the department id
	 * @return department id
	 */
	public int getId();
	
	/**
	 * This method is used to set the department id
	 * @param department id 
	 */
	public void setId(int id);
	
	/**
	 * This method is used to get the department name
	 * @return Department Name
	 */
	public String getName();
	/**
	 * This method is used to set the department name
	 * @param Department Name
	 */
	public void setName(String name);
}

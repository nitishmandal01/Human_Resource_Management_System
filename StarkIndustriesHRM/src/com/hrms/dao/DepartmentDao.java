package com.hrms.dao;

import java.util.List;

import com.hrms.dto.DepartmentImpl;
import com.hrms.exception.DepartmentException;

public interface DepartmentDao {
	
	/**
	 * This method will get the DepartmentImplementation Object as parameter and add the data in the database, Return type is void
	 * @param Department Object
	 * @throws DepartmentException
	 */
	public void addDepartment(DepartmentImpl dept) throws DepartmentException;
	
	/**
	 * This method will produce the List of DepartmentImplementation Objects
	 * @return List of Department's Object
	 * @throws DepartmentException
	 */
	public List<DepartmentImpl> getAllDepartment() throws DepartmentException;
	
	/**
	 * This method will take Department Object as a parameter to Update, Return type is void
	 * @param Department Object
	 * @throws DepartmentException
	 */
	public void updateDepartment(DepartmentImpl department) throws DepartmentException;
}

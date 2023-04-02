package com.hrms.dto;

public class DepartmentImpl implements Department{
	private int id;
	private String name;
	
	public DepartmentImpl(String name) {
		super();
		
		this.name = name;
	}
	
	public DepartmentImpl(int id,String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public DepartmentImpl() {
		super();
	}
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "DepartmentImpl [id=" + id + ", name=" + name + "]";
	}

	
	
	
}

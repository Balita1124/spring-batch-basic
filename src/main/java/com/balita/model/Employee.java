package com.balita.model;

public class Employee {

	private String fullname;

	public Employee() {
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	@Override
	public String toString() {
		return "Employee [fullname=" + fullname + "]";
	}
		
}

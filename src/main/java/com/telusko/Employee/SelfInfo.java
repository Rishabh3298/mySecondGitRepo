package com.telusko.Employee;

public class SelfInfo {

	private String Id;
	private String name;
	private double salary;
	private String address;
	
    
	public void setId(String id) {
		Id = id;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", name=" + name + ", salary=" + salary + ", address=" + address + "]";
	}






	
	
	
	
	

}

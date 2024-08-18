package com.telusko.Employee;

public class Employee implements IEmployee {
	
	private String Id;
	private String name;
	private double salary;
	private String address;
	
	
//	
//	public Employee(String id, String name, double salary, String address){
//		this.Id = id;
//		this.name = name;
//		this.salary = salary;
//		this.address = address;
//		System.out.println("Employee bean created with for Rishabh " + id.toString());
//	}

    
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

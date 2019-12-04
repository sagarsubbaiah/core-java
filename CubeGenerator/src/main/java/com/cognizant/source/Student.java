package com.cognizant.source;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	
	
	private String name;
	//@Autowired
	private Address address;
	
	
	/*public String getName() {
		return name;
	}*/
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
//	public Student(String name)
//	{
//		this.name=name;
//	}
//	
//	public Student(Address address)
//	{
//		this.address=address;
//	}
	
	//business logic method
	public void display()
	{
		System.out.println("student name is "+name+" his address is " +address);
	}
	public Student()
	{
		
	}

}

package com.cognizant.controller;

public class Student {
	public String name;
	public int age;
	public String degree;
	public Student(String name, int age, String degree) {
		this.age=age;
		this.name=name;
		this.degree=degree;
	}
	public String getName() {
		return name;
	}

}

package com.cognizant.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cognizant.config.AppConfig;
import com.cognizant.source.Student;

public class Test {
	
	public static void main(String[] args)
	{
		
		//ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Student student = (Student)context.getBean("student");
		student.display();
	}

}
	
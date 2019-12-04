package com.cognizant.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cognizant.source.Address;
import com.cognizant.source.Student;

@Configuration
public class AppConfig {
	@Bean(name="student")
	public Student getStudent() {
		Address add = new Address();
		add.setCityName("Bangalore");
		Student st = new Student();
		st.setName("Sagar");
		st.setAddress(add);
		return st;
	}

}

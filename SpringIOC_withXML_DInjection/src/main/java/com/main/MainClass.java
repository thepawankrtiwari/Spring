package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.entity.College;
import com.entity.Student;

public class MainClass {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("springbeans.xml");
		Student s = context.getBean(Student.class);
//		College c = context.getBean(College.class);
		System.out.println(s);
//		System.out.println(c);
	}

}

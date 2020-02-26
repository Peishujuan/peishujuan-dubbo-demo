package com.peishujuan;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.peishujuan.pojo.Student;
import com.peishujuan.service.StudentService;

public class ConsumerStart {

	private static ClassPathXmlApplicationContext context;
	private static StudentService studentService;
	
	
	public static void main(String[] args) {
		
		context = new ClassPathXmlApplicationContext("classpath:ApplicationContext.xml");
		
		studentService = context.getBean(StudentService.class);
		
		Student student = studentService.getById(1);
		
		System.out.println("student is " + student);
		
		Student addAge = studentService.addAge(student, 2);
		
		System.out.println("增加年龄后的数据"+addAge);
	}
}

package com.peishujuan.service.Impl;

import com.peishujuan.pojo.Student;
import com.peishujuan.service.StudentService;

public class StudentServiceImpl implements StudentService{

	public Student getById(Integer id) {
		Student student = new Student();
		student.setId(id);
		student.setName("蜡笔小新");
		student.setAge(18);
		return student;
	}

	public Student addAge(Student stu, Integer n) {
		//增加年龄
		stu.setAge(stu.getAge() + n);
		return stu;
	}

}

package com.peishujuan.service;

import com.peishujuan.pojo.Student;

public interface StudentService {

	/**
	 * 根据Id获取一个学生
	 * @param id
	 * @return
	 */
	Student getById(Integer id);
	/**
	 * 增加年龄
	 * @param age
	 * @return
	 */
	Student addAge(Student stu,Integer n);
}

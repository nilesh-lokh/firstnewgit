package com.inno.service;

import java.util.Optional;

import com.inno.model.Student;


public interface ServiceI {
	
	
	public Student save1(Student student);
	public java.util.List<Student> all();
	public Optional<Student> single(int a);

}

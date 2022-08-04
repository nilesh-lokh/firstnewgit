package com.inno.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inno.model.Student;
import com.inno.repository.Repo;

@Service
public class ServiceIMPL implements ServiceI {
	@Autowired
	private Repo repo;

	@Override
	public Student save1(Student student) {
		 
		Student student2 = repo.save(student);
		
		return student2;
		
	}

	@Override
	public List<Student> all() {
		List<Student> all = repo.findAll();
		return all;
	}

	@Override
	public Optional<Student> single(int a) {
		Optional<Student> byId = repo.findById(a);
		return byId;
	}

}

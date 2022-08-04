package com.inno.controller;

import java.security.PublicKey;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.inno.model.Student;
import com.inno.service.ServiceIMPL;

@RestController
public class StuController {
	
	@Autowired
	private ServiceIMPL serviceIMPL;
@PostMapping(value="/sav", consumes = "application/json",produces = "application/json")
	public ResponseEntity<Student> savei(@RequestBody Student student){
		
		Student student2 = serviceIMPL.save1(student);
		return new ResponseEntity<Student>( student2,HttpStatus.ACCEPTED);
		
		}
		@GetMapping(value ="/fetch")
        public ResponseEntity<List<Student>> all(){
	
	List<Student> all = serviceIMPL.all();
	
	return new ResponseEntity<List<Student>>(all,HttpStatus.ACCEPTED);	
	}

		@GetMapping(value="/sinl")
		public ResponseEntity<Optional<Student>> byid(@RequestBody int a){
			
			Optional<Student> single = serviceIMPL.single(a);
			
			
			return new ResponseEntity<Optional<Student>>(single,HttpStatus.OK);
			
			
			
			
		}
		
		
		
}

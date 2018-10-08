package com.DbPractice;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentControllerDB {
	
	@Autowired
	public StudentServiceDB studentService;
	
	@GetMapping("/students")
	public List<StudentDB> getAll(){
		return studentService.getAllStudents();
	}

	@RequestMapping("/students/{id}")
	public Optional<StudentDB> getStudent(@PathVariable("id") int x){
		return studentService.getStudent(x);
	}
	@RequestMapping(method=RequestMethod.POST,value="/students")
	public String AddStudent(@RequestBody StudentDB s){
		return studentService.AddStudent(s);
	}
	@DeleteMapping("/students/{id}")
	public String DeleteStudent(@PathVariable int id){
		return studentService.DeleteStudent(id);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/students/{id}")
	public String updateStudent(@RequestBody StudentDB s,@PathVariable int id){
		return studentService.updateStudent(s,id);
	}
}
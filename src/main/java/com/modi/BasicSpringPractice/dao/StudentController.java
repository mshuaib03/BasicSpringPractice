package com.modi.BasicSpringPractice.dao;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@Autowired
	public StudentService studentService;
	
	@GetMapping("/students")
	public List<Student> getAll(){
		return studentService.getAllStudents();
	}

	@RequestMapping("/students/{id}")
	public Student getStudent(@PathVariable("id") int x){
		return studentService.getStudent(x);
	}
	@RequestMapping(method=RequestMethod.POST,value="/students")
	public String AddStudent(@RequestBody Student s){
		return studentService.AddStudent(s);
	}
	@DeleteMapping("/students/{id}")
	public String DeleteStudent(@PathVariable int id){
		return studentService.DeleteStudent(id);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/students/{id}")
	public String updateStudent(@RequestBody Student s,@PathVariable int id){
		return studentService.updateStudent(s,id);
	}
}

package com.DbPractice;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;



@Component
public class StudentServiceDB {
	@Autowired
	private StudentRepoDB studentrepo;
	
	public List<StudentDB> getAllStudents(){
		List<StudentDB> l1 = new ArrayList();
		studentrepo.findAll()
		.forEach(l1::add);
		return l1;
	}
	
	public Optional<StudentDB> getStudent(int id){
		return studentrepo.findById(id);
		
		}
	public String AddStudent(StudentDB s){
		studentrepo.save(s);
		return "Added Successfully";
	}

	public String DeleteStudent(int id){
		if(studentrepo.existsById(id))
		{
			studentrepo.deleteById(id);
			return "deleted Successfully";
		}
		return "Id not found Thanks for your Patience";
	}
	
	public String updateStudent(StudentDB s,int id){
		if(studentrepo.existsById(id))
			{
				studentrepo.save(s); 
				return "Edit Successfully";
			}
		return "Id not found Thanks for your Patience";
	}
}
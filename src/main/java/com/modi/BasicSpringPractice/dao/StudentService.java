package com.modi.BasicSpringPractice.dao;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Iterator;

import org.springframework.stereotype.Service;



@Service
public class StudentService {
	
	private List<Student> l1 = new ArrayList(Arrays.asList(
	new Student(1,"ABCB","34"),
	new Student(2,"ABCD","32"),
	new Student(3,"ABCE","35")
	));
	public List<Student> getAllStudents(){
		return l1;
	}
	
	public Student getStudent(int id){
		Student s1 = new Student(-1,"","");
		for( Student  s : l1){
			if(id==s.getId())
			return s;
		}
		return s1;
	}
	public String AddStudent(Student s){
		l1.add(s);
		return "Added Successfully";
	}

	public String DeleteStudent(int id){
		Iterator <Student> itr =  l1.iterator();
		while(itr.hasNext()){
			if(itr.next().getId() == id)
			   {itr.remove(); return "removed Successfully";}
			
		}
		return "Id not found Thanks for your Patience";
	}
	
	public String updateStudent(Student s,int id){
		Iterator <Student> itr =  l1.iterator();
		while(itr.hasNext()){
			if(itr.next().getId() == id)
			   {itr.remove(); l1.add(s);return "Updated Successfully";}
			
		}
		return "Id not found Thanks for your Patience";
	}
}

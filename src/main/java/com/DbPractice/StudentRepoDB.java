package com.DbPractice;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;


public interface StudentRepoDB extends JpaRepository<StudentDB,Integer>{
	@Query("select name from StudentDB ")
	List<String> findname();
	StudentDB findByNameAndAge(String name,String age);
	
	/*@Query("select CourseDB.name from CourseDB INNER JOIN StudentDB ON CourseDB.id  = StudentDB.fk")
	List<String> findCoursename();*/
	
}

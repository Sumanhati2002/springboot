package com.springboot.db.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.springboot.db.model.Student;

@Repository
public interface StudentDao extends CrudRepository<Student, Integer>{
 
	public List<Student> findByName(String name);
	public List<Student> findBynameAndAddress(String name,String address);
	
	///JPQL query
	@Query("select s FROM Student s")
	public List<Student> getAllStudent();
	
	@Query("select s FROM Student s WHERE s.address= :a")
	public List<Student> getByAddress(@Param("a") String address);
	
	///Native query
	@Query(value = "select * from Student", nativeQuery = true)
	public List<Student> getAllAddress();
}

package com.springboot.db;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springboot.db.dao.StudentDao;
import com.springboot.db.model.Student;

@SpringBootApplication
public class SpringBootDbConnecApplication {

	public static void main(String[] args) {
		org.springframework.context.ApplicationContext context= SpringApplication.run(SpringBootDbConnecApplication.class, args);
		
		  StudentDao studentDao=context.getBean(StudentDao.class);
			/*
			 * Student student=new Student(0, "suman", "kolkata"); Student student1=new
			 * Student(0, "hati", "wb");
			 */
		 
			/*
			 * List<Student> sList=List.of(student,student1); Iterable<Student>
			 * resIterable=studentDao.saveAll(sList); resIterable.forEach(students->{
			 * System.out.println(students); });
			 */
		/*
		 * System.out.println(student2); System.out.println(student3);
		 */

		 //update data
			/*
			 * Optional<Student> findstudent=studentDao.findById(252); Student
			 * student=findstudent.get(); student.setAddress("Medinipur");
			 * studentDao.save(student); System.out.println(student);
			 */
		 
		 //delete data
			/*
			 * studentDao.deleteById(253); System.out.println("deleted...");
			 */
		  
		  //////////
			/*
			 * List<Student> students=studentDao.findByName("suman");
			 * students.forEach(e->System.out.println(e));
			 */
		  
		  /////////
			/*
			 * List<Student> students=studentDao.findBynameAndAddress("suman", "Medinipur");
			 * students.forEach(a->System.out.println(a));
			 */
		 
		 //////
			/*
			 * List<Student> students=studentDao.getAllStudent();
			 * students.forEach(s->System.out.println(s));
			 */
		   
		   /////////
			/*
			 * List<Student> addList=studentDao.getByAddress("Medinipur");
			 * addList.forEach(a->System.out.println(a));
			 */
		   
		   /////
		   List<Student> alladdressList=studentDao.getAllAddress();
		   alladdressList.forEach(AA->System.out.println(AA));
	}

}

















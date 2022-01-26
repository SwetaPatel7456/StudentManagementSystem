package com.student.student;

import com.student.student.Entity.Students;
import com.student.student.Repository.StudentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentApplication.class, args);

	}

	@Autowired
	private StudentRepository studentRepository;

	public StudentApplication(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}

	@Override
	public void run(String... args) throws Exception {

//		Students student1 = new Students();
//		student1.setFname("Ram");
//		student1.setLname("Patel");
//		student1.setEmail("kk@gmail.com");
//		studentRepository.save(student1);

		/*
		 * Students student2 = new Students();
		 * student2.setFname("Eva");
		 * student2.setLname("Patel");
		 * student2.setEmail("s@gmail.com");
		 * studentRepository.save(student2);
		 * Students student3 = new Students();
		 * student3.setFname("Radha");
		 * student3.setLname("Patel");
		 * student3.setEmail("s@gmail.com");
		 * studentRepository.save(student3);
		 */

	}

}

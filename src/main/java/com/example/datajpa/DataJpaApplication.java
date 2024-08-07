package com.example.datajpa;

import com.example.datajpa.model.Student;
import com.example.datajpa.repo.StudentRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DataJpaApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(DataJpaApplication.class, args);
		Student s = applicationContext.getBean(Student.class);
		StudentRepo repo = applicationContext.getBean(StudentRepo.class);
		s.setRollNo(13);
		s.setMarks(90);
		s.setName("Vamzee");

		System.out.println(s);
		repo.save(s);
	}
}

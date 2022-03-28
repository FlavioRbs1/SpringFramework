package com.springData;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.springData.entities.Student;
import com.springData.repository.StudentRepository;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringDataJpaApplicationTests {

	@Autowired
	private StudentRepository repository;
	
	@Test
	public void testSaveStudent() {
		Student student = new Student();
		student.setId(1L);
		student.setName("Flavio");
		student.setTestScore(100);
		repository.save(student);
		
		Student savedStudent = repository.findById(1l).get();
		assertNotNull(savedStudent);
	}

}

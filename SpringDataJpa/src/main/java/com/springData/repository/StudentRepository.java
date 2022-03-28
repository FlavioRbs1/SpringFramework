package com.springData.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springData.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}

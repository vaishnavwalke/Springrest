package com.telusko.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.telusko.demo.entities.Course;

public interface CourseDao extends JpaRepository<Course, Long>{

	
}

package com.example.demo.services;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.example.demo.entities.Course;

public interface CourseService {

	public List<Course> getCourses();

	public Course getCourse(long courseId);

	public Course addCourse(Course course);

	public Course renameCourse(Course course);

	public void deleteCourse(long parseLong);

	//public boolean deleteCourse(long courseId);
}

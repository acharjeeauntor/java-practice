package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Course;
import com.example.demo.services.CourseService;

@RestController
public class MyController {
	
	@Autowired
	private CourseService courseservice;

	@GetMapping("/home")
	public String home() {
		return "This is home";
	}
	
	//Get the courses
	@GetMapping("/courses")
	public List<Course> getCourses(){
		return courseservice.getCourses();
	}
	
	@GetMapping("/courses/{courseId}")
	public Course getCourse(@PathVariable String courseId) {
		return courseservice.getCourse(Long.parseLong(courseId));
	}
	
//	@PostMapping(path="/courses",consumes="application/json")
//	public Course addCourse(@RequestBody Course course) {
//		return courseservice.addCourse(course);
//	}
	
	@PostMapping("/courses")
	public Course addCourse(@RequestBody Course course) {
		return courseservice.addCourse(course);
	}
	
	@PutMapping("/courses")
	public Course renameCourse(@RequestBody Course course) {
		return courseservice.renameCourse(course);
	}
	
	@DeleteMapping("/courses/{courseId}")
	public boolean deleteCourse(@PathVariable String courseId ) {
		return courseservice.deleteCourse(Long.parseLong(courseId));
	}
	
} 

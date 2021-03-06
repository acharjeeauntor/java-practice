package com.example.demo.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

	
	//Get all the courses
	@GetMapping("/courses")
	public List<Course> getCourses(){
		return courseservice.getCourses();
	}
	
	//Get a single course
	@GetMapping("/courses/{courseId}")
	public Course getCourse(@PathVariable String courseId) {
		return courseservice.getCourse(Long.parseLong(courseId));
	}
	
//	@PostMapping(path="/courses",consumes="application/json")
//	public Course addCourse(@RequestBody Course course) {
//		return courseservice.addCourse(course);
//	}
	
	//Add a single course
	@PostMapping("/courses")
	public Course addCourse(@RequestBody Course course) {
		return courseservice.addCourse(course);
	}
	
	//Edit a single course
	@PutMapping("/courses")
	public Course renameCourse(@RequestBody Course course) {
		return courseservice.renameCourse(course);
	}
	
	//Delete a single course
//	@DeleteMapping("/courses/{courseId}")
//	public boolean deleteCourse(@PathVariable String courseId ) {
//		return courseservice.deleteCourse(Long.parseLong(courseId));
//	}
	
	//Delete a single course
	@DeleteMapping("/courses/{courseId}")
	public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String courseId ) {
		try {
			courseservice.deleteCourse(Long.parseLong(courseId));
			return new ResponseEntity<>(HttpStatus.OK);
		}catch(Exception e){
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
	
	
} 

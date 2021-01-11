package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.dao.CourseDao;
import com.example.demo.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {
	
	@Autowired
	private CourseDao courseDao;
	
	public CourseServiceImpl() {
	
	}

	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return courseDao.findAll();
	}

//	@Override
//	public Course getCourse(long courseId) {
//		System.out.println("gotit:"+courseDao.getOne(courseId));
//		return courseDao.getOne(courseId);
//	}
	
	@Override
	public Course getCourse(long courseId) {
		//System.out.println("gotit:"+courseDao.getOne(courseId));
		return courseDao.findById(courseId).get();
	}

	@Override
	public Course addCourse(Course course) {
		courseDao.save(course);
		return course;
	}

	@Override
	public Course renameCourse(Course course) {
		courseDao.save(course);
		return course;
	}

//	@Override
//	public void deleteCourse(long parseLong) {
//		Course entity = courseDao.getOne(parseLong);
//		courseDao.delete(entity);
//	}

	@Override
	public void deleteCourse(long parseLong) {
		courseDao.deleteById(parseLong);
	}
	

}

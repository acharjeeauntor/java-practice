package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {
	
	List<Course> list;

	public CourseServiceImpl() {
		list = new ArrayList<>();
		list.add(new Course(145,"abc","my desc"));
		list.add(new Course(155,"ac","my descghgwew"));
		list.add(new Course(185,"akoiic","my descghgh"));
	}

	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public Course getCourse(long courseId) {
		Course c = null;
		for(Course course:list) {
			if(course.getId()==courseId) {
				c=course;
				break;
			}
		}
		return c;
	}

	@Override
	public Course addCourse(Course course) {
		list.add(course);
		return course;
	}

	@Override
	public Course renameCourse(Course course) {
		list.add(course);
		return course;
	}

	
	@Override
	public boolean deleteCourse(long courseId) {
		var isRemoved=list.removeIf(c->c.getId()==courseId);
		return isRemoved;
	}

}

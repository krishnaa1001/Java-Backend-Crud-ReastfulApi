package com.springrest.springrest.services;

//import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entities.Course;
@Service
public class CourseSericeImpl implements CourseService {
	
	@Autowired
	private CourseDao courseDao;
	
//	List<Course> list;
	
	
	public CourseSericeImpl()
	{
//		list = new ArrayList<>();
//		list.add(new Course(44,"java","Learn java with krishna "));
//		list.add(new Course(442,"pyhton","Learn python with krishna "));
	}


	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
//		return list;
		return courseDao.findAll();
	}


	@Override
	public Course getCourse(long courseid) {
//		Course c=null;
//		for(Course course:list)
//		{
//			if(course.getId()==courseid)
//			{
//				c=course;
//				break;
//			}
//		}
//		return c;
		return courseDao.findById(courseid).get();
	}


	@Override
	public Course addCourse(Course course) {
//		list.add(course);
//		return course;
		courseDao.save(course);
		return course;
	}


	@Override
	public Course updateCourse(Course course) {
//		list. forEach(e -> {
//	     if (e.getId() == course.getId()) {
//	        e.setName(course.getName());
//	        e.setDescription(course.getDescription());
//	     }
//	});
//		return course;
		courseDao.save(course);
		return course;
	}


	@Override
	public void deleteCourse(long parseLong) {
		
//		list =this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
		Course entity=courseDao.findById(parseLong).get();
		courseDao.delete(entity);
	}

}

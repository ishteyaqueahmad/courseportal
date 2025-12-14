package com.ishteyaque.courseportal.service.impl;

import com.ishteyaque.courseportal.entity.Course;
import com.ishteyaque.courseportal.repository.CourseRepo;
import com.ishteyaque.courseportal.service.CourseService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CourseServiceImpl implements CourseService {


    private final CourseRepo courseRepo;
    public CourseServiceImpl(CourseRepo courseRepo){
        this.courseRepo=courseRepo;
    }
    @Override
    public List<Course> getCourses() {
        return courseRepo.findAll();
    }

    @Override
    public Course saveCourse(Course course) {
        return courseRepo.save(course);
    }
}

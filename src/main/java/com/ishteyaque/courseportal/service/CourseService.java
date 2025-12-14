package com.ishteyaque.courseportal.service;

import com.ishteyaque.courseportal.entity.Course;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface CourseService {
    public List<Course> getCourses();

    Course saveCourse(Course course);
}

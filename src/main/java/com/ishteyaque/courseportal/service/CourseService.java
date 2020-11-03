package com.ishteyaque.courseportal.service;

import com.ishteyaque.courseportal.entity.Course;
import com.ishteyaque.courseportal.repository.CourseRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService extends BaseService{

    private final CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public List<Course> getAllAvailableCourse(){
         List<Course> result = new ArrayList<>();
         Iterable<Course> courses = courseRepository.findAll();
         courses.forEach(course -> result.add(course));
         return result;
    }

    public void saveCourse(Course course){
         courseRepository.save(course);
    }

    public void deleteUsingId(Long id)
    {
        courseRepository.deleteById(id);
    }
}

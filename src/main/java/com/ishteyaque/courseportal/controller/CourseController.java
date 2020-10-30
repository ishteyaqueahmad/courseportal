package com.ishteyaque.courseportal.controller;

import com.ishteyaque.courseportal.entity.Course;
import com.ishteyaque.courseportal.service.CourseService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {

    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping("/courses")
    public List<Course> getAllCourses(){
        return courseService.getAllAvailableCourse();
    }
}

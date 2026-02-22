package com.ishteyaque.courseportal.controller;

import com.ishteyaque.courseportal.entity.Course;
import com.ishteyaque.courseportal.service.CourseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courseportal")
public class CourseController {

    private CourseService courseService;

    public CourseController(CourseService courseService){
        this.courseService=courseService;
    }
@GetMapping("/courses")
    public List<Course> getCourses(){
        return courseService.getCourses();
    }

    @PostMapping("/course")
    public Course createCourse(@RequestBody Course course){
       return courseService.saveCourse(course);
    }

    @PostMapping("/course/{id}")
    public Course updateCourse(@PathVariable Long id,@RequestBody Course course){
        return courseService.updateCourse(id, course);
    }
}

package com.ishteyaque.courseportal.controller;

import com.ishteyaque.courseportal.entity.Course;
import com.ishteyaque.courseportal.service.CourseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courseportal")
public class CourseController {

    private final CourseService courseService;

    public CourseController(CourseService courseService) {

        this.courseService = courseService;
    }

    @GetMapping("/courses")
    public ResponseEntity< List<Course>> getAllCourses(){


        return new ResponseEntity<>(courseService.getAllAvailableCourse(), HttpStatus.OK);
    }
@PostMapping("/course")
    public Course save(@RequestBody  Course course) {
         courseService.saveCourse(course);
    return course;
    }

    @DeleteMapping("/deleteUser/{id}")
        public void delete(@PathVariable String id){

        Long userId=Long.parseLong(id);
        courseService.deleteUsingId(userId);
    }
}

package com.ishteyaque.courseportal.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ishteyaque.courseportal.entity.Course;
import com.ishteyaque.courseportal.service.CourseService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(CourseController.class)
class CourseControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private CourseService courseService;

    @Autowired
    private ObjectMapper objectMapper;

    private Course course1;
    private Course course2;

    @BeforeEach
    void setUp() {
        course1 = new Course();
        course1.setId(1L);
        course1.setTitle("Java Spring Boot");

        course2 = new Course();
        course2.setId(2L);
        course2.setTitle("REST APIs");
    }

    @Test
    void testGetCourses_Success() throws Exception {
        List<Course> courses = new ArrayList<>();
        courses.add(course1);
        courses.add(course2);

        when(courseService.getCourses()).thenReturn(courses);

        mockMvc.perform(get("/courseportal/courses"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(2)))
                .andExpect(jsonPath("$[0].id", is(1)))
                .andExpect(jsonPath("$[0].title", is("Java Spring Boot")))
                .andExpect(jsonPath("$[1].id", is(2)))
                .andExpect(jsonPath("$[1].title", is("REST APIs")));
    }

    @Test
    void testGetCourses_Empty() throws Exception {
        List<Course> courses = new ArrayList<>();

        when(courseService.getCourses()).thenReturn(courses);

        mockMvc.perform(get("/courseportal/courses"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(0)));
    }

    @Test
    void testCreateCourse_Success() throws Exception {
        Course newCourse = new Course();
        newCourse.setTitle("Docker Basics");

        Course savedCourse = new Course();
        savedCourse.setId(3L);
        savedCourse.setTitle("Docker Basics");

        when(courseService.saveCourse(any(Course.class))).thenReturn(savedCourse);

        mockMvc.perform(post("/courseportal/course")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(newCourse)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id", is(3)))
                .andExpect(jsonPath("$.title", is("Docker Basics")));
    }

    @Test
    void testCreateCourse_InvalidData() throws Exception {
        String invalidCourseJson = "{}";

        mockMvc.perform(post("/courseportal/course")
                .contentType(MediaType.APPLICATION_JSON)
                .content(invalidCourseJson))
                .andExpect(status().isOk());
    }

    @Test
    void testUpdateCourse_Success() throws Exception {
        Long courseId = 1L;
        Course updatedCourse = new Course();
        updatedCourse.setId(1L);
        updatedCourse.setTitle("Advanced Java");

        when(courseService.updateCourse(eq(courseId), any(Course.class))).thenReturn(updatedCourse);

        mockMvc.perform(post("/courseportal/course/update/{id}", courseId)
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(updatedCourse)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id", is(1)))
                .andExpect(jsonPath("$.title", is("Advanced Java")));
    }
}


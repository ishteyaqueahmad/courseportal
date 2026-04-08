package com.ishteyaque.courseportal.exception;

public class Exception {
        public static class CourseNotFoundException extends RuntimeException{
            public CourseNotFoundException(String message) {
                super(message);
            }
        }
}

package com.ishteyaque.courseportal.repository;

import com.ishteyaque.courseportal.entity.Course;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends CrudRepository<Course,Long> {
}

package com.bhasha.xInstitute.repository;

import com.bhasha.xInstitute.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CourseRepository extends JpaRepository<Course, Long> {
    Optional<Course> findByCourseName(String name);
}

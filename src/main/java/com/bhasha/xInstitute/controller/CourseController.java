package com.bhasha.xInstitute.controller;

import com.bhasha.xInstitute.dto.CourseDto;
import com.bhasha.xInstitute.model.Course;
import com.bhasha.xInstitute.model.Student;
import com.bhasha.xInstitute.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/course-service")
public class CourseController {
    private CourseService studentService;

    @GetMapping("/courses")
    public ResponseEntity <List<Course>> getAllCourses() {
        List<Course> allCourses = studentService.getAllCourses();
        return ResponseEntity.ok(allCourses);
    }
}

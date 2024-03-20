package com.bhasha.xInstitute.service;

import com.bhasha.xInstitute.dto.CourseDto;
import com.bhasha.xInstitute.model.Course;

import java.util.List;

public interface CourseService {
    List<Course> getAllCourses();
}

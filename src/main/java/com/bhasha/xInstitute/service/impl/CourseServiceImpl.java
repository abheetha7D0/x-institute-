package com.bhasha.xInstitute.service.impl;

import com.bhasha.xInstitute.model.Course;
import com.bhasha.xInstitute.repository.CourseRepository;
import com.bhasha.xInstitute.service.CourseService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.*;
@Service
@Transactional
@RequiredArgsConstructor
public class CourseServiceImpl implements CourseService {

    private CourseRepository courseRepository;

    @Override
    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }
}

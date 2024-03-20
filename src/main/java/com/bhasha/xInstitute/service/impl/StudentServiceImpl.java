package com.bhasha.xInstitute.service.impl;

import com.bhasha.xInstitute.dto.request.AddStudentDtoRequest;
import com.bhasha.xInstitute.enums.ErrorCode;
import com.bhasha.xInstitute.exception.GenericException;
import com.bhasha.xInstitute.model.Course;
import com.bhasha.xInstitute.model.Student;
import com.bhasha.xInstitute.repository.CourseRepository;
import com.bhasha.xInstitute.repository.StudentRepository;
import com.bhasha.xInstitute.service.StudentService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.*;
@Service
@Transactional
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;
    private CourseRepository courseRepository;

    @Override
    public Student addStudentById(AddStudentDtoRequest req) {
        Course course = courseRepository.findByCourseName(req.getCourseName()).orElseThrow(() -> new GenericException(ErrorCode.NOT_FOUND));
        Student student = new Student(req.getFirstName(), req.getLastName(), req.getBirthday(),req.getAddress(),req.getContactNumber(),course);
        return studentRepository.save(student);
    }

    @Override
    public Student getStudentById(Long id) {
        return studentRepository.findById(id).orElseThrow(() -> new GenericException(ErrorCode.NOT_FOUND));
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

}

package com.bhasha.xInstitute.service;

import com.bhasha.xInstitute.dto.request.AddStudentDtoRequest;
import com.bhasha.xInstitute.model.Student;

import java.util.List;

public interface StudentService {
    Student addStudentById(AddStudentDtoRequest req);

    Student getStudentById(Long id);

    List<Student> getAllStudents();
}

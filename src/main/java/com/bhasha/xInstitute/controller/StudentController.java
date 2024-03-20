package com.bhasha.xInstitute.controller;

import com.bhasha.xInstitute.dto.request.AddStudentDtoRequest;
import com.bhasha.xInstitute.model.Student;
import com.bhasha.xInstitute.service.impl.StudentServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/student-service")
public class StudentController {

    private StudentServiceImpl studentService;

    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable Long id) {
        Student studentById = studentService.getStudentById(id);
        return ResponseEntity.ok(studentById);
    }

    @PostMapping("/add-user")
    public ResponseEntity<Student> getStudentById(@RequestBody AddStudentDtoRequest req) {
        Student student = studentService.addStudentById(req);
        return ResponseEntity.ok(student);
    }

    @GetMapping
    public ResponseEntity <List<Student>> getAllStudents() {
        List<Student> allStudents = studentService.getAllStudents();
        return ResponseEntity.ok(allStudents);
    }

}

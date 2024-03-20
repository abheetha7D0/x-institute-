package com.bhasha.xInstitute.repository;

import com.bhasha.xInstitute.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}

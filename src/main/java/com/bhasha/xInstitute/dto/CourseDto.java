package com.bhasha.xInstitute.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CourseDto {
    private String department;
    private String courseName;
    private double fees;
    private int maxStudentCount;
}

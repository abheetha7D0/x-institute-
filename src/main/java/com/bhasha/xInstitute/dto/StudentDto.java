package com.bhasha.xInstitute.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.sql.Date;
@Data
@AllArgsConstructor
public class StudentDto {
    private Long id;
    private String firstName;
    private String lastName;
    private Date birthday;
    private String address;
    private String contactNumber;
    private String department;
    private String course;
}

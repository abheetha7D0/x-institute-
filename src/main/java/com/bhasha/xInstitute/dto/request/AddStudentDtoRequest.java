package com.bhasha.xInstitute.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

import java.sql.Date;

@Data
@AllArgsConstructor
public class AddStudentDtoRequest {
    private String firstName;
    private String lastName;
    private Date birthday;
    private String address;
    private String contactNumber;
    private String department;
    @NonNull
    private String courseName;
}

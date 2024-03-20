package com.bhasha.xInstitute.model;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@Entity
@ToString
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    private Date birthday;
    private String address;
    private String contactNumber;

    @ManyToOne
    @JoinColumn(name = "department", referencedColumnName = "department")
    private Course course;

    public Student(String firstName, String lastName, Date birthday, String address, String contactNumber, Course course) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.address = address;
        this.contactNumber = contactNumber;
        this.course = course;
    }


}
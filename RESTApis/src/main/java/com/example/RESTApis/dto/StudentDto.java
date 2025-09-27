package com.example.RESTApis.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor   // generates constructor with all fields
@NoArgsConstructor    // generates empty constructor
public class StudentDto {
    private long id;
    private String name;
    private String email;
}


package com.example.RESTApis.service;

import com.example.RESTApis.dto.AddStudentRequestDto;
import com.example.RESTApis.dto.StudentDto;

import java.util.List;

public interface StudentService {

    List<StudentDto> getAllStuednts();

    StudentDto getStudentById(Long id);

    StudentDto createNewStudent(AddStudentRequestDto addStudentRequestDto);
}

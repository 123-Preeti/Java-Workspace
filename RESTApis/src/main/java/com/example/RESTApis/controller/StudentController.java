package com.example.RESTApis.controller;

import com.example.RESTApis.dto.AddStudentRequestDto;
import com.example.RESTApis.dto.StudentDto;
import com.example.RESTApis.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentService studentService;


    @GetMapping
    public ResponseEntity<List<StudentDto>> getAllStudents() {
//        return (ResponseEntity<List<StudentDto>>) studentService.getAllStuednts();
        return ResponseEntity.ok(studentService.getAllStuednts());
    }

    @GetMapping("/{id}")
    public ResponseEntity<StudentDto> getStudentById(@PathVariable Long id) {
//        return ResponseEntity.status(HttpStatus.OK).body((StudentDto) studentService.getAllStuednts());
        return ResponseEntity.ok(studentService.getStudentById(id));
    }



    @GetMapping("/{id}/{name}")
    public String getStudentById(@PathVariable Long id, @PathVariable String name) {
//        return new StudentDto(4,"chiku","chiku@gmail.com");
        return "Path variable" + id + "name is" +name;
    }



    @PostMapping("/students")
    public ResponseEntity<StudentDto> createNewStudent(@RequestBody AddStudentRequestDto addStudentRequestDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(studentService.createNewStudent(addStudentRequestDto));
    }

}
package com.example.RESTApis.service.Impl;

import com.example.RESTApis.dto.AddStudentRequestDto;
import com.example.RESTApis.dto.StudentDto;
import com.example.RESTApis.entity.Student;
import com.example.RESTApis.repository.StudentRepository;
import com.example.RESTApis.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;
    private final ModelMapper modelMapper;

    @Override
    public List<StudentDto> getAllStuednts() {
        List<Student> students = studentRepository.findAll();
        List<StudentDto> studentDtoList = students
                .stream()
                .map(student -> new StudentDto(student.getId(), student.getName(), student.getEmail()))
                .toList();
        return studentDtoList;
    }

    @Override
    public StudentDto getStudentById(Long id) {
        Student student =  studentRepository.findById(id).orElseThrow( () -> new IllegalArgumentException("Student not found with ID: " + id));
        return modelMapper.map(student, StudentDto.class);

    }

    @Override
    public StudentDto createNewStudent(AddStudentRequestDto addStudentRequestDto) {
        Student newStudent = modelMapper.map(addStudentRequestDto, Student.class);
        Student student = studentRepository.save(newStudent);
        return modelMapper.map(student, StudentDto.class);
    }
}

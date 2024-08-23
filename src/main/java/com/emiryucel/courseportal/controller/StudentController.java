package com.emiryucel.courseportal.controller;

import com.emiryucel.courseportal.dto.StudentDto;
import com.emiryucel.courseportal.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {

    private StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public ResponseEntity getStudent(@PathVariable Long id) {
        StudentDto studentDto= service.getStudentWithId(id);
        return new ResponseEntity(studentDto,HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity saveStudent(@RequestBody StudentDto studentDto) {

        StudentDto savedStudent = service.createStudent(studentDto);

        return new ResponseEntity(savedStudent, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity editStudent(@RequestBody StudentDto studentDto) {
        // service.getStudentWithId(studentDto.getId());
        StudentDto editedStudent = service.createStudent(studentDto);

        return new ResponseEntity(editedStudent, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteStudent(@PathVariable Long id) {

        service.removeStudent(id);

        return new ResponseEntity(HttpStatus.NOT_FOUND);
    }


}
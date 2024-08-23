package com.emiryucel.courseportal.service;

import com.emiryucel.courseportal.dto.StudentDto;

public interface StudentService {

    public StudentDto getStudentWithId(Long id);

//    public StudentDto loginStudent(StudentDto moduleDto);

    public StudentDto createStudent(StudentDto moduleDto);

    public void removeStudent(Long id);

    public StudentDto updateStudent(StudentDto moduleDto);
}

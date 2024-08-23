package com.emiryucel.courseportal.mapper;

import com.emiryucel.courseportal.dto.StudentDto;
import com.emiryucel.courseportal.model.Student;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StudentMapper {

    private LecturerMapper lecturerMapper;

    public StudentMapper(LecturerMapper lecturerMapper) {
        this.lecturerMapper = lecturerMapper;
    }

    public StudentDto modelToDto(Student student){
        return new StudentDto(student.getId(),student.getStudentId(),student.getFirstName(),student.getLastName(),student.getDegree());

    }
    public Student dtoToModel(StudentDto studentDto){
        return new Student(studentDto.getId(),studentDto.getStudentId(),studentDto.getFirstName(),studentDto.getLastName(),studentDto.getDegree());
    }

    public List<StudentDto> modelToDtoList(List<Student> studentList){
        return studentList.stream().map(student-> modelToDto(student)).toList();

    }
    public List<Student> dtoToModelList(List<StudentDto> studentDtoList){
        return studentDtoList.stream().map(studentDto-> dtoToModel(studentDto)).toList();
    }

}
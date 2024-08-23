package com.emiryucel.courseportal.service;

import com.emiryucel.courseportal.dto.StudentDto;
import com.emiryucel.courseportal.mapper.StudentMapper;
import com.emiryucel.courseportal.repository.StudentRepository;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    private StudentRepository dao;
    private StudentMapper mapper;

    public StudentServiceImpl(StudentRepository repository, StudentMapper studentMapper) {
        this.dao = repository;
        this.mapper = studentMapper;
    }

    public StudentDto getStudentWithId(Long id) {

        return mapper.modelToDto(dao.findById(id).get());
    }

    @Override
    public StudentDto createStudent(StudentDto studentDto) {


        return mapper.modelToDto(dao.save(mapper.dtoToModel(studentDto)));
    }

    @Override
    public void removeStudent(Long id) {

        dao.deleteById(id);
    }

    @Override
    public StudentDto updateStudent(StudentDto studentDto) {

        return mapper.modelToDto(dao.save(mapper.dtoToModel(studentDto)));
    }


//    @Override
//    public StudentDto loginStudent(StudentDto studentDto) {
//
//        return dao.;
//    }


}

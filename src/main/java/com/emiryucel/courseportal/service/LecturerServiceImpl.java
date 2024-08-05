package com.emiryucel.courseportal.service;

import com.emiryucel.courseportal.dto.LecturerDto;
import com.emiryucel.courseportal.mapper.LecturerMapper;
import com.emiryucel.courseportal.repository.LecturerRepository;
import org.springframework.stereotype.Service;

@Service
public class LecturerServiceImpl implements LecturerService{

    private LecturerRepository dao;
    private LecturerMapper mapper;

    public LecturerServiceImpl(LecturerRepository repository,LecturerMapper lecturerMapper){
        this.dao=repository;
        this.mapper=lecturerMapper;
    }

    public LecturerDto getLecturerWithId(Long id){

       return mapper.modelToDto(dao.findById(id).get());
    }

//    @Override
//    public LecturerDto loginLecturer(LecturerDto lecturerDto) {
//
//        return dao.;
//    }


}

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

    @Override
    public LecturerDto createLecturer(LecturerDto lecturerDto) {



        return mapper.modelToDto(dao.save(mapper.dtoToModel(lecturerDto)));
    }

    @Override
    public void removeLecturer(Long id) {

        dao.deleteById(id);
    }

    @Override
    public LecturerDto updateLecturer(LecturerDto lecturerDto) {

        return mapper.modelToDto(dao.save(mapper.dtoToModel(lecturerDto)));
    }


//    @Override
//    public LecturerDto loginLecturer(LecturerDto lecturerDto) {
//
//        return dao.;
//    }


}

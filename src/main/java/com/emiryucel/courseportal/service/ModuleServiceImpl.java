package com.emiryucel.courseportal.service;

import com.emiryucel.courseportal.dto.ModuleDto;
import com.emiryucel.courseportal.mapper.ModuleMapper;
import com.emiryucel.courseportal.repository.ModuleRepository;
import org.springframework.stereotype.Service;

@Service
public class ModuleServiceImpl implements ModuleService {

    private ModuleRepository dao;
    private ModuleMapper mapper;

    public ModuleServiceImpl(ModuleRepository repository, ModuleMapper moduleMapper) {
        this.dao = repository;
        this.mapper = moduleMapper;
    }

    public ModuleDto getModuleWithId(Long id) {

        return mapper.modelToDto(dao.findById(id).get());
    }

    @Override
    public ModuleDto createModule(ModuleDto moduleDto) {


        return mapper.modelToDto(dao.save(mapper.dtoToModel(moduleDto)));
    }

    @Override
    public void removeModule(Long id) {

        dao.deleteById(id);
    }

    @Override
    public ModuleDto updateModule(ModuleDto moduleDto) {

        return mapper.modelToDto(dao.save(mapper.dtoToModel(moduleDto)));
    }


//    @Override
//    public ModuleDto loginModule(ModuleDto moduleDto) {
//
//        return dao.;
//    }


}

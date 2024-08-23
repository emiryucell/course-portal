package com.emiryucel.courseportal.mapper;

import com.emiryucel.courseportal.dto.LecturerDto;
import com.emiryucel.courseportal.dto.ModuleDto;
import com.emiryucel.courseportal.model.Lecturer;
import com.emiryucel.courseportal.model.Module;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ModuleMapper {

    private LecturerMapper lecturerMapper;

    public ModuleMapper(@Lazy LecturerMapper lecturerMapper) {
        this.lecturerMapper = lecturerMapper;
    }

    public ModuleDto modelToDto(Module module){
       return new ModuleDto(module.getId(),module.getName(),module.getShortCode(),lecturerMapper.modelToDtoList(module.getLecturerList()));

    }
    public Module dtoToModel(ModuleDto moduleDto){
        return new Module(moduleDto.getId(),moduleDto.getName(),moduleDto.getShortCode(),lecturerMapper.dtoToModelList(moduleDto.getLecturerDtoList()));
    }

    public List<ModuleDto> modelToDtoList(List<Module> moduleList){
        return moduleList.stream().map(module-> modelToDto(module)).toList();

    }
    public List<Module> dtoToModelList(List<ModuleDto> moduleDtoList){
        return moduleDtoList.stream().map(moduleDto-> dtoToModel(moduleDto)).toList();
    }

}

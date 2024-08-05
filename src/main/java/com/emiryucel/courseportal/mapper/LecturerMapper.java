package com.emiryucel.courseportal.mapper;

import com.emiryucel.courseportal.dto.LecturerDto;
import com.emiryucel.courseportal.dto.ModuleDto;
import com.emiryucel.courseportal.model.Lecturer;
import com.emiryucel.courseportal.model.Module;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class LecturerMapper {

    private ModuleMapper moduleMapper;

    public LecturerMapper(ModuleMapper moduleMapper) {
        this.moduleMapper = moduleMapper;
    }

    public LecturerDto modelToDto(Lecturer lecturer){
        return new LecturerDto(lecturer.getId(), lecturer.getLecturerId(), lecturer.getFirstName(), lecturer.getLastName(), lecturer.getDepartment(), moduleMapper.modelToDtoList(lecturer.getModules()));
    }

    public Lecturer dtoToModel(LecturerDto lecturerDto){
        return new Lecturer(lecturerDto.getId(), lecturerDto.getLecturerId(), lecturerDto.getFirstName(), lecturerDto.getLastName(), lecturerDto.getDepartment(), moduleMapper.dtoToModelList(lecturerDto.getModules()));
    }

    public List<LecturerDto> modelToDtoList(List<Lecturer> lecturerList){
        return lecturerList.stream().map(lecturer-> modelToDto(lecturer)).toList();

    }
    public List<Lecturer> dtoToModelList(List<LecturerDto> lecturerDtoList){
        return lecturerDtoList.stream().map(lecturerDto-> dtoToModel(lecturerDto)).toList();
    }

}

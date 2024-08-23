package com.emiryucel.courseportal.dto;

import com.emiryucel.courseportal.model.Lecturer;
import jakarta.persistence.ManyToMany;

import java.util.List;

public class ModuleDto {
    private Long id;

    private String name;

    private String shortCode;

    private List<LecturerDto> lecturerDtoList;

    public ModuleDto(Long id, String name, String shortCode, List<LecturerDto> lecturerDtoList) {
        this.id = id;
        this.name = name;
        this.shortCode = shortCode;
        this.lecturerDtoList = lecturerDtoList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortCode() {
        return shortCode;
    }

    public void setShortCode(String shortCode) {
        this.shortCode = shortCode;
    }

    public List<LecturerDto> getLecturerDtoList() {
        return lecturerDtoList;
    }

    public void setLecturerDtoList(List<LecturerDto> lecturerDtoList) {
        this.lecturerDtoList = lecturerDtoList;
    }
}

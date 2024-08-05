package com.emiryucel.courseportal.dto;

import com.emiryucel.courseportal.model.Lecturer;
import jakarta.persistence.ManyToMany;

import java.util.List;

public class ModuleDto {
    private Long id;

    private String name;

    private String shortCode;

    private List<LecturerDto> lecturerList;

    public ModuleDto(Long id, String name, String shortCode, List<LecturerDto> lecturerList) {
        this.id = id;
        this.name = name;
        this.shortCode = shortCode;
        this.lecturerList = lecturerList;
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

    public void setLecturerList(List<LecturerDto> lecturerList) {
        this.lecturerList = lecturerList;
    }

    public List<LecturerDto> getLecturerList() {
        return lecturerList;
    }
}

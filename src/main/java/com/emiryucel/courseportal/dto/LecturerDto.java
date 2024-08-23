package com.emiryucel.courseportal.dto;

import java.util.List;

public class LecturerDto {
    private Long id;
    private String lecturerId;

    private String firstName;
    private String lastName;
    private String department;
    private List<ModuleDto> moduleDtoList;

    public LecturerDto(Long id, String lecturerId, String firstName, String lastName, String department, List<ModuleDto> moduleDtoList) {
        this.id = id;
        this.lecturerId = lecturerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.moduleDtoList = moduleDtoList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLecturerId() {
        return lecturerId;
    }

    public void setLecturerId(String lecturerId) {
        this.lecturerId = lecturerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public List<ModuleDto> getModuleDtoList() {
        return moduleDtoList;
    }

    public void setModuleDtoList(List<ModuleDto> moduleDtoList) {
        this.moduleDtoList = moduleDtoList;
    }
}

package com.emiryucel.courseportal.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Lecturer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String lecturerId;
    private String firstName;
    private String lastName;
    private String department;
    @ManyToMany
    private List<Module> moduleList;


    public Lecturer() {

    }

    public Lecturer(Long id, String lecturerId, String firstName, String lastName, String department, List<Module> moduleList) {
        this.id = id;
        this.lecturerId = lecturerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.moduleList = moduleList;
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

    public List<Module> getModuleList() {
        return moduleList;
    }

    public void setModuleList(List<Module> moduleList) {
        this.moduleList = moduleList;
    }
}

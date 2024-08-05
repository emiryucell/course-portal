package com.emiryucel.courseportal.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
public class Module {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String shortCode;

    @ManyToMany
    private List<Lecturer> lecturerList;



    public Module(Long id, String name, String shortCode, List<Lecturer> lecturerList) {
        this.id = id;
        this.name = name;
        this.shortCode = shortCode;
        this.lecturerList = lecturerList;
    }

    public Module() {

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

    public List<Lecturer> getLecturerList() {
        return lecturerList;
    }

    public void setLecturerList(List<Lecturer> lecturerList) {
        this.lecturerList = lecturerList;
    }
}

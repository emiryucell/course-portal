package com.emiryucel.courseportal.controller;

import com.emiryucel.courseportal.dto.LecturerDto;
import com.emiryucel.courseportal.service.LecturerService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LecturerController {

    private LecturerService service;

    public LecturerController(LecturerService service) {
        this.service = service;
    }

}

package com.emiryucel.courseportal.controller;

import com.emiryucel.courseportal.dto.LecturerDto;
import com.emiryucel.courseportal.service.LecturerService;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/lecturer")
public class LecturerController {

    private LecturerService service;

    public LecturerController(LecturerService service) {
        this.service = service;
    }

    public LecturerDto getLecturer(Long id){
        return service.getLecturerWithId(id);
    }
//    public LecturerDto login(LecturerDto lecturerDto){
//        return service.;
//    }
//    public LecturerDto createLecturer(LecturerDto lecturerDto){
//        return service;
//    }


}

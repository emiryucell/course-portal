package com.emiryucel.courseportal.controller;

import com.emiryucel.courseportal.dto.LecturerDto;
import com.emiryucel.courseportal.service.LecturerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/lecturer")
public class LecturerController {

    private LecturerService service;

    public LecturerController(LecturerService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    @ResponseBody
    public LecturerDto getLecturer(@PathVariable Long id) {
        return service.getLecturerWithId(id);
    }

    @PostMapping
    public ResponseEntity saveLecturer(@RequestBody LecturerDto lecturerDto) {

        LecturerDto savedLecturer = service.createLecturer(lecturerDto);

        return new ResponseEntity(savedLecturer, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity editLecturer(@RequestBody LecturerDto lecturerDto) {
        // service.getLecturerWithId(lecturerDto.getId());
        LecturerDto editedLecturer = service.createLecturer(lecturerDto);

        return new ResponseEntity(editedLecturer, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteLecturer(@PathVariable Long id) {

        service.removeLecturer(id);

        return new ResponseEntity(HttpStatus.NOT_FOUND);
    }


}

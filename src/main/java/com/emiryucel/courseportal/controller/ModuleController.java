package com.emiryucel.courseportal.controller;

import com.emiryucel.courseportal.dto.ModuleDto;
import com.emiryucel.courseportal.service.ModuleService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/module")
public class ModuleController {

    private ModuleService service;

    public ModuleController(ModuleService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public ResponseEntity getModule(@PathVariable Long id) {
        ModuleDto moduleDto= service.getModuleWithId(id);
        return new ResponseEntity(moduleDto,HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity saveModule(@RequestBody ModuleDto moduleDto) {

        ModuleDto savedModule = service.createModule(moduleDto);

        return new ResponseEntity(savedModule, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity editModule(@RequestBody ModuleDto moduleDto) {
        // service.getModuleWithId(moduleDto.getId());
        ModuleDto editedModule = service.createModule(moduleDto);

        return new ResponseEntity(editedModule, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteModule(@PathVariable Long id) {

        service.removeModule(id);

        return new ResponseEntity(HttpStatus.NOT_FOUND);
    }


}
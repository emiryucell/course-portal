package com.emiryucel.courseportal.service;

import com.emiryucel.courseportal.dto.LecturerDto;
import org.springframework.stereotype.Service;


public interface LecturerService {

    public LecturerDto getLecturerWithId(Long id);

//    public LecturerDto loginLecturer(LecturerDto lecturerDto);

    public LecturerDto createLecturer(LecturerDto lecturerDto);

    public void removeLecturer(Long id);

    public LecturerDto updateLecturer(LecturerDto lecturerDto);

}

package com.emiryucel.courseportal.repository;

import com.emiryucel.courseportal.model.Lecturer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LecturerRepository extends JpaRepository<Lecturer,Long> {
}

package com.emiryucel.courseportal.repository;

import com.emiryucel.courseportal.model.Module;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModuleRepository extends JpaRepository<Module,Long> {
}

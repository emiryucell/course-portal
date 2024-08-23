package com.emiryucel.courseportal.service;

import com.emiryucel.courseportal.dto.ModuleDto;

public interface ModuleService {

    public ModuleDto getModuleWithId(Long id);

//    public ModuleDto loginModule(ModuleDto moduleDto);

    public ModuleDto createModule(ModuleDto moduleDto);

    public void removeModule(Long id);

    public ModuleDto updateModule(ModuleDto moduleDto);
}

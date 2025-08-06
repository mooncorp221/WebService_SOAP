package com.soapws.metier.service;

import com.soapws.metier.dto.ClasseDto;

import java.util.List;

public interface IClasseService {
    boolean save(ClasseDto dto);
    boolean update(ClasseDto dto);
    boolean delete(Long id);
    ClasseDto findById(Long id);
    List<ClasseDto> findAll();
    List<ClasseDto> findBySectorName(String sectorName);

}

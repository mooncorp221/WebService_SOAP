package com.soapws.metier.service;

import com.soapws.metier.dto.SectorDto;

import java.util.List;

public interface ISectorService {
    boolean save(SectorDto dto);
    boolean update(SectorDto dto);
    boolean delete(Long id);
    SectorDto findById(Long id);
    List<SectorDto> findAll();
}

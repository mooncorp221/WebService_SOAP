package com.soapws.metier.mapper;

import com.soapws.metier.dto.SectorDto;
import com.soapws.metier.entity.Sector;


public class SectorMapper {

    public static SectorDto toDto(Sector entity) {
        if (entity == null) return null;

        SectorDto dto = new SectorDto();
        dto.setId(entity.getId());
        dto.setName(entity.getName());


        return dto;
    }

    public static Sector toEntity(SectorDto dto) {
        if (dto == null) return null;

        Sector entity = new Sector();
        entity.setId(dto.getId());
        entity.setName(dto.getName());


        return entity;
    }
}

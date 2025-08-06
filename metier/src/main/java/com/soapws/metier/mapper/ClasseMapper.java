package com.soapws.metier.mapper;

import com.soapws.metier.dto.ClasseDto;
import com.soapws.metier.entity.Classe;
import com.soapws.metier.entity.Sector;

public class ClasseMapper {

    public static ClasseDto toDto(Classe entity) {
        if (entity == null) return null;

        ClasseDto dto = new ClasseDto();
        dto.setId(entity.getId());
        dto.setClassName(entity.getClassName());
        dto.setDescription(entity.getDescription());
        dto.setSectorId(entity.getSector().getId());
        dto.setSectorName(entity.getSector().getName());

        return dto;
    }

    public static Classe toEntity(ClasseDto dto, Sector sector) {
        if (dto == null) return null;

        Classe entity = new Classe();
        entity.setId(dto.getId());
        entity.setClassName(dto.getClassName());
        entity.setDescription(dto.getDescription());
        entity.setSector(sector); // on injecte directement l’objet sector

        return entity;
    }
}

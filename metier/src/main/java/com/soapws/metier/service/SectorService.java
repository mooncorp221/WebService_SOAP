package com.soapws.metier.service;

import com.soapws.metier.dao.SectorDao;
import com.soapws.metier.dto.SectorDto;
import com.soapws.metier.entity.Sector;
import com.soapws.metier.mapper.SectorMapper;

import java.util.List;
import java.util.stream.Collectors;

public class SectorService implements ISectorService {

    private final SectorDao sectorDao = new SectorDao();

    @Override
    public boolean save(SectorDto dto) {
        System.out.println("Tentative de sauvegarde du secteur: " + dto.getName());

        Sector entity = SectorMapper.toEntity(dto);
        boolean result = sectorDao.save(entity);

        System.out.println("Résultat du save: " + result);
        return result;
    }

    @Override
    public boolean update(SectorDto dto) {
        Sector entity = SectorMapper.toEntity(dto);
        return sectorDao.update(entity);
    }

    @Override
    public boolean delete(Long id) {
        Sector entity = sectorDao.findById(id, new Sector());
        return sectorDao.delete(id, entity);
    }

    @Override
    public SectorDto findById(Long id) {
        Sector entity = sectorDao.findById(id, new Sector());
        return SectorMapper.toDto(entity);
    }

    @Override
    public List<SectorDto> findAll() {
        return sectorDao.findAll(new Sector())
                .stream()
                .map(SectorMapper::toDto)
                .collect(Collectors.toList());
    }
}

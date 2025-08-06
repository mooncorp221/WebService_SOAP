package com.soapws.metier.service;

import com.soapws.metier.dao.ClasseDao;
import com.soapws.metier.dao.SectorDao;
import com.soapws.metier.dto.ClasseDto;
import com.soapws.metier.entity.Classe;
import com.soapws.metier.entity.Sector;
import com.soapws.metier.mapper.ClasseMapper;

import java.util.List;
import java.util.stream.Collectors;

public class ClasseService implements IClasseService {

    private final ClasseDao classeDao = new ClasseDao();
    private final SectorDao sectorDao = new SectorDao();

    @Override
    public boolean save(ClasseDto dto) {
        Sector sector = sectorDao.findById(dto.getSectorId(), new Sector());
        Classe entity = ClasseMapper.toEntity(dto, sector);
        return classeDao.save(entity);
    }

    @Override
    public boolean update(ClasseDto dto) {
        Sector sector = sectorDao.findById(dto.getSectorId(), new Sector());
        Classe entity = ClasseMapper.toEntity(dto, sector);
        return classeDao.update(entity);
    }

    @Override
    public boolean delete(Long id) {
        Classe entity = classeDao.findById(id, new Classe());
        return classeDao.delete(id, entity);
    }


    @Override
    public ClasseDto findById(Long id) {
        Classe entity = classeDao.findById(id, new Classe());
        return ClasseMapper.toDto(entity);
    }

    @Override
    public List<ClasseDto> findAll() {
        return classeDao.findAll(new Classe())
                .stream()
                .map(ClasseMapper::toDto)
                .collect(Collectors.toList());
    }
    @Override
    public List<ClasseDto> findBySectorName(String sectorName) {
        Sector sector = sectorDao.findByName(sectorName);
        if (sector == null) {
            return List.of(); // Retourne une liste vide si aucun secteur trouvé
        }

        List<Classe> classes = classeDao.findBySector(sector);
        return classes.stream()
                .map(ClasseMapper::toDto)
                .collect(Collectors.toList());
    }

}

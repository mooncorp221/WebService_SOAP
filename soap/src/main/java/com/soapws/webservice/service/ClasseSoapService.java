package com.soapws.webservice.service;

import com.soapws.metier.dto.ClasseDto;
import com.soapws.metier.service.ClasseService;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import java.util.List;

@WebService(serviceName = "ClasseService")
public class ClasseSoapService {

    private final ClasseService classeService = new ClasseService();

    @WebMethod
    public boolean addClasse(@WebParam(name = "dto")ClasseDto dto) {
        return classeService.save(dto);
    }

    @WebMethod
    public List<ClasseDto> getAllClasses() {
        return classeService.findAll();
    }

    @WebMethod
    public ClasseDto getClasseById(Long id) {
        return classeService.findById(id);
    }

    @WebMethod
    public List<ClasseDto> getClassesBySector(String sectorName) {
        return classeService.findBySectorName(sectorName);
    }

    @WebMethod
    public boolean updateClasse(ClasseDto dto) {
        return classeService.update(dto);
    }

    @WebMethod
    public boolean deleteClasse(Long id) {
        return classeService.delete(id);
    }
}

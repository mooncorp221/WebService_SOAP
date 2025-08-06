package com.soapws.webservice.service;


import com.soapws.metier.dto.ClasseDto;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import java.util.List;

@WebService
public interface IClasseSoapService {

    @WebMethod
    ClasseDto save(ClasseDto dto);

    @WebMethod
    ClasseDto findById(Long id);

    @WebMethod
    List<ClasseDto> findAll();

    @WebMethod
    void delete(Long id);
}

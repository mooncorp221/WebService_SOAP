package com.soapws.webservice.service;

import com.soapws.metier.dto.SectorDto;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import java.util.List;

@WebService
public interface ISectorSoapService {

    @WebMethod
    SectorDto save(SectorDto dto);

    @WebMethod
    SectorDto findById(Long id);

    @WebMethod
    List<SectorDto> findAll();

    @WebMethod
    void delete(Long id);
}

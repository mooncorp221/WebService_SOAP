package com.soapws.webservice.service;

import com.soapws.metier.dto.SectorDto;
import com.soapws.metier.service.SectorService;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import java.util.List;

@WebService(serviceName = "SectorService")
public class SectorSoapService {

    private final SectorService sectorService = new SectorService();

    @WebMethod
    public boolean addSector(@WebParam(name = "dto") SectorDto dto) {
        return sectorService.save(dto);
    }

    @WebMethod
    public List<SectorDto> getAllSectors() {
        return sectorService.findAll();
    }

    @WebMethod
    public SectorDto getSectorById(Long id) {
        return sectorService.findById(id);
    }

    @WebMethod
    public boolean updateSector(SectorDto dto) {
        return sectorService.update(dto);
    }

    @WebMethod
    public boolean deleteSector(Long id) {
        return sectorService.delete(id);
    }
}

package com.soapws.metier.dto;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "Sector")
public class SectorDto {
    private Long id;
    private String name;

    public SectorDto() {}

    @XmlElement
    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    @XmlElement
    public String getName() { return name; }

    public void setName(String name) { this.name = name; }
}





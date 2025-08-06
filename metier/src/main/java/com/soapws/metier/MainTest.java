package com.soapws.metier;

import com.soapws.metier.dto.ClasseDto;
import com.soapws.metier.dto.SectorDto;
import com.soapws.metier.service.ClasseService;
import com.soapws.metier.service.SectorService;

import java.util.List;

public class MainTest {
    public static void main(String[] args) {

        // Initialisation des services
        SectorService sectorService = new SectorService();
        ClasseService classeService = new ClasseService();

        // 1. Créer un secteur
        SectorDto sectorDto = new SectorDto();
        sectorDto.setName("Informatique");

        boolean sectorSaved = sectorService.save(sectorDto);
        System.out.println("Secteur sauvegardé ? " + sectorSaved);

        // 2. Récupérer le secteur pour l'utiliser
        List<SectorDto> sectors = sectorService.findAll();
        SectorDto savedSector = sectors.get(0); // on prend le premier

        // 3. Créer une classe liée au secteur
        ClasseDto classeDto = new ClasseDto();
        classeDto.setClassName("Développement Java");
        classeDto.setDescription("Formation complète Java + Spring");
        classeDto.setSectorId(savedSector.getId());

        boolean classeSaved = classeService.save(classeDto);
        System.out.println("Classe sauvegardée ? " + classeSaved);

        // 4. Lire toutes les classes
        List<ClasseDto> allClasses = classeService.findAll();
        System.out.println("\n📚 Liste des classes :");
        System.out.println("📚 Liste des classes :");
        for (ClasseDto classe : classeService.findAll()) {
            System.out.println("- " + classe.getClassName() + " (Secteur : " + classe.getSectorName() + ")");
        }

    }
    }
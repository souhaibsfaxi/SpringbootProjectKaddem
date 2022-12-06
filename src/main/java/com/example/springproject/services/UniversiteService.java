package com.example.springproject.services;

import com.example.springproject.entities.Contrat;
import com.example.springproject.entities.Universite;

import java.util.List;

public interface UniversiteService {

    List<Universite> retrieveAllUniversites();

    Universite addUniversite(Universite c);

    void deleteUniversite(Integer id);

    Universite updateUniversite(Universite c);

    Universite retrieveUniversite(Integer id);

    //void assignUniversiteToDepartement(Integer idUniversite, Integer idDepartement);
}

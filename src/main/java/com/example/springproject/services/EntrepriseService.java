package com.example.springproject.services;

import com.example.springproject.entities.Entreprise;
import com.example.springproject.entities.Equipe;

import java.util.List;

public interface EntrepriseService {

    List<Entreprise> retrieveAllEnt();

    Entreprise addEnt(Entreprise e);

    void deleteEnt(Integer id);

    Entreprise updateEnt(Integer id,Entreprise e);

    Entreprise retrieveEnt(Integer id);

    List<Entreprise> searchEntByLocation(String l);

    List<Entreprise> searchEntByNameOrMail(String l);


    //void assignEquipeToEntreprise (Integer equipeId, Integer entrepriseId);
    void checkRecruitingDate(Integer id);

    void logEntrepriseOpenToRecruiting();

}

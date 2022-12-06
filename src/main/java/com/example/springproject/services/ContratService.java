package com.example.springproject.services;

import com.example.springproject.entities.Contrat;

import java.util.List;

public interface ContratService {
    List<Contrat> retrieveAllContrats();

    Contrat addContrat(Contrat c);

    void deleteContrat(Integer id);

    Contrat updateContrat(Contrat c);

    Contrat retrieveContrat(Integer id);

    //Contrat affectContratToEtudiant (Contrat ce,String nomE ,String prenomE );
    void retrieveAndUpdateStatusContrat();
}

package com.example.springproject.services;

import com.example.springproject.entities.Contrat;
import com.example.springproject.entities.Etudiant;

import java.util.List;

public interface EtudiantService {

    List<Etudiant> retrieveAllEtudiant();

    Etudiant addEtudiant(Etudiant c);

    void deleteEtudiant(Integer id);

    Etudiant updateEtudiant(Etudiant c);

    Etudiant retrieveEtudiant(Integer id);
/*
    void assignEtudiantToDepartment (Integer etudiantId, Integer departmentId);

    Etudiant addAndAssignEtudiantToEquipeAndContract(Etudiant e, Integer idContrat, Integer idEquipe);

    List<Etudiant> getEtudiantsByDepartement (Integer idDepartement);
    */

}

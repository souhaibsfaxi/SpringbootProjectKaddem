package com.example.springproject.services;


import com.example.springproject.entities.Contrat;
import com.example.springproject.entities.Department;
import com.example.springproject.entities.Equipe;
import com.example.springproject.entities.Etudiant;

import com.example.springproject.repositories.ContratRepo;
import com.example.springproject.repositories.DepartmentRepo;
import com.example.springproject.repositories.EquipeRepo;
import com.example.springproject.repositories.EtudiantRepo;
import lombok.AllArgsConstructor;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EtudiantServiceimpl implements EtudiantService{
    EtudiantRepo Etudiantrepo;
    DepartmentRepo Departmentrepo;
    ContratRepo Contratrepo;
    EquipeRepo Equiperepo;

    @Override
    public List<Etudiant> retrieveAllEtudiant(){
        return Etudiantrepo.findAll();
    }
    @Override
    public Etudiant addEtudiant(Etudiant c){
        return Etudiantrepo.save(c);
    }

    @Override
    public void deleteEtudiant(Integer id){
        Etudiantrepo.deleteById(id);
    }

    @Override
    public Etudiant updateEtudiant(Etudiant c){
        return Etudiantrepo.save(c);
    }

    @Override
    public Etudiant retrieveEtudiant(Integer id){
        return Etudiantrepo.findById(id).orElse(null);
    }
/*
    @Override
    public void assignEtudiantToDepartment(Integer etudiantId, Integer departmentId){
        Etudiant etudiant = Etudiantrepo.findById(etudiantId).orElse(null);
        Department department = Departmentrepo.findById(departmentId).orElse(null);

        etudiant.setDepartment(department);

        Etudiantrepo.save(etudiant);
    }

    @Override
    public Etudiant addAndAssignEtudiantToEquipeAndContract(Etudiant e, Integer idContrat, Integer idEquipe){

        Contrat cont = Contratrepo.findById(idContrat).orElse(null);
        Equipe eq = Equiperepo.findById(idEquipe).orElse(null);

        e.getContrats().add(cont);
        e.getEquipes().add(eq);
        Etudiantrepo.save(e);
        return e;
    }



    @Override
    Public List<Etudiant> getEtudiantsByDepartement (Integer idDepartement){
         List<Etudiant> etud = Equiperepo.findByDepartment_id_depart(idDepartement);
        return etud;
    }
*/
}

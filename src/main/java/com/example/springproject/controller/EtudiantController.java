package com.example.springproject.controller;


import com.example.springproject.entities.Contrat;
import com.example.springproject.entities.Equipe;
import com.example.springproject.entities.Etudiant;
import com.example.springproject.repositories.EtudiantRepo;
import com.example.springproject.services.EquipeService;
import com.example.springproject.services.EtudiantService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("Etudiant")
public class EtudiantController {
    EtudiantService Etudiantservice;
    EtudiantRepo etudiantrepo;

    @GetMapping("GetAllEq")
    List<Etudiant> retrieveAllEtudiant(){
        return Etudiantservice.retrieveAllEtudiant();
    }

    @PostMapping("addEq")
    Etudiant addEtudiant(@RequestBody Etudiant c){
        return Etudiantservice.addEtudiant(c);
    }

    @DeleteMapping("deleteEq/{id}")
    void deleteEtudiant(@PathVariable Integer id){
        Etudiantservice.deleteEtudiant(id);
    }

    @PutMapping("updateEq")
    Etudiant updateEtudiant(@RequestBody Etudiant c){
        return Etudiantservice.updateEtudiant(c);
    }

    @GetMapping("getEq/{id}")
    Etudiant retrieveEtudiant(@PathVariable Integer id){
        return Etudiantservice.retrieveEtudiant(id);
    }

    /*
    @PutMapping("assignEtudiantToDepartment")
    void assignEtudiantToDepartment (Integer etudiantId, Integer departmentId){
        Etudiantservice.assignEtudiantToDepartment(etudiantId,departmentId);
    }

    @PostMapping("addAndAssignEtudiantToEquipeAndContract")
    Etudiant addAndAssignEtudiantToEquipeAndContract(Etudiant e, Integer idContrat, Integer idEquipe){
        return Etudiantservice.addAndAssignEtudiantToEquipeAndContract(e , idContrat, idEquipe);
    }
*/

}

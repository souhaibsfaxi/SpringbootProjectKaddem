package com.example.springproject.controller;

import com.example.springproject.entities.Contrat;
import com.example.springproject.services.ContratService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Contrat Management")
@RestController
@AllArgsConstructor
@RequestMapping("Contrat")
public class ContratController {

    ContratService contratService;

    @GetMapping("GetAllContrats")
    List<Contrat> retrieveAllContrats(){
        return contratService.retrieveAllContrats();
    }

    @PostMapping("addContrat")
    Contrat addContrat(@RequestBody Contrat c){
        return contratService.addContrat(c);
    }

    @DeleteMapping("deleteContrat/{id}")
    void deleteContrat(@PathVariable Integer id){
        contratService.deleteContrat(id);
    }

    @PutMapping("updateContrat")
    Contrat updateContrat(@RequestBody Contrat c){
        return contratService.updateContrat(c);
    }

    @GetMapping("getContrat/{id}")
    Contrat retrieveContrat(@PathVariable Integer id){
        return contratService.retrieveContrat(id);
    }

    @GetMapping("retrieveAndUpdateStatusContrat")
    void retrieveAndUpdateStatusContrat(){ contratService.retrieveAndUpdateStatusContrat();}
/*
    @PutMapping("affectContratToEtudiant")
    Contrat affectContratToEtudiant (Contrat ce, String nomE , String prenomE) {

        return Etudiantservice.affectContratToEtudiant(ce, nomE, prenomE);
    } */
}

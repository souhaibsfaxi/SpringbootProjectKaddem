package com.example.springproject.controller;

import com.example.springproject.entities.Contrat;
import com.example.springproject.entities.Universite;
import com.example.springproject.services.ContratService;
import com.example.springproject.services.UniversiteService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("Universite")
public class UniversiteController {
    UniversiteService universiteService;

    @GetMapping("GetAllContrats")
    List<Universite> retrieveAllUniversites(){
        return universiteService.retrieveAllUniversites();
    }

    @PostMapping("addContrat")
    Universite addUniversite(@RequestBody Universite c){
        return universiteService.addUniversite(c);
    }

    @DeleteMapping("deleteContrat/{id}")
    void deleteUniversite(@PathVariable Integer id){
        universiteService.deleteUniversite(id);
    }

    @PutMapping("updateContrat")
    Universite updateUniversite(@RequestBody Universite c){
        return universiteService.updateUniversite(c);
    }

    @GetMapping("getContrat/{id}")
    Universite retrieveUniversite(@PathVariable Integer id){
        return universiteService.retrieveUniversite(id);
    }
/*
    @PutMapping("assignUniversiteToDepartement")
    void assignUniversiteToDepartement(Integer idUniversite, Integer idDepartement){
        universiteService.assignUniversiteToDepartement(idUniversite,idDepartement);
    }
    */

}

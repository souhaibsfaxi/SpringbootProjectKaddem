package com.example.springproject.controller;


import com.example.springproject.entities.Entreprise;

import com.example.springproject.services.EntrepriseService;

import lombok.AllArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("Entreprise/")
public class EntrepriseController {

    EntrepriseService entrepriseService;

    @GetMapping("e")
    List<Entreprise> retrieveAllEnt(){
        return entrepriseService.retrieveAllEnt();
    }

    @PostMapping("e")
    Entreprise addEnt(@RequestBody Entreprise c){
        return entrepriseService.addEnt(c);
    }

    @DeleteMapping("e/{id}")
    void deleteEnt(@PathVariable Integer id){
        entrepriseService.deleteEnt(id);
    }

    @PutMapping("/e/{id}")
    Entreprise updateEnt(@PathVariable Integer id, @RequestBody Entreprise e){
        return entrepriseService.updateEnt(id,e);
    }

    @GetMapping("e/{id}")
    Entreprise retrieveEnt(@PathVariable Integer id){
        return entrepriseService.retrieveEnt(id);
    }

    @GetMapping("searchEntByLocation")
    List<Entreprise> searchEntByLocation( @RequestParam("l") String l){
        return entrepriseService.searchEntByLocation(l);
    }

    @GetMapping("searchEntByNameOrMail")
    List<Entreprise> searchEntByNameOrMail( @RequestParam("query") String query){
        return entrepriseService.searchEntByNameOrMail(query);
    }



/*
    @PostMapping ("assignEquipeToEntreprise/{equipeId}/{entrepriseId}")
    void assignEquipeToEntreprise (@PathVariable Integer equipeId, @PathVariable Integer entrepriseId){
        entrepriseService.assignEquipeToEntreprise(equipeId, entrepriseId);
    } */
}

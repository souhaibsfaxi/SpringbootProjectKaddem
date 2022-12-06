package com.example.springproject.controller;

import com.example.springproject.entities.DetailEquipe;
import com.example.springproject.entities.Equipe;
import com.example.springproject.services.DetailEquipeService;
import com.example.springproject.services.EquipeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("Equipe/")
public class EquipeController {

    EquipeService Equipeservice;

    @GetMapping("equipe")
    List<Equipe> retrieveAllEquipe(){
        return Equipeservice.retrieveAllEquipe();
    }

    @PostMapping("equipe")
    Equipe addEquipe(@RequestBody Equipe c){
        return Equipeservice.addEquipe(c);
    }

    @DeleteMapping("equipe/{id}")
    void deleteEquipe(@PathVariable Integer id){
        Equipeservice.deleteEquipe(id);
    }

    @PutMapping("equipe")
    Equipe updateEquipe(@RequestBody Equipe c){
        return Equipeservice.updateEquipe(c);
    }

    @GetMapping("equipe/{id}")
    Equipe retrieveEquipe(@PathVariable Integer id){
        return Equipeservice.retrieveEquipe(id);
    }

    @GetMapping("public void faireEvoluerEquipes()")
     void faireEvoluerEquipes(){ Equipeservice.faireEvoluerEquipes();}
}

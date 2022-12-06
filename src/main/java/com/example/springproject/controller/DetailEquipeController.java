package com.example.springproject.controller;

import com.example.springproject.entities.Department;
import com.example.springproject.entities.DetailEquipe;
import com.example.springproject.services.DepartmentService;
import com.example.springproject.services.DetailEquipeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("DetailEquipe")
public class DetailEquipeController {

    DetailEquipeService DetailEquipeservice;

    @GetMapping("GetAllDetailEq")
    List<DetailEquipe> retrieveAllDetailEquipe(){
        return DetailEquipeservice.retrieveAllDetailEquipe();
    }

    @PostMapping("addDetailEq")
    DetailEquipe addDetailEquipe(@RequestBody DetailEquipe c){
        return DetailEquipeservice.addDetailEquipe(c);
    }

    @DeleteMapping("deleteDetailEq/{id}")
    void deleteDetailEquipe(@PathVariable Integer id){
        DetailEquipeservice.deleteDetailEquipe(id);
    }

    @PutMapping("updateDetailEq")
    DetailEquipe updateDetailEquipe(@RequestBody DetailEquipe c){
        return DetailEquipeservice.updateDetailEquipe(c);
    }

    @GetMapping("getDetailEq/{id}")
    DetailEquipe retrieveDetailEquipe(@PathVariable Integer id){
        return DetailEquipeservice.retrieveDetailEquipe(id);
    }
}

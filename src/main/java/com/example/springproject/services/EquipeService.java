package com.example.springproject.services;

import com.example.springproject.entities.DetailEquipe;
import com.example.springproject.entities.Equipe;

import java.util.List;

public interface EquipeService {


    List<Equipe> retrieveAllEquipe();

    Equipe addEquipe(Equipe c);

    void deleteEquipe(Integer id);

    Equipe updateEquipe(Equipe c);

    Equipe retrieveEquipe(Integer id);

    void faireEvoluerEquipes();

}

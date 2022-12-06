package com.example.springproject.services;

import com.example.springproject.entities.Contrat;
import com.example.springproject.entities.DetailEquipe;

import java.util.List;

public interface DetailEquipeService {

    List<DetailEquipe> retrieveAllDetailEquipe();

    DetailEquipe addDetailEquipe(DetailEquipe c);

    void deleteDetailEquipe(Integer id);

    DetailEquipe updateDetailEquipe(DetailEquipe c);

    DetailEquipe retrieveDetailEquipe(Integer id);
}

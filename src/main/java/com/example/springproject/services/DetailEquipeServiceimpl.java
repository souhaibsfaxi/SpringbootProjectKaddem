package com.example.springproject.services;


import com.example.springproject.entities.DetailEquipe;

import com.example.springproject.repositories.DetailEquipeRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
//@AllArgsConstructor
public class DetailEquipeServiceimpl implements DetailEquipeService {

    DetailEquipeRepo DetailEquiperepo;

    @Override
    public List<DetailEquipe> retrieveAllDetailEquipe(){
        return DetailEquiperepo.findAll();
    }

    @Override
    public DetailEquipe addDetailEquipe(DetailEquipe c){
        return DetailEquiperepo.save(c);
    }

    @Override
    public void deleteDetailEquipe(Integer id){
        DetailEquiperepo.deleteById(id);
    }

    @Override
    public DetailEquipe updateDetailEquipe(DetailEquipe c){
        return DetailEquiperepo.save(c);
    }

    @Override
    public DetailEquipe retrieveDetailEquipe(Integer id){
        return DetailEquiperepo.findById(id).orElse(null);
    }

}

package com.example.springproject.services;


import com.example.springproject.entities.Department;
import com.example.springproject.entities.Universite;

import com.example.springproject.repositories.DepartmentRepo;
import com.example.springproject.repositories.UniversiteRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UniversiteServiceimpl implements UniversiteService{

    UniversiteRepo Universiterepo;
    DepartmentRepo Departmentrepo;

    @Override
    public List<Universite> retrieveAllUniversites(){
        return Universiterepo.findAll();
    }

    @Override
    public Universite addUniversite(Universite c){
        return Universiterepo.save(c);
    }

    @Override
    public void deleteUniversite(Integer id){
        Universiterepo.deleteById(id);
    }

    @Override
    public Universite updateUniversite(Universite c){
        return Universiterepo.save(c);
    }

    @Override
    public Universite retrieveUniversite(Integer id){
        return Universiterepo.findById(id).orElse(null);
    }
/*
    @Override
    public void assignUniversiteToDepartement(Integer idUniversite, Integer idDepartement){
        Universite uni = Universiterepo.findById(idUniversite).orElse(null);
        Department dep = Departmentrepo.findById(idDepartement).orElse(null);
        uni.getDepartments().add(dep);
        Universiterepo.save(uni);


    }
*/

}

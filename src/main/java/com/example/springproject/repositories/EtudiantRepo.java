package com.example.springproject.repositories;

import com.example.springproject.entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EtudiantRepo extends JpaRepository<Etudiant, Integer> {
        //Etudiant findByNomeAndPrenome(String nom, String prenom);

        //List<Etudiant> findByDepartment_id_depart(Integer deptId);

}

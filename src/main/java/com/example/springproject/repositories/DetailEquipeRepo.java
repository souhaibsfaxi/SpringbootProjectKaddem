package com.example.springproject.repositories;

import com.example.springproject.entities.DetailEquipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetailEquipeRepo extends JpaRepository<DetailEquipe, Integer> {

}

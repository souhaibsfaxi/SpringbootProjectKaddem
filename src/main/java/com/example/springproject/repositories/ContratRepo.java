package com.example.springproject.repositories;

import com.example.springproject.entities.Contrat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContratRepo extends JpaRepository<Contrat,Integer> {
}

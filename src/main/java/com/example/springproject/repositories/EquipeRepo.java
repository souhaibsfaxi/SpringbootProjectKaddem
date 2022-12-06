package com.example.springproject.repositories;

import com.example.springproject.entities.Equipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EquipeRepo extends JpaRepository<Equipe, Integer> {
}

package com.bnta.dragonball_api.repositories;

import com.bnta.dragonball_api.models.Technique;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TechniqueRepository extends JpaRepository<Technique,Long> {

    List<Technique> findByNameContainingIgnoreCase(String name);
    List<Technique> findByTypeContainingIgnoreCase(String type);
    List<Technique> findByPersonsName(String name);
}

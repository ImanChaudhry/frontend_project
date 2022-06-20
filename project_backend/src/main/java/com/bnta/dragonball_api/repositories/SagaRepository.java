package com.bnta.dragonball_api.repositories;

import com.bnta.dragonball_api.models.Saga;
import com.bnta.dragonball_api.models.Series;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface SagaRepository extends JpaRepository<Saga, Long> {

    List<Saga> findByReleaseDateAfter(LocalDate releaseDate);
    List<Saga> findByNameContainingIgnoreCase(String name);
    List<Saga> findBySeries(Series series);
    List<Saga> findByPersonsName(String name);
}

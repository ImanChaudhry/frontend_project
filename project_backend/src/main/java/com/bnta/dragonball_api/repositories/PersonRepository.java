package com.bnta.dragonball_api.repositories;

import com.bnta.dragonball_api.models.Person;
import com.bnta.dragonball_api.models.Series;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonRepository extends JpaRepository<Person, Long> {
         List<Person> findByNameContainingIgnoreCase(String name);
         List<Person> findByPlanetContainingIgnoreCase(String planet);
         List<Person> findByAgeGreaterThan(Integer age);
         List<Person> findByRaceContainingIgnoreCase(String race);
         List<Person> findBySeries(Series series);

         //name, planet, age, race, series

}

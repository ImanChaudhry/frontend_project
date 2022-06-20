package com.bnta.dragonball_api.controllers;

import com.bnta.dragonball_api.models.Technique;
import com.bnta.dragonball_api.repositories.TechniqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
@RequestMapping("techniques")
public class TechniqueController {

    @Autowired
    TechniqueRepository techniqueRepository;

    //INDEX
    @GetMapping //localhost:8080/techniques
    public ResponseEntity<List<Technique>> getAllTechniquesAndFilters(
            @RequestParam(name = "name", required = false) String name,
            @RequestParam(name = "type", required = false) String type,
            @RequestParam(name = "personName", required = false) String personName){
        if(name != null && type != null && personName != null){
            List<Technique> list1 = techniqueRepository.findByNameContainingIgnoreCase(name);
            List<Technique> list2 = techniqueRepository.findByTypeContainingIgnoreCase(type);
            List<Technique> list3= techniqueRepository.findByPersonsName(personName);
            List<Technique> out = new ArrayList<>(Stream.of(list1, list2, list3).flatMap(List::stream)//create a stream of each list, then convert the list of lists to one big list(flattening)
                    .collect(Collectors.toMap(Technique::getId, d -> d, (Technique x, Technique y) -> x == null ? y : x)).values());//create a map out of the list using the id as the key and the saga as the value,
            return new ResponseEntity<>(out, HttpStatus.OK);                                                                        // where if the value is a duplicate it is ignored as the value will be null when toMap is applied
        }
        if(name != null && type != null && personName == null){
            List<Technique> list1 = techniqueRepository.findByNameContainingIgnoreCase(name);
            List<Technique> list2 = techniqueRepository.findByTypeContainingIgnoreCase(type);
            List<Technique> out = new ArrayList<>(Stream.of(list1, list2).flatMap(List::stream)//create a stream of each item in each list
                    .collect(Collectors.toMap(Technique::getId, d -> d, (Technique x, Technique y) -> x == null ? y : x)).values());//compare each item by id and remove duplicates
            return new ResponseEntity<>(out, HttpStatus.OK);
        }
        if(name != null && type == null && personName != null){
            List<Technique> list1 = techniqueRepository.findByNameContainingIgnoreCase(name);
            List<Technique> list3= techniqueRepository.findByPersonsName(personName);
            List<Technique> out = new ArrayList<>(Stream.of(list1, list3).flatMap(List::stream)//create a stream of each item in each list
                    .collect(Collectors.toMap(Technique::getId, d -> d, (Technique x, Technique y) -> x == null ? y : x)).values());//compare each item by id and remove duplicates
            return new ResponseEntity<>(out, HttpStatus.OK);
        }
        if(name == null && type != null && personName != null){
            List<Technique> list2 = techniqueRepository.findByTypeContainingIgnoreCase(type);
            List<Technique> list3= techniqueRepository.findByPersonsName(personName);
            List<Technique> out = new ArrayList<>(Stream.of(list2, list3).flatMap(List::stream)//create a stream of each item in each list
                    .collect(Collectors.toMap(Technique::getId, d -> d, (Technique x, Technique y) -> x == null ? y : x)).values());//compare each item by id and remove duplicates
            return new ResponseEntity<>(out, HttpStatus.OK);
        }
        if(name == null && type == null && personName != null){
            return new ResponseEntity<>(techniqueRepository.findByPersonsName(personName),HttpStatus.OK);
        }
        if(name == null && type != null && personName == null){
            return new ResponseEntity<>(techniqueRepository.findByTypeContainingIgnoreCase(type),HttpStatus.OK);
        }
        if(name != null && type == null && personName == null){
            return new ResponseEntity<>(techniqueRepository.findByNameContainingIgnoreCase(name),HttpStatus.OK);
        }
        return new ResponseEntity<>(techniqueRepository.findAll(), HttpStatus.OK);
    }

    //SHOW
    @GetMapping(value = "/{id}") //localhost:8080/techniques/1
    public ResponseEntity<Optional<Technique>> getTechnique(@PathVariable Long id){
        Optional<Technique> technique = techniqueRepository.findById(id);
        return new ResponseEntity<>(technique, technique.isEmpty() ? HttpStatus.NOT_FOUND : HttpStatus.OK);
    }

    //POST
    @PostMapping // localhost:8080/techniques
    public ResponseEntity<Technique> createTechnique(@RequestBody Technique newTechnique) throws Exception{
        Long id = newTechnique.getId();
        Optional<Technique> technique = techniqueRepository.findById(id);
        if(technique.isEmpty()) {
            techniqueRepository.save(newTechnique);
            return new ResponseEntity<>(newTechnique, HttpStatus.CREATED);
        } else {
            throw new Exception("Technique with id: " + id + " already exists");
        }
    }

    //DELETE
    @DeleteMapping(value = "/{id}") //localhost:8080/techniques/1
    public ResponseEntity<Technique> deleteTechnique(@PathVariable Long id) throws Exception{
        Optional<Technique> technique = techniqueRepository.findById(id);
        if(technique.isEmpty()){
            throw new Exception("Technique with id: " + id + " not found");
        } else {
            techniqueRepository.deleteById(id);
            return new ResponseEntity("Deleted Technique with id: " + id, HttpStatus.OK);
        }
    }

    //UPDATE
    @PutMapping(value = "/{id}") //localhost:8080/techniques/1
    public ResponseEntity<Technique> updateTechnique(@PathVariable(value = "id") Long id, @RequestBody Technique upTechnique) throws Exception{
        Optional<Technique> technique = techniqueRepository.findById(id);
        if(technique.isEmpty()){
            throw new Exception("Technique with id: " + id + " not found");
        } else {
            Technique t = technique.get();
            t.setName(upTechnique.getName());
            t.setType(upTechnique.getType());
            t.setPersons(upTechnique.getPersons());
            Technique updatedTechnique = techniqueRepository.save(t);
            return new ResponseEntity<>(updatedTechnique,HttpStatus.OK);
        }
    }
}

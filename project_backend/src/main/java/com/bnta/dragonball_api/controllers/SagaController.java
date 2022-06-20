package com.bnta.dragonball_api.controllers;

import com.bnta.dragonball_api.models.Saga;
import com.bnta.dragonball_api.models.Series;
import com.bnta.dragonball_api.repositories.SagaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
@RequestMapping("sagas")
public class SagaController {

    @Autowired
    SagaRepository sagaRepository;

    //INDEX
    @GetMapping //localhost:8080/sagas
    public ResponseEntity<List<Saga>> getAllSagasAndFilter(
            @RequestParam(name = "releaseDate", required = false) String strDate,
            @RequestParam(name = "name", required = false) String name,
            @RequestParam(name = "series",required = false) String series,
            @RequestParam(name = "personName", required = false) String personName){
        if(strDate != null && name != null && series != null && personName != null){
            LocalDate date = LocalDate.parse(strDate, DateTimeFormatter.BASIC_ISO_DATE);
            List<Saga> list1 = sagaRepository.findByReleaseDateAfter(date);
            List<Saga> list2 = sagaRepository.findByNameContainingIgnoreCase(name);
            List<Saga> list3 = new ArrayList<>();
            for(Series s : Series.values()){
                if(s.toString().contains(series)){
                    list3 = (sagaRepository.findBySeries(s));
                }
            }
            List<Saga> list4 = sagaRepository.findByPersonsName(personName);
            List<Saga> out = new ArrayList<>(Stream.of(list1, list2, list3, list4).flatMap(List::stream)//create a stream of each list, then convert the list of lists to one big list(flattening)
                    .collect(Collectors.toMap(Saga::getId, d -> d, (Saga x, Saga y) -> x == null ? y : x)).values());//create a map out of the list using the id as the key and the saga as the value,
            return new ResponseEntity<>(out, HttpStatus.OK);                                                        // where if the value is a duplicate it is ignored as the value will be null when toMap is applied
        }
        if(strDate != null && name != null && series == null && personName != null){
            LocalDate date = LocalDate.parse(strDate, DateTimeFormatter.BASIC_ISO_DATE);
            List<Saga> list1 = sagaRepository.findByReleaseDateAfter(date);
            List<Saga> list2 = sagaRepository.findByNameContainingIgnoreCase(name);
            List<Saga> list4 = sagaRepository.findByPersonsName(personName);
            List<Saga> out = new ArrayList<>(Stream.of(list1, list2, list4).flatMap(List::stream)//create a stream of each item in each list
                    .collect(Collectors.toMap(Saga::getId, d -> d, (Saga x, Saga y) -> x == null ? y : x)).values());//compare each item by id and remove duplicates
            return new ResponseEntity<>(out, HttpStatus.OK);
        }
        if(strDate == null && name != null && series != null && personName != null) {
            List<Saga> list2 = sagaRepository.findByNameContainingIgnoreCase(name);
            List<Saga> list3 = new ArrayList<>();
            for (Series s : Series.values()) {
                if (s.toString().contains(series)) {
                    list3 = (sagaRepository.findBySeries(s));
                }
            }
            List<Saga> list4 = sagaRepository.findByPersonsName(personName);
            List<Saga> out = new ArrayList<>(Stream.of(list2, list3, list4).flatMap(List::stream)//create a stream of each item in each list
                    .collect(Collectors.toMap(Saga::getId, d -> d, (Saga x, Saga y) -> x == null ? y : x)).values());//compare each item by id and remove duplicates
            return new ResponseEntity<>(out, HttpStatus.OK);
        }
        if(strDate != null && name == null && series != null && personName != null){
            LocalDate date = LocalDate.parse(strDate, DateTimeFormatter.BASIC_ISO_DATE);
            List<Saga> list1 = sagaRepository.findByReleaseDateAfter(date);
            List<Saga> list3 = new ArrayList<>();
            for(Series s : Series.values()){
                if(s.toString().contains(series)){
                    list3 = (sagaRepository.findBySeries(s));
                }
            }
            List<Saga> list4 = sagaRepository.findByPersonsName(personName);
            List<Saga> out = new ArrayList<>(Stream.of(list1,list3,list4).flatMap(List::stream)//create a stream of each item in each list
                    .collect(Collectors.toMap(Saga::getId, d -> d, (Saga x, Saga y) -> x == null ? y : x)).values());//compare each item by id and remove duplicates
            return new ResponseEntity<>(out, HttpStatus.OK);
        }
        if(strDate == null && name != null && series == null && personName != null){
            List<Saga> list2 = sagaRepository.findByNameContainingIgnoreCase(name);
            List<Saga> list4 = sagaRepository.findByPersonsName(personName);
            List<Saga> out = new ArrayList<>(Stream.of(list2,list4).flatMap(List::stream)//create a stream of each item in each list
                    .collect(Collectors.toMap(Saga::getId, d -> d, (Saga x, Saga y) -> x == null ? y : x)).values());//compare each item by id and remove duplicates
            return new ResponseEntity<>(out, HttpStatus.OK);
        }
        if(strDate != null && name == null && series == null && personName != null){
            LocalDate date = LocalDate.parse(strDate, DateTimeFormatter.BASIC_ISO_DATE);
            List<Saga> list1 = sagaRepository.findByReleaseDateAfter(date);
            List<Saga> list4 = sagaRepository.findByPersonsName(personName);
            List<Saga> out = new ArrayList<>(Stream.of(list1,list4).flatMap(List::stream)//create a stream of each item in each list
                    .collect(Collectors.toMap(Saga::getId, d -> d, (Saga x, Saga y) -> x == null ? y : x)).values());//compare each item by id and remove duplicates
            return new ResponseEntity<>(out, HttpStatus.OK);
        }
        if(strDate == null && name == null && series != null && personName != null){
            List<Saga> list3 = new ArrayList<>();
            for(Series s : Series.values()){
                if(s.toString().contains(series)){
                    list3 = (sagaRepository.findBySeries(s));
                }
            }
            List<Saga> list4 = sagaRepository.findByPersonsName(personName);
            List<Saga> out = new ArrayList<>(Stream.of(list3,list4).flatMap(List::stream)//create a stream of each item in each list
                    .collect(Collectors.toMap(Saga::getId, d -> d, (Saga x, Saga y) -> x == null ? y : x)).values());//compare each item by id and remove duplicates
            return new ResponseEntity<>(out, HttpStatus.OK);
        }
        if(strDate != null && name != null && series != null && personName == null){
            LocalDate date = LocalDate.parse(strDate, DateTimeFormatter.BASIC_ISO_DATE);
            List<Saga> list1 = sagaRepository.findByReleaseDateAfter(date);
            List<Saga> list2 = sagaRepository.findByNameContainingIgnoreCase(name);
            List<Saga> list3 = new ArrayList<>();
            for(Series s : Series.values()){
                if(s.toString().contains(series)){
                    list3 = (sagaRepository.findBySeries(s));
                }
            }
            List<Saga> out = new ArrayList<>(Stream.of(list1,list2,list3).flatMap(List::stream)//create a stream of each item in each list
                    .collect(Collectors.toMap(Saga::getId, d -> d, (Saga x, Saga y) -> x == null ? y : x)).values());//compare each item by id and remove duplicates
            return new ResponseEntity<>(out, HttpStatus.OK);
        }
        if(strDate != null && name != null && series == null && personName == null){
            LocalDate date = LocalDate.parse(strDate, DateTimeFormatter.BASIC_ISO_DATE);
            List<Saga> list1 = sagaRepository.findByReleaseDateAfter(date);
            List<Saga> list2 = sagaRepository.findByNameContainingIgnoreCase(name);
            List<Saga> out = new ArrayList<>(Stream.of(list1,list2).flatMap(List::stream)//create a stream of each item in each list
                    .collect(Collectors.toMap(Saga::getId, d -> d, (Saga x, Saga y) -> x == null ? y : x)).values());//compare each item by id and remove duplicates
            return new ResponseEntity<>(out, HttpStatus.OK);
        }
        if(strDate == null && name != null && series != null && personName == null) {
            List<Saga> list2 = sagaRepository.findByNameContainingIgnoreCase(name);
            List<Saga> list3 = new ArrayList<>();
            for (Series s : Series.values()) {
                if (s.toString().contains(series)) {
                    list3 = (sagaRepository.findBySeries(s));
                }
            }
            List<Saga> out = new ArrayList<>(Stream.of(list2, list3).flatMap(List::stream)//create a stream of each item in each list
                    .collect(Collectors.toMap(Saga::getId, d -> d, (Saga x, Saga y) -> x == null ? y : x)).values());//compare each item by id and remove duplicates
            return new ResponseEntity<>(out, HttpStatus.OK);
        }
        if(strDate != null && name == null && series != null && personName == null){
            LocalDate date = LocalDate.parse(strDate, DateTimeFormatter.BASIC_ISO_DATE);
            List<Saga> list1 = sagaRepository.findByReleaseDateAfter(date);
            List<Saga> list3 = new ArrayList<>();
            for(Series s : Series.values()){
                if(s.toString().contains(series)){
                    list3 = (sagaRepository.findBySeries(s));
                }
            }
            List<Saga> out = new ArrayList<>(Stream.of(list1,list3).flatMap(List::stream)//create a stream of each item in each list
                    .collect(Collectors.toMap(Saga::getId, d -> d, (Saga x, Saga y) -> x == null ? y : x)).values());//compare each item by id and remove duplicates
            return new ResponseEntity<>(out, HttpStatus.OK);
        }
        if(strDate == null && name != null && series == null && personName == null){
            return new ResponseEntity<>(sagaRepository.findByNameContainingIgnoreCase(name),HttpStatus.OK);
        }
        if(strDate != null && name == null && series == null && personName == null){
            LocalDate date = LocalDate.parse(strDate, DateTimeFormatter.BASIC_ISO_DATE);
            return new ResponseEntity<>(sagaRepository.findByReleaseDateAfter(date),HttpStatus.OK);
        }
        if(strDate == null && name == null && series != null && personName == null){
            for(Series s : Series.values()){
                if(s.toString().contains(series)){
                    return new ResponseEntity(sagaRepository.findBySeries(s),HttpStatus.OK);
                }
            }
        }
        return new ResponseEntity<>(sagaRepository.findAll(), HttpStatus.OK);
    }

    //SHOW
    @GetMapping(value = "/{id}") //localhost:8080/sagas/1
    public ResponseEntity<Optional<Saga>> getSaga(@PathVariable Long id){
        Optional<Saga> saga = sagaRepository.findById(id);
        return new ResponseEntity<>(saga, saga.isEmpty() ? HttpStatus.NOT_FOUND : HttpStatus.OK);
    }

    //POST
    @PostMapping // localhost:8080/sagas
    public ResponseEntity<Saga> createSaga(@RequestBody Saga newSaga) throws Exception{
        Long id = newSaga.getId();
        Optional<Saga> saga = sagaRepository.findById(id);
        if(saga.isEmpty()) {
            sagaRepository.save(newSaga);
            return new ResponseEntity<>(newSaga, HttpStatus.CREATED);
        } else {
            throw new Exception("Saga with id: " + id + " already exists");
        }
    }

    //DELETE
    @DeleteMapping(value = "/{id}") //localhost:8080/sagas/1
    public ResponseEntity<Saga> deleteSaga(@PathVariable Long id) throws Exception{
        Optional<Saga> saga = sagaRepository.findById(id);
        if(saga.isEmpty()){
            throw new Exception("Saga with id: " + id + " not found");
        } else {
            sagaRepository.deleteById(id);
            return new ResponseEntity("Deleted Saga with id: " + id, HttpStatus.OK);
        }
    }

    //UPDATE
    @PutMapping(value = "/{id}") //localhost:8080/sagas/1
    public ResponseEntity<Saga> updateSaga(@PathVariable(value = "id") Long id, @RequestBody Saga upSaga) throws Exception{
        Optional<Saga> saga = sagaRepository.findById(id);
        if(saga.isEmpty()){
            throw new Exception("Saga with id: " + id + " not found");
        } else {
            Saga s = saga.get();
            s.setName(upSaga.getName());
            s.setSeries(upSaga.getSeries());
            s.setEpisodes(upSaga.getEpisodes());
            s.setReleaseDate(upSaga.getReleaseDate());
            s.setPersons(upSaga.getPersons());
            Saga updatedSaga = sagaRepository.save(s);
            return new ResponseEntity<>(updatedSaga,HttpStatus.OK);
        }
    }
}

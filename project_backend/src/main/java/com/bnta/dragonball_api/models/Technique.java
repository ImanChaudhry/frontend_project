package com.bnta.dragonball_api.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.scheduling.support.SimpleTriggerContext;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "techniques")
public class Technique {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;
    @Column
    private String name;
    @Column
    private String type;
    @Column
    private String image;

    @ManyToMany(mappedBy = "techniques",cascade = CascadeType.ALL)
    @JsonIgnoreProperties({"techniques", "saga"})
    private List<Person> persons;

    public Technique() {}

    public Technique(String name, String type, String image) {
        this.name = name;
        this.type = type;
        this.image = image;
        this.persons = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Person> getPersons() {
        return persons;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }
}

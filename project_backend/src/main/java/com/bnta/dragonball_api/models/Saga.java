package com.bnta.dragonball_api.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "sagas")
public class Saga {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;
    @Column
    private String name;
    @Column
    @Enumerated(EnumType.STRING)
    private Series series;
    @Column
    private String episodes;
    @Column
    private String image;
    @Column
    private LocalDate releaseDate;
    @OneToMany(mappedBy = "saga", cascade = CascadeType.ALL)
    @JsonIgnoreProperties({ "saga", "techniques"})
    private List<Person> persons;

    public Saga() {}

    public Saga(String name, Series series, String episodes, String image, LocalDate releaseDate) {
        this.name = name;
        this.series = series;
        this.episodes = episodes;
        this.image = image;
        this.releaseDate = releaseDate;
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

    public Series getSeries() {
        return series;
    }

    public void setSeries(Series series) {
        this.series = series;
    }

    public String getEpisodes() {
        return episodes;
    }

    public void setEpisodes(String episodes) {
        this.episodes = episodes;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public List<Person> getPersons() {
        return persons;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }
}

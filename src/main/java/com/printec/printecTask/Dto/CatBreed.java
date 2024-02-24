package com.printec.printecTask.Dto;

import jakarta.persistence.*;

@Entity
public class CatBreed {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String breed;
    private String country;
    private String origin;
    private String coat;
    private String pattern;

    // Not sure if the free api provided will always return full objects
    @PrePersist
    public void prePersist() {
        if (breed == null) breed = "Unknown Breed";
        if (country == null) country = "Unknown Country";
        if (origin == null) origin = "Unknown Origin";
        if (coat == null) coat = "Unknown Coat";
        if (pattern == null) pattern = "Unknown Pattern";
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getCoat() {
        return coat;
    }

    public void setCoat(String coat) {
        this.coat = coat;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }
}
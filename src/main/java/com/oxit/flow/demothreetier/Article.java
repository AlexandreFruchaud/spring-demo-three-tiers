package com.oxit.flow.demothreetier;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    @Size(max = 45)
    private String name;

    public Article() {
    }

    public Article(Long id, @Size(max = 45) String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

package com.example.jpa.Model;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
@Table(name = "IndianMovies")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private int ratings;
    private long time;

    public Movie(String name, int ratings, long time) {
        this.name = name;
        this.ratings = ratings;
        this.time = time;
    }

    public Movie() {

    }
}

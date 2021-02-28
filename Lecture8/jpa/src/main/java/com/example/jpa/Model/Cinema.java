package com.example.jpa.Model;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
@Table(name = "Cinema")
public class Cinema {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;
    String tName;

    public Cinema(String name) {
        this.name = name;
    }

    public Cinema() {

    }
}

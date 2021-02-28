package com.example.jpa.Respository;

import com.example.jpa.Model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MovieRepository extends JpaRepository<Movie,Integer> {

    @Query(value = "                 ",nativeQuery = true);
    public Movie findByNameAndTime(String name, long time);
}

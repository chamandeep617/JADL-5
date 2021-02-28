package com.example.jpa.Respository;

import com.example.jpa.Model.Cinema;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CinemaRepository extends JpaRepository<Cinema,Integer> {
}

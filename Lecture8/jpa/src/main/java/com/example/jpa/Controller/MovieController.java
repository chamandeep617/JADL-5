package com.example.jpa.Controller;

import com.example.jpa.Dto.MovieDto;
import com.example.jpa.Dto.MovieResponseDto;
import com.example.jpa.Dto.ResponseDto;
import com.example.jpa.Model.Cinema;
import com.example.jpa.Respository.CinemaRepository;
import com.example.jpa.Service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {

    @Autowired
    MovieService movieService;

    @Autowired
    CinemaRepository cinemaRepository;

    @PostMapping("/saveMovie")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseDto<MovieResponseDto> saveMovie(@RequestBody MovieDto movieDto){
        MovieResponseDto movieResponseDto = movieService.saveMovie(movieDto);
        return new  ResponseDto(movieResponseDto, HttpStatus.CREATED);
    }

    @PostMapping("/saveCinema")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseDto<Cinema> saveCinema(@RequestBody Cinema cinema){
        cinema = cinemaRepository.save(cinema);
        return new  ResponseDto(cinema, HttpStatus.CREATED);
    }
}

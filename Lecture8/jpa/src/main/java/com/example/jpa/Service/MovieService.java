package com.example.jpa.Service;

import com.example.jpa.Dto.MovieDto;
import com.example.jpa.Dto.MovieResponseDto;
import com.example.jpa.Model.Movie;
import com.example.jpa.Respository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

    @Autowired
    MovieRepository movieRepository;

    public MovieResponseDto saveMovie(MovieDto movieDto){
        Movie movie = new Movie(movieDto.getName(),movieDto.getRatings(),System.currentTimeMillis());
        /////////////////////////////////////////////////////////
        movie = movieRepository.save(movie);
        /////////////////////////////////////////////////////////
        MovieResponseDto movieResponseDto = new MovieResponseDto(movie.getId(),movie.getName(),movie.getRatings());
        return movieResponseDto;
    }

}

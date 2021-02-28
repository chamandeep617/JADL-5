package com.example.jpa.Dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class MovieDto {
    private String name;
    private int ratings;
}

package com.SpringBoot_SpringSecurity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBoot_SpringSecurity.models.Movies;
import com.SpringBoot_SpringSecurity.repositories.MovieRepository;
import com.SpringBoot_SpringSecurity.services.MovieService;

@RestController
@RequestMapping("/api/movies")
public class MovieController {
    private MovieService movieService;

    @Autowired
    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/all")
    public List<Movies> getAllProducts() {
        System.out.println("Chiamata riuscita");
        return movieService.findAll();
    }
}
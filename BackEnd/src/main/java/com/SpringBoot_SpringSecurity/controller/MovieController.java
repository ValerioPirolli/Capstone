package com.SpringBoot_SpringSecurity.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBoot_SpringSecurity.models.Actors;
import com.SpringBoot_SpringSecurity.models.Movies;
import com.SpringBoot_SpringSecurity.repositories.MovieRepository;
import com.SpringBoot_SpringSecurity.services.MovieService;


@RestController
@RequestMapping("/api/movies")
public class MovieController {
    private MovieService ms;

    @Autowired
    public MovieController(MovieService movieService) {
        this.ms = movieService;
    }

    @GetMapping("/all")
    public List<Movies> getAllProducts() {
        System.out.println("Chiamata riuscita");
        return ms.findAll();
    }
    @GetMapping("/{id}")
    public Movies getMovieById(@PathVariable Long id) {
        return ms.findById(id);
    }

    @GetMapping("/{id}/attori")
    public List<Actors> getMovieActors(@PathVariable Long id) {
    	System.out.println("Chiamata attori/film riuscita");
        Movies movie = ms.findById(id);
        return new ArrayList<Actors>(movie.getAttori());
    }
    @GetMapping("/attori/{titolo}")
    public List<Actors> getMovieActorsByTitolo(@PathVariable String titolo) {
    	System.out.println("Chiamata attori/film riuscita");
        Movies movie = ms.findByTitle(titolo);
        return new ArrayList<Actors>(movie.getAttori());
    }
    @GetMapping("/title/{title}")
    public Movies getMovieByTitle(@PathVariable String title) {
        return ms.findByTitle(title);
    }
}
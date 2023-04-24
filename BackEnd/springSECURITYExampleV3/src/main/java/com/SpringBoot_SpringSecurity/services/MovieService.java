package com.SpringBoot_SpringSecurity.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringBoot_SpringSecurity.models.Movies;
import com.SpringBoot_SpringSecurity.repositories.MovieRepository;

import jakarta.persistence.EntityExistsException;
import jakarta.persistence.EntityNotFoundException;


@Service
public class MovieService {
	@Autowired private MovieRepository MovieRepository;

    public Movies save(Movies m) {
    if(MovieRepository.existsByTitolo(m.getTitolo())) {
		 throw new EntityExistsException("Movie exists!!");
	}
	MovieRepository.save(m);
	return m;
}

    public void deleteById(Long id){
        if(MovieRepository.findById(id).isEmpty()){
            throw new EntityNotFoundException("Movie not found with that id");
        }else{
            MovieRepository.deleteById(id);
        }
        
    }

    public Movies findById(Long id){
        if(MovieRepository.findById(id).isEmpty()){
            throw new EntityNotFoundException("Movies not found with that id");
        }else{
            return MovieRepository.findById(id).get();
        }
    }

    public List<Movies> findAll(){
        return MovieRepository.findAll();
    }
}

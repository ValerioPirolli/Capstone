package com.SpringBoot_SpringSecurity.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringBoot_SpringSecurity.models.Actors;
import com.SpringBoot_SpringSecurity.models.Movies;
import com.SpringBoot_SpringSecurity.repositories.ActorRepository;
import com.SpringBoot_SpringSecurity.repositories.MovieRepository;

import jakarta.persistence.EntityExistsException;
import jakarta.persistence.EntityNotFoundException;

@Service
public class MovieService {
	@Autowired private MovieRepository ar;

	public Movies save(Movies m) {
	    if(ar.existsByTitolo(m.getTitolo())) {
	        System.out.println("Il film " + m.getTitolo() + " esiste già e non verrà salvato.");
	        return null;
	    }
	    ar.save(m);
	    return m;
	}

    public void deleteById(Long id){
        if(ar.findById(id).isEmpty()){
            throw new EntityNotFoundException("Movie not found with that id");
        }else{
            ar.deleteById(id);
        }
        
    }

    public Movies findById(Long id){
        if(ar.findById(id).isEmpty()){
            throw new EntityNotFoundException("Movies not found with that id");
        }else{
            return ar.findById(id).get();
        }
    }

    public List<Movies> findAll(){
        return ar.findAll();
    }
    public void updateVotoMovie(long id){
    	if(ar.findById(id).isEmpty()){
            throw new EntityNotFoundException("Movies not found with that id");
        }else{
            Movies mov = ar.findById(id).get();
            mov.updateVoto();
            ar.save(mov);
        }
    	
    }
    public Movies findByTitle(String title){
        Optional<Movies> movie = ar.findByTitolo(title);
        if(movie.isEmpty()){
            throw new EntityNotFoundException("Movies not found with that title");
        }else{
            return movie.get();
        }
    }
}

package com.SpringBoot_SpringSecurity.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.SpringBoot_SpringSecurity.models.Actors;
import com.SpringBoot_SpringSecurity.models.Movies;
import com.SpringBoot_SpringSecurity.repositories.ActorRepository;
import com.SpringBoot_SpringSecurity.repositories.MovieRepository;

import jakarta.persistence.EntityExistsException;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;


@Service
public class ActorService {
	@Autowired private ActorRepository ar;

	public Actors save(Actors m) {
	    if(ar.existsByName(m.getName())) {
	        System.out.println("L'attore " + m.getName() + " esiste già e non verrà salvato.");
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

    public Actors findById(Long id){
        if(ar.findById(id).isEmpty()){
            throw new EntityNotFoundException("Movies not found with that id");
        }else{
            return ar.findById(id).get();
        }
    }

    public List<Actors> findAll(){
        return ar.findAll();
    }
    public Movies findByName(String name){
        Optional<Movies> movie = ar.findByName(name);
        if(movie.isEmpty()){
            throw new EntityNotFoundException("Actor not found with that title");
        }else{
            return movie.get();
        }
    }
}

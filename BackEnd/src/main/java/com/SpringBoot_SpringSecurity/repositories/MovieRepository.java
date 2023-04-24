package com.SpringBoot_SpringSecurity.repositories;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.SpringBoot_SpringSecurity.models.Generi;
import com.SpringBoot_SpringSecurity.models.Movies;



@Repository
	public interface MovieRepository extends JpaRepository<Movies,Long>{
	    
	    
		boolean existsByTitolo(String titolo);
		Optional<Movies> findByTitolo(String title);

		}


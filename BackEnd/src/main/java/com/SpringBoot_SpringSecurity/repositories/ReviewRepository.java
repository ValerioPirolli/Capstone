package com.SpringBoot_SpringSecurity.repositories;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SpringBoot_SpringSecurity.models.Recensioni;

@Repository
public interface ReviewRepository extends JpaRepository<Recensioni, Long> {
	boolean existsByid(Long id);
	Recensioni findByid(Long id);
	ArrayList<Recensioni> findByMovie(Long id);
	Recensioni findByMovie_TitoloAndUser_Username(String titolo, String username);
	ArrayList<Recensioni>findByMovie_TitoloAndUser_UsernameNot(String movieTitolo, String username);
}
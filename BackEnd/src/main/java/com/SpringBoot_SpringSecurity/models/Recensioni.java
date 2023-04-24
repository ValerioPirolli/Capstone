package com.SpringBoot_SpringSecurity.models;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.SpringBoot_SpringSecurity.auth.entity.User;
import com.fasterxml.jackson.annotation.JsonIgnore;

import io.micrometer.common.lang.NonNull;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
public class Recensioni {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @NonNull
	    private String titolo;


	    @Column(length = 1000)
	    @NonNull
	    private String descrizione;

	    @NonNull
	    private Double voto;
		
	    @ManyToOne
	    @JoinColumn(name = "recensioni_id")
	    private User user;
	    
	    @ManyToOne
	    @JoinColumn(name = "movies_id")
	    private Movies movie;
	}

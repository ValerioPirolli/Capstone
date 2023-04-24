package com.SpringBoot_SpringSecurity.models;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import io.micrometer.common.lang.NonNull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
public class Actors {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NonNull
    private String name;
    
    @NonNull
    private String dataNascita;
    
    @NonNull
    private String img;
    
    @ManyToMany(mappedBy = "attori")
    private List<Movies> films = new ArrayList<>();
    
    @Column(length = 1000)
    @NonNull
    private String bio;

	public Actors(String name, String img, String dataNascita, String bio) {
		super();
		this.name = name;
		this.img = img;
		this.dataNascita = dataNascita;
		this.bio = bio;
	}
    
    
	
}

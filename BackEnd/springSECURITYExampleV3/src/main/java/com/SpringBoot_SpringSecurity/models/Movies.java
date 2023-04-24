package com.SpringBoot_SpringSecurity.models;

import java.time.LocalDate;
import java.util.List;

import io.micrometer.common.lang.NonNull;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
@AllArgsConstructor
public class Movies {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@NonNull
	private String titolo;
	
	@NonNull
	private LocalDate dataUscita;
	
	@NonNull
	private String durata;

	@NonNull
	private String sottotitolo;

	@NonNull
	private String descrizione;

	@NonNull
	private String director;

	@NonNull
	private List<String> attori;
	
	@NonNull
    @Enumerated(EnumType.STRING)
    private List<Generi> generi;
}

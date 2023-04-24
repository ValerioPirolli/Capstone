package com.SpringBoot_SpringSecurity.models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import io.micrometer.common.lang.NonNull;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
public class Movies {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NonNull
    private String titolo;

    @NonNull
    private String dataUscita;

    @Column(length = 1000)
    @NonNull
    private String descrizione;

    @Column(length = 700)
    @NonNull
    private String director;

    @Column(length = 700)
    @NonNull
    private String posterPiccolo;

    @Column(length = 700)
    @NonNull
    private String cover;

    @Column(length = 700)
    @NonNull
    private String trailer;
    
    @Column(length = 700)
    @NonNull
	private String durata;
	 
	@NonNull
	private String sottotitolo;
	
	private Double voto;

    @NonNull
    @ManyToMany
    @JsonIgnore
    @JoinTable(name = "film_attore",
    joinColumns = @JoinColumn(name = "movies_id"),
    inverseJoinColumns = @JoinColumn(name = "actors_id"))
    private List<Actors> attori;

    @NonNull
    @ElementCollection(targetClass = Generi.class)
    private Set<Generi> generi = new HashSet<Generi>();
    
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "movies_id")
    @JsonIgnore
    private List<Recensioni> recensioni = new ArrayList<>();

	public Movies(String titolo, String dataUscita, String durata, String sottotitolo, String descrizione,
			String director, String posterPiccolo, String cover, String trailer) {
		super();
		this.titolo = titolo;
		this.dataUscita = dataUscita;
		this.descrizione = descrizione;
		this.director = director;
		this.posterPiccolo = posterPiccolo;
		this.cover = cover;
		this.trailer = trailer;
		this.durata = durata;
		this.sottotitolo = sottotitolo;
		this.attori = new ArrayList<Actors>();
	}
	public void addE(Actors elemento) {
        attori.add(elemento);
    }
	public void updateVoto() {
	    if (recensioni != null && !recensioni.isEmpty()) {
	        double somma = 0;
	        for (Recensioni recensione : recensioni) {
	            somma += recensione.getVoto();
	        }
	        this.voto = somma / recensioni.size();
	    }
	}


}

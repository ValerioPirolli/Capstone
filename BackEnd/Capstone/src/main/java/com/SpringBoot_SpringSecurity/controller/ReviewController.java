package com.SpringBoot_SpringSecurity.controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBoot_SpringSecurity.models.Movies;
import com.SpringBoot_SpringSecurity.models.Recensioni;
import com.SpringBoot_SpringSecurity.services.ReviewService;

@RestController
@RequestMapping("/api/reviews")
public class ReviewController {
    
    @Autowired
    private ReviewService rs;

    @GetMapping("/{id}")
    public ResponseEntity<Recensioni> getReviewById(@PathVariable Long id) {
        Optional<Recensioni> review = rs.getReviewById(id);
        if (review.isPresent()) {
            return ResponseEntity.ok(review.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    @GetMapping("/movie/user")
    public ResponseEntity<Recensioni> getReviewByMovieAndUser(@RequestParam String username, @RequestParam String id) {
        Recensioni reviews = rs.findByMovieAndUser(id, username);
        System.out.println("chiamata riuscita a recensioni1");
        return ResponseEntity.ok(reviews);
    }
    
    @GetMapping("/movie/reviews")
    public ResponseEntity<List<Recensioni>> getReviewsByrootMovieAndNotUser(@RequestParam String id, @RequestParam String username) {
        List<Recensioni> reviews = rs.findByMovieAndNotUser(id, username);
        System.out.println("chiamata riuscita a recensioni2");
        return ResponseEntity.ok(reviews);
    }
    
    @GetMapping("/all")
    public List<Recensioni> getAllProducts() {
        System.out.println("Chiamata riuscita");
        return rs.findAll();
    }

    @PostMapping
    public ResponseEntity<Recensioni> addReview(@RequestBody Recensioni review, @RequestParam String username, @RequestParam Long id) {
        Recensioni savedReview = rs.save(review, username, id);
        System.out.println("recensione aggiunta riuscita");
        return ResponseEntity.created(URI.create("/api/reviews/" + savedReview.getId())).body(savedReview);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Recensioni> updateReview(@PathVariable Long id, @RequestBody Recensioni review) {
        Recensioni updatedReview = rs.updateReview(id,review);
        return ResponseEntity.ok(updatedReview);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteReview(@PathVariable Long id) {
        rs.deleteReview(id);
        return ResponseEntity.noContent().build();
    }
}


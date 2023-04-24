package com.SpringBoot_SpringSecurity.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringBoot_SpringSecurity.auth.entity.User;
import com.SpringBoot_SpringSecurity.models.Actors;
import com.SpringBoot_SpringSecurity.models.Movies;
import com.SpringBoot_SpringSecurity.models.Recensioni;
import com.SpringBoot_SpringSecurity.repositories.ActorRepository;
import com.SpringBoot_SpringSecurity.repositories.ReviewRepository;
import com.SpringBoot_SpringSecurity.repositories.UserRepository2;

import jakarta.persistence.EntityExistsException;
import jakarta.persistence.EntityNotFoundException;

@Service
public class ReviewService  {
	@Autowired private ReviewRepository ar;
	@Autowired private UserService2 us;
	@Autowired private MovieService ms;

    public Recensioni save(Recensioni m, String user, Long id) {
    	if(!us.findByUsername(user).getRecensioni().isEmpty()) {
    	    throw new EntityExistsException("review exists!!" + m.getId());
    	}else {
		m.setMovie(ms.findById(id));
		m.setUser(us.findByUsername(user));
		ar.save(m);
		ms.updateVotoMovie(id);
		return m;
	}

}
    public Recensioni updateReview(Long id, Recensioni m) {
        if (!ar.existsById(id)) {
            throw new EntityNotFoundException("Review not found with id: " + id);
        } else {
            Recensioni a = ar.findByid(id);
            a.setVoto(m.getVoto());
            a.setDescrizione(m.getDescrizione());
            a.setTitolo(m.getTitolo());
            ar.save(a);
            ms.updateVotoMovie(id);
            return a;
        }
    }
    public Optional<Recensioni> getReviewById(Long id) {
        return ar.findById(id);
    }

    public void deleteReview(Long id) {
        if (!ar.existsById(id)) {
            throw new EntityNotFoundException("Review not found with id: " + id);
        }
        ar.deleteById(id);
    }

    public List<Recensioni> findAll(){
        return ar.findAll();
    }
    public List<Recensioni> findAllByMovie(Long id){
        
    	return ar.findByMovie(id);
    }
    public Recensioni findByMovieAndUser(String id, String user) {
        return ar.findByMovie_TitoloAndUser_Username(id, user);
    }
    public List<Recensioni> findByMovieAndNotUser(String id, String user) {
        return ar.findByMovie_TitoloAndUser_UsernameNot(id, user);
    }
}
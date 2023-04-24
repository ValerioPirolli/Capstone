package com.SpringBoot_SpringSecurity.runners;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.SpringBoot_SpringSecurity.models.Generi;
import com.SpringBoot_SpringSecurity.models.Movies;
import com.SpringBoot_SpringSecurity.services.MovieService;

@Component
public class MainProject implements ApplicationRunner {

    
    @Autowired 
    private MovieService MovieSerivice;


    public void run(ApplicationArguments args) throws Exception {
    
    	
      /*Movies m1 = new Movies();
      List<String> s = new ArrayList<String>();
      List<Generi> g = new ArrayList<Generi>();
      s.add("ciro");
      s.add("mirko");
      g.add(Generi.Azione);
      g.add(Generi.Drammatico);
      m1.setAttori(s);
      m1.setDataUscita(LocalDate.now());
      m1.setTitolo("");
      m1.setGeneri(g);
      m1.setSottotitolo("");
      m1.setDescrizione("");
      m1.setDurata("1h23m");
      m1.setDirector("");
      MovieSerivice.save(m1);*/
    }
}

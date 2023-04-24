package com.SpringBoot_SpringSecurity.runners;


import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.SpringBoot_SpringSecurity.models.Actors;
import com.SpringBoot_SpringSecurity.models.Generi;
import com.SpringBoot_SpringSecurity.models.Movies;
import com.SpringBoot_SpringSecurity.services.ActorService;
import com.SpringBoot_SpringSecurity.services.MovieService;

@Component
public class MainProject implements ApplicationRunner {

    
    @Autowired 
    private MovieService ms;

    @Autowired 
    private ActorService as;
    
    public void run(ApplicationArguments args) throws Exception {
    

//-----------------------------------------------------------------------------------
Actors keanuReeves = new Actors("Keanu Reeves","https://www.themoviedb.org/t/p/w300_and_h450_bestv2/rRdru6REr9i3WIHv2mntpcgxnoY.jpg","1964-09-02","Keanu Charles Reeves è un attore canadese. Reeves è noto per i suoi ruoli in Bill & Ted's Excellent Adventure, Speed, Point Break e nella trilogia di Matrix nei panni di Neo. Ha collaborato con registi importanti come Stephen Frears (nel film drammatico del 1988 Dangerous Liaisons); Gus Van Sant (nel film indipendente del 1991 My Own Private Idaho); e Bernardo Bertolucci (nel film Il piccolo Buddha del 1993). Riferendosi alle sue performance cinematografiche del 1991, il critico del New York Times, Janet Maslin, ha elogiato la versatilità di Reeves, dicendo che \"mostra una notevole disciplina e capacità interpretative ad ampio range. Si muove facilmente tra il comportamento abbottonato che si adatta a una storia procedurale della polizia e la libertà articolata dei suoi ruoli comici\". Un tema che si ripete spesso nelle sue interpretazioni è quello di \"salvatore del mondo\", inclusi i personaggi di Ted Logan, Buddha, Neo, Johnny Mnemonic, John Constantine e Klaatu.");

Actors donnieYen = new Actors("Donnie Yen","https://www.themoviedb.org/t/p/w300_and_h450_bestv2/hTlhrrZMj8hZVvD17j4KyAFWBHc.jpg","1963-07-27","Donnie Yen (Chinese: 甄子丹; born 27 July 1963) is a Hong Kong actor, martial artist, film director, action choreographer and film producer. Apart from being a well-known film and television actor in Hong Kong, Yen has also gained international recognition for appearing in many films together with other prominent and internationally-known actors such as Jackie Chan, Jet Li and Michelle Yeoh. He is considered to be Hong Kong's top action star; director Peter Chan mentioned that he \"is the 'it' action person right now\" and \"has built himself into a bona fide leading man, who happens to be an action star.\"");

Actors billSkarsgård = new Actors("Bill Skarsgård","https://www.themoviedb.org/t/p/w300_and_h450_bestv2/cFQN6rLSSLhGx8NQI7krYWwdRpl.jpg","1990-08-09 ","Bill Istvan Günther Skarsgård (born 9 August 1990) is a Swedish actor. He is best known for starring in The Divergent Series: Allegiant, Atomic Blonde, and the Netflix original series Hemlock Grove and playing Pennywise the Dancing Clown in the 2017 adaptation of It.");

Actors brendanFraser = new Actors("Brendan Fraser", "https://www.themoviedb.org/t/p/w300_and_h450_bestv2/tFj5PaWWQbb8rHBBhu1EHklznph.jpg", "1968-12-03", "Brendan James Fraser è un attore statunitense. È noto per i suoi ruoli in film come La mummia, George della giungla e The Quiet American. Ha iniziato la sua carriera nel cinema negli anni '90 e ha ricevuto il plauso della critica per la sua interpretazione in Gods and Monsters (1998).");

Actors sadieSink = new Actors("Sadie Sink", "https://www.themoviedb.org/t/p/w300_and_h450_bestv2/tEHNLdwPmxu3Ikkvq8I6FUfGdZL.jpg", "2002-04-16", "Sadie Sink è un'attrice statunitense. È nota per il suo ruolo di Maxine Mayfield nella serie televisiva di Netflix Stranger Things. Ha iniziato a recitare in teatro all'età di undici anni e ha fatto il suo debutto cinematografico nel film The Glass Castle (2017).");

Actors hongChau = new Actors("Hong Chau", "https://www.themoviedb.org/t/p/w300_and_h450_bestv2/3LIsdizzTUk9Doi0Mwwc1ROfSIy.jpg", "1979-06-25", "Hong Chau è un'attrice americana di origine vietnamita. Ha recitato in film come Tutto il denaro del mondo, Downsizing e Watchmen. Ha ricevuto una nomination ai Golden Globe per la sua interpretazione in Downsizing (2017).");

Actors laurenceFishburne = new Actors("Laurence Fishburne", "https://www.themoviedb.org/t/p/w300_and_h450_bestv2/8suOhUmPbfKqDQ17jQ1Gy0mI3P4.jpg", "1961-07-30", "Laurence John Fishburne III è un attore, produttore e regista americano. È noto per i suoi ruoli in film come The Matrix, Boys n the Hood e What's Love Got to Do with It. Ha ricevuto una nomination all'Oscar per la sua interpretazione di Ike Turner in What's Love Got to Do with It (1993).");

Actors carrieAnneMoss = new Actors("Carrie-Anne Moss", "https://www.themoviedb.org/t/p/w300_and_h450_bestv2/xD4jTA3KmVp5Rq3aHcymL9DUGjD.jpg", "1967-08-21", "Carrie-Anne Moss è un'attrice canadese. È nota per il suo ruolo di Trinity nella trilogia di Matrix e per il ruolo di Jeri Hogarth nelle serie televisive della Marvel. Ha iniziato la sua carriera nel cinema negli anni '90 e ha recitato in film come Memento e Chocolat. Ha ricevuto una nomination ai Gemini Awards per la sua interpretazione nella serie televisiva di HBO, The Heart Department (2001).");

Actors willemDafoe = new Actors("Willem Dafoe", "https://www.themoviedb.org/t/p/w300_and_h450_bestv2/ui8e4sgZAwMPi3hzEO53jyBJF9B.jpg", "1955-07-22", "Willem Dafoe è un attore e produttore americano. È noto per i suoi ruoli in film come Platoon, The Last Temptation of Christ, Spider-Man, Shadow of the Vampire e The Florida Project. Ha ricevuto tre nomination all'Oscar per i suoi ruoli in Platoon (1986), Shadow of the Vampire (2000) e The Florida Project (2017).");

Actors ianMcShane = new Actors("Ian McShane", "https://www.themoviedb.org/t/p/w300_and_h450_bestv2/q9qKbux5Jo76Sj8g3luxBt6rYtz.jpg", "1942-09-29", "Ian McShane è un attore inglese. È noto per i suoi ruoli in film come Sexy Beast, Kung Fu Panda, John Wick e Pirates of the Caribbean: On Stranger Tides. Ha anche recitato in diverse serie televisive, tra cui Lovejoy, Deadwood e American Gods. Ha vinto un Golden Globe per la sua interpretazione in Deadwood.");

Actors christianBale = new Actors("Christian Bale", "https://www.themoviedb.org/t/p/w300_and_h450_bestv2/b7fTC9WFkgqGOv77mLQtmD4Bwjx.jpg", "1974-01-30", "Christian Bale è un attore britannico. Ha ottenuto il successo internazionale grazie al ruolo di protagonista nella trilogia del Cavaliere Oscuro, diretta da Christopher Nolan, in cui interpreta Batman. Ha inoltre recitato in numerosi film di successo, tra cui American Psycho, The Machinist, The Fighter e Vice. Bale è noto per la sua grande capacità di trasformazione fisica e psicologica per i suoi ruoli, dimostrata dall'ampio dimagrimento per The Machinist e dall'aumento di peso per The Fighter, per cui ha vinto l'Oscar come Miglior attore non protagonista.");

Actors jaredLeto = new Actors("Jared Leto", "https://www.themoviedb.org/t/p/w300_and_h450_bestv2/ca3x0OfIKbJppZh8S1Alx3GfUZO.jpg", "1971-12-26", "Jared Leto è un attore e cantante statunitense. È noto per i suoi ruoli in film come Fight Club, Requiem for a Dream e Dallas Buyers Club, per cui ha vinto l'Oscar come Miglior attore non protagonista. Leto è anche il frontman della band Thirty Seconds to Mars, con cui ha pubblicato diversi album di successo. Ha vinto numerosi premi per la sua carriera, tra cui un Golden Globe, un Emmy e un MTV Video Music Award.");

Actors ryanGosling = new Actors("Ryan Gosling", "https://www.themoviedb.org/t/p/w300_and_h450_bestv2/lyUyVARQKhGxaxy0FbPJCQRpiaW.jpg", "1980-11-12", "Ryan Gosling è un attore canadese. Ha recitato in numerosi film di successo, tra cui Le pagine della nostra vita, Half Nelson, Drive, Crazy, Stupid, Love e La La Land, per cui è stato candidato all'Oscar come Miglior attore protagonista. Gosling è anche un musicista e ha suonato in diverse band. È stato incluso nella lista delle 100 persone più influenti al mondo stilata dalla rivista Time nel 2011.");

Actors bryanCranston = new Actors("Bryan Cranston", "https://www.themoviedb.org/t/p/w138_and_h175_face/7Jahy5LZX2Fo8fGJltMreAI49hC.jpg", "1956-03-07", "Bryan Cranston è un attore statunitense. Ha ottenuto il successo grazie al ruolo di protagonista nella serie televisiva Breaking Bad, per cui ha vinto numerosi premi, tra cui quattro Emmy come Miglior attore protagonista in una serie drammatica. Ha recitato anche in film come Argo, Drive, Godzilla e Trumbo, per cui ha ricevuto la sua prima candidatura all'Oscar.");

Actors emmaStone = new Actors("Emma Stone", "https://www.themoviedb.org/t/p/w138_and_h175_face/ayqOHTfxAiaSQZisD3Q4fB6UTjU.jpg", "1988-11-06", "Emma Stone è un'attrice statunitense. Ha recitato in numerosi film di successo, tra cui Superbad, Easy Girl, The Help, Birdman e La La Land, per cui ha vinto l'Oscar come Miglior attrice protagonista. Stone è anche una cantante e ha registrato diverse canzoni per le colonne sonore dei suoi film. Nel 2017 è stata inclusa nella lista delle 100 persone più influenti al mondo stilata dalla rivista Time.");

Actors jkSimmmons = new Actors("J.K. Simmons", "https://www.themoviedb.org/t/p/w138_and_h175_face/jPoNW5fugs5h8AbcE7H5OBm04Tm.jpg", "1955-01-09",
    "Jonathan Kimble Simmons è un attore e doppiatore americano noto per le sue performance in Whiplash, Spider-Man e Juno. Ha vinto un Oscar come miglior attore non protagonista per la sua interpretazione di Terence Fletcher in Whiplash. Simmons è anche un attore di teatro di successo, avendo recitato in numerose produzioni a Broadway. Ha doppiato molti personaggi animati, tra cui il Dottor Finkelstein in Nightmare Before Christmas e Tenzin in The Legend of Korra.");


Actors tobeyMaguire = new Actors("Tobey Maguire", "https://www.themoviedb.org/t/p/w300_and_h450_bestv2/kOJelnLSb89SeivbOCt1l94Hz2d.jpg", "1975-06-27",
    "Tobias Vincent Maguire è un attore e produttore americano noto per aver interpretato il ruolo di Peter Parker/Spider-Man nella trilogia di Spider-Man di Sam Raimi. Ha recitato in molti altri film di successo, tra cui The Cider House Rules, Seabiscuit e The Great Gatsby. È anche un produttore di successo, con la sua casa di produzione Material Pictures.");

Actors jamesFranco = new Actors("James Franco", "https://www.themoviedb.org/t/p/w300_and_h450_bestv2/rShzuvrQJJQJ6lXDn3IQX4o0iCE.jpg", "1978-04-19",
    "James Edward Franco è un attore, regista e scrittore americano noto per le sue interpretazioni in Spider-Man, 127 ore e The Disaster Artist. Ha recitato in molti altri film e ha vinto numerosi premi per le sue performance, tra cui un Golden Globe e un Screen Actors Guild Award. Franco è anche un regista di successo, avendo diretto film come The Disaster Artist e Child of God. Inoltre, ha pubblicato numerosi libri e ha insegnato cinema e scrittura creativa all'università.");
Actors liamNeeson = new Actors("Liam Neeson", "https://www.themoviedb.org/t/p/w300_and_h450_bestv2/bboldwqSC6tdw2iL6631c98l2Mn.jpg", "1952-06-07",
    "Liam John Neeson è un attore irlandese noto per le sue interpretazioni in Schindler's List, Taken e Batman Begins. Ha recitato in numerosi film di successo e ha vinto molti premi per le sue performance, tra cui un Golden Globe e un BAFTA. Neeson ha anche recitato in numerose produzioni teatrali e ha doppiato molti personaggi animati.");

Actors cillianMurphy = new Actors("Cillian Murphy", "https://www.themoviedb.org/t/p/w300_and_h450_bestv2/1txjjB7CFeiEUL60DKo0oG7u2v9.jpg", "1976-05-25",
    "Cillian Murphy è un attore irlandese noto per le sue interpretazioni in Peaky Blinders, Inception e 28 giorni dopo. Ha recitato in molti altri film di successo, tra cui Batman Begins e Dunkirk. Murphy è anche un musicista e ha suonato in alcune band.");

Actors heathLedger = new Actors("Heath Ledger", "https://www.themoviedb.org/t/p/w300_and_h450_bestv2/5Y9HnYYa9jF4NunY9lSgJGjSe8E.jpg", "1979-04-04",
    "Heathcliff Andrew Ledger è stato un attore australiano noto per le sue interpretazioni in The Dark Knight, Brokeback Mountain e 10 cose che odio di te. Ha vinto numerosi premi per le sue performance, tra cui un Oscar postumo per la sua interpretazione di Joker in The Dark Knight. Ledger è stato anche un regista e ha diretto alcuni video musicali.");

Actors michaelCaine = new Actors("Michael Caine", "https://www.themoviedb.org/t/p/w300_and_h450_bestv2/hZruclwEPCKw3e83rnFSIH5sRFZ.jpg", "1933-03-14",
    "Maurice Joseph Micklewhite Jr., meglio noto come Michael Caine, è un attore inglese noto per le sue interpretazioni in Alfie, The Dark Knight e The Italian Job. Ha recitato in molti altri film di successo e ha vinto numerosi premi per le sue performance, tra cui due premi Oscar e un Golden Globe. Caine è anche un autore di successo, avendo pubblicato diverse autobiografie e romanzi.");
Actors tomHardy = new Actors("Tom Hardy", "https://www.themoviedb.org/t/p/w300_and_h450_bestv2/d81K0RH8UX7tZj49tZaQhZ9ewH.jpg", "1977-09-15",
    "Edward Thomas Hardy è un attore britannico noto per le sue interpretazioni in The Dark Knight Rises, Mad Max: Fury Road e Venom. Ha recitato in molti altri film di successo e ha vinto numerosi premi per le sue performance, tra cui un BAFTA. Hardy è anche un produttore e ha fondato la sua casa di produzione, la Hardy Son & Baker.");

Actors zoeyDeutch = new Actors("Zoey Deutch", "https://www.themoviedb.org/t/p/w300_and_h450_bestv2/jApADmomPJWX8UZHEwTLie2zMGd.jpg", "1994-11-10",
    "Zoey Francis Thompson Deutch è un'attrice e produttrice americana nota per le sue interpretazioni in Settimo cielo, The Politician e Flower. Ha recitato in molti altri film e serie TV di successo e ha vinto diversi premi per le sue performance. Deutch è anche una produttrice e ha fondato la sua casa di produzione, la Zohar Films.");

Actors ewanMcGregor = new Actors("Ewan McGregor", "https://www.themoviedb.org/t/p/w300_and_h450_bestv2/aEmyadfRXTmmR7UW7OXsm5a6smS.jpg", "1971-03-31",
    "Ewan Gordon McGregor è un attore scozzese noto per le sue interpretazioni in Trainspotting, Moulin Rouge! e la trilogia di Star Wars nei panni di Obi-Wan Kenobi. Ha recitato in molti altri film di successo e ha vinto numerosi premi per le sue performance, tra cui un Golden Globe. McGregor è anche un regista e ha diretto diversi film.");

Actors nataliePortman = new Actors("Natalie Portman", "https://www.themoviedb.org/t/p/w300_and_h450_bestv2/edPU5HxncLWa1YkgRPNkSd68ONG.jpg", "1981-06-09",
    "Natalie Hershlag, meglio nota come Natalie Portman, è un'attrice e regista israelo-americana nota per le sue interpretazioni in Leon, Black Swan e la trilogia di Star Wars nei panni di Padmé Amidala. Ha recitato in molti altri film di successo e ha vinto numerosi premi per le sue performance, tra cui un Oscar. Portman è anche un'attivista e si è impegnata in diverse cause sociali e ambientali.");
Actors hugoWeaving = new Actors("Hugo Weaving", "https://www.themoviedb.org/t/p/w300_and_h450_bestv2/lSC8Et0PYi5zeQb3IpPkFje7hgR.jpg", "1960-04-04", "Hugo Wallace Weaving è un attore australiano. È noto per il suo ruolo come Agente Smith nella trilogia di Matrix, Elrond nella trilogia del Signore degli Anelli e come V in V for Vendetta. Weaving ha vinto numerosi premi, tra cui un premio AACTA, un Critics' Choice Movie Award e un Satellite Award.");

Actors samWorthington = new Actors("Sam Worthington", "https://www.themoviedb.org/t/p/w300_and_h450_bestv2/blKKsHlJIL9PmUQZB8f3YmMBW5Y.jpg", "1976-08-02", "Samuel Henry John Worthington è un attore australiano. È noto per i suoi ruoli come Jake Sully in Avatar, Marcus Wright in Terminator Salvation, Perseo in Clash of the Titans e il suo sequel, e come protagonista di Man on a Ledge. Ha ricevuto una nomination ai premi AACTA e un premio Australian Film Critics Association.");

Actors andrewGarfield = new Actors("Andrew Garfield", "https://www.themoviedb.org/t/p/w300_and_h450_bestv2/9hJ59ogLxgcZDkvfGcjLHqbB5Pl.jpg", "1983-08-20", "Andrew Russell Garfield è un attore britannico. È noto per il suo ruolo come Peter Parker / Spider-Man nei film The Amazing Spider-Man e il suo sequel, e per il suo ruolo in Hacksaw Ridge, per cui ha ricevuto una nomination all'Oscar come miglior attore. Ha anche vinto un Golden Globe e un premio BAFTA.");

Actors rhysIfans = new Actors("Rhys Ifans", "https://www.themoviedb.org/t/p/w300_and_h450_bestv2/g8EUs8r1ECh9plKtrxBparsxlZ1.jpg", "1967-07-22", "Rhys Ifans è un attore e musicista gallese. È noto per il suo ruolo come Xenophilius Lovegood in Harry Potter e i Doni della Morte - Parte 1, e per il suo ruolo in Notting Hill. Ha vinto un premio BAFTA Cymru come miglior attore e un Empire Award come miglior attore non protagonista.");

Actors dianeKruger = new Actors("Diane Kruger", "https://www.themoviedb.org/t/p/w300_and_h450_bestv2/o5gVowcjVw4ThYi0L3883Y4X7kH.jpg", "1976-07-15", "Diane Kruger è un'attrice e modella tedesca. È nota per i suoi ruoli in film come Troy, National Treasure, Inglourious Basterds e Unknown - Senza identità. Ha vinto il premio per la migliore interpretazione femminile al Festival di Cannes e il premio Saturn Award come miglior attrice non protagonista.");

//----------- ------------------------------------------------------------------------ 1
/*Movies JohnWick4 = new Movies();
JohnWick4.setTitolo("John Wick 4");
JohnWick4.setDataUscita("23/03/2023");
JohnWick4.setDirector("Chad Stahelski");
JohnWick4.setDurata("2h 49m ");
JohnWick4.setSottotitolo("No way back. One way out.");
JohnWick4.setDescrizione("John Wick trova una via per sconfiggere la Gran Tavola. Ma prima di guadagnare la libertà, Wick deve affrontare un nuovo nemico che ha potenti alleanze in tutto il mondo e ha mezzi tali da tramutare vecchi amici in nuovi nemici.");
JohnWick4.setPosterPiccolo("https://www.themoviedb.org/t/p/original/A5s5tWNPQtnxNjQh8dx2G5tBKxu.jpg");
JohnWick4.setCover("https://www.themoviedb.org/t/p/original/i8dshLvq4LE3s0v8PrkDdUyb1ae.jpg");
JohnWick4.setTrailer("https://www.youtube.com/watch?v=1-E33mUItH0");
	//JohnWick4.setAttori(new HashSet<Actors>());
	JohnWick4.addE(donnieYen);
    JohnWick4.addE(keanuReeves);
    JohnWick4.addE(billSkarsgård);
    JohnWick4.getGeneri().add(Generi.Azione);
    JohnWick4.getGeneri().add(Generi.Crime);
    JohnWick4.getGeneri().add(Generi.Thriller);*/
Movies JohnWick4 = new Movies("John Wick 4", "23/03/2023", "2h 49m", "No way back. One way out.",
        "John Wick trova una via per sconfiggere la Gran Tavola. Ma prima di guadagnare la libertà, Wick deve affrontare un nuovo nemico che ha potenti alleanze in tutto il mondo e ha mezzi tali da tramutare vecchi amici in nuovi nemici.", 
        "Chad Stahelski", "https://www.themoviedb.org/t/p/original/A5s5tWNPQtnxNjQh8dx2G5tBKxu.jpg", 
        "https://www.themoviedb.org/t/p/original/i8dshLvq4LE3s0v8PrkDdUyb1ae.jpg", 
        "https://www.youtube.com/watch?v=1-E33mUItH0");
JohnWick4.addE(donnieYen);
JohnWick4.addE(keanuReeves);
JohnWick4.addE(billSkarsgård);
JohnWick4.getGeneri().add(Generi.Azione);
JohnWick4.getGeneri().add(Generi.Crime);
JohnWick4.getGeneri().add(Generi.Thriller);

//------------------------------------------------------------------------------------------------------------------ 2

    Movies TheWhale = new Movies("The Whale", "23/02/2023", "1h 57m", "Uno scrittore e la figlia",
    		"Charlie è un uomo obeso di una cinquantina d'anni. Vive solo, passa le giornate seduto sul divano tenendo corsi di scrittura online, guardando la tv e mangiando compulsivamente. Nella sua vita ci sono Liz, amica infermiera che si prende cura del suo stato di salute sempre più precario, e la figlia Ellie, diciassettenne che ha abbandonato quando era bambina per seguire l'amore della sua vita, Adam, il cui successivo suicidio è alla causa della sua obesità. Sentendo la morte avvicinarsi Charlie decide di spendere il tempo che gli resta per riconciliarsi con Ellie, la quale non gli ha mai perdonato la sua scelta...", 
            "Darren Aronofsky", "https://www.themoviedb.org/t/p/original/2kwlQ0U5DuUnnYYgf2ZtjKrF8HG.jpg", 
            "https://www.themoviedb.org/t/p/original/r7Dfg9aRZ78gJsmDlCirIIlNH3d.jpg", 
            "https://www.youtube.com/watch?v=e0WCiqOWih8&t=1s");
    TheWhale.addE(brendanFraser);
    TheWhale.addE(hongChau);
    TheWhale.addE(sadieSink);
    TheWhale.getGeneri().add(Generi.Drammatico);

//------------------------------------------------------------------------------------------------------------------ 3
Movies matrix = new Movies("matrix","07/05/1999","2h 16m","Credete all'incredibile.","Seguendo un tatuaggio sulla spalla di una ragazza, l'hacker Neo scopre che la cosiddetta \"realtà\" è solo un impulso elettrico fornito al cervello degli umani da un'intelligenza artificiale. Per sopravvivere alla catastrofe l'umanità ha infatti avuto bisogno delle macchine, ma queste hanno vinto e necessitano degli uomini come fonte di energia. L'illusione in cui li fanno vivere è quindi finalizzata a \"coltivarli\" meglio. Nessuno è a conoscenza del tempo che è passato da quando il neurosimulatore ha assegnato una data fittizia al tempo. Solo Neo, con l'aiuto del pirata informatico Morpheus e della bella Trinity, può tentare di scoprire la verità, ma non sarà un'impresa facile.","Lana Wachowski, Lilly Wachowski","https://www.themoviedb.org/t/p/original/5uCQOswAMkOqUZiNzOxvckw59e3.jpg","https://www.themoviedb.org/t/p/original/l4QHerTSbMI7qgvasqxP36pqjN6.jpg","https://www.youtube.com/watch?v=VdZwkM_HWzw");

    	matrix.addE(keanuReeves);
    	matrix.addE(carrieAnneMoss);
    	matrix.addE(laurenceFishburne);
    	matrix.addE(hugoWeaving);
    	
    	matrix.getGeneri().add(Generi.Azione);
        matrix.getGeneri().add(Generi.Fantascienza);
        
    	
    	
	
   
//------------------------------------------------------------------------------------------------------------------ 4
        Movies JohnWick = new Movies("John Wick", "22/01/2015", "1h 41m", "Non provocarlo",
                "Dopo la morte dell'amata moglie, il leggendario ex assassino John Wick (Keanu Reeves) trascorre le giornate a rimettere in sesto la sua Ford Mustang del 1969 e con la sola compagnia del cane Daisy. La sua esistenza scivola via senza intoppi fino a quando un sadico delinquente di nome Yosef Tarasof nota la sua auto. Non accettando il rifiuto di venderla di Wick, Yosef manda due suoi complici a rubare la macchina e a uccidere brutalmente Daisy. Da quel momento, John si mette sulle tracce del criminale a New York, scoprendo di avere a che fare con l'unico figlio del boss della mala Viggo Tarasof. Quando in breve tempo per la città si diffonde la voce che John è in cerca di Yosef per vendicarsi, Viggo mette sulla sua testa una grande ricompensa, che attira tutti gli assassini in circolazione.", 
                "Chad Stahelski", 
                "https://www.themoviedb.org/t/p/original/8Mhp3QzVi64CrdzlsGl6CcnqMcs.jpg", 
                "https://www.themoviedb.org/t/p/original/7dzngS8pLkGJpyeskCFcjPO9qLF.jpg", 
                "https://www.youtube.com/watch?v=N_ZPL3hmFEo");
    	JohnWick.addE(keanuReeves);
    	JohnWick.addE(willemDafoe);
    	JohnWick.addE(ianMcShane);
    	JohnWick.getGeneri().add(Generi.Azione);
    	JohnWick.getGeneri().add(Generi.Thriller);
//--------------------------------------------------------------------------------------------------- 5
/*Movies americanPsycho = new Movies();
//americanPsycho.setAttori(new HashSet<Actors>());
    	americanPsycho.setTitolo("American Psycho ");
    	americanPsycho.setDataUscita("25/05/2001");
    	
    	americanPsycho.getGeneri().add(Generi.Drammatico);
        americanPsycho.getGeneri().add(Generi.Crime);
      americanPsycho.getGeneri().add(Generi.Thriller);
        
      americanPsycho.setDurata("1h 42m");
      americanPsycho.setSottotitolo("I think my mask of sanity is about to slip.");
      americanPsycho.setDescrizione("New York, 1987: Patrick Bateman è uno yuppie ricco che lavora nell'ambiente di Wall Street come dirigente di una società finanziaria che si occupa di fusioni e acquisizioni. Nella vita privata Patrick è una persona meticolosa, che dedica molto tempo alla cura della propria persona per acquisire il riconoscimento sociale che nella società yuppie è strettamente associato all'apparenza ed al consumismo. Di giorno vive una vita basata su pranzi di lavoro, locali alla moda e riunioni tra amici, in tipica rappresentanza della classe sociale cui egli appartiene, ma che nello stesso tempo lo rende indistinguibile dalle altre persone della sua cerchia. La sua frustrazione esplode di notte, facendo emergere nel protagonista l'assoluto disprezzo degli emarginati, l'invidia nei confronti dei colleghi, e l'aridità affettiva verso le donne, fino a trasformarlo in un serial killer che conserva i corpi, o loro parti, in casa.");
    	americanPsycho.setDirector("Mary Harron");
    	
    	americanPsycho.addE(christianBale);
    	americanPsycho.addE(willemDafoe);
    	americanPsycho.addE(jaredLeto);
    	
    	americanPsycho.setPosterPiccolo("https://www.themoviedb.org/t/p/original/6cMzv4GXKweCMWTD75van0m5Eqk.jpg");
    	americanPsycho.setCover("https://www.themoviedb.org/t/p/original/bneUTWFAcVCdsb0O5UwZbJd8xqZ.jpg");
    	americanPsycho.setTrailer("https://www.youtube.com/watch?v=2m8njNCQWR4");*/
    	Movies americanPsycho = new Movies("American Psycho", "25/05/2001", "1h 42m", "I think my mask of sanity is about to slip.",
    	        "New York, 1987: Patrick Bateman è uno yuppie ricco che lavora nell'ambiente di Wall Street come dirigente di una società finanziaria che si occupa di fusioni e acquisizioni. Nella vita privata Patrick è una persona meticolosa, che dedica molto tempo alla cura della propria persona per acquisire il riconoscimento sociale che nella società yuppie è strettamente associato all'apparenza ed al consumismo. Di giorno vive una vita basata su pranzi di lavoro, locali alla moda e riunioni tra amici, in tipica rappresentanza della classe sociale cui egli appartiene, ma che nello stesso tempo lo rende indistinguibile dalle altre persone della sua cerchia. La sua frustrazione esplode di notte, facendo emergere nel protagonista l'assoluto disprezzo degli emarginati, l'invidia nei confronti dei colleghi, e l'aridità affettiva verso le donne, fino a trasformarlo in un serial killer che conserva i corpi, o loro parti, in casa.",
    	        "Mary Harron", "https://www.themoviedb.org/t/p/original/6cMzv4GXKweCMWTD75van0m5Eqk.jpg",
    	        "https://www.themoviedb.org/t/p/original/bneUTWFAcVCdsb0O5UwZbJd8xqZ.jpg",
    	        "https://www.youtube.com/watch?v=2m8njNCQWR4");
    	        
    	americanPsycho.getGeneri().add(Generi.Drammatico);
    	americanPsycho.getGeneri().add(Generi.Crime);
    	americanPsycho.getGeneri().add(Generi.Thriller);

    	americanPsycho.addE(christianBale);
    	americanPsycho.addE(willemDafoe);
    	americanPsycho.addE(jaredLeto);


//--------------------------------------------------------------------------------------------------- 6
Movies LaLaLand = new Movies(
"La La Land", 
"26/01/2017", 
"2h 6m", 
"Una moderna versione della classica storia d'amore ambientata a Hollywood", 
"Los Angeles. Mia sogna di poter recitare ma intanto, mentre passa da un provino all'altro, serve caffè e cappuccini alle star. Sebastian è un musicista jazz che si guadagna da vivere suonando nei piano bar in cui nessuno si interessa a ciò che propone. I due si scontrano e si incontrano fino a quando nasce un rapporto che è cementato anche dalla comune volontà di realizzare i propri sogni e quindi dal sostegno reciproco. Il successo arriverà ma, insieme ad esso, gli ostacoli che porrà sul percorso della loro relazione.",
"Damien Chazelle", 
"https://www.themoviedb.org/t/p/original/7cKs9G0GUMDtIs7E4j8CHEYIWV1.jpg", 
"https://www.themoviedb.org/t/p/original/qJeU7KM4nT2C1WpOrwPcSDGFUWE.jpg", 
"https://www.youtube.com/watch?v=YbtJyxjXpMI"
);

    	LaLaLand.addE(ryanGosling);
    	LaLaLand.addE(emmaStone);
    	LaLaLand.addE(jkSimmmons);
    	
    	LaLaLand.getGeneri().add(Generi.Commedia);
    	LaLaLand.getGeneri().add(Generi.Dramma);
    	LaLaLand.getGeneri().add(Generi.Romantico);
    	



//--------------------------------------------------------------------------------------------------- 7
Movies BatmanBegins = new Movies(
		"Batman Begins", 
		"17/06/2005", 
		"2h 20m", 
		"Il male teme il cavaliere.", 
		"Bruce Wayne, figlio di un illuminato filantropo di Gotham City, vede i suoi genitori assassinati da un rapinatore. Incapace di liberarsi del senso di colpa, inizia un vagabondaggio che lo porta fin sulle vette dell'Himalaya, dove Ra's Al Ghul e il suo fido Ducard lo iniziano alla lotta contro il male. Wayne è deciso a servire la giustizia, e una volta tornato a Gotham trova in Falcone, potente trafficante di droga, e in Crane, altrettanto corrotto psichiatra, due acerrimi nemici, dietro ai quali però pare celarsi qualcuno di ancor più potente. L'unico modo per combatterli è diventare Batman, un simbolo che dia forza e speranza alla gente.",
		"Christopher Nolan", 
		"https://www.themoviedb.org/t/p/original/8RW2runSEc34IwKN2D1aPcJd2UL.jpg", 
		"https://www.themoviedb.org/t/p/original/ew5FcYiRhTYNJAkxoVPMNlCOdVn.jpg", 
		"https://i.ytimg.com/vi/KCq4ES_kq2g/hq720.jpg?sqp=-oaymwEcCNAFEJQDSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLB5RS3GG-VZ2bcYwKlilrPDn_vYmQ"
		);
    	
    	BatmanBegins.getGeneri().add(Generi.Azione);
        BatmanBegins.getGeneri().add(Generi.Crime);
        BatmanBegins.getGeneri().add(Generi.Dramma);
    	BatmanBegins.addE(christianBale);
    	BatmanBegins.addE(michaelCaine);
    	BatmanBegins.addE(liamNeeson);
    	BatmanBegins.addE(cillianMurphy);


//--------------------------------------------------------------------------------------------------- 8
Movies Ilcavaliereoscuro = new Movies(
		"Il cavaliere oscuro", 
		"23/07/2008", 
		"2h 26m", 
		"Benvenuti in un mondo senza regole.", 
		"Il crimine organizzato a Gotham City ha le ore contate. Batman, il tenente Gordon, il nuovo Procuratore Distrettuale e alcuni improbabili epigoni dell'Uomo Pipistrello in imbottiture da hockey hanno dichiarato guerra ai criminali. La loro fortuna e i loro dollari, accumulati in una banca di massima sicurezza, vengono rubati da Joker, un pagliaccio sadico e mascherato che getterà la città nel disordine e nell'anarchia. Riempite le tasche di lame, polvere da sparo e lanugine, Joker sfiderà il cavaliere oscuro di Bruce Wayne e rivelerà il lato oscuro di Harvey Dent, l'eroe procuratore che applica la giustizia e agisce a volto scoperto.",
		"Christopher Nolan", 
		"https://www.themoviedb.org/t/p/original/qIhsgno1mjbzUbs4H6DaRjhskAR.jpg", 
		"https://www.themoviedb.org/t/p/original/cfT29Im5VDvjE0RpyKOSdCKZal7.jpg", 
		"https://www.youtube.com/watch?v=yqcDBdk8wpo"
		);
    
	Ilcavaliereoscuro.getGeneri().add(Generi.Azione);
	Ilcavaliereoscuro.getGeneri().add(Generi.Crime);
	Ilcavaliereoscuro.getGeneri().add(Generi.Thriller);
	Ilcavaliereoscuro.getGeneri().add(Generi.Dramma);
    	Ilcavaliereoscuro.addE(christianBale);
    	Ilcavaliereoscuro.addE(michaelCaine);
    	Ilcavaliereoscuro.addE(heathLedger);

//------------------------------------------------------------------------------------------------------------------ 9
Movies IlcavaliereoscuroIlritorno = new Movies(
"Il cavaliere oscuro - Il ritorno", 
"29/08/2012", 
"2h 45m", 
"Il fuoco divamperà", 
"Sono passati otto anni da quando Batman è svanito nella notte, trasformandosi in un istante da eroe a fuggitivo. Prendendosi la colpa della morte del procuratore Harvey Dent, il Cavaliere oscuro ha sacrificato tutto per ciò che lui e il Commissario Gordon speravano fosse un bene superiore. Per un po’ di tempo la bugia ha funzionato e l’attività criminale di Gotham City è stata schiacciata dal peso della legge anti-criminale Dent Act. Ma tutto cambierà con l’arrivo di un’astuta ladra con un misterioso piano. Ma molto più pericoloso è l’arrivo di Bane, un terrorista mascherato i cui spietati piani per Gotham costringono Bruce a uscire dal suo esilio auto imposto. Ma anche se indossa di nuovo il mantello e il cappuccio, Batman potrebbe non essere così forte da fermare Bane.",
"Christopher Nolan", 
"https://www.themoviedb.org/t/p/original/4Op2hWPNa5JygwbmLs1O1pDAm7L.jpg", 
"https://www.themoviedb.org/t/p/original/rV8g8ATRPIwUHC1rKRXEXBjbclu.jpg", 
"https://www.youtube.com/watch?v=UwU4WpPRSvA"
);
IlcavaliereoscuroIlritorno.getGeneri().add(Generi.Azione);
IlcavaliereoscuroIlritorno.getGeneri().add(Generi.Crime);
IlcavaliereoscuroIlritorno.getGeneri().add(Generi.Thriller);
IlcavaliereoscuroIlritorno.getGeneri().add(Generi.Dramma);
//IlcavaliereoscuroIlritorno.setAttori(new HashSet<Actors>());
IlcavaliereoscuroIlritorno.addE(christianBale);
IlcavaliereoscuroIlritorno.addE(michaelCaine);
IlcavaliereoscuroIlritorno.addE(tomHardy);


//------------------------------------------------------------------------------------------------------------------ 10
Movies Propriolui = new Movies(
"Proprio lui", 
"23/12/2016", 
"1h 51m", 
"Di tutti i ragazzi che sua figlia poteva scegliere...", 
"La storia esilarante su un padre del Midwest che per Natale porta la famiglia a visitare una delle figlie che frequenta Stanford. L’uomo finirà per entrare in competizione con il fidanzato di sua figlia, un giovane miliardario di Internet molto bello, ricchissimo ma socialmente inaccettabile.",
"John Hamburg", 
"https://www.themoviedb.org/t/p/original/wrgCGVfAsp9rYhxEPDWcfr1BKnj.jpg", 
"https://www.themoviedb.org/t/p/original/o3NEwD06NiD8UFr0ztRd2qCeuFK.jpg", 
"https://www.youtube.com/watch?v=JdBXvAnKENU"
);
Propriolui.getGeneri().add(Generi.Commedia);
//Propriolui.setAttori(new HashSet<Actors>());
Propriolui.addE(bryanCranston);
Propriolui.addE(jamesFranco);
Propriolui.addE(zoeyDeutch);


//---------------------------------------------------------------------------------------------------------------------- 11
Movies SpiderMan = new Movies(
"Spider-Man", 
"07/06/2002", 
"2h 1m", 
"Da un grande potere derivano grandi responsabilità", 
"Peter Parker è il tipico adolescente sfigato, segretamente innamorato fin da bambino della sua vicina di casa Mary Jane, rimasto orfano dei genitori e che vive con gli zii. Durante una gita scolastica a un laboratorio scientifico Peter viene morso da un ragno geneticamente modificato. Ben presto si renderà conto di non aver più bisogno degli occhiali da vista e di essere in possesso di poteri molto particolari.",
"Sam Raimi", 
"https://www.themoviedb.org/t/p/original/gh4cZbhZxyTbgxQPxD0dOudNPTn.jpg", 
"https://www.themoviedb.org/t/p/original/nyBtN2QqimXKZwYc7iTJlt18CfY.jpg", 
"https://www.youtube.com/watch?v=hELlUNOVVtY"
);
SpiderMan.getGeneri().add(Generi.Azione);
SpiderMan.getGeneri().add(Generi.Fantasy);
//SpiderMan.setAttori(new HashSet<Actors>());
SpiderMan.addE(tobeyMaguire);
SpiderMan.addE(jamesFranco);
SpiderMan.addE(willemDafoe);


//---------------------------------------------------------------------------------------------------------------------- 12
Movies StarWarsI = new Movies(
"Star Wars - La minaccia fantasma", 
"17/09/1999", 
"2h 16m", 
"Ogni generazione ha una leggenda. Ogni viaggio ha un primo passo. Ogni saga ha un inizio.", 
"Il regno pacifico di Naboo denuncia l'imminente invasione da parte della Lega dei Commercianti, ma la Repubblica, paralizzata dalla corruzione dilagante e dalla burocrazia del Senato, sceglie di non intervenire. Solo i Cavalieri Jedi Qui-gon Jin e Obi-wan Kenobi si recano a Naboo per proteggere la regina Amidala, in pericolo di vita, e condurla in salvo sul pianeta Tatooine. Qui i Jedi faranno la conoscenza di un bambino fuori dall'ordinario, Anakin Skywalker: Qui-gon è convinto che si tratti del Prescelto, destinato un giorno a riportare equilibrio nella Forza.",
"George Lucas", 
"https://www.themoviedb.org/t/p/original/7ozBHvOoDDi4UcBWbz3N7SGOKdm.jpg", 
"https://www.themoviedb.org/t/p/original/wDe8LzwuvHYYiuwyNfxdYQq8ti4.jpg", 
"https://www.youtube.com/watch?v=ak7v-mJ77Lw"
);
StarWarsI.getGeneri().add(Generi.Azione);
StarWarsI.getGeneri().add(Generi.Avventura);
StarWarsI.getGeneri().add(Generi.Fantascienza);
//StarWarsI.setAttori(new HashSet<Actors>());
StarWarsI.addE(liamNeeson);
StarWarsI.addE(ewanMcGregor);
StarWarsI.addE(nataliePortman);


//---------------------------------------------------------------------------------------------------------------------- 13
Movies HacksawRidge = new Movies(
"La battaglia di Hacksaw Ridge", 
"02/02/2017", 
"2h 19m", 
"Per diventare un eroe non serve un'arma", 
"L'attacco alla base americana di Pearl Harbor apre un nuovo fronte delle ostilità in Giappone. Desmond Doss, cresciuto sulle montagne della Virginia e in una famiglia vessata da un padre alcolizzato, decide di arruolarsi e di servire il suo Paese. Ma Desmond non è come gli altri. Cristiano avventista e obiettore di coscienza, il ragazzo rifiuta di impugnare il fucile e uccidere un uomo. Fosse anche nemico. In un mondo dilaniato dalla guerra, Desmond ha deciso di rimettere assieme i pezzi. Arruolato come soccorritore medico e spedito sull'isola di Okinawa combatterà contro l'esercito nipponico, contro il pregiudizio dei compagni e contro i fantasmi di dentro che urlano più forte nel clangore della battaglia.",
"Mel Gibson", 
"https://www.themoviedb.org/t/p/original/gPV8lFaNTgd6ifw1fWEvoIsWnRq.jpg", 
"https://www.themoviedb.org/t/p/original/rshlQ6LfPRSWFhpGL4s5ZkIPR51.jpg", 
"https://www.youtube.com/watch?v=kYf3Wxb7-0Y"
);
HacksawRidge.getGeneri().add(Generi.Azione);
HacksawRidge.getGeneri().add(Generi.Guerra);
HacksawRidge.getGeneri().add(Generi.Avventura);
//HacksawRidge.setAttori(new HashSet<Actors>());
HacksawRidge.addE(andrewGarfield);
HacksawRidge.addE(samWorthington);
HacksawRidge.addE(hugoWeaving);



//---------------------------------------------------------------------------------------------------------------------- 14
Movies amazingSpiderMan = new Movies(
"The Amazing Spider-Man", 
"04/07/2012", 
"2h 16m", 
"La storia mai raccontata inizia.", 
"E' la storia di Peter Parker (Garfield), un liceale emarginato che è stato abbandonato da piccolo dai genitori e affidato allo zio Ben (Sheen) e alla zia May (Field). Come la maggior parte degli adolescenti, Peter cerca di capire chi è e come è diventato la persona che è adesso. Peter cerca la sua strada insieme alla ragazza per cui si è preso una cotta, Gwen Stacy (Stone), e insieme i due affronteranno l’amore, l’impegno e tanti segreti. Quando Peter scopre una misteriosa valigetta che apparteneva a suo padre, inizia una ricerca per capire il perché della scomparsa dei genitori – e questo lo porta direttamente a Oscorp e al laboratorio del Dr. Curt Connors (Ifans), il vecchio socio del padre. Quando, nei panni di Spider-Man, entrerà in rotta di collisione con l’alter ego di Connors, Lizard, Peter sceglie di usare i suoi poteri e diventare un eroe, anche se questo cambierà radicalmente la sua vita.",
"Marc Webb", 
"https://www.themoviedb.org/t/p/original/gpPHp8A6EfqLW7VArHA1vvysrNy.jpg", 
"https://www.themoviedb.org/t/p/original/sLWUtbrpiLp23a0XDSiUiltdFPJ.jpg", 
"https://www.youtube.com/watch?v=xcNt1t3joCg"
);
amazingSpiderMan.getGeneri().add(Generi.Azione);
amazingSpiderMan.getGeneri().add(Generi.Avventura);
amazingSpiderMan.getGeneri().add(Generi.Fantasy);
//amazingSpiderMan.setAttori(new HashSet<Actors>());
amazingSpiderMan.addE(andrewGarfield);
amazingSpiderMan.addE(samWorthington);
amazingSpiderMan.addE(hugoWeaving);


//---------------------------------------------------------------------------------------------------------------------- 15
Movies mrNobody = new Movies(
"Mr. Nobody", 
"18/09/2009", 
"2h 21m", 
"Nothing is real, everything is possible", 
"Nell'anno 2092, Nemo Nobody è un uomo di 117 anni, l'ultimo mortale sulla Terra. L'umanità ha conquistato l'immortalità attraverso un continuo rinnovamento cellulare ottenuto grazie ad un processo chiamato telomerizzazione e ora il mondo guarda con curiosità il signor Nobody che si avvicina alla morte. Tutti vogliono conoscere la vita che ha vissuto. Nemo stesso afferma di non ricordare nulla del suo passato e uno psichiatra, il dottor Feldheim, cerca di fargli ricordare delle memorie attraverso l'ipnosi; altri ricordi sono narrati ad un giornalista. Nemo racconta storie contraddittorie e incongruenti, e nessuno è sicuro di quello che sia veramente accaduto.",
"Jaco Van Dormael", 
"https://www.themoviedb.org/t/p/original/qNkIONc4Rgmzo23ph7qWp9QfVnW.jpg", 
"https://www.themoviedb.org/t/p/original/8iYqLiWWdapOWxxMimSqtfST2M1.jpg", 
"https://www.youtube.com/watch?v=qzlb3THrq6s"
);
mrNobody.getGeneri().add(Generi.Azione);
mrNobody.getGeneri().add(Generi.Dramma);
mrNobody.getGeneri().add(Generi.Fantascienza);
mrNobody.addE(dianeKruger);
mrNobody.addE(jaredLeto);
mrNobody.addE(rhysIfans);
//----------------------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------------------
as.save(donnieYen);
as.save(keanuReeves);
as.save(billSkarsgård);
as.save(sadieSink);
as.save(brendanFraser);
as.save(hongChau);
as.save(carrieAnneMoss);
as.save(laurenceFishburne);
as.save(willemDafoe);
as.save(ianMcShane);
as.save(christianBale);
as.save(jaredLeto);
as.save(ryanGosling);
as.save(jkSimmmons);
as.save(emmaStone);
as.save(tobeyMaguire);
as.save(jamesFranco);
as.save(liamNeeson);
as.save(cillianMurphy);
as.save(heathLedger);
as.save(michaelCaine);
as.save(tomHardy);
as.save(zoeyDeutch);
as.save(ewanMcGregor);
as.save(nataliePortman);
as.save(hugoWeaving);
as.save(samWorthington);
as.save(andrewGarfield);
as.save(rhysIfans);
as.save(dianeKruger);
as.save(bryanCranston);

ms.save(JohnWick4);
ms.save(LaLaLand);
ms.save(TheWhale);
ms.save(matrix);
ms.save(JohnWick);
ms.save(americanPsycho);
ms.save(BatmanBegins);
ms.save(Ilcavaliereoscuro);
ms.save(IlcavaliereoscuroIlritorno);
ms.save(Propriolui);
ms.save(SpiderMan);
ms.save(StarWarsI);
ms.save(HacksawRidge);
ms.save(amazingSpiderMan);
ms.save(mrNobody);


/*
Drop Table actors cascade;
Drop Table movies cascade;
Drop Table film_attore cascade;
Drop Table movies_generi cascade;

Drop Table actors cascade;
Drop Table movies cascade;
Drop Table film_attore cascade;
Drop Table movies_generi cascade;
Drop Table recensioni cascade;
Drop Table roles cascade;
Drop Table users cascade;
Drop Table users_roles cascade;
 */

    }
}

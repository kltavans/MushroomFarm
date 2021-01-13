package com.example.MushroomFarm.ChampignonProfiel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
@Transactional
public class ChampignonProfielService {
	
	@Autowired
    ChampignonProfielRepository champignonProfielRepository;

	//Standaard functie; genereert een lijst van alle champignon profielen
    public List<ChampignonProfiel> listAll() {
        return champignonProfielRepository.findAll();
    }

    //Standaard functie; het opslaan van een champignon profiel
    public void save(ChampignonProfiel champignon_profiel) {
    	champignonProfielRepository.save(champignon_profiel);
    }
	
  //Standaard functie; het wijzigen van één champignon profiel
    public void change(ChampignonProfiel champignon_profiel) {
    	champignonProfielRepository.save(champignon_profiel);
    }
    
    //Standaard functie; het verwijderen van één champignon profiel
    public void delete(long champignon_id) {
    	champignonProfielRepository.deleteById((int) champignon_id);
    }

    //Standaard functie; het ophalen van één champignon profiel
    public ChampignonProfiel get(long champignon_id) {
        return champignonProfielRepository.findById((int) champignon_id).get();
    }
    
    //Zelf gemaakte functie; het bijwerken van één champignon profiel
    public int champignonProfielBijwerken(String cp_champignon_soort, String cp_grootte, Integer cp_groeitijd, Integer cp_lux, Double cp_temperatuur, Integer cp_luchtvochtigheid, Integer cp_champignon_id) {
    	return champignonProfielRepository.champignonProfielBijwerken(cp_champignon_soort, cp_grootte, cp_groeitijd, cp_lux, cp_temperatuur, cp_luchtvochtigheid, cp_champignon_id);
    }
    
}

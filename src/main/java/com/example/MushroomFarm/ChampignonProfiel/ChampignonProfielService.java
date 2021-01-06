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

    public List<ChampignonProfiel> listAll() {
        return champignonProfielRepository.findAll();
    }

    public void save(ChampignonProfiel champignonProfiel) {
    	champignonProfielRepository.save(champignonProfiel);
    }
	
    public void change(ChampignonProfiel champignonProfiel) {
    	champignonProfielRepository.save(champignonProfiel);
    }

    public ChampignonProfiel get(long champignonID) {
        return champignonProfielRepository.findById((int) champignonID).get();
    }


    public void delete(long champignonID) {
    	champignonProfielRepository.deleteById((int) champignonID);
    }
    
    public String findID(long champignonID ) {
    	return champignonProfielRepository.findID(champignonID);
    }
    
}

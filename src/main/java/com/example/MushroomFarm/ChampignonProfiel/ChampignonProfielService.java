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

    public void save(ChampignonProfiel champignon_profiel) {
    	champignonProfielRepository.save(champignon_profiel);
    }
	
    public void change(ChampignonProfiel champignon_profiel) {
    	champignonProfielRepository.save(champignon_profiel);
    }

    public ChampignonProfiel get(long champignon_id) {
        return champignonProfielRepository.findById((int) champignon_id).get();
    }


    public void delete(long champignon_id) {
    	champignonProfielRepository.deleteById((int) champignon_id);
    }
    
    public String findID(long champignon_id ) {
    	return champignonProfielRepository.findID(champignon_id);
    }
    
}

package com.example.MushroomFarm.Champignonlogboek;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ChampignonlogboekService {
	@Autowired
	ChampignonlogboekRepository champignonlogboekRepository;

    public List<Champignonlogboek> listAll() {
        return champignonlogboekRepository.findAll();
    }

    public void save(Champignonlogboek champignonlogboek) {
    	champignonlogboekRepository.save(champignonlogboek);
    }
	
    public void change(Champignonlogboek champignonlogboek) {
    	champignonlogboekRepository.save(champignonlogboek);
    }

    public Champignonlogboek get(long meldingnummer) {
        return champignonlogboekRepository.findById((int) meldingnummer).get();
    }


    public void delete(long meldingnummer) {
    	champignonlogboekRepository.deleteById((int) meldingnummer);
    }
    
    public String findID(long meldingnummer ) {
    	return champignonlogboekRepository.findID(meldingnummer);
    }
}
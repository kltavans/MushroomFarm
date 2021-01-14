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

    public Champignonlogboek get(long nummer) {
        return champignonlogboekRepository.findById((int) nummer).get();
    }


    public void delete(long nummer) {
    	champignonlogboekRepository.deleteById((int) nummer);
    }
    
    public String findID(long nummer ) {
    	return champignonlogboekRepository.findID(nummer);
    }
}
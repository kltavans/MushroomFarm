package com.example.MushroomFarm.Classificatie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
@Transactional
public class ClassificatieService {

	@Autowired
    ClassificatieRepository classificatieRepository;

    public List<Classificatie> listAll() {
        return classificatieRepository.findAll();
    }

    public void save(Classificatie classificatie) {
    	classificatieRepository.save(classificatie);
    }
	
    public void change(Classificatie classificatie) {
    	classificatieRepository.save(classificatie);
    }

    public Classificatie get(long classificatieID) {
        return classificatieRepository.findById((int) classificatieID).get();
    }


    public void delete(long classificatieID) {
    	classificatieRepository.deleteById((int) classificatieID);
    }
    
    public String findID(long classificatieID ) {
    	return classificatieRepository.findID(classificatieID);
    }
    
}
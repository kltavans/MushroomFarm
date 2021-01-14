package com.example.MushroomFarm.Meting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
@Transactional
public class MetingService {
	@Autowired
    MetingRepository metingRepository;

    public List<Meting> listAll() {
        return metingRepository.findAll();
    }

    public void save(Meting meting) {
    	metingRepository.save(meting);
    }
	
    public void change(Meting meting) {
    	metingRepository.save(meting);
    }

    public Meting get(long meting_id) {
        return metingRepository.findById((int) meting_id).get();
    }


    public void delete(long meting_id) {
    	metingRepository.deleteById((int) meting_id);
    }
    
    public String findID(long meting_id ) {
    	return metingRepository.findID(meting_id);
    }
}

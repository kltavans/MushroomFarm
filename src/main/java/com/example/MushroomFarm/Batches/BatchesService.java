package com.example.MushroomFarm.Batches;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
@Transactional
public class BatchesService {
	
	@Autowired
    BatchesRepository batchRepository;

    public List<Batch> listAll() {
        return batchRepository.findAll();
    }

    public void save(Batch batch) {
    	batchRepository.save(batch);
    }
	
    public void change(Batch batch) {
    	batchRepository.save(batch);
    }

    public Batch get(long batchID) {
        return batchRepository.findById((int) batchID).get();
    }


    public void delete(long batchID) {
    	batchRepository.deleteById((int) batchID);
    }
    
    public String findID(long batchID ) {
    	return batchRepository.findID(batchID);
    }
    
}

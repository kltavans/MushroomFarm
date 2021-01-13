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

    public Batch get(long batch_id) {
        return batchRepository.findById((int) batch_id).get();
    }


    public void delete(long batch_id) {
    	batchRepository.deleteById((int) batch_id);
    }
    
    public String findID(long batch_id ) {
    	return batchRepository.findID(batch_id);
    }
    
}

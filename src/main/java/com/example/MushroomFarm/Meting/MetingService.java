package com.example.MushroomFarm.Meting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
@Transactional
public class MetingService {
	@Autowired
    MetingRepository metingRepository;

    public Page<Meting> listAll(int pageNumber, String sortField, String sortDir) {
    	Sort sort = Sort.by(sortField);
    	sort = sortDir.equals("asc") ? sort.ascending() : sort.descending();
    	
    	Pageable pageable = PageRequest.of(pageNumber - 1, 100, sort);
        return metingRepository.findAll(pageable);
    }

    public void save(Meting meting) {
    	metingRepository.save(meting);
    }
	
    public void change(Meting meting) {
    	metingRepository.save(meting);
    }

    public Meting get(long metingen) {
        return metingRepository.findById(metingen).get();
    }


    public void delete(long metingen) {
    	metingRepository.deleteById(metingen);
    }
}

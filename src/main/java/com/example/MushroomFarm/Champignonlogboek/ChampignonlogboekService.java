package com.example.MushroomFarm.Champignonlogboek;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ChampignonlogboekService {
	@Autowired
	ChampignonlogboekRepository champignonlogboekRepository;

	//De methode die ervoor zorgt dat het logboek is gesorteerd en is opgedeeld in pagina's 
    public Page<Champignonlogboek> listAll(int pageNumber, String sortField, String sortDir) {
    	Sort sort = Sort.by(sortField);
    	sort = sortDir.equals("asc") ? sort.ascending() : sort.descending();
    	
    	Pageable pageable = PageRequest.of(pageNumber - 1, 100, sort);
    	return champignonlogboekRepository.findAll(pageable);
    }
}
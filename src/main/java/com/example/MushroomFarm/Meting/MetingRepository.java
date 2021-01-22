package com.example.MushroomFarm.Meting;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MetingRepository extends PagingAndSortingRepository<Meting, Long>{

	
}

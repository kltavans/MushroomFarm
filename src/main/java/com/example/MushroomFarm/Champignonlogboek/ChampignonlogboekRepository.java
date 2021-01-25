package com.example.MushroomFarm.Champignonlogboek;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.example.MushroomFarm.Meting.Meting;

@Repository
public interface ChampignonlogboekRepository extends PagingAndSortingRepository<Champignonlogboek, Long>{

	// custom query to search to blog post by title or content
		//  List<Product> findByTitleContainingOrContentContaining(String text, String textAgain);
			
}

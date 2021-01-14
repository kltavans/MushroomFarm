package com.example.MushroomFarm.Champignonlogboek;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ChampignonlogboekRepository extends JpaRepository<Champignonlogboek, Integer>{

	// custom query to search to blog post by title or content
		//  List<Product> findByTitleContainingOrContentContaining(String text, String textAgain);
			
		@Query(value = "SELECT nummer FROM Champignon_Logboeken WHERE nummer =?1", nativeQuery = true)
		String findID(long nummer);
}

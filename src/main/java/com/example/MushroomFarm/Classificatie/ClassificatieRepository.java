package com.example.MushroomFarm.Classificatie;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassificatieRepository extends JpaRepository<Classificatie, Integer> {

	// custom query to search to blog post by title or content
	//  List<Product> findByTitleContainingOrContentContaining(String text, String textAgain);
		
	@Query(value = "SELECT classificatieID FROM Classificaties WHERE classificatieID =?1", nativeQuery = true)
	String findID(long classificatieID);
	
}
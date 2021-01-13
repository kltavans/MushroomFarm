package com.example.MushroomFarm.ChampignonProfiel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ChampignonProfielRepository extends JpaRepository<ChampignonProfiel, Integer> {
	
	// custom query to search to blog post by title or content
	//  List<Product> findByTitleContainingOrContentContaining(String text, String textAgain);
			
	@Query(value = "SELECT champignon_id FROM ChampignonProfielen WHERE champignon_id =?1", nativeQuery = true)
	String findID(long champignon_id);

}

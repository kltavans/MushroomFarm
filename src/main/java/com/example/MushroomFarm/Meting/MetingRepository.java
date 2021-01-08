package com.example.MushroomFarm.Meting;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface MetingRepository extends JpaRepository<Meting, Integer>{

	// custom query to search to blog post by title or content
		//  List<Product> findByTitleContainingOrContentContaining(String text, String textAgain);
			
		@Query(value = "SELECT metingID FROM Metingen WHERE metingID =?1", nativeQuery = true)
		String findID(long metingID);
}

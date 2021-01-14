package com.example.MushroomFarm.ChampignonProfiel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ChampignonProfielRepository extends JpaRepository<ChampignonProfiel, Integer> {
	
	// custom query to search to blog post by title or content
	//  List<Product> findByTitleContainingOrContentContaining(String text, String textAgain);
	
	//Query om champignon profielen te laten zien order by
//	@Modifying(clearAutomatically = true)
//	@Query(value = "SELECT * FROM Champignon_Profielen ORDER BY champignon_id");
	
	//Query om een champignon profiel te updaten
	@Modifying(clearAutomatically = true)
	@Query(value = "UPDATE Champignon_Profielen SET champignon_soort =?1, grootte =?2, groeitijd =?3, lux =?4, temperatuur =?5, luchtvochtigheid =?6 WHERE champignon_id =?7", nativeQuery = true)
	int champignonProfielBijwerken(String cp_champignon_soort, String cp_grootte, Integer cp_groeitijd, Integer cp_lux, Double cp_temperatuur, Integer cp_luchtvochtigheid, Integer cp_champignon_id);
	
}

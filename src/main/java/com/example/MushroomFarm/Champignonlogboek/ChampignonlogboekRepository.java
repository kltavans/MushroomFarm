package com.example.MushroomFarm.Champignonlogboek;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.example.MushroomFarm.Meting.Meting;

@Repository
public interface ChampignonlogboekRepository extends JpaRepository<Champignonlogboek, Long>{

	// custom query to search to blog post by title or content
	//  List<Product> findByTitleContainingOrContentContaining(String text, String textAgain);
	
	// HomePage Logboek query
	@Query(value = "SELECT * FROM Champignon_Logboeken ORDER BY nummer DESC LIMIT ?1", nativeQuery = true)
	public List<Champignonlogboek> findLastTen(int limit);

}

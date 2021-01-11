package com.example.MushroomFarm.Batches;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BatchesRepository extends JpaRepository<Batch, Integer> {
	
	// Opzoeken van alle entries
			
	@Query(value = "SELECT batchID FROM Batches WHERE batchID =?1", nativeQuery = true)
	String findID(long batchID);

}

package com.example.MushroomFarm.Batches;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BatchesRepository extends JpaRepository<Batch, Integer> {
	
	// Opzoeken van alle entries
			
	@Query(value = "SELECT batch_id FROM Batches WHERE batch_id =?1", nativeQuery = true)
	String findID(long batch_id);

}

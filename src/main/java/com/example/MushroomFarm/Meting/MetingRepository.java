package com.example.MushroomFarm.Meting;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface MetingRepository extends JpaRepository<Meting, Long>{
	
	@Query(value = "SELECT * FROM getLastMetingPerSector;", nativeQuery = true)
	public List<Meting> getLastMetingPerSector();
	
}

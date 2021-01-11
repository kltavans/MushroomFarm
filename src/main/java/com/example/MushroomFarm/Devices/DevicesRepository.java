package com.example.MushroomFarm.Devices;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface DevicesRepository extends JpaRepository<Device, Integer> {
	
	//Een query om alle devices te krijgen om een lijst ervan te maken
			
	@Query(value = "SELECT deviceID FROM Devices WHERE deviceID =?1", nativeQuery = true)
	String findID(long deviceID);

}

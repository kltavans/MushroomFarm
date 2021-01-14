package com.example.MushroomFarm.Devices;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface DevicesRepository extends JpaRepository<Device, String> {
	
	//Een query om alle devices te krijgen om een lijst ervan te maken
	
	@Query(value = "SELECT device_id FROM Devices WHERE device_id =?1", nativeQuery = true)
	String alldevicenaam(String device_id);
			
	@Query(value = "SELECT device_id FROM Devices WHERE device_id =?1", nativeQuery = true)
	String findID(long device_id);
	
	@Modifying(clearAutomatically = true)
	@Query(value = "UPDATE Devices SET device_naam =?1, sectornaam =?2 WHERE device_id =?3", nativeQuery = true)
	String deviceAanpassen(String device_naam, String sectornaam, String device_id);
	

}

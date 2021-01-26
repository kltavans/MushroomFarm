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

}

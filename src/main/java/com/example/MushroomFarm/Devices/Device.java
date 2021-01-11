package com.example.MushroomFarm.Devices;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="devices")
public class Device {
	
	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    public Integer deviceID;
	
	@Column(name = "deviceNaam", nullable = false, unique = false)
    private String deviceNaam;
	
	@Column(name = "sectorNaam", nullable = false, unique = false)
    private String sectorNaam;
	
	
	//Constructors
	public Device() {
		
	}
	
	public Device(String deviceNaam, String sectorNaam) {
		this.deviceNaam = deviceNaam;
		this.sectorNaam = sectorNaam;
	}

	//Getters & Setters
	public Integer getDeviceID() {
		return deviceID;
	}

	public void setDeviceID(Integer deviceID) {
		this.deviceID = deviceID;
	}
	
	public String getDeviceNaam() {
		return deviceNaam;
	}

	public void setDeviceNaam(String deviceNaam) {
		this.deviceNaam = deviceNaam;
	}

	public String getSectorNaam() {
		return sectorNaam;
	}

	public void setSectorNaam(String sectorNaam) {
		this.sectorNaam = sectorNaam;
	}
}
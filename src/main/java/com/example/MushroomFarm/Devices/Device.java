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
    public Integer device_id;
	
	@Column(name = "device_naam", nullable = false, unique = false)
    private String device_naam;
	
	@Column(name = "sector_naam", nullable = false, unique = false)
    private String sector_naam;
	
	
	//Constructors
	public Device() {
		
	}
	
	public Device(String device_naam, String sector_naam) {
		this.device_naam = device_naam;
		this.sector_naam = sector_naam;
	}

	public Integer getDevice_id() {
		return device_id;
	}

	public void setDevice_id(Integer device_id) {
		this.device_id = device_id;
	}

	public String getDevice_naam() {
		return device_naam;
	}

	public void setDevice_naam(String device_naam) {
		this.device_naam = device_naam;
	}

	public String getSector_naam() {
		return sector_naam;
	}

	public void setSector_naam(String sector_naam) {
		this.sector_naam = sector_naam;
	}
	
}
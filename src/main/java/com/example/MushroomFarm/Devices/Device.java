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
	@Column(name = "device_id", nullable = false, unique = false)
    public String device_id;
	
	@Column(name = "device_naam", nullable = false, unique = false)
    private String device_naam;
	
	@Column(name = "sectornaam", nullable = false, unique = false)
    private String sectornaam;
	
	
	//Constructors
	public Device() {
		
	}
	
	public Device(String device_id, String device_naam, String sectornaam) {
		this.device_id = device_id;
		this.device_naam = device_naam;
		this.sectornaam = sectornaam;
	}

	public String getDevice_id() {
		return device_id;
	}

	public void setDevice_id(String device_id) {
		this.device_id = device_id;
	}

	public String getDevice_naam() {
		return device_naam;
	}

	public void setDevice_naam(String device_naam) {
		this.device_naam = device_naam;
	}

	public String getSectornaam() {
		return sectornaam;
	}

	public void setSectornaam(String sectornaam) {
		this.sectornaam = sectornaam;
	}
	
}
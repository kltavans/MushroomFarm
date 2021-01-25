package com.example.MushroomFarm.Meting;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="metingen")
public class Meting {

	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name = "meting_id", nullable = false, unique = false)
    public int meting;
	
	@Column(name = "device_id", nullable = false, unique = false)
    private String device;
	
	@Column(name = "datum", nullable = false, unique = false)
    private Date datum;
	
	@Column(name = "lux", nullable = false, unique = false)
    private int lux;
	
	@Column(name = "temperatuur", nullable = false, unique = false)
    private Double temperatuur;
	
	@Column(name = "luchtvochtigheid", nullable = false, unique = false)
    private int luchtvochtigheid;

	
	public Meting() {
		
	}

	public Meting(String device, Date datum, int lux, Double temperatuur,
			int luchtvochtigheid) {
		this.device = device;
		this.datum = datum;
		this.lux = lux;
		this.temperatuur = temperatuur;
		this.luchtvochtigheid = luchtvochtigheid;
	}

	public int getMeting() {
		return meting;
	}

	public void setMeting(int meting) {
		this.meting = meting;
	}

	public String getDevice() {
		return device;
	}

	public void setDevice(String device) {
		this.device = device;
	}

	public Date getDatum() {
		return datum;
	}

	public void setDatum(Date datum) {
		this.datum = datum;
	}

	public int getLux() {
		return lux;
	}

	public void setLux(int lux) {
		this.lux = lux;
	}

	public Double getTemperatuur() {
		return temperatuur;
	}

	public void setTemperatuur(Double temperatuur) {
		this.temperatuur = temperatuur;
	}

	public int getLuchtvochtigheid() {
		return luchtvochtigheid;
	}

	public void setLuchtvochtigheid(int luchtvochtigheid) {
		this.luchtvochtigheid = luchtvochtigheid;
	}
}

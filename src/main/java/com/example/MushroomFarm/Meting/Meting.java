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
    public int meting_id;
	
	@Column(name = "device_id", nullable = false, unique = false)
    private String device_id;
	
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

	public Meting(String device_id, Date datum, int lux, Double temperatuur,
			int luchtvochtigheid) {
		this.device_id = device_id;
		this.datum = datum;
		this.lux = lux;
		this.temperatuur = temperatuur;
		this.luchtvochtigheid = luchtvochtigheid;
	}

	public int getMeting_id() {
		return meting_id;
	}

	public void setMeting_id(int meting_id) {
		this.meting_id = meting_id;
	}

	public String getDevice_id() {
		return device_id;
	}

	public void setDevice_id(String device_id) {
		this.device_id = device_id;
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

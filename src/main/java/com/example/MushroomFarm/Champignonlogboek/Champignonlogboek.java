package com.example.MushroomFarm.Champignonlogboek;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Champignon_Logboeken")
public class Champignonlogboek {

	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    public int nummer;
	
	@Column(name = "meting_id", nullable = false, unique = false)
    private int meting_id;
	
	@Column(name = "datum", nullable = false, unique = false)
    private Date datum;
	
	@Column(name = "sectornaam", nullable = false, unique = false)
    private String sectornaam;
	
	@Column(name = "champignon_soort", nullable = false, unique = false)
    private String champignon_soort;
	
	@Column(name = "grootte", nullable = false, unique = false)
    private String grootte;
	
	@Column(name = "melding", nullable = false, unique = false)
    private String melding;
	
	@Column(name = "waarde", nullable = false, unique = false)
    private double waarde;

	
	public Champignonlogboek() {
		
	}
	

	public Champignonlogboek(int meldingnummer, int metingID, Date datum, String deviceID, String champignonsoort,
			String grootte, String melding, double waarde) {
		this.nummer = meldingnummer;
		this.meting_id = metingID;
		this.datum = datum;
		this.sectornaam = deviceID;
		this.champignon_soort = champignonsoort;
		this.grootte = grootte;
		this.melding = melding;
		this.waarde = waarde;
	}



	public int getMeldingnummer() {
		return nummer;
	}


	public void setMeldingnummer(int meldingnummer) {
		this.nummer = meldingnummer;
	}


	public int getMeting_id() {
		return meting_id;
	}


	public void setMeting_id(int meting_id) {
		this.meting_id = meting_id;
	}


	public Date getDatum() {
		return datum;
	}


	public void setDatum(Date datum) {
		this.datum = datum;
	}


	public String getSectornaam() {
		return sectornaam;
	}


	public void setSectornaam(String sectornaam) {
		this.sectornaam = sectornaam;
	}


	public String getChampignon_soort() {
		return champignon_soort;
	}


	public void setChampignon_soort(String champignon_soort) {
		this.champignon_soort = champignon_soort;
	}


	public String getGrootte() {
		return grootte;
	}


	public void setGrootte(String grootte) {
		this.grootte = grootte;
	}


	public String getMelding() {
		return melding;
	}


	public void setMelding(String melding) {
		this.melding = melding;
	}


	public double getWaarde() {
		return waarde;
	}


	public void setWaarde(double waarde) {
		this.waarde = waarde;
	}
}


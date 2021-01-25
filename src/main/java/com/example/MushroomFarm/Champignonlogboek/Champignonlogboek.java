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
    private int meting;
	
	@Column(name = "datum", nullable = false, unique = false)
    private Date datum;
	
	@Column(name = "sectornaam", nullable = false, unique = false)
    private String sectornaam;
	
	@Column(name = "champignon_soort", nullable = false, unique = false)
    private String soort;
	
	@Column(name = "grootte", nullable = false, unique = false)
    private String grootte;
	
	@Column(name = "melding", nullable = false, unique = false)
    private String melding;
	
	@Column(name = "waarde", nullable = false, unique = false)
    private String waarde;

	
	public Champignonlogboek() {
		
	}
	

	public Champignonlogboek(int meting, Date datum, String sectornaam, String soort,
			String grootte, String melding, String waarde) {
		this.meting = meting;
		this.datum = datum;
		this.sectornaam = sectornaam;
		this.soort = soort;
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


	public int getMeting() {
		return meting;
	}


	public void setMeting(int meting) {
		this.meting = meting;
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


	public String getSoort() {
		return soort;
	}


	public void setSoort(String soort) {
		this.soort = soort;
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


	public String getWaarde() {
		return waarde;
	}


	public void setWaarde(String waarde) {
		this.waarde = waarde;
	}
}


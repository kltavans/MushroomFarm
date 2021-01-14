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
	
	@Column(name = "device_id", nullable = false, unique = false)
    private String device_id;
	
	@Column(name = "champignon_soort", nullable = false, unique = false)
    private String champignon_soort;
	
	@Column(name = "grootte", nullable = false, unique = false)
    private String grootte;
	
	@Column(name = "melding_lux", nullable = false, unique = false)
    private String melding_lux;
	
	@Column(name = "lux", nullable = false, unique = false)
    private int lux;
	
	@Column(name = "melding_temperatuur", nullable = false, unique = false)
    private String melding_temperatuur;
	
	@Column(name = "temperatuur", nullable = false, unique = false)
    private Double temperatuur;
	
	@Column(name = "melding_luchtvochtigheid", nullable = false, unique = false)
    private String melding_luchtvochtigheid;
	
	@Column(name = "luchtvochtigheid", nullable = false, unique = false)
    private int luchtvochtigheid;

	
	public Champignonlogboek() {
		
	}
	

	public Champignonlogboek(int meldingnummer, int metingID, Date datum, String deviceID, String champignonsoort,
			String grootte, String meldingLux, int lux, String meldingTemperatuur, Double temperatuur,
			String meldingLuchtvochtigheid, int luchtvochtigheid) {
		this.nummer = meldingnummer;
		this.meting_id = metingID;
		this.datum = datum;
		this.device_id = deviceID;
		this.champignon_soort = champignonsoort;
		this.grootte = grootte;
		this.melding_lux = meldingLux;
		this.lux = lux;
		this.melding_temperatuur = meldingTemperatuur;
		this.temperatuur = temperatuur;
		this.melding_luchtvochtigheid = meldingLuchtvochtigheid;
		this.luchtvochtigheid = luchtvochtigheid;
	}



	public int getMeldingnummer() {
		return nummer;
	}


	public void setMeldingnummer(int meldingnummer) {
		this.nummer = meldingnummer;
	}


	public int getMetingID() {
		return meting_id;
	}


	public void setMetingID(int metingID) {
		this.meting_id = metingID;
	}


	public Date getDatum() {
		return datum;
	}


	public void setDatum(Date datum) {
		this.datum = datum;
	}


	public String getDeviceID() {
		return device_id;
	}


	public void setDeviceID(String deviceID) {
		this.device_id = deviceID;
	}


	public String getChampignonsoort() {
		return champignon_soort;
	}


	public void setChampignonsoort(String champignonsoort) {
		this.champignon_soort = champignonsoort;
	}


	public String getGrootte() {
		return grootte;
	}


	public void setGrootte(String grootte) {
		this.grootte = grootte;
	}


	public String getMeldingLux() {
		return melding_lux;
	}


	public void setMeldingLux(String meldingLux) {
		this.melding_lux = meldingLux;
	}


	public int getLux() {
		return lux;
	}


	public void setLux(int lux) {
		this.lux = lux;
	}


	public String getMeldingTemperatuur() {
		return melding_temperatuur;
	}


	public void setMeldingTemperatuur(String meldingTemperatuur) {
		this.melding_temperatuur = meldingTemperatuur;
	}


	public Double getTemperatuur() {
		return temperatuur;
	}


	public void setTemperatuur(Double temperatuur) {
		this.temperatuur = temperatuur;
	}


	public String getMeldingLuchtvochtigheid() {
		return melding_luchtvochtigheid;
	}


	public void setMeldingLuchtvochtigheid(String meldingLuchtvochtigheid) {
		this.melding_luchtvochtigheid = meldingLuchtvochtigheid;
	}


	public int getLuchtvochtigheid() {
		return luchtvochtigheid;
	}


	public void setLuchtvochtigheid(int luchtvochtigheid) {
		this.luchtvochtigheid = luchtvochtigheid;
	}
	

}


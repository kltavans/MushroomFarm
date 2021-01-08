package Champignonlogboek;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Champignonlogboek")
public class Champignonlogboek {

	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    public int meldingnummer;
	
	@Column(name = "metingID", nullable = false, unique = false)
    private int metingID;
	
	@Column(name = "datum", nullable = false, unique = false)
    private Date datum;
	
	@Column(name = "deviceID", nullable = false, unique = false)
    private String deviceID;
	
	@Column(name = "champignonsoort", nullable = false, unique = false)
    private String champignonsoort;
	
	@Column(name = "grootte", nullable = false, unique = false)
    private String grootte;
	
	@Column(name = "meldingLux", nullable = false, unique = false)
    private String meldingLux;
	
	@Column(name = "lux", nullable = false, unique = false)
    private int lux;
	
	@Column(name = "meldingTemperatuur", nullable = false, unique = false)
    private String meldingTemperatuur;
	
	@Column(name = "temperatuur", nullable = false, unique = false)
    private Double temperatuur;
	
	@Column(name = "meldingLuchtvochtigheid", nullable = false, unique = false)
    private String meldingLuchtvochtigheid;
	
	@Column(name = "luchtvochtigheid", nullable = false, unique = false)
    private int luchtvochtigheid;

	
	public Champignonlogboek() {
		
	}
	

	public Champignonlogboek(int meldingnummer, int metingID, Date datum, String deviceID, String champignonsoort,
			String grootte, String meldingLux, int lux, String meldingTemperatuur, Double temperatuur,
			String meldingLuchtvochtigheid, int luchtvochtigheid) {
		this.meldingnummer = meldingnummer;
		this.metingID = metingID;
		this.datum = datum;
		this.deviceID = deviceID;
		this.champignonsoort = champignonsoort;
		this.grootte = grootte;
		this.meldingLux = meldingLux;
		this.lux = lux;
		this.meldingTemperatuur = meldingTemperatuur;
		this.temperatuur = temperatuur;
		this.meldingLuchtvochtigheid = meldingLuchtvochtigheid;
		this.luchtvochtigheid = luchtvochtigheid;
	}



	public int getMeldingnummer() {
		return meldingnummer;
	}


	public void setMeldingnummer(int meldingnummer) {
		this.meldingnummer = meldingnummer;
	}


	public int getMetingID() {
		return metingID;
	}


	public void setMetingID(int metingID) {
		this.metingID = metingID;
	}


	public Date getDatum() {
		return datum;
	}


	public void setDatum(Date datum) {
		this.datum = datum;
	}


	public String getDeviceID() {
		return deviceID;
	}


	public void setDeviceID(String deviceID) {
		this.deviceID = deviceID;
	}


	public String getChampignonsoort() {
		return champignonsoort;
	}


	public void setChampignonsoort(String champignonsoort) {
		this.champignonsoort = champignonsoort;
	}


	public String getGrootte() {
		return grootte;
	}


	public void setGrootte(String grootte) {
		this.grootte = grootte;
	}


	public String getMeldingLux() {
		return meldingLux;
	}


	public void setMeldingLux(String meldingLux) {
		this.meldingLux = meldingLux;
	}


	public int getLux() {
		return lux;
	}


	public void setLux(int lux) {
		this.lux = lux;
	}


	public String getMeldingTemperatuur() {
		return meldingTemperatuur;
	}


	public void setMeldingTemperatuur(String meldingTemperatuur) {
		this.meldingTemperatuur = meldingTemperatuur;
	}


	public Double getTemperatuur() {
		return temperatuur;
	}


	public void setTemperatuur(Double temperatuur) {
		this.temperatuur = temperatuur;
	}


	public String getMeldingLuchtvochtigheid() {
		return meldingLuchtvochtigheid;
	}


	public void setMeldingLuchtvochtigheid(String meldingLuchtvochtigheid) {
		this.meldingLuchtvochtigheid = meldingLuchtvochtigheid;
	}


	public int getLuchtvochtigheid() {
		return luchtvochtigheid;
	}


	public void setLuchtvochtigheid(int luchtvochtigheid) {
		this.luchtvochtigheid = luchtvochtigheid;
	}
	

}


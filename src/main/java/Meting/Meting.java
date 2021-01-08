package Meting;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Metingen")
public class Meting {

	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    public int metingID;
	
	@Column(name = "deviceID", nullable = false, unique = false)
    private String deviceID;
	
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

	public Meting(int metingID, String deviceID, Date datum, int lux, Double temperatuur,
			int luchtvochtigheid) {
		this.metingID = metingID;
		this.deviceID = deviceID;
		this.datum = datum;
		this.lux = lux;
		this.temperatuur = temperatuur;
		this.luchtvochtigheid = luchtvochtigheid;
	}

	public int getMetingID() {
		return metingID;
	}

	public void setMetingID(int metingID) {
		this.metingID = metingID;
	}

	public String getDeviceID() {
		return deviceID;
	}

	public void setDeviceID(String deviceID) {
		this.deviceID = deviceID;
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

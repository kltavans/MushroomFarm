package com.example.MushroomFarm.Batches;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="batches")
public class Batch {
	
	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    public Integer batchID;
	
	@Column(name = "champignonID", nullable = false, unique = false)
    private Integer champignonID;
	
	@Column(name = "deviceID", nullable = false, unique = false)
    private Integer deviceID;
	
	@Column(name = "champignonSoort", nullable = false, unique = false)
    private String champignonSoort;
	
	@Column(name = "grootte", nullable = false, unique = false)
    private String grootte;
	
	@Column(name = "groeitijd", nullable = false, unique = false)
    private Integer groeitijd;
	
	
	//Constructors
	public Batch() {
		
	}
	
	public Batch(Integer champignonID, Integer deviceID, String champignonSoort, String grootte, Integer groeitijd) {
		this.champignonID = champignonID;
		this.deviceID = deviceID;
		this.champignonSoort = champignonSoort;
		this.grootte = grootte;
		this.groeitijd = groeitijd;
	}

	public Integer getBatchID() {
		return batchID;
	}

	public void setBatchID(Integer batchID) {
		this.batchID = batchID;
	}

	public Integer getChampignonID() {
		return champignonID;
	}

	public void setChampignonID(Integer champignonID) {
		this.champignonID = champignonID;
	}

	public Integer getDeviceID() {
		return deviceID;
	}

	public void setDeviceID(Integer deviceID) {
		this.deviceID = deviceID;
	}

	public String getChampignonSoort() {
		return champignonSoort;
	}

	public void setChampignonSoort(String champignonSoort) {
		this.champignonSoort = champignonSoort;
	}

	public String getGrootte() {
		return grootte;
	}

	public void setGrootte(String grootte) {
		this.grootte = grootte;
	}

	public Integer getGroeitijd() {
		return groeitijd;
	}

	public void setGroeitijd(Integer groeitijd) {
		this.groeitijd = groeitijd;
	}
	
	
}
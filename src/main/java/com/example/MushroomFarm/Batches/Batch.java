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
    public Integer batch_id;
	
	@Column(name = "champignon_id", nullable = false, unique = false)
    private Integer champignon_id;
	
	@Column(name = "device_id", nullable = false, unique = false)
    private String device_id;
	
	@Column(name = "champignon_soort", nullable = false, unique = false)
    private String champignon_soort;
	
	@Column(name = "grootte", nullable = false, unique = false)
    private String grootte;
	
	@Column(name = "groeitijd", nullable = false, unique = false)
    private Integer groeitijd;
	
	
	//Constructors
	public Batch() {
		
	}
	
	public Batch(Integer champignon_id, String device_id, String champignon_soort, String grootte, Integer groeitijd) {
		this.champignon_id = champignon_id;
		this.device_id = device_id;
		this.champignon_soort = champignon_soort;
		this.grootte = grootte;
		this.groeitijd = groeitijd;
	}

	public Integer getBatch_id() {
		return batch_id;
	}

	public void setBatch_id(Integer batch_id) {
		this.batch_id = batch_id;
	}

	public Integer getChampignon_id() {
		return champignon_id;
	}

	public void setChampignon_id(Integer champignon_id) {
		this.champignon_id = champignon_id;
	}

	public String getDevice_id() {
		return device_id;
	}

	public void setDevice_id(String device_id) {
		this.device_id = device_id;
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

	public Integer getGroeitijd() {
		return groeitijd;
	}

	public void setGroeitijd(Integer groeitijd) {
		this.groeitijd = groeitijd;
	}

}
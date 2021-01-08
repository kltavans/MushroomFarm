package com.example.MushroomFarm.ChampignonProfiel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="champignonprofielen")
public class ChampignonProfiel {
	
	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    public Integer champignonID;
	
	@Column(name = "champignonSoort", nullable = false, unique = false)
    private String champignonSoort;
	
	@Column(name = "grootte", nullable = false, unique = false)
    private String grootte;
	
	@Column(name = "groeitijd", nullable = false, unique = false)
    private String groeitijd;
	
	@Column(name = "lux", nullable = false, unique = false)
    private Integer lux;
	
	@Column(name = "temperatuur", nullable = false, unique = false)
    private Double temperatuur;
	
	@Column(name = "luchtvochtigheid", nullable = false, unique = false)
    private Integer luchtvochtigheid;
	
	
	//Constructors
	public ChampignonProfiel() {
		
	}
	
	public ChampignonProfiel(String champignonSoort, String grootte, String groeitijd, Integer lux, Double temperatuur, Integer luchtvochtigheid) {
		this.champignonSoort = champignonSoort;
		this.grootte = grootte;
		this.groeitijd = groeitijd;
		this.lux = lux;
		this.temperatuur = temperatuur;
		this.luchtvochtigheid = luchtvochtigheid;
	}

	//Getters & Setters
	public Integer getChampignonID() {
		return champignonID;
	}

	public void setChampignonID(Integer champignonID) {
		this.champignonID = champignonID;
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

	public String getGroeitijd() {
		return groeitijd;
	}

	public void setGroeitijd(String groeitijd) {
		this.groeitijd = groeitijd;
	}

	public Integer getLux() {
		return lux;
	}

	public void setLux(Integer lux) {
		this.lux = lux;
	}

	public Double getTemperatuur() {
		return temperatuur;
	}

	public void setTemperatuur(Double temperatuur) {
		this.temperatuur = temperatuur;
	}

	public Integer getLuchtvochtigheid() {
		return luchtvochtigheid;
	}

	public void setLuchtvochtigheid(Integer luchtvochtigheid) {
		this.luchtvochtigheid = luchtvochtigheid;
	}
	
}
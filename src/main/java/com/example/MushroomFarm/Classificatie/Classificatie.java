package com.example.MushroomFarm.Classificatie;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="classificaties")
public class Classificatie {
	
	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer classificatieID;
	
	@Column(name = "champignonID", nullable = false, unique = false)
    private Integer champignonID;
	
	@Column(name = "champignonSoort", nullable = false, unique = false)
    private String champignonSoort;
	
	@Column(name = "grootte", nullable = false, unique = false)
    private String grootte;
	
	@Column(name = "groeitijd", nullable = false, unique = false)
    private Integer groeitijd;
	
	@Column(name = "lux", nullable = false, unique = false)
    private Integer lux;
	
	@Column(name = "temperatuur", nullable = false, unique = false)
    private Double temperatuur;
	
	@Column(name = "luchtvochtigheid", nullable = false, unique = false)
    private Integer luchtvochtigheid;
	
	@Column(name = "acceptabel", nullable = false, unique = false)
    private Boolean acceptabel;

	//Constructors
	public Classificatie() {
		
	}
	
	public Classificatie(Integer champignonID, String champignonSoort, String grootte,
			Integer groeitijd, Integer lux, Double temperatuur, Integer luchtvochtigheid, Boolean acceptabel) {
		this.champignonID = champignonID;
		this.champignonSoort = champignonSoort;
		this.grootte = grootte;
		this.groeitijd = groeitijd;
		this.lux = lux;
		this.temperatuur = temperatuur;
		this.luchtvochtigheid = luchtvochtigheid;
		this.acceptabel = acceptabel;
	}
	
	//Getters & Setters
	public Integer getClassificatieID() {
		return classificatieID;
	}

	public void setClassificatieID(Integer classificatieID) {
		this.classificatieID = classificatieID;
	}

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

	public Integer getGroeitijd() {
		return groeitijd;
	}

	public void setGroeitijd(Integer groeitijd) {
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

	public Boolean getAcceptabel() {
		return acceptabel;
	}

	public void setAcceptabel(Boolean acceptabel) {
		this.acceptabel = acceptabel;
	}

}
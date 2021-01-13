package com.example.MushroomFarm.ChampignonProfiel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="champignon_profielen")
public class ChampignonProfiel {
	
	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    public Integer champignon_id;
	
	@Column(name = "champignon_soort", nullable = false, unique = false)
    private String champignon_soort;
	
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
	
	
	//Constructors
	public ChampignonProfiel() {
		
	}
	
	public ChampignonProfiel(String champignon_soort, String grootte, Integer groeitijd, Integer lux, Double temperatuur, Integer luchtvochtigheid) {
		this.champignon_soort = champignon_soort;
		this.grootte = grootte;
		this.groeitijd = groeitijd;
		this.lux = lux;
		this.temperatuur = temperatuur;
		this.luchtvochtigheid = luchtvochtigheid;
	}

	//Getters & Setters
	public Integer getChampignon_id() {
		return champignon_id;
	}

	public void setChampignon_id(Integer champignon_id) {
		this.champignon_id = champignon_id;
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
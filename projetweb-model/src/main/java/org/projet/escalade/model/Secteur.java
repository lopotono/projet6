package org.projet.escalade.model;

import java.util.List;

public class Secteur {
	
	private int id;
	private String name;
	private List<Voie> voie;
	private Secteur secteur;
		
	public int getSecteurid() {
		return id;
	}

	public void setSecteurid(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Voie> getVoie() {
		return voie;
	}

	public void setVoie(List<Voie> voie) {
		this.voie = voie;
	}

	public Secteur getSecteur() {
		return secteur;
	}

	public void setSecteur(Secteur secteur) {
		this.secteur = secteur;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
}
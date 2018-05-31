package org.projet.escalade.model;

import java.util.List;

public class Voie {
	
	private int id;
	private int voiehauteur;
	private int voienumerocotation;
	private int voienombrepoints;
	private List<Longueur> longueur;
		
	public Voie() {
		
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getVoiehauteur() {
		return voiehauteur;
	}
	public void setVoiehauteur(Integer voiehauteur) {
		this.voiehauteur = voiehauteur;
	}
	public Integer getVoienumerocotation() {
		return voienumerocotation;
	}
	public void setVoienumerocotation(Integer voienumerocotation) {
		this.voienumerocotation = voienumerocotation;
	}
	public Integer getVoienombrepoints() {
		return voienombrepoints;
	}
	public void setVoienombrepoints(Integer voienombrepoints) {
		this.voienombrepoints = voienombrepoints;
	}

	public List<Longueur> getLongueur() {
		return longueur;
	}

	public void setLongueur(List<Longueur> longueur) {
		this.longueur = longueur;
	}
}

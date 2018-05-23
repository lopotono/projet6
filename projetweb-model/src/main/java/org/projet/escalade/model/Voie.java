package org.projet.escalade.model;

public class Voie {
	
	private Integer id;
	private Integer voiehauteur;
	private Integer voienumerocotation;
	private Integer voienombrepoints;
	
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
}

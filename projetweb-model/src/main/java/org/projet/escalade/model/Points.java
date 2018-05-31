package org.projet.escalade.model;

import java.util.List;

public class Points {
	
	public Points() {
		
	}
	
	private Integer id;
	private Integer pointsnombre;
	private List<Longueur> longueurs;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getPointsnombre() {
		return pointsnombre;
	}
	public void setPointsnombre(Integer pointsnombre) {
		this.pointsnombre = pointsnombre;
	}
	public List<Longueur> getLongueurs() {
		return longueurs;
	}
	public void setLongueurs(List<Longueur> longueurs) {
		this.longueurs = longueurs;
	}	
}

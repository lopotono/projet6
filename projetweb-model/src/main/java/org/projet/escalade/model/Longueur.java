package org.projet.escalade.model;

import java.util.List;

public class Longueur {
	
	public Longueur() {
		
	}
	
	private int id;
	private int longueurnombre;
	private List<Points> points;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public int getLongueurnombre() {
		return longueurnombre;
	}
	public void setLongueurnombre(int longueurnombre) {
		this.longueurnombre = longueurnombre;
	}
	
	public List<Points> getPoints() {
		return points;
	}
	public void setPoints(List<Points> points) {
		this.points = points;
	}
}

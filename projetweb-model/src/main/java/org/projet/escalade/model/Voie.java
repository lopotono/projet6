package org.projet.escalade.model;

import java.util.List;

public class Voie {
	
	private int id;
	private String name;
	private int hauteur;
	private int numerocotation;
	private int nombrepoints;
	private List<Longueur> longueur;
		
	public Voie() {
		
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHauteur() {
		return hauteur;
	}

	public void setHauteur(int hauteur) {
		this.hauteur = hauteur;
	}

	public int getNumerocotation() {
		return numerocotation;
	}

	public void setNumerocotation(int numerocotation) {
		this.numerocotation = numerocotation;
	}

	public int getNombrepoints() {
		return nombrepoints;
	}

	public void setNombrepoints(int nombrepoints) {
		this.nombrepoints = nombrepoints;
	}

	public List<Longueur> getLongueur() {
		return longueur;
	}

	public void setLongueur(List<Longueur> longueur) {
		this.longueur = longueur;
	}	
}

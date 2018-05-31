package org.projet.escalade.model;

import java.util.List;

public class Secteur {
	
	private int id;
	private String secteurname;
	private List<Voie> voie;
		
	public int getSecteurid() {
		return id;
	}

	public void setSecteurid(int id) {
		this.id = id;
	}

	public String getSecteurname() {
		return secteurname;
	}

	public void setSecteurname(String secteurname) {
		this.secteurname = secteurname;
	}

	public List<Voie> getVoie() {
		return voie;
	}

	public void setVoie(List<Voie> voie) {
		this.voie = voie;
	}
}

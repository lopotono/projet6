package org.projet.escalade.model;

import java.util.Date;

public class Ajouttopo {
	
	private String ajouttoponame;
	private User responsable;
	private Date dateCreation;
	private Boolean cloture;
	
	public Ajouttopo() {
		
	}
	
	public String getAjouttoponame() {
		return ajouttoponame;
	}

	public void setAjouttoponame(String ajouttoponame) {
		this.ajouttoponame = ajouttoponame;
	}

	public User getResponsable() {
		return responsable;
	}

	public void setResponsable(User vResponsable) {
		this.responsable = vResponsable;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date date) {
		this.dateCreation = date;
	}

	public Boolean getCloture() {
		return cloture;
	}

	public void setCloture(Boolean cloture) {
		this.cloture = cloture;
	}	
}

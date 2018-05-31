package org.projet.escalade.model;

import java.util.Date;

public class Topos {
	
	private int id;
	private String toposname;
	private boolean topodispo;
	private boolean cloture;
	private User username;
	private Date dateCreation;
	
	public Topos() {
		
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

    public String getToposname() {
        return toposname;
    }

    public void setToposname(String toposname) {
        this.toposname = toposname;
    }

	public boolean isTopodispo() {
		return topodispo;
	}

	public void setTopodispo(boolean topodispo) {
		this.topodispo = topodispo;
	}

	public boolean isCloture() {
		return cloture;
	}

	public void setCloture(boolean cloture) {
		this.cloture = cloture;
	}

	public User getUsername() {
		return username;
	}

	public void setUsername(User username) {
		this.username = username;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	
}

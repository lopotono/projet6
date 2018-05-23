package org.projet.escalade.webapp.action;

import org.projet.escalade.model.Longueur;

import com.opensymphony.xwork2.ActionSupport;

public class LongueurAction extends AbstractAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4785333294656986767L;
	
	private int id;
	private Longueur longueur;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Longueur getLongueur() {
		return longueur;
	}
	public void setLongueur(Longueur longueur) {
		this.longueur = longueur;
	}
	
	public String execute() {
		longueur = getManagerFactory().getLongueurManager().getLongueur(id);
		return ActionSupport.SUCCESS;
	}
}

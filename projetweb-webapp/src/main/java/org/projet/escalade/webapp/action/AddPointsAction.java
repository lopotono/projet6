package org.projet.escalade.webapp.action;

import com.opensymphony.xwork2.ActionSupport;

public class AddPointsAction extends AbstractAction {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2387736492425366805L;
	
	private String id;
	private String nbpoints;
	private String id_longueur;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getNbpoints() {
		return nbpoints;
	}
	public void setNbpoints(String nbpoints) {
		this.nbpoints = nbpoints;
	}
	
	public String getId_longueur() {
		return id_longueur;
	}
	public void setId_longueur(String id_longueur) {
		this.id_longueur = id_longueur;
	}
	
	public String execute() {

		String result = ActionSupport.INPUT;
		if (id != null && nbpoints != null && id_longueur != null) {
			getManagerFactory().getPointsManager().AddPoints(Integer.valueOf(id), Integer.valueOf(nbpoints), Integer.valueOf(id_longueur));
			result = ActionSupport.SUCCESS;
		}
		return result;	
	}
}
package org.projet.escalade.webapp.action;

import com.opensymphony.xwork2.ActionSupport;

public class AddVoieAction extends AbstractAction {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3544063963351713917L;
	
	private String id;
	private String name;
	private String hauteur;
	private String numero;
	private String nbpoints;
	private String id_secteur;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getHauteur() {
		return hauteur;
	}
	public void setHauteur(String hauteur) {
		this.hauteur = hauteur;
	}
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public String getNbpoints() {
		return nbpoints;
	}
	public void setNbpoints(String nbpoints) {
		this.nbpoints = nbpoints;
	}
	
	public String getId_secteur() {
		return id_secteur;
	}
	public void setId_secteur(String id_secteur) {
		this.id_secteur = id_secteur;
	}
	
	public String execute() {

		String result = ActionSupport.INPUT;
		if (name != null && hauteur != null && numero != null && nbpoints != null && id_secteur != null) {
			getManagerFactory().getVoieManager().AddVoie(name, Integer.valueOf(hauteur), Integer.valueOf(numero), Integer.valueOf(nbpoints), Integer.valueOf(id_secteur));
			result = ActionSupport.SUCCESS;
		}
		return result;	
	}
}
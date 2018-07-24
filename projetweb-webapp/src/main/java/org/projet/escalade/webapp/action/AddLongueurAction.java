package org.projet.escalade.webapp.action;

import com.opensymphony.xwork2.ActionSupport;

public class AddLongueurAction extends AbstractAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7241034095388518416L;
	
	private String id;
	private String nblongueur;
	private String id_voie;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getNblongueur() {
		return nblongueur;
	}
	public void setNblongueur(String nblongueur) {
		this.nblongueur = nblongueur;
	}
	
	public String getId_voie() {
		return id_voie;
	}
	public void setId_voie(String id_voie) {
		this.id_voie = id_voie;
	}
	
	public String execute() {

		String result = ActionSupport.INPUT;
		if (id != null && nblongueur != null && id_voie != null) {
			getManagerFactory().getLongueurManager().AddLongueur(Integer.valueOf(id), Integer.valueOf(nblongueur), Integer.valueOf(id_voie));
			result = ActionSupport.SUCCESS;
		}
		return result;	
	}
}
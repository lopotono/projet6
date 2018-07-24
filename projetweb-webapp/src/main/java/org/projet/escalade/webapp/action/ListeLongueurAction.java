package org.projet.escalade.webapp.action;

import java.util.List;

import org.projet.escalade.model.Longueur;

import com.opensymphony.xwork2.ActionSupport;

public class ListeLongueurAction extends AbstractAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5879641473882535708L;
	
	private Integer id;
	
	private List<Longueur> listLongueur;
	private Longueur longueur;
	private List<Longueur> longueurbyvoie;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public List<Longueur> getListLongueur() {
		return listLongueur;
	}
	public void setListLongueur(List<Longueur> listLongueur) {
		this.listLongueur = listLongueur;
	}
	public Longueur getLongueur() {
		return longueur;
	}
	public void setLongueur(Longueur longueur) {
		this.longueur = longueur;
	}
	public List<Longueur> getLongueurbyvoie() {
		return longueurbyvoie;
	}
	public void setLongueurbyvoie(List<Longueur> longueurbyvoie) {
		this.longueurbyvoie = longueurbyvoie;
	}
	
	public String doListLongueur() {
		listLongueur = AbstractAction.getManagerFactory().getLongueurManager().getListLongueur();
		return ActionSupport.SUCCESS;
	}


}

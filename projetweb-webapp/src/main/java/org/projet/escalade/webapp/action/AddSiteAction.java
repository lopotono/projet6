package org.projet.escalade.webapp.action;

import org.projet.escalade.model.Secteur;
import org.projet.escalade.model.Sites;
import org.projet.escalade.model.Voie;

import com.opensymphony.xwork2.ActionSupport;

public class AddSiteAction extends AbstractAction {
	
/**
	 * 
	 */
	private static final long serialVersionUID = -3157546552966957237L;
	
	private Sites addsite;
	private Secteur addsecteur;
	private Voie addvoie;
	private String name;

	public Sites getAddsite() {
		return addsite;
	}

	public void setAddsite(Sites addsite) {
		this.addsite = addsite;
	}
	
	public Secteur getAddSecteur() {
		return addsecteur;
	}

	public void setAddSecteur(Secteur addSecteur) {
		this.addsecteur = addSecteur;
	}
	
	public Voie getAddvoie() {
		return addvoie;
	}

	public void setAddvoie(Voie addvoie) {
		this.addvoie = addvoie;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
		
	public String execute() {
		
		addsite = getManagerFactory().getSitesManager().getAddSite(name);
		
		addsecteur = getManagerFactory().getSecteurManager().getAddSecteur(name);
		
		addvoie = getManagerFactory().getVoieManager().getAddVoie(name);
		
		return ActionSupport.SUCCESS;		
	}
}

package org.projet.escalade.webapp.action;

import java.util.List;

import org.projet.escalade.model.Secteur;
import org.projet.escalade.model.Sites;

import com.opensymphony.xwork2.ActionSupport;

public class SearchAction extends AbstractAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6893326862926901279L;
	
	private List<Sites> searchsite;
	private List<Secteur> searchsecteur;
	private String name;

	public List<Sites> getSearchsite() {
		return searchsite;
	}
	public void setSearchsite(List<Sites> searchsite) {
		this.searchsite = searchsite;
	}
	
	public List<Secteur> getSearchsecteur() {
		return searchsecteur;
	}
	public void setSearchsecteur(List<Secteur> searchsecteur) {
		this.searchsecteur = searchsecteur;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
			
	public String execute() {
		
		setSearchsite(getManagerFactory().getSitesManager().getSearchSite(name));
		
		setSearchsecteur(getManagerFactory().getSecteurManager().getSearchSecteur(name));
				
		return ActionSupport.SUCCESS;
	}	
}

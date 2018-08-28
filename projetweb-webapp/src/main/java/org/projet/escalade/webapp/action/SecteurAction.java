package org.projet.escalade.webapp.action;

import java.util.List;

import org.projet.escalade.model.Secteur;
import org.projet.escalade.model.Sites;

import com.opensymphony.xwork2.ActionSupport;

public class SecteurAction extends AbstractAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1149418719637915541L;
	
	private int id;
	private Secteur secteur;
	private String idsites;
	private List<Sites> listSites;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Secteur getSecteur() {
		return secteur;
	}
	public void setSecteur(Secteur secteur) {
		this.secteur = secteur;
	}
	public String getIdsites() {
		return idsites;
	}
	public void setIdsites(String idsites) {
		this.idsites = idsites;
	}
	public List<Sites> getListSites() {
		return listSites;
	}
	public void setListSites(List<Sites> listSites) {
		this.listSites = listSites;
	}	
	
	public String execute() {
		setListSites(getManagerFactory().getSitesManager().getListSites());
		secteur = getManagerFactory().getSecteurManager().getSecteur(id);
		this.secteur.setSecteur(getManagerFactory().getSecteurManager().getSites(idsites));
		return ActionSupport.SUCCESS;
	}	
}
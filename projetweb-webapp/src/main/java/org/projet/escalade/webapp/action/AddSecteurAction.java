package org.projet.escalade.webapp.action;

import java.util.List;

import org.projet.escalade.model.Secteur;
import org.projet.escalade.model.Sites;

import com.opensymphony.xwork2.ActionSupport;

public class AddSecteurAction extends AbstractAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1361721202613352707L;
	
	private String id_site;
	private String name;
	private List<Secteur> listSecteur;
	private List<Sites> listSites;
	private String idsites;
	
	public String getId_site() {
		return id_site;
	}
	public void setId_site(String id_site) {
		this.id_site = id_site;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public List<Secteur> getListSecteur() {
		return listSecteur;
	}
	public void setListSecteur(List<Secteur> listSecteur) {
		this.listSecteur = listSecteur;
	}
	
	public List<Sites> getListSites() {
		return listSites;
	}
	public void setListSites(List<Sites> listSites) {
		this.listSites = listSites;
	}
	
	public String execute() {
		
		String result = ActionSupport.INPUT;
		listSites = getManagerFactory().getSitesManager().getListSites();
		getManagerFactory().getSecteurManager().getSites(idsites);
		if (name != null && idsites != null) {
			getManagerFactory().getSecteurManager().AddSecteur(name, idsites);
			result = ActionSupport.SUCCESS;
		}
		return result;		
	}
}
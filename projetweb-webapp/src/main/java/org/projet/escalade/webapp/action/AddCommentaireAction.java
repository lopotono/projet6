package org.projet.escalade.webapp.action;

import java.util.List;

import org.projet.escalade.model.Sites;

import com.opensymphony.xwork2.ActionSupport;

public class AddCommentaireAction extends AbstractAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2332742647205080147L;
	
	private String name;
	private String contain;
	private String idsite;
	private List<Sites> listSites;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getContain() {
		return contain;
	}
	public void setContain(String contain) {
		this.contain = contain;
	}
	
	public String getIdsite() {
		return idsite;
	}
	public void setIdsite(String idsite) {
		this.idsite = idsite;
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
		getManagerFactory().getCommentaireManager().getSites(idsite);
		if (name != null && contain != null && idsite != null) {
			getManagerFactory().getCommentaireManager().AddCommentaire(name, contain, idsite);
			result = ActionSupport.SUCCESS;
		}
		return result;		
	}
}
package org.projet.escalade.webapp.action;

import org.projet.escalade.model.Sites;

import com.opensymphony.xwork2.ActionSupport;

public class SiteAction extends AbstractAction {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -873630247920101186L;
	
	private int id;
	private Sites site;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Sites getSite() {
		return site;
	}
	public void setSite(Sites site) {
		this.site = site;
	}

	public String execute() {
		site = getManagerFactory().getSitesManager().getSite(id);
		return ActionSupport.SUCCESS;		
	}
}

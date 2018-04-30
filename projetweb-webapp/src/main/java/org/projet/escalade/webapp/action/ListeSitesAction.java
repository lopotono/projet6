package org.projet.escalade.webapp.action;

import java.util.List;

import org.projet.escalade.model.Sites;

import com.opensymphony.xwork2.ActionSupport;

public class ListeSitesAction extends AbstractAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7227990153624180024L;

	private String listSites;

	public String getListSites() {
		return listSites;
	}

	public void setListSites(String list) {
		this.listSites = list;
	}

	public String execute() {
		List<Sites> list = getManagerFactory().getSitesManager().getListSites();
		setListSites(list.get(0).getSitesname());
		return ActionSupport.SUCCESS;
	}
}

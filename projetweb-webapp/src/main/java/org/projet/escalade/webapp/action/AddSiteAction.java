package org.projet.escalade.webapp.action;

import com.opensymphony.xwork2.ActionSupport;

public class AddSiteAction extends AbstractAction {

	/**
		 * 
		 */
	private static final long serialVersionUID = -3157546552966957237L;

	private String id_topo;
	private String name;
	private String description;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getId_topo() {
		return id_topo;
	}

	public void setId_topo(String id_topo) {
		this.id_topo = id_topo;
	}

	public String execute() {

		String result = ActionSupport.INPUT;
		if (name != null && description != null && id_topo != null) {
			getManagerFactory().getSitesManager().AddSite(name, Integer.valueOf(id_topo) , description);
			result = ActionSupport.SUCCESS;
		}
		return result;	
	}
}
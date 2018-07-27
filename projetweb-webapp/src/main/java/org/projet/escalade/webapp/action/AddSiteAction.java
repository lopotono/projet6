package org.projet.escalade.webapp.action;

import java.util.List;

import org.projet.escalade.model.Sites;
import org.projet.escalade.model.Topos;

import com.opensymphony.xwork2.ActionSupport;

public class AddSiteAction extends AbstractAction {

	/**
		 * 
		 */
	private static final long serialVersionUID = -3157546552966957237L;

	private String id_topo;
	private String name;
	private String description;
	private Sites site;
	private List<Topos> listTopos;
	private String idtopo;

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
	
	public Sites getSite() {
		return site;
	}

	public void setSite(Sites site) {
		this.site = site;
	}
	
	public List<Topos> getListTopos() {
		return listTopos;
	}

	public void setListTopos(List<Topos> listTopos) {
		this.listTopos = listTopos;
	}
	
	public String getIdtopo() {
		return idtopo;
	}
	
	public void setIdtopo(String idtopo) {
		this.idtopo = idtopo;
	}

	public String execute() {

		String result = ActionSupport.INPUT;
		listTopos = getManagerFactory().getToposManager().getListTopos();
		getManagerFactory().getSitesManager().getTopos(idtopo);
		if (name != null && description != null && idtopo != null) {
			getManagerFactory().getSitesManager().AddSite(name, idtopo, description);
			result = ActionSupport.SUCCESS;
		}
		return result;	
	}
}
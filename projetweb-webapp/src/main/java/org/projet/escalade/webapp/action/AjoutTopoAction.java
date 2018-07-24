package org.projet.escalade.webapp.action;

import java.util.List;

import org.projet.escalade.model.Topos;
import org.projet.escalade.model.User;

import com.opensymphony.xwork2.ActionSupport;

public class AjoutTopoAction extends AbstractAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5517825675508194633L;

	private List<User> listUser;

	private Topos ajouttopo;
	private String name;
	private Boolean dispo;
	private String id;

	public List<User> getListUser() {
		return listUser;
	}

	public void setListUser(List<User> listUser) {
		this.listUser = listUser;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getDispo() {
		return dispo;
	}

	public void setDispo(Boolean dispo) {
		this.dispo = dispo;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public Topos getAjouttopo() {
		return ajouttopo;
	}

	public void setAjouttopo(Topos ajouttopo) {
		this.ajouttopo = ajouttopo;
	}
	
	public String execute() {
		
		String result = ActionSupport.INPUT;
		if (name != null && dispo != null && id != null) {
			getManagerFactory().getToposManager().AjoutTopo(name, dispo , Integer.valueOf(id));
			result = ActionSupport.SUCCESS;
		}
		return result;
	}
}
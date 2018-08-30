package org.projet.escalade.webapp.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;
import org.projet.escalade.model.Topos;
import org.projet.escalade.model.User;

import com.opensymphony.xwork2.ActionSupport;

public class AjoutTopoAction extends AbstractAction implements SessionAware {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5517825675508194633L;

	private List<User> listUser;

	private Topos ajouttopo;
	private String name;
	private String toposname;
	private boolean dispo;
	private String id;
	private Map<String, Object> session;
	private List<Topos> listTopos;
	private int topoid;

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
	
	public String getToposname() {
		return toposname;
	}
	
	public void setToposname(String toposname) {
		this.toposname = toposname;
	}
	
	public List<Topos> getListTopos() {
		return listTopos;
	}
	
	public void setListTopos(List<Topos> listTopos) {
		this.listTopos = listTopos;
	}
	
	public boolean getDispo() {
		return dispo;
	}
	
	public void setDispo(boolean dispo) {
		this.dispo = dispo;
	}
	
	public int getTopoid() {
		return topoid;
	}
	
	public void setTopoid(int topoid) {
		this.topoid = topoid;
	}
	
	public String execute() {

		String result = ActionSupport.INPUT;
		// Récupérer le nom de l'utilisateur
		User vUser = (User) this.session.get("user");
		this.setName(vUser.getName());
				
		if (toposname != null) {
			getManagerFactory().getToposManager().AjoutTopo(toposname, dispo, vUser.getId().toString());
			result = ActionSupport.SUCCESS;
		}
		return result;
	}

	public void setSession(Map<String, Object> pSession) {
		this.session = pSession;
	}
}
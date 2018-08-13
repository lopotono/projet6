package org.projet.escalade.webapp.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;
import org.projet.escalade.model.Emprunttopo;
import org.projet.escalade.model.User;

import com.opensymphony.xwork2.ActionSupport;

public class ListeEmpruntAction extends AbstractAction implements SessionAware {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5337233843745165375L;


	private List<Emprunttopo> listEmpruntTopos;
	private Map<String, Object> session;

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public List<Emprunttopo> getListEmpruntTopos() {
		return listEmpruntTopos;
	}

	public void setListEmpruntTopos(List<Emprunttopo> listEmpruntTopos) {
		this.listEmpruntTopos = listEmpruntTopos;
	}
	
	public String execute() {
		User vUser = (User) this.session.get("user");
		listEmpruntTopos = getManagerFactory().getEmpruntManager().getEmpruntByUser(vUser);
		return ActionSupport.SUCCESS;		
	}
}
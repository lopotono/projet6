package org.projet.escalade.webapp.action;

import java.util.List;

import org.projet.escalade.model.User;

import com.opensymphony.xwork2.ActionSupport;

public class ListeUserAction extends AbstractAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4292732896307310629L;
	
	private Integer id;
	
	private List<User> listUser;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<User> getListUser() {
		return listUser;
	}

	public void setListUser(List<User> listUser) {
		this.listUser = listUser;
	}
	
	public String doListUser() {
		listUser = getManagerFactory().getUserManager().getListUser();
		return ActionSupport.SUCCESS;
	}
}

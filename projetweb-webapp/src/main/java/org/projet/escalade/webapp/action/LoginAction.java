package org.projet.escalade.webapp.action;

import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.apache.struts2.interceptor.SessionAware;
import org.projet.escalade.model.User;
import org.projet.escalade.model.exception.NotFoundException;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends AbstractAction implements SessionAware {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4510595769280222445L;

	private String name;
	private String password;
	private Map<String, Object> session;

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String doLogin() {
		String vResult = ActionSupport.INPUT;
		if (!StringUtils.isAllEmpty(name, password)) {
			try {
				User vUser = AbstractAction.getManagerFactory().getUserManager().getUser(name, password);

				if (vUser == null) {
					throw new NotFoundException();
				}
				this.session.put("user", vUser);

				vResult = ActionSupport.SUCCESS;
				
			} catch (NotFoundException pE) {
				this.addActionError("Identifiant ou mot de passe invalide !");
			}
		}
		return vResult;
	}

	public String doLogout() {

		this.session.remove("user");

		return ActionSupport.SUCCESS;
	}

	public void setSession(Map<String, Object> pSession) {
		this.session = pSession;
	}
}

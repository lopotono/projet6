package org.projet.escalade.webapp.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;
import org.projet.escalade.model.User;
import org.projet.escalade.model.exception.NotFoundException;
import org.apache.commons.lang3.StringUtils;

import com.opensymphony.xwork2.ActionSupport;


public class LoginAction extends AbstractAction implements SessionAware {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4510595769280222445L;
	
	private String login;
	private String password;
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String doLogin() throws NotFoundException {
		String vResult = ActionSupport.INPUT;
		if (!StringUtils.isAllEmpty(login, password)) {
			User vUser = AbstractAction.getManagerFactory().getUserManager().getUser(login, password);
			
			this.session.put("user", vUser);
			
			vResult = ActionSupport.SUCCESS;
		}
		return vResult;
	}
	
	public String doLogout() {
		
		this.session.remove("user");
		
		return ActionSupport.SUCCESS;
	}
	
	private Map<String, Object> session;
	
	public void setSession(Map<String, Object> pSession) {
		this.session = pSession;
	}
}

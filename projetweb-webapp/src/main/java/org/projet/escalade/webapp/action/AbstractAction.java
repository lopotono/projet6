package org.projet.escalade.webapp.action;

import org.projet.escalade.business.contract.ManagerFactory;

import com.opensymphony.xwork2.ActionSupport;

public abstract class AbstractAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6702313734198988582L;
	private static ManagerFactory managerFactory;
	
	public static ManagerFactory getManagerFactory() {
		return managerFactory;
	}
	
	public static void setManagerFactory(ManagerFactory managerFactory) {
		AbstractAction.managerFactory = managerFactory;
	}

}

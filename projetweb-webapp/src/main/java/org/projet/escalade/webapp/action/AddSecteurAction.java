package org.projet.escalade.webapp.action;

import com.opensymphony.xwork2.ActionSupport;

public class AddSecteurAction extends AbstractAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1361721202613352707L;
	
	private String id_site;
	private String name;
	
	public String getId_site() {
		return id_site;
	}
	public void setId_site(String id_site) {
		this.id_site = id_site;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String execute() {
		
		String result = ActionSupport.INPUT;
		if (name != null && id_site != null) {
			getManagerFactory().getSecteurManager().AddSecteur(name, Integer.valueOf(id_site));
			result = ActionSupport.SUCCESS;
		}
		return result;		
	}
}

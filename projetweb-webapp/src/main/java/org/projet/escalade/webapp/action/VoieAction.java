package org.projet.escalade.webapp.action;

import org.projet.escalade.model.Voie;

import com.opensymphony.xwork2.ActionSupport;

public class VoieAction extends AbstractAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3944235065644309353L;
	
	private int id;
	private Voie voie;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public Voie getVoie() {
		return voie;
	}
	public void setVoie(Voie voie) {
		this.voie = voie;
	}
	
	public String execute() {
		voie = getManagerFactory().getVoieManager().getVoie(id);
		return ActionSupport.SUCCESS;
	}
}
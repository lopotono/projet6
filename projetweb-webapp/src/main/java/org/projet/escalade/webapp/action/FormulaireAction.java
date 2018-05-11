package org.projet.escalade.webapp.action;

import org.projet.escalade.model.Formulaire;

import com.opensymphony.xwork2.ActionSupport;

public class FormulaireAction extends AbstractAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = -448856616223611110L;
	
	private Formulaire formulaire;

	public Formulaire getFormulaire() {
		return formulaire;
	}

	public void setFormulaire(Formulaire formulaire) {
		this.formulaire = formulaire;
	}
	
	public String doForm() {
		formulaire = getManagerFactory().getFormulaireManager().getFormulaire();
		return ActionSupport.SUCCESS;
	}
}

package org.projet.escalade.webapp.action;

import java.util.Date;
import java.util.List;

import org.projet.escalade.model.Ajouttopo;
import org.projet.escalade.model.User;
import org.projet.escalade.model.exception.FunctionalException;
import org.projet.escalade.model.exception.NotFoundException;
import org.projet.escalade.model.exception.TechnicalException;

import com.opensymphony.xwork2.ActionSupport;

public class AjoutTopoAction extends AbstractAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5517825675508194633L;

	private List<User> listUser;

	private Ajouttopo ajouttopo;

	public List<User> getListUser() {
		return listUser;
	}

	public void setListUser(List<User> listUser) {
		this.listUser = listUser;
	}

	public Ajouttopo getAjouttopo() {
		return ajouttopo;
	}

	public void setAjouttopo(Ajouttopo ajouttopo) {
		this.ajouttopo = ajouttopo;
	}

	public String doCreate() throws FunctionalException, TechnicalException {

		String vResult = ActionSupport.INPUT;

		if (this.ajouttopo.getResponsable() == null || this.ajouttopo.getResponsable().getId() == null) {
			this.addFieldError("ajouttopo.responsable.id", "ne doit pas être vide");
		} else {
			try {
				User vResponsable = getManagerFactory().getUserManager()
						.getUser(this.ajouttopo.getResponsable().getId());
				this.ajouttopo.setResponsable(vResponsable);
			} catch (NotFoundException pE) {
				this.addFieldError("ajouttopo.responsable.id", pE.getMessage());
			}
		}

		this.ajouttopo.setDateCreation(new Date());

		if (!this.hasErrors()) {
			getManagerFactory().getAjouttopoManager().insertAjouttopo(this.ajouttopo);
			vResult = ActionSupport.SUCCESS;
			this.addActionMessage("Topo ajouté avec succès");
		}
		if (vResult.equals(ActionSupport.INPUT)) {
			this.listUser = getManagerFactory().getUserManager().getListUser();
		}

		return vResult;
	}
}

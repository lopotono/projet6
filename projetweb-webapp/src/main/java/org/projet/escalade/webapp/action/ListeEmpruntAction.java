package org.projet.escalade.webapp.action;

import java.util.List;

import org.projet.escalade.model.Emprunttopo;
import org.projet.escalade.model.Topos;

import com.opensymphony.xwork2.ActionSupport;

public class ListeEmpruntAction extends AbstractAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5337233843745165375L;

	private String empruntencours;
	private List<Topos> listTopos;
	private Emprunttopo emprunttopo;
	private boolean listdispo;

	public String getEmpruntencours() {
		return empruntencours;
	}

	public void setEmpruntencours(String empruntencours) {
		this.empruntencours = empruntencours;
	}

	public List<Topos> getListTopos() {
		return listTopos;
	}

	public void setListTopos(List<Topos> listTopos) {
		this.listTopos = listTopos;
	}

	public Emprunttopo getEmprunttopo() {
		return emprunttopo;
	}

	public void setEmprunttopo(Emprunttopo emprunttopo) {
		this.emprunttopo = emprunttopo;
	}

	public boolean isListdispo() {
		return listdispo;
	}

	public void setListdispo(boolean listdispo) {
		this.listdispo = listdispo;
	}

	public String doEmprunt() {
		listTopos = getManagerFactory().getToposManager().getListTopos();
		return ActionSupport.SUCCESS;		
	}
}
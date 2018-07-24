package org.projet.escalade.webapp.action;

import java.util.Date;
import java.util.List;

import org.projet.escalade.model.Emprunttopo;
import org.projet.escalade.model.Topos;
import com.opensymphony.xwork2.ActionSupport;

public class EmpruntAction extends AbstractAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6524829433182160439L;

	private List<Topos> listTopos;
	private Emprunttopo emprunttopo;
	private String topoid;

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

	public String getTopoid() {
		return topoid;
	}

	public void setTopoid(String topoid) {
		this.topoid = topoid;
	}

	public String execute() {

		String vResult = ActionSupport.INPUT;
		//Récupérer la liste des topos disponibles
		listTopos = getManagerFactory().getToposManager().getListTopos();
		// Vérifier si le topo existe
		if (this.topoid != null) {
			try {
				
				this.emprunttopo = new Emprunttopo();
				this.emprunttopo.setDateEmprunt(new Date());
				this.emprunttopo.setTopos(getManagerFactory().getToposManager().getTopo(topoid));
				//sauvegarder l'emprunt
				vResult = ActionSupport.SUCCESS;
			} catch (Exception e) {
				this.addActionError("Erreur");
			}		
		}
		return vResult;
	}	
}
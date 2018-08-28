package org.projet.escalade.webapp.action;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;
import org.projet.escalade.model.Emprunttopo;
import org.projet.escalade.model.Topos;
import org.projet.escalade.model.User;

import com.opensymphony.xwork2.ActionSupport;

public class EmpruntAction extends AbstractAction implements SessionAware {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6524829433182160439L;

	private List<Topos> listTopos;
	private Emprunttopo emprunttopo;
	private String topoid;
	private Calendar datedebut;
	private Calendar datefin;
	private boolean topodispo;
	private String name;
	private Map<String, Object> session;
	private String toposname;

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
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Calendar getDatefin() {
		return datefin;
	}
	
	public void setDatefin(Calendar datefin) {
		this.datefin = datefin;
	}
	
	public Calendar getDatedebut() {
		return datedebut;
	}
	
	public void setDatedebut(Calendar datedebut) {
		this.datedebut = datedebut;
	}
	
	public String getToposname() {
		return toposname;
	}
	
	public void setToposname(String toposname) {
		this.toposname = toposname;
	}
				
	public String execute() {

		String vResult = ActionSupport.INPUT;
		// Récupérer la liste des topos disponibles
		listTopos = getManagerFactory().getToposManager().getToposdisponible(topodispo);
		emprunttopo = new Emprunttopo();
		// Récupérer le nom de l'utilisateur
		User vUser = (User) this.session.get("user");
		this.setName(vUser.getName());
							
		// La période de prêt
		Calendar datedebut = new GregorianCalendar();
		Calendar datefin = Calendar.getInstance();
		datefin.add(Calendar.MONTH, 1);

		// Vérifier si le topo existe
		if (this.topoid != null) {
			try {
				this.emprunttopo = new Emprunttopo();
				this.emprunttopo.setDatedebut(datedebut);
				this.emprunttopo.setDatefin(datefin);
				getManagerFactory().getEmpruntManager().SaveEmprunt(datedebut, datefin, vUser.getId().toString(), topoid);
				vResult = ActionSupport.SUCCESS;
			} catch (Exception e) {
				this.addActionError("Erreur");
			}
		}
		return vResult;
	}

	public void setSession(Map<String, Object> pSession) {
		this.session = pSession;
	}
}
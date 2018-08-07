package org.projet.escalade.webapp.action;

import java.util.Date;
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
	private String name;
	private String toposname;
	private boolean empruntencours;
	private Date datedebut;
	private Date datefin;
	private String id_topo;
	private String id_user;
	private boolean topodispo;
	private Map<String, Object> session;

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
	
	public boolean isEmpruntencours() {
		return empruntencours;
	}

	public void setEmpruntencours(boolean empruntencours) {
		this.empruntencours = empruntencours;
	}

	public Date getDatedebut() {
		return datedebut;
	}

	public void setDatedebut(Date datedebut) {
		this.datedebut = datedebut;
	}

	public Date getDatefin() {
		return datefin;
	}

	public void setDatefin(Date datefin) {
		this.datefin = datefin;
	}
	
	public String getId_topo() {
		return id_topo;
	}
	
	public void setId_topo(String id_topo) {
		this.id_topo = id_topo;
	}
	
	public String getId_user() {
		return id_user;
	}
	
	public void setId_user(String id_user) {
		this.id_user = id_user;
	}
		
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
		//listTopos = getManagerFactory().getToposManager().getListTopos();
		listTopos = getManagerFactory().getToposManager().getToposdisponible(topodispo);
		emprunttopo = new Emprunttopo();
		// Récupérer le nom de l'utilisateur
		User vUser = (User)this.session.get("user");
		this.setName(vUser.getName());
		
		//Topos topos = getManagerFactory().getToposManager().getTopo(topoid); 
		//this.setToposname(topos.getToposname());

		// Calcul de la période de prêt
		
					
		// Vérifier si le topo existe
		if (this.topoid != null) {
			try {				
				this.emprunttopo = new Emprunttopo();
				this.emprunttopo.setDatedebut(datedebut);
				this.emprunttopo.setDatefin(datefin);
				this.emprunttopo.setTopos(getManagerFactory().getToposManager().getTopo(topoid));
			
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
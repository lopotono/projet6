package org.projet.escalade.model;

import java.util.Date;
import java.util.List;

public class Emprunttopo {
	
	private int idemprunt;
	private String empruntencours;
	private Date datedebut;
	private Date datefin;
	private User name;
	private Topos topos;
	private List<Topos> topo;
	
	public int getIdemprunt() {
		return idemprunt;
	}
	public void setIdemprunt(int idemprunt) {
		this.idemprunt = idemprunt;
	}
	
	public String getEmpruntencours() {
		return empruntencours;
	}
	public void setEmpruntencours(String empruntencours) {
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
	
	public User getName() {
		return name;
	}
	public void setName(User name) {
		this.name = name;
	}
	
	public Topos getTopos() {
		return topos;
	}
	public void setTopos(Topos topos) {
		this.topos = topos;
	}
	public List<Topos> getTopo() {
		return topo;
	}
	public void setTopo(List<Topos> topo) {
		this.topo = topo;
	}	
}
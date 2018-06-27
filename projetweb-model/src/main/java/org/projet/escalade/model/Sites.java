package org.projet.escalade.model;

import java.util.List;

public class Sites {
		
	private String name;
	private int sitesid;
	private String description;
	private List<Secteur> secteurs;
	private List<Voie> voie;
	private List<Topos> topo;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

    public int getSitesid() {
		return sitesid;
	}
    
	public void setSitesid(int sitesid) {
		this.sitesid = sitesid;		
	}

	public List<Secteur> getSecteurs() {
		return secteurs;
	}

	public void setSecteurs(List<Secteur> secteurs) {
		this.secteurs = secteurs;
	}

	public List<Voie> getVoie() {
		return voie;
	}

	public void setVoie(List<Voie> voie) {
		this.voie = voie;
	}

	public List<Topos> getTopo() {
		return topo;
	}

	public void setTopo(List<Topos> topo) {
		this.topo = topo;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}	
}

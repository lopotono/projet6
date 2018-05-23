package org.projet.escalade.model;

import java.util.List;

public class Sites {
		
	private String sitesname;
	private int sitesid;
	private List<Secteur> secteurs;
	private List<Voie> voie;

    public String getSitesname() {
        return sitesname;
    }

    public void setSitesname(String sitesname) {
        this.sitesname = sitesname;
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
}

package org.projet.escalade.business.impl;

import java.util.List;

import org.projet.escalade.business.contract.SecteurManager;
import org.projet.escalade.model.Secteur;
import org.projet.escalade.model.Sites;
import org.projet.escalade.model.Voie;

public class SecteurManagerImpl extends AbstractManager implements SecteurManager{

	public List<Secteur> getListSecteur() {
		return getDaoFactory().getSecteurDao().getSecteur();
	}

	public List<Secteur> getSecteurBySite(Sites vSite) {
		return getDaoFactory().getSecteurDao().getSecteurBySite(vSite);
	}
	
	public Secteur getSecteur(int id) {
		Secteur vSecteur = getDaoFactory().getSecteurDao().getSecteur(id);
		List<Voie> vVoie = getDaoFactory().getVoieDao().getVoieBySecteur(vSecteur);	
		vSecteur.setVoie(vVoie);
		return vSecteur;
	}

	public List<Secteur> getSearchSecteur(String name) {
		return getDaoFactory().getSecteurDao().getSearchSecteur(name);
	}	
}

package org.projet.escalade.business.contract;

import java.util.List;

import org.projet.escalade.model.Secteur;
import org.projet.escalade.model.Sites;

public interface SecteurManager {

	List<Secteur> getListSecteur();
	
	List<Secteur> getSecteurBySite(Sites vSite);

	Secteur getSecteur(int id);

	List<Secteur> getSearchSecteur(String name);
}

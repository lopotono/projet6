package org.projet.escalade.business.contract;

import java.util.List;

import org.projet.escalade.model.Secteur;
import org.projet.escalade.model.exception.NotFoundException;

public interface SecteurManager {

	List<Secteur> getListSecteur();
	
	Secteur getSecteur(Integer pID) throws NotFoundException;
}

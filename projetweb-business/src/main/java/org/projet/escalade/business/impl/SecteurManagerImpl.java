package org.projet.escalade.business.impl;

import java.util.List;

import org.projet.escalade.business.contract.SecteurManager;
import org.projet.escalade.model.Secteur;
import org.projet.escalade.model.exception.NotFoundException;

public class SecteurManagerImpl extends AbstractManager implements SecteurManager{

	public List<Secteur> getListSecteur() {
		return getDaoFactory().getSecteurDao().getSecteur();
	}

	public Secteur getSecteur(Integer pID) throws NotFoundException {
		return null;
	}

}

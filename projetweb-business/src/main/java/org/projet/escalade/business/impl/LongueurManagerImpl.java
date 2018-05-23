package org.projet.escalade.business.impl;

import java.util.List;

import org.projet.escalade.business.contract.LongueurManager;
import org.projet.escalade.model.Longueur;
import org.projet.escalade.model.Voie;

public class LongueurManagerImpl extends AbstractManager implements LongueurManager {

	public List<Longueur> getListLongueur() {
		return getDaoFactory().getLongueurDao().getLongueur();
	}
	
	public List<Longueur> getLongueurByVoie(Voie vVoie) {
		return getDaoFactory().getLongueurDao().getLongueurByVoie(vVoie);		
	}

	public Longueur getLongueur(int id) {
		Longueur vLongueur = getDaoFactory().getLongueurDao().getLongueur(id);
		return vLongueur;
	}
}

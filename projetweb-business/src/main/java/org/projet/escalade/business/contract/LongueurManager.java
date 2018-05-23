package org.projet.escalade.business.contract;

import java.util.List;

import org.projet.escalade.model.Longueur;
import org.projet.escalade.model.Voie;

public interface LongueurManager {
	
	Longueur getLongueur(int id);

	List<Longueur> getListLongueur();
	
	List<Longueur> getLongueurByVoie(Voie vVoie);
}

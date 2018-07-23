package org.projet.escalade.business.contract;

import java.util.List;

import org.projet.escalade.model.Longueur;
import org.projet.escalade.model.Voie;

public interface LongueurManager {

	List<Longueur> getListLongueur();
	
	List<Longueur> getLongueurByVoie(Voie vVoie);

	Longueur getLongueur(int id);
	
	void AddLongueur(int id, int nblongueur, int id_voie);
}
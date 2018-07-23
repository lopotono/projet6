package org.projet.escalade.consumer.contract;

import java.util.List;

import org.projet.escalade.model.Longueur;
import org.projet.escalade.model.Voie;

public interface LongueurDAO {
		
	List<Longueur> getLongueur();
	
	List<Longueur> getLongueurByVoie(Voie vVoie);

	Longueur getLongueur(int id);

	void AddLongueur(int id, int nblongueur, int id_voie);
}
package org.projet.escalade.business.contract;

import java.util.List;

import org.projet.escalade.model.Secteur;
import org.projet.escalade.model.Voie;

public interface VoieManager {

	Voie getVoie(int id);

	List<Voie> getListVoie();
	
	List<Voie> getVoieBySecteur(Secteur vSecteur);
}

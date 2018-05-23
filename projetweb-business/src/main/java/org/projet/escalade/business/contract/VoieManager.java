package org.projet.escalade.business.contract;

import java.util.List;

import org.projet.escalade.model.Voie;

public interface VoieManager {
	
	List<Voie> getListVoie();

	Voie getVoie(int id);
}

package org.projet.escalade.consumer.contract;

import java.util.List;

import org.projet.escalade.model.Secteur;
import org.projet.escalade.model.Voie;

public interface VoieDAO {
	
	List<Voie> getVoie();

	Voie getVoie(int id);

	List<Voie> getVoieBySecteur(Secteur vSecteur);	
}

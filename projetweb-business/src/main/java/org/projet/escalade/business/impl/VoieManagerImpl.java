package org.projet.escalade.business.impl;

import java.util.List;

import org.projet.escalade.business.contract.VoieManager;
import org.projet.escalade.model.Secteur;
import org.projet.escalade.model.Voie;

public class VoieManagerImpl extends AbstractManager implements VoieManager {
	
	public List<Voie> getListVoie() {
		return getDaoFactory().getVoieDao().getVoie();
	}

	public Voie getVoie(int id) {
		return getDaoFactory().getVoieDao().getVoie(id);		
	}

	public List<Voie> getVoieBySecteur(Secteur vSecteur) {
		return getDaoFactory().getVoieDao().getVoieBySecteur(vSecteur);
	}
}

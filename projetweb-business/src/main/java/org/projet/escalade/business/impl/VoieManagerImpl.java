package org.projet.escalade.business.impl;

import java.util.List;

import org.projet.escalade.business.contract.VoieManager;
import org.projet.escalade.model.Voie;
import org.projet.escalade.model.exception.NotFoundException;

public class VoieManagerImpl extends AbstractManager implements VoieManager {

	public List<Voie> getListVoie() {
		return getDaoFactory().getVoieDao().getVoie();
	}

	public Voie getVoie(Integer pID) throws NotFoundException {
		return null;
	}
}

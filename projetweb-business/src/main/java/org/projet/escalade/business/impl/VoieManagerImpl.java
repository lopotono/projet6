package org.projet.escalade.business.impl;

import java.util.List;

import org.projet.escalade.business.contract.VoieManager;
import org.projet.escalade.model.Secteur;
import org.projet.escalade.model.Voie;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

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

	public List<Voie> getSearchVoie(String name) {
		return getDaoFactory().getVoieDao().getSearchVoie(name);
	}
	
	@Transactional(value="txManagerSite")
	public void AddVoie(final int id, final String name, final int hauteur, final int numero, final int nbpoints, final int id_secteur) {
		
		TransactionTemplate vTransactionTemplate = new TransactionTemplate(getPlatformTransactionManager());
		
		vTransactionTemplate.execute(new TransactionCallbackWithoutResult() {

			@Override
			protected void doInTransactionWithoutResult(TransactionStatus status) {
				
				getDaoFactory().getVoieDao().AddVoie(id ,name, hauteur, numero, nbpoints, id_secteur);
			};
		});
	}	
}
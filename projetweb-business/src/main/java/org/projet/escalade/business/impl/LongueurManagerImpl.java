package org.projet.escalade.business.impl;

import java.util.List;

import org.projet.escalade.business.contract.LongueurManager;
import org.projet.escalade.model.Longueur;
import org.projet.escalade.model.Voie;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

public class LongueurManagerImpl extends AbstractManager implements LongueurManager {

	public List<Longueur> getListLongueur() {
		return getDaoFactory().getLongueurDao().getLongueur();
	}
	
	public List<Longueur> getLongueurByVoie(Voie vVoie) {
		return getDaoFactory().getLongueurDao().getLongueurByVoie(vVoie);		
	}

	public Longueur getLongueur(int id) {
		return getDaoFactory().getLongueurDao().getLongueur(id);
	}

	@Transactional(value="txManagerSite")
	public void AddLongueur(final int id, final int nblongueur, final int id_voie) {
		
		TransactionTemplate vTransactionTemplate = new TransactionTemplate(getPlatformTransactionManager());
		
		vTransactionTemplate.execute(new TransactionCallbackWithoutResult() {

			@Override
			protected void doInTransactionWithoutResult(TransactionStatus status) {
				
				getDaoFactory().getLongueurDao().AddLongueur(id, nblongueur, id_voie);
			};
		});			
	}
}
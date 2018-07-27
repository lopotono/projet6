package org.projet.escalade.business.impl;

import java.util.List;

import org.projet.escalade.business.contract.SecteurManager;
import org.projet.escalade.model.Secteur;
import org.projet.escalade.model.Sites;
import org.projet.escalade.model.Voie;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

public class SecteurManagerImpl extends AbstractManager implements SecteurManager {

	public List<Secteur> getListSecteur() {
		return getDaoFactory().getSecteurDao().getSecteur();
	}

	public List<Secteur> getSecteurBySite(Sites vSite) {
		return getDaoFactory().getSecteurDao().getSecteurBySite(vSite);
	}

	public Secteur getSecteur(int id) {
		Secteur vSecteur = getDaoFactory().getSecteurDao().getSecteur(id);
		List<Voie> vVoie = getDaoFactory().getVoieDao().getVoieBySecteur(vSecteur);
		vSecteur.setVoie(vVoie);
		return vSecteur;
	}

	public List<Secteur> getSearchSecteur(String name) {
		return getDaoFactory().getSecteurDao().getSearchSecteur(name);
	}

	@Transactional(value = "txManagerSite")
	public void AddSecteur(final String name, final String idsites) {

		TransactionTemplate vTransactionTemplate = new TransactionTemplate(getPlatformTransactionManager());

		vTransactionTemplate.execute(new TransactionCallbackWithoutResult() {

			@Override
			protected void doInTransactionWithoutResult(TransactionStatus status) {

				getDaoFactory().getSecteurDao().AddSecteur(name, idsites);
			};
		});
	}

	public Secteur getSites(String idsites) {
		// TODO Auto-generated method stub
		return null;
	}
}
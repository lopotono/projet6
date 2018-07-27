package org.projet.escalade.business.impl;

import java.util.List;

import org.projet.escalade.business.contract.SitesManager;
import org.projet.escalade.model.Longueur;
import org.projet.escalade.model.Points;
import org.projet.escalade.model.Secteur;
import org.projet.escalade.model.Sites;
import org.projet.escalade.model.Topos;
import org.projet.escalade.model.Voie;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

public class SitesManagerImpl extends AbstractManager implements SitesManager {

	public List<Sites> getListSites() {
		return getDaoFactory().getSitesDao().getSites();
	}

	public Sites getSite(int id) {
		Sites vSite = getDaoFactory().getSitesDao().getSite(id);
		List<Secteur> vSecteurs = getDaoFactory().getSecteurDao().getSecteurBySite(vSite);
		vSite.setSecteurs(vSecteurs);

		for (Secteur secteur : vSecteurs) {
			List<Voie> vVoies = getDaoFactory().getVoieDao().getVoieBySecteur(secteur);
			secteur.setVoie(vVoies);

			for (Voie voie : vVoies) {
				List<Longueur> vLongueur = getDaoFactory().getLongueurDao().getLongueurByVoie(voie);
				voie.setLongueur(vLongueur);

				for (Longueur longueur : vLongueur) {
					List<Points> vPoints = getDaoFactory().getPointsDao().getPointsByLongueur(longueur);
					longueur.setPoints(vPoints);
				}
			}
		}
		return vSite;
	}

	public List<Sites> getSiteByTopos(Topos vTopo) {
		return getDaoFactory().getSitesDao().getSiteByTopos(vTopo);
	}

	public List<Sites> getSearchSite(String name) {
		return getDaoFactory().getSitesDao().getSearchSite(name);
	}
	
	@Transactional(value="txManagerSite")
	public void AddSite(final String name, final String idtopo, final String description) {
	
		TransactionTemplate vTransactionTemplate = new TransactionTemplate(getPlatformTransactionManager());
	
		vTransactionTemplate.execute(new TransactionCallbackWithoutResult() {

			@Override
			protected void doInTransactionWithoutResult(TransactionStatus status) {
				
				getDaoFactory().getSitesDao().AddSite(name, idtopo, description);
			};
		});
	}

	public Sites getTopos(String idtopo) {

		return null;
	}
}
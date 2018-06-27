package org.projet.escalade.business.impl;

import java.util.List;

import org.projet.escalade.business.contract.SitesManager;
import org.projet.escalade.model.Longueur;
import org.projet.escalade.model.Points;
import org.projet.escalade.model.Secteur;
import org.projet.escalade.model.Sites;
import org.projet.escalade.model.Topos;
import org.projet.escalade.model.Voie;

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

	public Sites getAddSite(String name, int id_topo, String description) {
		return getDaoFactory().getSitesDao().getAddSite(name, id_topo, description);
	}
}

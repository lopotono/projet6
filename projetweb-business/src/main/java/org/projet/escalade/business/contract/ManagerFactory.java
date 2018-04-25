package org.projet.escalade.business.contract;

public interface ManagerFactory {

    ToposManager getToposManager();

	SitesManager getSitesManager();

	SecteurManager getSecteurManager();

	VoieManager getVoieManager();
}

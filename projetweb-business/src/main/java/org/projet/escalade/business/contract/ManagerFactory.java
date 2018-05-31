package org.projet.escalade.business.contract;

public interface ManagerFactory {

    ToposManager getToposManager();

	SitesManager getSitesManager();

	SecteurManager getSecteurManager();
	
	UserManager getUserManager();
	
	AjouttopoManager getAjouttopoManager();
	
	VoieManager getVoieManager();

	LongueurManager getLongueurManager();
	
	PointsManager getPointsManager();
}

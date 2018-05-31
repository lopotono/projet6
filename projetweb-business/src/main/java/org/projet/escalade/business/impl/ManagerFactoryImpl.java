package org.projet.escalade.business.impl;

import org.projet.escalade.business.contract.*;

public class ManagerFactoryImpl implements ManagerFactory {

	private ToposManager toposManager;
    public ToposManager getToposManager() {
        return this.toposManager;
    }
    public void setToposManager(ToposManager toposManager) {
        this.toposManager = toposManager;
    }
        
    private SitesManager sitesManager;
    public SitesManager getSitesManager() {
    	return this.sitesManager;
    }
    public void setSitesManager(SitesManager sitesManager) {
    	this.sitesManager = sitesManager;
    }
    
    private SecteurManager secteurManager;
	public SecteurManager getSecteurManager() {
		return secteurManager;
	}
	public void setSecteurManager(SecteurManager secteurManager) {
    	this.secteurManager = secteurManager;
    }
	
	private UserManager userManager;
	public UserManager getUserManager() {
		return this.userManager;
	}
	public void setUserManager(UserManager userManager) {
		this.userManager = userManager;
	}
		
	private AjouttopoManager ajouttopoManager;
	public AjouttopoManager getAjouttopoManager() {
		return this.ajouttopoManager;
	}
	public void setAjouttopoManager(AjouttopoManager ajouttopoManager) {
		this.ajouttopoManager = ajouttopoManager;
	}
	
	private VoieManager voieManager;
	public VoieManager getVoieManager() {
		return this.voieManager;
	}
	public void setVoieManager(VoieManager voieManager) {
		this.voieManager = voieManager;
	}
	
	private LongueurManager longueurManager;
	public LongueurManager getLongueurManager() {
		return this.longueurManager;
	}
	public void setLongueurManager(LongueurManager longueurManager) {
		this.longueurManager = longueurManager;
	}
	
	private PointsManager pointsManager;
	public PointsManager getPointsManager() {
		return this.pointsManager;
	}
	public void setPointsManager(PointsManager pointsManager) {
		this.pointsManager = pointsManager;
	}	
}

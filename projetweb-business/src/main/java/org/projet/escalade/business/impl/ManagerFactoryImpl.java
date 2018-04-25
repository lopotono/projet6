package org.projet.escalade.business.impl;

import org.projet.escalade.business.contract.ManagerFactory;
import org.projet.escalade.business.contract.SecteurManager;
import org.projet.escalade.business.contract.SitesManager;
import org.projet.escalade.business.contract.ToposManager;
import org.projet.escalade.business.contract.VoieManager;

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
	
	private VoieManager voieManager;
	public VoieManager getVoieManager() {
		return voieManager;
	}
	public void setVoieManager(VoieManager voieManager) {
    	this.voieManager = voieManager;
    }	
}

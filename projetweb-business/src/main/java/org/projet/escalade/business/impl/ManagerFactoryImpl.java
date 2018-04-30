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
	
	private CommentaireManager commentaireManager;
	public CommentaireManager getCommentaireManager() {
		return this.commentaireManager;
	}
	public void setCommentaireManager(CommentaireManager commentaireManager) {
		this.commentaireManager = commentaireManager;
	}			
}

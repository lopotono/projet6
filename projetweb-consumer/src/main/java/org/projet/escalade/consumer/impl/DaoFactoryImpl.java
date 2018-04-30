package org.projet.escalade.consumer.impl;

import org.projet.escalade.consumer.contract.CommentaireDAO;
import org.projet.escalade.consumer.contract.DaoFactory;
import org.projet.escalade.consumer.contract.SecteurDAO;
import org.projet.escalade.consumer.contract.SitesDAO;
import org.projet.escalade.consumer.contract.TopoDAO;
import org.projet.escalade.consumer.contract.UserDAO;

public class DaoFactoryImpl implements DaoFactory {
	
    private TopoDAO topoDao;
    private SecteurDAO secteurDao;
    private SitesDAO sitesDao;
    private UserDAO userDao;
    private CommentaireDAO commentaireDAO;
 
    
    public TopoDAO getTopoDao() {
    	return topoDao;
    }
    
    public void setTopoDao(TopoDAO topoDao) {
		this.topoDao = topoDao;
	}

	public SecteurDAO getSecteurDao() {
		return secteurDao;
	}
	
	public void setSecteurDao(SecteurDAO secteurDao) {
		this.secteurDao = secteurDao;
	}

	public SitesDAO getSitesDao() {
		return sitesDao;
	}
	
	public void setSitesDAO(SitesDAO sitesDAO) {
		this.sitesDao = sitesDAO;
	}

	public UserDAO getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDAO userDao) {
		this.userDao = userDao;
	}

	public CommentaireDAO getCommentaireDao() {
		return commentaireDAO;
	}
	
	public void setCommentaireDAO(CommentaireDAO commentaireDAO) {
		this.commentaireDAO = commentaireDAO;
	}
}

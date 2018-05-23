package org.projet.escalade.consumer.impl;

import org.projet.escalade.consumer.contract.DaoFactory;
import org.projet.escalade.consumer.contract.LongueurDAO;
import org.projet.escalade.consumer.contract.SecteurDAO;
import org.projet.escalade.consumer.contract.SitesDAO;
import org.projet.escalade.consumer.contract.TopoDAO;
import org.projet.escalade.consumer.contract.UserDAO;
import org.projet.escalade.consumer.contract.VoieDAO;

public class DaoFactoryImpl implements DaoFactory {

	private TopoDAO topoDao;
	private SecteurDAO secteurDao;
	private SitesDAO sitesDao;
	private UserDAO userDao;
	private VoieDAO voieDao;
	private LongueurDAO longueurDao;
	
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
	public void setSitesDao(SitesDAO sitesDao) {
		this.sitesDao = sitesDao;
	}
	public UserDAO getUserDao() {
		return userDao;
	}
	public void setUserDao(UserDAO userDao) {
		this.userDao = userDao;
	}
	public VoieDAO getVoieDao() {
		return voieDao;
	}
	public void setVoieDao(VoieDAO voieDao) {
		this.voieDao = voieDao;
	}
	public LongueurDAO getLongueurDao() {
		return longueurDao;
	}
	public void setLongueurDao(LongueurDAO longueurDao) {
		this.longueurDao = longueurDao;
	}
}

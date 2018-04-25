package org.projet.escalade.consumer.impl;

import org.projet.escalade.consumer.contract.DaoFactory;
import org.projet.escalade.consumer.contract.SecteurDAO;
import org.projet.escalade.consumer.contract.SitesDAO;
import org.projet.escalade.consumer.contract.TopoDAO;
import org.projet.escalade.consumer.contract.VoieDAO;

public class DaoFactoryImpl implements DaoFactory {
	
    private TopoDAO topoDao;
    private VoieDAO voieDao;
    private SecteurDAO secteurDao;
    private SitesDAO sitesDao;
 
    
    public TopoDAO getTopoDao() {
    	return topoDao;
    }
    
    public void setTopoDao(TopoDAO topoDao) {
		this.topoDao = topoDao;
	}

	public VoieDAO getVoieDao() {
		return voieDao;
	}
	
	public void setVoieDao(VoieDAO voieDAO) {
		this.voieDao = voieDAO;
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
}

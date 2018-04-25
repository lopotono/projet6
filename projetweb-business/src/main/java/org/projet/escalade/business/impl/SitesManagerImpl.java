package org.projet.escalade.business.impl;

import java.util.List;

import org.projet.escalade.business.contract.SitesManager;
import org.projet.escalade.model.Sites;
import org.projet.escalade.model.exception.NotFoundException;

public class SitesManagerImpl extends AbstractManager implements SitesManager{

	public List<Sites> getListSites() {
		return getDaoFactory().getSitesDao().getSites();
	}

	public Sites getSites(Integer pID) throws NotFoundException {
		return null;
	}		
}

package org.projet.escalade.business.impl;

import java.util.List;

import org.projet.escalade.business.contract.SitesManager;
import org.projet.escalade.model.Sites;

public class SitesManagerImpl extends AbstractManager implements SitesManager{

	public List<Sites> getListSites() {
		return getDaoFactory().getSitesDao().getSites();
	}		
}

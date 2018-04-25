package org.projet.escalade.business.contract;

import java.util.List;

import org.projet.escalade.model.Sites;
import org.projet.escalade.model.exception.NotFoundException;

public interface SitesManager {

	List<Sites> getListSites();
	
	Sites getSites(Integer pID) throws NotFoundException;
}

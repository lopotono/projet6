package org.projet.escalade.business.contract;

import java.util.List;

import org.projet.escalade.model.Sites;
import org.projet.escalade.model.Topos;

public interface SitesManager {

	List<Sites> getListSites();
	
	Sites getSite(int id);
	
	List<Sites> getSiteByTopos(Topos vTopo);

	List<Sites> getSearchSite(String name);
	
	void AddSite(String name, int id_topo, String description);
}
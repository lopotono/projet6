package org.projet.escalade.consumer.contract;

import java.util.List;

import org.projet.escalade.model.Sites;
import org.projet.escalade.model.Topos;

public interface SitesDAO {
	
	List<Sites> getSites();
	
	Sites getSite(int id);

	List<Sites> getSiteByTopos(Topos vTopo);

	List<Sites> getSearchSite(String name);

	void AddSite(String name, String idtopo, String description);
}
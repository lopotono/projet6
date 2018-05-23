package org.projet.escalade.consumer.contract;

import java.util.List;

import org.projet.escalade.model.Sites;

public interface SitesDAO {
	
	List<Sites> getSites();
	
	Sites getSite(int id);
}


package org.projet.escalade.consumer.impl;

import java.util.List;

import org.projet.escalade.consumer.contract.SitesDAO;
import org.projet.escalade.consumer.impl.rawmapper.SiteRawMapper;
import org.projet.escalade.model.Sites;

public class SitesDAOImpl extends AbstractDAO implements SitesDAO {
	
	public SitesDAOImpl() {
		
	}

	public List<Sites> getSites() {
		
		String vSQL = "SELECT * FROM site_escalade";
		
		SiteRawMapper vRowMapper = new SiteRawMapper(); 
		
		List<Sites> vListSites = getJdbcTemplate().query(vSQL, vRowMapper);

		return vListSites;
	}

	public Sites getSite(int id) {
		
		String vSQL = "SELECT * FROM site_escalade WHERE id_site_escalade="+id;

		SiteRawMapper vRowMapper = new SiteRawMapper();

		List<Sites> vListSites = getJdbcTemplate().query(vSQL, vRowMapper);

		return vListSites.get(0);
	}
}

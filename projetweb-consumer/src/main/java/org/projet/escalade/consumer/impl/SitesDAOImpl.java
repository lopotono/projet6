package org.projet.escalade.consumer.impl;

import java.util.List;

import org.projet.escalade.consumer.contract.SitesDAO;
import org.projet.escalade.consumer.impl.rawmapper.SiteRawMapper;
import org.projet.escalade.model.Sites;
import org.projet.escalade.model.Topos;

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

	public List<Sites> getSiteByTopos(Topos vTopo) {
		
		String vSQL = "SELECT * FROM site_escalade WHERE id_topo=" + vTopo.getId();
		
		SiteRawMapper vRowMapper = new SiteRawMapper();
		
		List<Sites> vListSites = getJdbcTemplate().query(vSQL, vRowMapper);
		
		return vListSites;
	}

	public List<Sites> getSearchSite(String name) {
		
		String vSQL = "SELECT * FROM site_escalade WHERE nom_site LIKE '%"+ name + "%'";
		
		SiteRawMapper vRowMapper = new SiteRawMapper();
		
		List<Sites> sites = getJdbcTemplate().query(vSQL, vRowMapper);
		
		return sites;
	}
}

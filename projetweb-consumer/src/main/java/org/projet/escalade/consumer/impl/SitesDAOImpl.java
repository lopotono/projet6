package org.projet.escalade.consumer.impl;

import java.sql.Types;
import java.util.List;

import org.projet.escalade.consumer.contract.SitesDAO;
import org.projet.escalade.consumer.impl.rawmapper.SiteRawMapper;
import org.projet.escalade.model.Sites;
import org.projet.escalade.model.Topos;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

public class SitesDAOImpl extends AbstractDAO implements SitesDAO {

	public SitesDAOImpl() {
		
	}

	public List<Sites> getSites() {
		
		String vSQL = "SELECT * FROM site_escalade ORDER BY nom_site";
		
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
		
		String vSQL = "SELECT * FROM site_escalade WHERE LOWER(nom_site) LIKE '%"+ name + "%'";
	
		SiteRawMapper vRowMapper = new SiteRawMapper();
		
		List<Sites> sites = getJdbcTemplate().query(vSQL, vRowMapper);
		
		return sites;
		
	}
	
	public void AddSite(String name, int id_topo, String description) {
										
		String vSQL = "INSERT INTO site_escalade (nom_site, id_topo, description) VALUES (:nom_site,:id_topo,:description)";
		//String vSQL = "INSERT INTO site_escalade (nom_site, id_topo, description) VALUES ('"+ name +"',"+ id_topo +",'"+ description +"')";
		MapSqlParameterSource vParams = new MapSqlParameterSource();
		vParams.addValue("nom_site", name, Types.VARCHAR);
		vParams.addValue("id_topo", id_topo, Types.INTEGER);
		vParams.addValue("description", description, Types.VARCHAR);
		
		NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());
			
		try {
			vJdbcTemplate.update(vSQL, vParams);
			System.out.println("Le site "+ name +" est bien ajouté !");
		} catch (DuplicateKeyException vEx) {
			System.out.println("Le site "+ name +" existe déjà !");			
		}
		//getJdbcTemplate().update(vSQL);
	}
}	
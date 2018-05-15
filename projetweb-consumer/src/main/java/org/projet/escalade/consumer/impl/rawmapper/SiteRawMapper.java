package org.projet.escalade.consumer.impl.rawmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import org.projet.escalade.model.Sites;

public class SiteRawMapper implements RowMapper<Sites> {
	
	public Sites mapRow(ResultSet pRS, int pRowNum) throws SQLException {
		Sites vSites = new Sites();
		vSites.setSitesid(pRS.getInt("id_site_escalade"));
		vSites.setSitesname(pRS.getString("nom_site"));
		return vSites;
	}
}

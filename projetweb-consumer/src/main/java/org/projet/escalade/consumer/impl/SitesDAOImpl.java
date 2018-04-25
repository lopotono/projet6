package org.projet.escalade.consumer.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.projet.escalade.consumer.contract.SitesDAO;
import org.projet.escalade.model.Sites;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class SitesDAOImpl extends AbstractDAO implements SitesDAO {
	
	public List<Sites> getSites() {
		String vSQL = "SELECT * FROM site_escalade";
		
		JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
		
		RowMapper<Sites> vRowMapper = new RowMapper<Sites>() {
			public Sites mapRow(ResultSet pRS, int pRowNum) throws SQLException {
				Sites vSites = new Sites();
				vSites.setSitesid(pRS.getInt("id_site_escalade"));
				vSites.setSitesname(pRS.getString("nom_site"));
				return vSites;
			}		
		};
		
		List<Sites> vListSites = vJdbcTemplate.query(vSQL, vRowMapper);

        return vListSites;		
	}

}

package org.projet.escalade.consumer.impl;

import java.util.List;

import org.projet.escalade.consumer.contract.SecteurDAO;
import org.projet.escalade.consumer.impl.rawmapper.SecteurRawMapper;
import org.projet.escalade.model.Secteur;
import org.projet.escalade.model.Sites;
import org.springframework.jdbc.core.JdbcTemplate;

public class SecteurDAOImpl extends AbstractDAO implements SecteurDAO {

	public SecteurDAOImpl() {
		setJdbcTemplate(new JdbcTemplate(getDataSource()));
	}

	public List<Secteur> getSecteur() {
		String vSQL = "SELECT * FROM secteur";

		SecteurRawMapper vRowMapper = new SecteurRawMapper();

		List<Secteur> vListSecteur = getJdbcTemplate().query(vSQL, vRowMapper);

		return vListSecteur;
	}

	public List<Secteur> getSecteurBySite(Sites vSite) {

		String vSQL = "SELECT * FROM secteur WHERE id_site_escalade="+vSite.getSitesid();
		
		SecteurRawMapper vRowMapper = new SecteurRawMapper();
		
		List<Secteur> vListSecteur = getJdbcTemplate().query(vSQL, vRowMapper);
		
		return vListSecteur;	
	}
}

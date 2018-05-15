package org.projet.escalade.consumer.impl.rawmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.projet.escalade.consumer.contract.SitesDAO;
import org.projet.escalade.consumer.impl.SitesDAOImpl;
import org.projet.escalade.model.Secteur;
import org.projet.escalade.model.Sites;
import org.springframework.jdbc.core.RowMapper;

public class SecteurRawMapper implements RowMapper<Secteur> {

	public Secteur mapRow(ResultSet pRS, int pRowNum) throws SQLException {
		Secteur vSecteur = new Secteur();
		vSecteur.setSecteurid(pRS.getInt("id_secteur"));
		vSecteur.setSecteurname(pRS.getString("nom_secteur"));
		SitesDAO sitesDAO = new SitesDAOImpl();
		Sites site = sitesDAO.getSite(pRS.getInt("id_site_escalade"));
		vSecteur.setSite(site);
		return vSecteur;
	}
}

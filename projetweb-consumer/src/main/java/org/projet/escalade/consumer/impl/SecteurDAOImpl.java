package org.projet.escalade.consumer.impl;

import java.sql.Types;
import java.util.List;

import org.projet.escalade.consumer.contract.SecteurDAO;
import org.projet.escalade.consumer.impl.rawmapper.SecteurRawMapper;
import org.projet.escalade.model.Secteur;
import org.projet.escalade.model.Sites;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

public class SecteurDAOImpl extends AbstractDAO implements SecteurDAO {

	public SecteurDAOImpl() {

	}

	public List<Secteur> getSecteur() {
		String vSQL = "SELECT * FROM secteur";

		SecteurRawMapper vRowMapper = new SecteurRawMapper();

		List<Secteur> vListSecteur = getJdbcTemplate().query(vSQL, vRowMapper);

		return vListSecteur;
	}

	public List<Secteur> getSecteurBySite(Sites vSite) {

		String vSQL = "SELECT * FROM secteur WHERE id_site_escalade=" + vSite.getSitesid();

		SecteurRawMapper vRowMapper = new SecteurRawMapper();

		List<Secteur> vListSecteur = getJdbcTemplate().query(vSQL, vRowMapper);

		return vListSecteur;
	}

	public Secteur getSecteur(int id) {
		
		String vSQL = "SELECT * FROM secteur WHERE id_secteur="+id;
		
		SecteurRawMapper vRowMapper = new SecteurRawMapper();
		
		List<Secteur> vListSecteur = getJdbcTemplate().query(vSQL, vRowMapper);
		
		return vListSecteur.get(0);
	}

	public List<Secteur> getSearchSecteur(String name) {
		
		String vSQL = "SELECT * FROM secteur WHERE LOWER(nom_secteur) LIKE '%"+ name + "%'";
		
		SecteurRawMapper vRowMapper = new SecteurRawMapper();
		
		List<Secteur> secteur = getJdbcTemplate().query(vSQL, vRowMapper);
		
		return secteur;
	}

	public void AddSecteur(String name, String idsites) {
		
		String vSQL = "INSERT INTO secteur (nom_secteur, id_site_escalade) VALUES (:nom_secteur,:id_site_escalade)";
		
		MapSqlParameterSource vParams = new MapSqlParameterSource();
		vParams.addValue("nom_secteur", name, Types.VARCHAR);
		vParams.addValue("id_site_escalade", idsites, Types.INTEGER);
			
		NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());
			
		try {
			vJdbcTemplate.update(vSQL, vParams);
			System.out.println("Le secteur "+ name + "est bien ajouté");
		} catch (DuplicateKeyException vEx) {
			System.out.println("Le secteur "+ name +" existe déjà !");
		}
	}
}

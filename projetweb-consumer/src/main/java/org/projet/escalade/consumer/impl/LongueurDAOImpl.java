package org.projet.escalade.consumer.impl;

import java.sql.Types;
import java.util.List;

import org.projet.escalade.consumer.contract.LongueurDAO;
import org.projet.escalade.consumer.impl.rawmapper.LongueurRawMapper;
import org.projet.escalade.model.Longueur;
import org.projet.escalade.model.Voie;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

public class LongueurDAOImpl extends AbstractDAO implements LongueurDAO {
	
	public LongueurDAOImpl() {
		
	}
	
	public List<Longueur> getLongueur() {
		String vSQL = "SELECT * FROM longueur";
		
		LongueurRawMapper vRowMapper = new LongueurRawMapper();
		
		List<Longueur> vListLongueur = getJdbcTemplate().query(vSQL, vRowMapper);
		
		return vListLongueur;	
	}
	
	public List<Longueur> getLongueurByVoie(Voie vVoie) {
		
		String vSQL = "SELECT * FROM longueur WHERE id_voie="+vVoie.getId();
		
		LongueurRawMapper vRowMapper = new LongueurRawMapper();
		
		List<Longueur> vListLongueur = getJdbcTemplate().query(vSQL, vRowMapper);
		
		return vListLongueur;
	}

	public Longueur getLongueur(int id) {
		
		String vSQL = "SELECT * FROM longueur WHERE id_longueur="+id;
		
		LongueurRawMapper vRowMapper = new LongueurRawMapper();
		
		List<Longueur> vListLongueur = getJdbcTemplate().query(vSQL, vRowMapper);
		
		return vListLongueur.get(0);
	}

	public void AddLongueur(int id, int nblongueur, int id_voie) {
		
		String vSQL = "INSERT INTO longueur (id_longueur, nombre_longueur, id_voie) VALUES (:id_longueur,:nombre_longueur,:id_voie)";
		MapSqlParameterSource vParams = new MapSqlParameterSource();
		vParams.addValue("id_longueur", id, Types.INTEGER);
		vParams.addValue("nombre_longueur", nblongueur, Types.INTEGER);
		vParams.addValue("id_voie", id_voie, Types.INTEGER);
		
		NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());
			
		try {
			vJdbcTemplate.update(vSQL, vParams);
			System.out.println("La longueur est bien ajoutée !");
		} catch (DuplicateKeyException vEx) {
			System.out.println("La longueur existe déjà !");			
		}
	}
}
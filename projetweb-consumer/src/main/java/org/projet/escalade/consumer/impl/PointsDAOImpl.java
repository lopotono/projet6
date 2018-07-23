package org.projet.escalade.consumer.impl;

import java.sql.Types;
import java.util.List;

import org.projet.escalade.consumer.contract.PointsDAO;
import org.projet.escalade.consumer.impl.rawmapper.PointsRawMapper;
import org.projet.escalade.model.Longueur;
import org.projet.escalade.model.Points;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

public class PointsDAOImpl extends AbstractDAO implements PointsDAO {
	
	public PointsDAOImpl() {
		
	}
	
	public List<Points> getPoints() {
		
		String vSQL = "SELECT * FROM points";
		
		PointsRawMapper vRowMapper = new PointsRawMapper();
		
		List<Points> vListPoints = getJdbcTemplate().query(vSQL, vRowMapper);
		
		return vListPoints;
	}
	
	public List<Points> getPointsByLongueur(Longueur vLongueur) {
		
		String vSQL = "SELECT * FROM points WHERE id_longueur="+vLongueur.getId();
	
		PointsRawMapper vRowMapper = new PointsRawMapper();
		
		List<Points> vListPoints = getJdbcTemplate().query(vSQL, vRowMapper);
		
		return vListPoints;		
	}

	public Points getPoints(int id) {
		
		String vSQL = "SELECT * FROM points WHERE id_points="+id;
		
		PointsRawMapper vRowMapper = new PointsRawMapper();
		
		List<Points> vListPoints = getJdbcTemplate().query(vSQL, vRowMapper);
		
		return vListPoints.get(0);
	}

	public void AddPoints(int id, int nbpoints, int id_longueur) {
	
		String vSQL = "INSERT INTO points (id_points, nombre_points, id_longueur) VALUES (:id_points,:nombre_points,:id_longueur)";
		MapSqlParameterSource vParams = new MapSqlParameterSource();
		vParams.addValue("id_points", id, Types.INTEGER);
		vParams.addValue("nombre_points", nbpoints, Types.INTEGER);
		vParams.addValue("id_longueur", id_longueur, Types.INTEGER);
		
		NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());
			
		try {
			vJdbcTemplate.update(vSQL, vParams);
			System.out.println("Les points sont bien ajoutés !");
		} catch (DuplicateKeyException vEx) {
			System.out.println("Les points existent déjà !");			
		}		
	}
}
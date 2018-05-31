package org.projet.escalade.consumer.impl;

import java.util.List;

import org.projet.escalade.consumer.contract.PointsDAO;
import org.projet.escalade.consumer.impl.rawmapper.PointsRawMapper;
import org.projet.escalade.model.Longueur;
import org.projet.escalade.model.Points;

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
		System.out.println(vSQL);
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
}

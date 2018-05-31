package org.projet.escalade.consumer.impl.rawmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.projet.escalade.model.Points;
import org.springframework.jdbc.core.RowMapper;

public class PointsRawMapper implements RowMapper<Points> {
	
	public Points mapRow(ResultSet pRS, int pRowNum) throws SQLException {
		Points vPoints = new Points();
		vPoints.setPointsnombre(pRS.getInt("nombre_points"));
		return vPoints;		
	}
}

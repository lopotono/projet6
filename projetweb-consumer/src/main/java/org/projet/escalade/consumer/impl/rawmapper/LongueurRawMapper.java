package org.projet.escalade.consumer.impl.rawmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.projet.escalade.model.Longueur;
import org.springframework.jdbc.core.RowMapper;

public class LongueurRawMapper implements RowMapper<Longueur> {

	public Longueur mapRow(ResultSet pRS, int pRowNum) throws SQLException {
		Longueur vLongueur = new Longueur();
		vLongueur.setLongueurnombre(pRS.getInt("nombre_longueur"));
		return vLongueur;
	}
}

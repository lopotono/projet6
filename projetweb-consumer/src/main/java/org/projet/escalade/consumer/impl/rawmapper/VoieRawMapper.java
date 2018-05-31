package org.projet.escalade.consumer.impl.rawmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.projet.escalade.model.Voie;
import org.springframework.jdbc.core.RowMapper;

public class VoieRawMapper implements RowMapper<Voie> {
	
	public Voie mapRow(ResultSet pRS, int pRowNum) throws SQLException {
		Voie vVoie = new Voie();
		vVoie.setId(pRS.getInt("id_voie"));
		vVoie.setVoiehauteur(pRS.getInt("hauteur"));
		vVoie.setVoienumerocotation(pRS.getInt("numero_cotation"));
		vVoie.setVoienombrepoints(pRS.getInt("nombre_points"));	
		return vVoie;
	}
}

package org.projet.escalade.consumer.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.projet.escalade.consumer.contract.VoieDAO;
import org.projet.escalade.model.Voie;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class VoieDAOImpl extends AbstractDAO implements VoieDAO {
	
	public List<Voie> getVoie() {
		String vSQL = "SELECT * FROM voie";
		
		JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
		
		RowMapper<Voie> vRowMapper = new RowMapper<Voie>() {
            public Voie mapRow(ResultSet pRS, int pRowNum) throws SQLException {
                Voie vVoie = new Voie();
                vVoie.setVoiehauteur(pRS.getInt("hauteur"));
                vVoie.setVoienumerocotation(pRS.getInt("numero_cotation"));
                vVoie.setVoienombrepoints(pRS.getInt("nombre_points"));
                return vVoie;
            }
		};
		
		List<Voie> vListVoie = vJdbcTemplate.query(vSQL, vRowMapper);
		
		return vListVoie;		
	}
}

package org.projet.escalade.consumer.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.projet.escalade.consumer.contract.SecteurDAO;
import org.projet.escalade.model.Secteur;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class SecteurDAOImpl extends AbstractDAO implements SecteurDAO{
	
	public List<Secteur> getSecteur() {
		String vSQL = "SELECT * FROM secteur";
		
		JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
		
		RowMapper<Secteur> vRowMapper = new RowMapper<Secteur>() {
			public Secteur mapRow(ResultSet pRS, int pRowNum) throws SQLException {
				Secteur vSecteur = new Secteur();
				vSecteur.setSecteurid(pRS.getInt("id"));
				vSecteur.setSecteurname(pRS.getString("secteurname"));
				return vSecteur;
			}		
		};
		
		List<Secteur> vListSecteur = vJdbcTemplate.query(vSQL, vRowMapper);

        return vListSecteur;		
	}
}

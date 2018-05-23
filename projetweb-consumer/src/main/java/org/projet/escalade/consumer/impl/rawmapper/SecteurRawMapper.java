package org.projet.escalade.consumer.impl.rawmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.projet.escalade.model.Secteur;
import org.springframework.jdbc.core.RowMapper;

public class SecteurRawMapper implements RowMapper<Secteur> {

	public Secteur mapRow(ResultSet pRS, int pRowNum) throws SQLException {
		Secteur vSecteur = new Secteur();
		vSecteur.setSecteurid(pRS.getInt("id_secteur"));
		vSecteur.setSecteurname(pRS.getString("nom_secteur"));
		return vSecteur;
	}
}

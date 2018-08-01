package org.projet.escalade.consumer.impl.rawmapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import org.projet.escalade.model.Emprunttopo;

public class EmpruntRawMapper implements RowMapper<Emprunttopo> {
	
	public Emprunttopo mapRow(ResultSet pRS, int pRowNum) throws SQLException {
		Emprunttopo vEmprunttopo = new Emprunttopo();
		vEmprunttopo.setIdemprunt(pRS.getInt("id_emprunt_topo"));
		vEmprunttopo.setDatedebut(pRS.getDate("date_debut_emprunt"));
		vEmprunttopo.setDatefin(pRS.getDate("date_fin_emprunt"));
		return vEmprunttopo;
	}
}
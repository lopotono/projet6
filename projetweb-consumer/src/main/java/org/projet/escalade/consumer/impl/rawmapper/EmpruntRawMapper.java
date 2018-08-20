package org.projet.escalade.consumer.impl.rawmapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;

import org.springframework.jdbc.core.RowMapper;
import org.projet.escalade.model.Emprunttopo;

public class EmpruntRawMapper implements RowMapper<Emprunttopo> {
	
	public Emprunttopo mapRow(ResultSet pRS, int pRowNum) throws SQLException {
		Emprunttopo vEmprunttopo = new Emprunttopo();
		vEmprunttopo.setIdemprunt(pRS.getInt("id_emprunt_topo"));
		Calendar cal = Calendar.getInstance();
		cal.setTime(pRS.getDate("date_debut_emprunt"));
		vEmprunttopo.setDatedebut(cal);
		Calendar cal1 = Calendar.getInstance();
		cal1.setTime(pRS.getDate("date_fin_emprunt"));
		vEmprunttopo.setDatefin(cal1);
		vEmprunttopo.setId_topo(pRS.getString("id_topo"));
		return vEmprunttopo;
	}
}
package org.projet.escalade.consumer.impl.rawmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.projet.escalade.model.Topos;
import org.springframework.jdbc.core.RowMapper;

public class TopoRawMapper implements RowMapper<Topos> {

	public Topos mapRow(ResultSet pRS, int pRowNum) throws SQLException {
		Topos vTopos = new Topos();
		vTopos.setId(pRS.getInt("id_topo"));
		vTopos.setToposname(pRS.getString("nom_topo"));
		vTopos.setTopodispo(pRS.getBoolean("topo_disponible"));
		return vTopos;
	}
}

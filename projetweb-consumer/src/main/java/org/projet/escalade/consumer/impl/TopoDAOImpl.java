package org.projet.escalade.consumer.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.projet.escalade.consumer.contract.TopoDAO;
import org.projet.escalade.model.Topos;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class TopoDAOImpl extends AbstractDAO implements TopoDAO {
	
	public List<Topos> getTopos() {
		String vSQL = "SELECT * FROM topo";
		
		JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
		
		RowMapper<Topos> vRowMapper = new RowMapper<Topos>() {
			public Topos mapRow(ResultSet pRS, int pRowNum) throws SQLException {
				Topos vTopos = new Topos();
				vTopos.setToposname(pRS.getString("nom_topo"));
				vTopos.setTopodispo(pRS.getBoolean("topo_disponible"));
				return vTopos;
			}
		};	
		List<Topos> vListTopos= vJdbcTemplate.query(vSQL, vRowMapper);
		
		return vListTopos;		
	}				
}

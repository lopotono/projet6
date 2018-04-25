package org.projet.escalade.consumer.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.projet.escalade.consumer.contract.ResponsableDAO;
import org.projet.escalade.model.Responsable;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class ResponsableDAOImpl extends AbstractDAO implements ResponsableDAO {

	public List<Responsable> getResponsable() {
		
		String vSQL = "SELECT * FROM responsable";

        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());

        RowMapper<Responsable> vRowMapper = new RowMapper<Responsable>() {
            public Responsable mapRow(ResultSet pRS, int pRowNum) throws SQLException {
            	Responsable vResponsable = new Responsable();
                vResponsable.setId(pRS.getInt("id"));
                vResponsable.setResponsablename(pRS.getString("responsablename"));
              
                return vResponsable;
            }
        };

        List<Responsable> vListResponsable = vJdbcTemplate.query(vSQL, vRowMapper);
     
		return vListResponsable;
	}		
}

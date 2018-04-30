package org.projet.escalade.consumer.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.projet.escalade.consumer.contract.UserDAO;
import org.projet.escalade.model.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;


public class UserDAOImpl extends AbstractDAO implements UserDAO {
	
	public List<User> getUser() {
		String vSQL = "SELECT * FROM utilisateur";
		
		JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
		
		RowMapper<User> vRowMapper = new RowMapper<User>() {
			public User mapRow(ResultSet pRS, int pRowNum) throws SQLException {
				User vUser = new User();
				vUser.setUsername(pRS.getString("nom_user"));
				vUser.setUserprenom(pRS.getString("prenom_user"));
				return vUser;
			}
		};
		List<User> vListUser = vJdbcTemplate.query(vSQL, vRowMapper);
		
		return vListUser;
	}
}

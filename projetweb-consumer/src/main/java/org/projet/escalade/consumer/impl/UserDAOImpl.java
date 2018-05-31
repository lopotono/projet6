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
				vUser.setUsermail(pRS.getString("mail_user"));
				vUser.setUseradresse(pRS.getString("adresse"));
				vUser.setUsercodepostal(pRS.getInt("code_postal"));
				vUser.setUserville(pRS.getString("ville"));
				return vUser;
			}
		};
		List<User> vListUser = vJdbcTemplate.query(vSQL, vRowMapper);
		
		return vListUser;
	}

	public void creer(User user) {
		// TODO Auto-generated method stub
		
	}

	public User trouver(String username) {
		// TODO Auto-generated method stub
		return null;
	}
}


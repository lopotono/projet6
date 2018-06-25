package org.projet.escalade.consumer.impl;

import java.util.List;

import org.projet.escalade.consumer.contract.UserDAO;
import org.projet.escalade.consumer.impl.rawmapper.UserRawMapper;
import org.projet.escalade.model.User;

public class UserDAOImpl extends AbstractDAO implements UserDAO {
	
	public List<User> getUser() {
		
		String vSQL = "SELECT * FROM utilisateur";		
				
		UserRawMapper vRowMapper = new UserRawMapper(); 
		
		List<User> vListUser = getJdbcTemplate().query(vSQL, vRowMapper);
		
		return vListUser;
	}
	
	public User getUser(int id) {
		
		String vSQL = "SELECT * FROM utilisateur WHERE id_user="+id;
		
		UserRawMapper vRowMapper = new UserRawMapper(); 
		
		List<User> vListUser = getJdbcTemplate().query(vSQL, vRowMapper);
		
		return vListUser.get(0);		
	}

	public User getUser(String name, String password) {
		
		String vSQL = "SELECT * FROM utilisateur WHERE nom_user='"+ name + "' AND mot_de_passe='" + password + "'";
		System.out.println(vSQL);
		UserRawMapper vRowMapper = new UserRawMapper();
		
		List<User> user = getJdbcTemplate().query(vSQL, vRowMapper);
		
		if (user.isEmpty()) {
			return null;
		}
		return user.get(0);
	}
}


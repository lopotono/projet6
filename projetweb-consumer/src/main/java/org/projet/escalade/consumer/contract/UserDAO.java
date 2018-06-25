package org.projet.escalade.consumer.contract;

import java.util.List;

import org.projet.escalade.model.User;

public interface UserDAO {

	List<User> getUser();
	
	User getUser(int id);

	User getUser(String name, String password);
}


package org.projet.escalade.business.contract;

import java.util.List;

import org.projet.escalade.model.User;

public interface UserManager {

	List<User> getListUser();

	User getUsers(Integer id);

	User getUser(String name, String password);	
}

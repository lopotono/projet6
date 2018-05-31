package org.projet.escalade.business.contract;

import java.util.List;

import org.projet.escalade.model.User;

public interface UserManager {

	List<User> getListUser();

	User getUser(String login, String password);

	User getUsers(Integer id);	
}

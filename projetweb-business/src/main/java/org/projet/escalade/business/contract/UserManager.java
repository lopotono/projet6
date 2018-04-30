package org.projet.escalade.business.contract;

import java.util.List;

import org.projet.escalade.model.User;
import org.projet.escalade.model.exception.NotFoundException;

public interface UserManager {

	public List<User> getListUser();

	public User getUser(String login, String password);
	
	User getUser(Integer pID) throws NotFoundException;
}

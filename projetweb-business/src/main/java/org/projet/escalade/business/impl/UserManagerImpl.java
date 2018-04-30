package org.projet.escalade.business.impl;

import java.util.List;

import org.projet.escalade.business.contract.UserManager;
import org.projet.escalade.model.User;
import org.projet.escalade.model.exception.NotFoundException;

public class UserManagerImpl extends AbstractManager implements UserManager {

	public User getUser(String login, String password) {
		return getUser(login, password);
	}

	public List<User> getListUser() {
		return getDaoFactory().getUserDao().getUser();
	}

	public User getUser(Integer pID) throws NotFoundException {
		// TODO Auto-generated method stub
		return null;
	}
}

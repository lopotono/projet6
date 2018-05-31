package org.projet.escalade.business.impl;

import java.util.List;

import org.projet.escalade.business.contract.UserManager;
import org.projet.escalade.model.User;

public class UserManagerImpl extends AbstractManager implements UserManager {

	public User getUser(String username, String usermotdepasse) {
		return getUser(username, usermotdepasse);
	}

	public List<User> getListUser() {
		return getDaoFactory().getUserDao().getUser();
	}

	public User getUsers(Integer id) {
		return getUsers(id);
	}
}

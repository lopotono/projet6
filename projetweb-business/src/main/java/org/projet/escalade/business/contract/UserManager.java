package org.projet.escalade.business.contract;

import org.projet.escalade.model.User;

public interface UserManager {

	User getUser(String login, String password);

}

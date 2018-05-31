package org.projet.escalade.business.contract;

import java.util.List;

import org.projet.escalade.model.Sites;
import org.projet.escalade.model.Topos;
import org.projet.escalade.model.User;

public interface ToposManager {

	List<Topos> getListTopos();

	Topos getTopo(int id);
	
	List<Topos> getToposBySite(Sites vSite);
	
	List<Topos> getToposByUser(User vUser);
}

package org.projet.escalade.business.impl;

import java.util.List;

import org.projet.escalade.business.contract.ToposManager;
import org.projet.escalade.model.Sites;
import org.projet.escalade.model.Topos;
import org.projet.escalade.model.User;

public class ToposManagerImpl extends AbstractManager implements ToposManager {

	
    public List<Topos> getListTopos() {
		return getDaoFactory().getTopoDao().getTopos();
	}

	public Topos getTopo(int id) {
		return getDaoFactory().getTopoDao().getTopos(id);
	}

	public List<Topos> getToposBySite(Sites vSite) {
		return getDaoFactory().getTopoDao().getToposBySite(vSite);
	}

	public List<Topos> getToposByUser(User vUser) {
		return getDaoFactory().getTopoDao().getToposByUser(vUser);
	}  	
}

package org.projet.escalade.consumer.contract;

import java.util.List;

import org.projet.escalade.model.Sites;
import org.projet.escalade.model.Topos;
import org.projet.escalade.model.User;

public interface TopoDAO {

	List<Topos> getTopos();

	Topos getTopos(int id);

	List<Topos> getToposBySite(Sites vSite);

	List<Topos> getToposByUser(User vUser);
}

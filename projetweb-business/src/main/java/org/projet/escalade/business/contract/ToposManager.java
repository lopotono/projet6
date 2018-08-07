package org.projet.escalade.business.contract;

import java.util.List;

import org.projet.escalade.model.Topos;
import org.projet.escalade.model.User;

public interface ToposManager {

	List<Topos> getListTopos();
	
	List<Topos> getToposdisponible(boolean topodispo);

	Topos getTopo(int id);
	
	Topos getSearchTopo(int id, String name);
	
	void AjoutTopo(String name, Boolean dispo, String iduser);

	Topos getEmprunttopo(String name);
	
	Topos getToponame(String toponame);

	Topos getTopo(String topoid);
	
	Topos getListDisponible(Boolean listdispo);

	Topos getUser(String iduser);
	
	List<Topos> getEmpruntByUser(User vUser);
}
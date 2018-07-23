package org.projet.escalade.business.contract;

import java.util.List;

import org.projet.escalade.model.Topos;

public interface ToposManager {

	List<Topos> getListTopos();

	Topos getTopo(int id);
	
	Topos getSearchTopo(int id, String name);
	
	void AjoutTopo(String name, Boolean dispo, int id);

	Topos getEmprunttopo(String name);
}
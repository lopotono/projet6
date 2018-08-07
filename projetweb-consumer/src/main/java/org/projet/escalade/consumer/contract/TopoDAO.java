package org.projet.escalade.consumer.contract;

import java.util.List;

import org.projet.escalade.model.Topos;

public interface TopoDAO {

	List<Topos> getTopos();
	
	List<Topos> getToposdisponible(boolean topodispo);

	Topos getTopos(int id);

	Topos getSearchTopo(int id, String name);

	Topos getEmprunttopo(String name);

	void AjoutTopo(String name, Boolean dispo, String iduser);
}
package org.projet.escalade.consumer.contract;

import java.util.List;

import org.projet.escalade.model.Topos;

public interface TopoDAO {

	List<Topos> getTopos();

	Topos getTopos(int id);

	Topos getSearchTopo(int id, String name);

	void AjoutTopo(String name, Boolean dispo, String iduser);

	Topos getEmprunttopo(String name);
}
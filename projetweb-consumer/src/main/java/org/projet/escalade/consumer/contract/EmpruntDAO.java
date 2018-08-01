package org.projet.escalade.consumer.contract;

import java.util.Date;
import java.util.List;

import org.projet.escalade.model.Emprunttopo;

public interface EmpruntDAO {
	
	List<Emprunttopo> getEmprunttopo();

	void AddEmprunt(Date datedebut, Date datefin, int id_topo, int id_user);
}
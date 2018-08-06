package org.projet.escalade.consumer.contract;

import java.util.Date;
import java.util.List;

import org.projet.escalade.model.Emprunttopo;
import org.projet.escalade.model.User;

public interface EmpruntDAO {
	
	List<Emprunttopo> getListEmprunttopo();

	void AddEmprunt(Date datedebut, Date datefin, int id_topo, int id_user);

	List<Emprunttopo> getEmpruntByUser(User vUser);
}
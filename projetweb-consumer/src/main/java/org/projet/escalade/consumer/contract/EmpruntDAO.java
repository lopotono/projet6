package org.projet.escalade.consumer.contract;

import java.util.Date;
import java.util.List;

import org.projet.escalade.model.Emprunttopo;
import org.projet.escalade.model.User;

public interface EmpruntDAO {
	
	List<Emprunttopo> getListEmprunttopo();

	void SaveEmprunt(Date datedebut, Date datefin, String userid, String topoid);

	List<Emprunttopo> getEmpruntByUser(User vUser);

	Emprunttopo getTopos(String id_topo);

	Emprunttopo getUser(String vUser);
}
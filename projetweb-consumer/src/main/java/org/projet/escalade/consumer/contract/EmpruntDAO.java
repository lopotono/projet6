package org.projet.escalade.consumer.contract;

import java.util.Calendar;
import java.util.List;

import org.projet.escalade.model.Emprunttopo;
import org.projet.escalade.model.User;

public interface EmpruntDAO {
	
	List<Emprunttopo> getListEmprunttopo();

	Emprunttopo getTopos(String id_topo);

	Emprunttopo getUser(String vUser);

	List<Emprunttopo> getEmpruntByUser(User vUser);
	
	void SaveEmprunt(Calendar datedebut, Calendar datefin, String userid, String topoid);
}
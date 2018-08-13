package org.projet.escalade.business.contract;

import java.util.Date;
import java.util.List;

import org.projet.escalade.model.Emprunttopo;
import org.projet.escalade.model.User;

public interface EmpruntManager {
	
	void SaveEmprunt(Date datedebut, Date datefin, String userid, String topoid);
	
	List<Emprunttopo> getEmpruntByUser(User vUser);
	
	List<Emprunttopo> getListEmprunttopo();

	Emprunttopo getTopos(String topoid);

	Emprunttopo getUser(String userid);
}
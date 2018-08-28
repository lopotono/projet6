package org.projet.escalade.business.contract;

import java.util.Calendar;
import java.util.List;

import org.projet.escalade.model.Emprunttopo;
import org.projet.escalade.model.User;

public interface EmpruntManager {
		
	List<Emprunttopo> getEmpruntByUser(User vUser);
		
	List<Emprunttopo> getListEmprunttopo();
	
	Emprunttopo getTopos(String topoid);

	Emprunttopo getUser(String userid);

	void SaveEmprunt(Calendar datedebut, Calendar datefin, String userid, String topoid);
}
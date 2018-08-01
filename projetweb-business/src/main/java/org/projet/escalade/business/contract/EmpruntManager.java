package org.projet.escalade.business.contract;

import java.util.Date;

public interface EmpruntManager {
	
	void AddEmprunt(Date datedebut, Date datefin, int id_topo, int id_user);
}
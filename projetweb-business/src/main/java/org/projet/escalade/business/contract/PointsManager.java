package org.projet.escalade.business.contract;

import java.util.List;

import org.projet.escalade.model.Longueur;
import org.projet.escalade.model.Points;

public interface PointsManager {
	
	List<Points> getListPoints();
	
	List<Points> getPointsByLongueur(Longueur vLongueur);

	Points getPoint(int id);
}

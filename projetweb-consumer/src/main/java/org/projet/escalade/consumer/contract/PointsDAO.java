package org.projet.escalade.consumer.contract;

import java.util.List;

import org.projet.escalade.model.Longueur;
import org.projet.escalade.model.Points;

public interface PointsDAO {

	Points getPoints(int id);

	List<Points> getPoints();

	List<Points> getPointsByLongueur(Longueur vLongueur);
}

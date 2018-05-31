package org.projet.escalade.business.impl;

import java.util.List;

import org.projet.escalade.business.contract.PointsManager;
import org.projet.escalade.model.Longueur;
import org.projet.escalade.model.Points;

public class PointsManagerImpl extends AbstractManager implements PointsManager {

	public List<Points> getListPoints() {
		return getDaoFactory().getPointsDao().getPoints();
	}

	public Points getPoint(int id) {
		return getDaoFactory().getPointsDao().getPoints(id);
	}

	public List<Points> getPointsByLongueur(Longueur vLongueur) {
		return getDaoFactory().getPointsDao().getPointsByLongueur(vLongueur);
	}
}

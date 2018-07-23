package org.projet.escalade.business.impl;

import java.util.List;

import org.projet.escalade.business.contract.PointsManager;
import org.projet.escalade.model.Longueur;
import org.projet.escalade.model.Points;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

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

	@Transactional(value = "txManagerSite")
	public void AddPoints(final int id, final int nbpoints, final int id_longueur) {

		TransactionTemplate vTransactionTemplate = new TransactionTemplate(getPlatformTransactionManager());

		vTransactionTemplate.execute(new TransactionCallbackWithoutResult() {

			@Override
			protected void doInTransactionWithoutResult(TransactionStatus status) {

				getDaoFactory().getPointsDao().AddPoints(id, nbpoints, id_longueur);
			};
		});
	}
}
package org.projet.escalade.business.impl;

import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

import org.projet.escalade.business.contract.EmpruntManager;
import org.projet.escalade.model.Emprunttopo;
import org.projet.escalade.model.Topos;
import org.projet.escalade.model.User;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

public class EmpruntManagerImpl extends AbstractManager implements EmpruntManager {
	
	public List<Emprunttopo> getListEmprunttopo() {
		return getDaoFactory().getEmpruntDao().getListEmprunttopo();
	}

	@Transactional(value = "txManagerSite")
	public void SaveEmprunt(final Calendar datedebut, final Calendar datefin, final String userid, final String topoid) {

		TransactionTemplate vTransactionTemplate = new TransactionTemplate(getPlatformTransactionManager());

		vTransactionTemplate.execute(new TransactionCallbackWithoutResult() {

			@Override
			protected void doInTransactionWithoutResult(TransactionStatus status) {

				getDaoFactory().getEmpruntDao().SaveEmprunt(datedebut, datefin, userid, topoid);
			};
		});
	}

	public List<Emprunttopo> getEmpruntByUser(User vUser) {
		List<Emprunttopo> list = getDaoFactory().getEmpruntDao().getEmpruntByUser(vUser);
		for (Iterator<Emprunttopo> iterator = list.iterator(); iterator.hasNext();) {
			Emprunttopo emprunttopo = (Emprunttopo) iterator.next();
			Topos topo = getDaoFactory().getTopoDao().getTopos(emprunttopo.getIdtopo());
			emprunttopo.setToponame(topo);
		}
		return list;
	}

	public Emprunttopo getUser(String vUser) {
		return getDaoFactory().getEmpruntDao().getUser(vUser);
	}

	public Emprunttopo getTopos(String topoid) {
		return getDaoFactory().getEmpruntDao().getTopos(topoid);
	}
}
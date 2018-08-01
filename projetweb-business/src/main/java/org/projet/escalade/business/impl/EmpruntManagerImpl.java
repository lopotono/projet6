package org.projet.escalade.business.impl;

import java.util.Date;
import java.util.List;

import org.projet.escalade.business.contract.EmpruntManager;
import org.projet.escalade.model.Emprunttopo;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

public class EmpruntManagerImpl extends AbstractManager implements EmpruntManager {
	
	public List<Emprunttopo> getListEmprunttopo() {
		return getDaoFactory().getEmpruntDao().getEmprunttopo();
	}

	@Transactional(value = "txManagerSite")
	public void AddEmprunt(final Date datedebut, final Date datefin, final int id_topo, final int id_user) {

		TransactionTemplate vTransactionTemplate = new TransactionTemplate(getPlatformTransactionManager());

		vTransactionTemplate.execute(new TransactionCallbackWithoutResult() {

			@Override
			protected void doInTransactionWithoutResult(TransactionStatus status) {

				getDaoFactory().getEmpruntDao().AddEmprunt(datedebut, datefin, id_topo, id_user);
			};
		});
	}
}
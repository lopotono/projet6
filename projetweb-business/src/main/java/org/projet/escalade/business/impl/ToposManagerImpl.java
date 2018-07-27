package org.projet.escalade.business.impl;

import java.util.List;

import org.projet.escalade.business.contract.ToposManager;
import org.projet.escalade.model.Sites;
import org.projet.escalade.model.Topos;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

public class ToposManagerImpl extends AbstractManager implements ToposManager {

	public List<Topos> getListTopos() {
		return getDaoFactory().getTopoDao().getTopos();
	}

	public Topos getTopo(int id) {
		Topos vTopo = getDaoFactory().getTopoDao().getTopos(id);
		List<Sites> vSite = getDaoFactory().getSitesDao().getSiteByTopos(vTopo);
		vTopo.setSite(vSite);
		return vTopo;
	}

	public Topos getSearchTopo(int id, String name) {
		return getDaoFactory().getTopoDao().getSearchTopo(id, name);
	}

	public Topos getEmprunttopo(String name) {
		return getDaoFactory().getTopoDao().getEmprunttopo(name);
	}

	@Transactional(value = "txManagerSite")
	public void AjoutTopo(final String name, final Boolean dispo, final String iduser) {

		TransactionTemplate vTransactionTemplate = new TransactionTemplate(getPlatformTransactionManager());

		vTransactionTemplate.execute(new TransactionCallbackWithoutResult() {

			@Override
			protected void doInTransactionWithoutResult(TransactionStatus status) {

				getDaoFactory().getTopoDao().AjoutTopo(name, dispo, iduser);
			};
		});
	}

	public Topos getTopo(String topoid) {
		// TODO Auto-generated method stub
		return null;
	}

	public Topos getListDisponible(Boolean listdispo) {
		// TODO Auto-generated method stub
		return null;
	}

	public Topos getUser(String iduser) {
		// TODO Auto-generated method stub
		return null;
	}
}
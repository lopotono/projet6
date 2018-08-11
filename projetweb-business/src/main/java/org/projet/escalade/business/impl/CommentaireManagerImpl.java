package org.projet.escalade.business.impl;

import java.util.List;

import org.projet.escalade.business.contract.CommentaireManager;
import org.projet.escalade.model.Commentaire;
import org.projet.escalade.model.Sites;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

public class CommentaireManagerImpl extends AbstractManager implements CommentaireManager {

	public List<Commentaire> getCommentaireBySite(Sites vSite) {
		return getDaoFactory().getCommentaireDao().getCommentaireBySite(vSite);
	}

	public List<Commentaire> getListCommentaire() {
		return getDaoFactory().getCommentaireDao().getListCommentaire();
	}
	
	@Transactional(value="txManagerSite")
	public void AddCommentaire(final String name, final String contain, final String idsite) {
		
		TransactionTemplate vTransactionTemplate = new TransactionTemplate(getPlatformTransactionManager());
		
		vTransactionTemplate.execute(new TransactionCallbackWithoutResult() {

			@Override
			protected void doInTransactionWithoutResult(TransactionStatus status) {
				
				getDaoFactory().getCommentaireDao().AddCommentaire(name, contain, idsite);
			};
		});
		
	}

	public Commentaire getSites(String idsite) {
		return null;
	}

	public Commentaire getCommentaire(int id) {
		return null;
	}
}
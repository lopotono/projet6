package org.projet.escalade.business.impl;

import java.util.List;

import org.projet.escalade.business.contract.CommentaireManager;
import org.projet.escalade.model.Commentaire;

public class CommentaireManagerImpl extends AbstractManager implements CommentaireManager {

	public List<Commentaire> getCommentaire() {
		return getDaoFactory().getCommentaireDao().getCommentaire();
	}
}

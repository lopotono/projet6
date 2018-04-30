package org.projet.escalade.consumer.contract;

import java.util.List;

import org.projet.escalade.model.Commentaire;

public interface CommentaireDAO {
	
	public List<Commentaire> getCommentaire();
}

package org.projet.escalade.consumer.contract;

import java.util.List;

import org.projet.escalade.model.Commentaire;
import org.projet.escalade.model.Sites;

public interface CommentaireDAO {

	List<Commentaire> getCommentaireBySite(Sites vSite);

	List<Commentaire> getListCommentaire();

	void AddCommentaire(String name, String contain, String idsite);
}
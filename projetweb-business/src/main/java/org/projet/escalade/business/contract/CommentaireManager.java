package org.projet.escalade.business.contract;

import java.util.List;

import org.projet.escalade.model.Commentaire;
import org.projet.escalade.model.Message;
import org.projet.escalade.model.exception.FunctionalException;
import org.projet.escalade.model.exception.NotFoundException;
import org.projet.escalade.model.exception.TechnicalException;

public interface CommentaireManager {

	public List<Commentaire> getCommentaire();

	Commentaire getCommentaire(String pName) throws NotFoundException;

	void addCommentaire(Commentaire pCommentaire) throws FunctionalException, TechnicalException;

	List<Message> getListNewMessage(Commentaire pCommentaire, Integer pLastMessageindex)
			throws NotFoundException, TechnicalException;

	void addMessage(Commentaire pCommentaire, Message pMessage)
			throws FunctionalException, NotFoundException, TechnicalException;
}

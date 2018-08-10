package org.projet.escalade.webapp.action;

import java.util.List;

import org.projet.escalade.model.Commentaire;

import com.opensymphony.xwork2.ActionSupport;

public class ListeCommentaireAction extends AbstractAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6686810005201438327L;
	
	private List<Commentaire> listCommentaire;
	private Commentaire commentaire;
	
	public List<Commentaire> getListCommentaire() {
		return listCommentaire;
	}

	public void setListCommentaire(List<Commentaire> listCommentaire) {
		this.listCommentaire = listCommentaire;
	}

	public Commentaire getCommentaire() {
		return commentaire;
	}

	public void setCommentaire(Commentaire commentaire) {
		this.commentaire = commentaire;
	}
	
	public String doListCommentaire() {
		listCommentaire = getManagerFactory().getCommentaireManager().getListCommentaire();
		return ActionSupport.SUCCESS;
	}
}
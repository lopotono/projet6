package org.projet.escalade.webapp.action;

import java.util.List;

import org.projet.escalade.model.Commentaire;

public class CommentaireAction extends AbstractAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2111586829219794628L;
	
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
	
	public String doCommentaire() {
		System.out.println(this.getClass()+"doCommentaire()");
		return SUCCESS;
	}
}

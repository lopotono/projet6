package org.projet.escalade.webapp.action;

import java.util.List;

import org.projet.escalade.model.Commentaire;
import org.projet.escalade.model.Sites;

import com.opensymphony.xwork2.ActionSupport;

public class CommentaireAction extends AbstractAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2111586829219794628L;
	
	private int id;
	private Commentaire commentaire;
	private String idsite;
	private List<Sites> listSites;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public Commentaire getCommentaire() {
		return commentaire;
	}
	public void setCommentaire(Commentaire commentaire) {
		this.commentaire = commentaire;
	}
	
	public String getIdsite() {
		return idsite;
	}
	public void setIdsite(String idsite) {
		this.idsite = idsite;
	}
	
	public List<Sites> getListSites() {
		return listSites;
	}
	public void setListSites(List<Sites> listSites) {
		this.listSites = listSites;
	}
	
	public String execute() {
		setListSites(getManagerFactory().getSitesManager().getListSites());
		commentaire = getManagerFactory().getCommentaireManager().getCommentaire(id);
		this.commentaire.setCommentaire(getManagerFactory().getCommentaireManager().getSites(idsite));
		return ActionSupport.SUCCESS;
	}
}
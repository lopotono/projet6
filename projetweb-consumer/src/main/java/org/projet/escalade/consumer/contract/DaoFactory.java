package org.projet.escalade.consumer.contract;

public interface DaoFactory {

    public TopoDAO getTopoDao();
    public SecteurDAO getSecteurDao();
    public SitesDAO getSitesDao();
	public UserDAO getUserDao();
	public CommentaireDAO getCommentaireDao();
}

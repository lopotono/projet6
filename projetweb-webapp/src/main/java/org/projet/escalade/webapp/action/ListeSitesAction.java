package org.projet.escalade.webapp.action;

import java.util.List;

import org.projet.escalade.model.Sites;
import org.projet.escalade.webapp.action.AbstractAction;

import com.opensymphony.xwork2.ActionSupport;

public class ListeSitesAction extends AbstractAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7227990153624180024L;

	// ======= Attributs =========
    // ------- Paramètres en entrée
    private Integer id;

    // ------- Eléments en sortie
    private List<Sites> listSites;
    private Sites sites;

    // ======= Getters/Setters =======
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public List<Sites> getListSites() {
        return listSites;
    }
    public Sites getSites() {
        return sites;
    }
    
    // ======== Méthodes ========
    public String doList() {
    	listSites = AbstractAction.getManagerFactory().getSitesManager().getListSites();
    	return ActionSupport.SUCCESS;
    }
}

package org.projet.escalade.webapp.action;

import java.util.List;

import org.projet.escalade.model.Topos;

import com.opensymphony.xwork2.ActionSupport;


public class ListeToposAction extends AbstractAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9090185658533410370L;

	// ======= Attributs =========
    // ------- Paramètres en entrée
    private Integer id;

    // ------- Eléments en sortie
    private List<Topos> listTopos;
    private Topos topos; 

    // ======= Getters/Setters =======
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public List<Topos> getListTopos() {
        return listTopos;
    }
    public Topos getTopos() {
        return topos;
    }
       
    // ========== Méthodes ===========
    public String doList() {
    	listTopos = getManagerFactory().getToposManager().getListTopos();
    	return ActionSupport.SUCCESS;
    }
}
